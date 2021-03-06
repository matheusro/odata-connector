/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.odata4j.producer.command;

import org.odata4j.core.OEntity;
import org.odata4j.producer.EntityResponse;

public interface CreateEntityCommandContext extends ProducerCommandContext<EntityResponse> {

  String getEntitySetName();

  OEntity getEntity();

}
