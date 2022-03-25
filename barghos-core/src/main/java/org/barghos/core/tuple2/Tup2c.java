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
import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple2.Tup2cBase;
import org.barghos.core.api.tuple2.Tup2cR;

/**
 * This class represents a 2-dimensional char tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2c implements Tup2cBase, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public char x;
	
	/**
	 * The y component.
	 */
	public char y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup2c()
	{
		set((char)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupcR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupcR} to adopt the values from.
	 */
	public Tup2c(TupcR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2cR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2cR} to adopt the values from.
	 */
	public Tup2c(Tup2cR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2c(char value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2c(char[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2c(char x, char y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public char getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public char getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c setX(char x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c setY(char y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2c set(Tup2cR t)
	{
		return (Tup2c)Tup2cBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c set(char value)
	{
		return (Tup2c)Tup2cBase.super.set(value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c set(char x, char y)
	{
		return (Tup2c)Tup2cBase.super.set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2cR)
		{
			Tup2cR other = (Tup2cR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TupcR)
		{
			TupcR other = (TupcR) obj;
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
		return "tup2c(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c clone()
	{
		return new Tup2c(this);
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
	public Tup2c set(TupcR t)
	{
		return (Tup2c)Tup2cBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c setArray(char... values)
	{
		return (Tup2c)Tup2cBase.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2c setByIndex(int index, char value)
	{
		return (Tup2c)Tup2cBase.super.setByIndex(index, value);
	}
}