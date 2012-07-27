/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.producer.command;

import org.odata4j.producer.CountResponse;
import org.odata4j.producer.QueryInfo;

public interface GetEntitiesCountCommandContext extends ProducerCommandContext<CountResponse> {

  String getEntitySetName();

  QueryInfo getQueryInfo();

}
