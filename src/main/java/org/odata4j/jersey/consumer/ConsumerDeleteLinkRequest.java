/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.jersey.consumer;

import org.core4j.Enumerable;
import org.odata4j.consumer.ODataClientRequest;
import org.odata4j.core.OEntityId;
import org.odata4j.edm.EdmDataServices;

class ConsumerDeleteLinkRequest extends ConsumerEntityRequestBase<Void> {

  private final String targetNavProp;
  private final Object[] targetKeyValues;

  ConsumerDeleteLinkRequest(ODataJerseyClient client, String serviceRootUri,
      EdmDataServices metadata, OEntityId sourceEntity, String targetNavProp, Object... targetKeyValues) {
    super(client, serviceRootUri, metadata, sourceEntity.getEntitySetName(), sourceEntity.getEntityKey());
    this.targetNavProp = targetNavProp;
    this.targetKeyValues = targetKeyValues;
  }

  @Override
  public Void execute() {
    String path = Enumerable.create(getSegments()).join("/");
    path = ConsumerQueryLinksRequest.linksPath(targetNavProp, targetKeyValues).apply(path);
    ODataClientRequest request = ODataClientRequest.delete(getServiceRootUri() + path);
    getClient().deleteLink(request);
    return null;
  }

}
