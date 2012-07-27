/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.command;

public interface CommandExecution {

  <TContext extends CommandContext, TCommand extends Command<TContext>>
      void execute(TCommand command, TContext context) throws Exception;

  public final CommandExecution DEFAULT = new CommandExecution() {

    @Override
    public <TContext extends CommandContext, TCommand extends Command<TContext>> void execute(TCommand command, TContext context) throws Exception {
      if (command instanceof FilterCommand) {
        try {
          command.execute(context);
        } catch (Exception e) {
          FilterCommand<TContext> filterCommand = (FilterCommand<TContext>) command;
          FilterResult postProcessResult = filterCommand.postProcess(context, e);
          if (postProcessResult != FilterResult.HANDLED) {
            throw e;
          }
        }
      } else {
        command.execute(context);
      }
    }
  };

}
