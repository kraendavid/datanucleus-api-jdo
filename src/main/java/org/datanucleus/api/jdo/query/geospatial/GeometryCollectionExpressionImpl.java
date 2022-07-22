/**********************************************************************
Copyright (c) 2018 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
     ...
 **********************************************************************/
package org.datanucleus.api.jdo.query.geospatial;

import javax.jdo.query.PersistableExpression;
import javax.jdo.query.geospatial.GeometryCollectionExpression;

import org.datanucleus.api.jdo.query.ExpressionType;
import org.datanucleus.store.query.expression.Expression;

/**
 * Implementation of a GeometryCollectionExpression.
 */
public class GeometryCollectionExpressionImpl<T> extends GeometryExpressionImpl<T> implements GeometryCollectionExpression<T>
{
    public GeometryCollectionExpressionImpl(PersistableExpression parent, String name)
    {
        super(parent, name);
    }

    public GeometryCollectionExpressionImpl(Expression queryExpr)
    {
        super(queryExpr);
    }

    public GeometryCollectionExpressionImpl(Class<T> cls, String name, ExpressionType type)
    {
        super(cls, name, type);
    }
}