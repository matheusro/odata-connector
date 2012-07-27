/**
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.odata4j.format.json;

import javax.ws.rs.core.UriInfo;

import org.odata4j.format.SingleLink;
import org.odata4j.format.SingleLinks;

public class JsonSingleLinksFormatWriter extends JsonFormatWriter<SingleLinks> {

  public JsonSingleLinksFormatWriter(String jsonpCallback) {
    super(jsonpCallback);
  }

  @Override
  protected void writeContent(UriInfo uriInfo, JsonWriter jw, SingleLinks links) {
    jw.startObject();
    {
      jw.writeName("results");
      jw.startArray();
      for (SingleLink link : links)
        JsonSingleLinkFormatWriter.writeUri(jw, link);
      jw.endArray();
    }
    jw.endObject();
  }

}

/*
{
"d" : {
"results": [
{
"uri": "http://services.odata.org/northwind/Northwind.svc/Order_Details(OrderID=10285,ProductID=1)"
}, {
"uri": "http://services.odata.org/northwind/Northwind.svc/Order_Details(OrderID=10294,ProductID=1)"
}
]
}
}
*/
