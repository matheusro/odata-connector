/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.odata4j.producer.jpa;

import java.util.List;

import org.odata4j.producer.jpa.JPAProducer.CommandType;

public interface JPAProducerBehavior {
  public List<Command> modify(CommandType type, List<Command> commands);
}