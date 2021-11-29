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
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple2.Tup2bR;
import org.barghos.core.api.tuple2.Tup2bRW;

/**
 * This class represents a 2-dimensional byte tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup2b implements Tup2bRW, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public byte x;
	
	/**
	 * The y component.
	 */
	public byte y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2b()
	{
		set((byte)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2b(TupbR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2bR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2b(Tup2bR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2b(byte value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2b(byte[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2b(byte x, byte y)
	{
		set(x, y);
	}
	
	@Override
	public byte getX()
	{
		return this.x;
	}
	
	@Override
	public byte getY()
	{
		return this.y;
	}
	
	@Override
	public Tup2b setX(byte x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup2b setY(byte y)
	{
		this.y = y;
		
		return this;
	}
	
	@Override
	public Tup2b set(Tup2bR t)
	{
		return (Tup2b)Tup2bRW.super.set(t);
	}
	
	@Override
	public Tup2b set(byte value)
	{
		return (Tup2b)Tup2bRW.super.set(value);
	}
	
	@Override
	public Tup2b set(byte x, byte y)
	{
		return (Tup2b)Tup2bRW.super.set(x, y);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2bR)
		{
			Tup2bR other = (Tup2bR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TupbR)
		{
			TupbR other = (TupbR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "tup2b(x=" + getX() + ", y=" + getY() + ")";
	}
	
	@Override
	public Tup2b clone()
	{
		return new Tup2b(this);
	}
	
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		
		return values;
	}
	
	@Override
	public Tup2b getNewInstance(byte x, byte y)
	{
		return new Tup2b(x, y);
	}
	
	@Override
	public Tup2b getNewInstance(byte value)
	{
		return (Tup2b)Tup2bRW.super.getNewInstance(value);
	}
	
	@Override
	public Tup2b getNewInstance(Tup2bR t)
	{
		return (Tup2b)Tup2bRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup2b getNewInstance(TupbR t)
	{
		return (Tup2b)Tup2bRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup2b getNewInstanceFromArray(byte... values)
	{
		return (Tup2b)Tup2bRW.super.getNewInstanceFromArray(values);
	}
	
	@Override
	public Tup2b set(TupbR t)
	{
		return (Tup2b)Tup2bRW.super.set(t);
	}
	
	@Override
	public Tup2b setArray(byte... values)
	{
		return (Tup2b)Tup2bRW.super.setArray(values);
	}
	
	@Override
	public Tup2b setByIndex(int index, byte value)
	{
		return (Tup2b)Tup2bRW.super.setByIndex(index, value);
	}
}