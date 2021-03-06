/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.odata4j.core;

/**
 * A consumer-side entity-request builder, used for GET operations of a single entity.  Call {@link #execute()} to issue the request.
 *
 * @param <T>  the java-type of the operation response
 */
public interface OEntityGetRequest<T> extends OEntityRequest<T> {

  /**
   * Specifies a subset of properties to return.
   *
   * @param select  a comma-separated list of selection clauses
   * @return the entity-request builder
   */
  OEntityRequest<T> select(String select);

  /**
   * Specifies related entities to expand inline as part of the response.
   *
   * @param expand  a comma-separated list of navigation properties
   * @return the entity-request builder
   */
  OEntityRequest<T> expand(String expand);

}
