/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.tuple2;

import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple2.Tup2oR;

/**
 * This class represents a 2-dimensional {@link Object} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @param <X> The type of the x component.
 * @param <Y> The type of the y component.
 * 
 * @author picatrix1899
 */
public class Tup2o<X,Y> implements Tup2oC<X,Y>
{
	/**
	 * The x component.
	 * This must not be null.
	 */
	public X x;
	
	/**
	 * The y component. 
	 * This must not be null.
	 */
	public Y y;
	
	/**
	 * Creates a new instance with all components set to null.
	 */
	public Tup2o() { }
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2oR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2oR} to adopt the values from.
	 */
	public Tup2o(Tup2oR<X,Y> t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2o(X x, Y y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc} */
	@Override
	public X getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public Y getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isValid()
	{
		return	this.x != null &&
				this.y != null;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2o<X,Y> setX(X x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2o<X,Y> setY(Y y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2o<X,Y> set(Tup2oR<X,Y> t)
	{
		this.x = t.getX();
		this.y = t.getY();
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2o<X,Y> set(X x, Y y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x.hashCode();
		result = prime * result + this.y.hashCode();
		return result;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Tup2oR)) return false;
		
		@SuppressWarnings("unchecked")
		Tup2oR<X,Y> other = (Tup2oR<X,Y>) obj;
		if(!this.x.equals(other.getX())) return false;
		if(!this.y.equals(other.getY())) return false;
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "tup2o(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2o<X,Y> clone()
	{
		return new Tup2o<>(this.x, this.y);
	}
}