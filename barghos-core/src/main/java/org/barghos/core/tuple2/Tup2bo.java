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
import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple2.Tup2boBase;
import org.barghos.core.api.tuple2.Tup2boR;

/**
 * This class represents a 2-dimensional boolean tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2bo implements Tup2boBase, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public boolean x;
	
	/**
	 * The y component.
	 */
	public boolean y;
	
	/**
	 * Creates a new instance with all components set to false.
	 */
	public Tup2bo()
	{
		set(false);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupboR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupboR} to adopt the values from.
	 */
	public Tup2bo(TupboR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2boR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2boR} to adopt the values from.
	 */
	public Tup2bo(Tup2boR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2bo(boolean value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2bo(boolean[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2bo(boolean x, boolean y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo setX(boolean x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo setY(boolean y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo set(Tup2boR t)
	{
		return (Tup2bo)Tup2boBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo set(boolean value)
	{
		return (Tup2bo)Tup2boBase.super.set(value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo set(boolean x, boolean y)
	{
		return (Tup2bo)Tup2boBase.super.set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (getX() ? 1 : 0);
		result = prime * result + (getY() ? 1 : 0);
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2boR)
		{
			Tup2boR other = (Tup2boR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TupboR)
		{
			TupboR other = (TupboR) obj;
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
		return "tup2bo(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo clone()
	{
		return new Tup2bo(this);
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
	public Tup2bo set(TupboR t)
	{
		return (Tup2bo)Tup2boBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo setArray(boolean... values)
	{
		return (Tup2bo)Tup2boBase.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bo setByIndex(int index, boolean value)
	{
		return (Tup2bo)Tup2boBase.super.setByIndex(index, value);
	}
}