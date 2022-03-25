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

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple2.Tup2lBase;
import org.barghos.core.api.tuple2.Tup2lR;

/**
 * This class represents a 2-dimensional long tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2l implements Tup2lBase, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public long x;
	
	/**
	 * The y component.
	 */
	public long y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup2l()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TuplR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
	 */
	public Tup2l(TuplR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2lR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2lR} to adopt the values from.
	 */
	public Tup2l(Tup2lR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2l(long value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2l(long[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2l(long x, long y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public long getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public long getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setX(long x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setY(long y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2l set(Tup2lR t)
	{
		return (Tup2l)Tup2lBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l set(long value)
	{
		return (Tup2l)Tup2lBase.super.set(value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l set(long x, long y)
	{
		return (Tup2l)Tup2lBase.super.set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (getX() ^ (getX() >>> 32));
		result = prime * result + (int) (getY() ^ (getY() >>> 32));
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2lR)
		{
			Tup2lR other = (Tup2lR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TuplR)
		{
			TuplR other = (TuplR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup2l(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l clone()
	{
		return new Tup2l(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		
		return values;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l set(TuplR t)
	{
		return (Tup2l)Tup2lBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setArray(long... values)
	{
		return (Tup2l)Tup2lBase.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setByIndex(int index, long value)
	{
		return (Tup2l)Tup2lBase.super.setByIndex(index, value);
	}
}