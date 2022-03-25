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
import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple2.Tup2objBase;
import org.barghos.core.api.tuple2.Tup2objR;

/**
 * This class represents a 2-dimensional {@link Object} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2obj implements Tup2objBase, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public Object x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public Object y;
	
	/**
	 * Creates a new instance with all components set to null.
	 */
	public Tup2obj() { }
	
	/**
	 * Creates a new instance from an existing instance of {@link TupobjR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupobjR} to adopt the values from.
	 */
	public Tup2obj(TupobjR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2objR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2objR} to adopt the values from.
	 */
	public Tup2obj(Tup2objR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2obj(Object value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2obj(Object[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2obj(Object x, Object y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Object getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public Object getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setX(Object x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setY(Object y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2obj set(Tup2objR t)
	{
		return (Tup2obj)Tup2objBase.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj set(Object value)
	{
		return (Tup2obj)Tup2objBase.super.set(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj set(Object x, Object y)
	{
		return (Tup2obj)Tup2objBase.super.set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		return result;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2objR)
		{
			Tup2objR other = (Tup2objR) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			
			return true;
		}
		
		if(obj instanceof TupobjR)
		{
			TupobjR other = (TupobjR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(!getX().equals(other.getByIndex(0))) return false;
			if(!getY().equals(other.getByIndex(1))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "tup2obj(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj clone()
	{
		return new Tup2obj(this);
	}
	
	/** {@inheritDoc} */
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		
		return values;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj set(TupobjR t)
	{
		return (Tup2obj)Tup2objBase.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setArray(Object... values)
	{
		return (Tup2obj)Tup2objBase.super.setArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2obj setByIndex(int index, Object value)
	{
		return (Tup2obj)Tup2objBase.super.setByIndex(index, value);
	}
}