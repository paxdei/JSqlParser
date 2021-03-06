/*
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2018 JSQLParser
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
package net.sf.jsqlparser.expression;

import net.sf.jsqlparser.parser.ASTNodeAccessImpl;

public class PositionExpression extends ASTNodeAccessImpl implements Expression {

    private Expression substring;
    private Expression string;

    @Override
    public void accept(ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    public Expression getSubstring() {
        return substring;
    }

    public void setSubstring(Expression substring) {
        this.substring = substring;
    }

    public Expression getString() {
        return string;
    }

    public void setString(Expression string) {
        this.string = string;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("POSITION(");
        sb.append(substring);
        sb.append(" IN ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
