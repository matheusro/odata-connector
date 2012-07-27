/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.producer.resources;

import java.util.Set;

/**
 * Default OData application containing the {@link DefaultODataProducerProvider}.
 */
public final class DefaultODataApplication extends AbstractODataApplication {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = super.getClasses();
    classes.add(DefaultODataProducerProvider.class);
    return classes;
  }
}
