/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.odata4j.expression;

/**
 <source>/<any|all>(<variable>:<predicate>)
 */
public interface AggregateBoolFunction extends BoolCommonExpression {

  CommonExpression getSource(); // .NET docs use this terminology

  String getVariable();

  BoolCommonExpression getPredicate();

  ExpressionParser.AggregateFunction getFunctionType();

}