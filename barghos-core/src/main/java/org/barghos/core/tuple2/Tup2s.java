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
import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple2.Tup2sC;
import org.barghos.core.api.tuple2.Tup2sR;

/**
 * This class represents a 2-dimensional short tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2s implements Tup2sC, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public short x;
	
	/**
	 * The y component.
	 */
	public short y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup2s()
	{
		set((short)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupsR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupsR} to adopt the values from.
	 */
	public Tup2s(TupsR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2sR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2sR} to adopt the values from.
	 */
	public Tup2s(Tup2sR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2s(short value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2s(short[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2s(short x, short y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public short getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public short getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s setX(short x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s setY(short y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s set(Tup2sR t)
	{
		return (Tup2s)Tup2sC.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s set(short value)
	{
		return (Tup2s)Tup2sC.super.set(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s set(short x, short y)
	{
		return (Tup2s)Tup2sC.super.set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		return result;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2sR)
		{
			Tup2sR other = (Tup2sR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TupsR)
		{
			TupsR other = (TupsR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "tup2s(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s clone()
	{
		return new Tup2s(this);
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
	public Tup2s set(TupsR t)
	{
		return (Tup2s)Tup2sC.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s setArray(short... values)
	{
		return (Tup2s)Tup2sC.super.setArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2s setByIndex(int index, short value)
	{
		return (Tup2s)Tup2sC.super.setByIndex(index, value);
	}
}