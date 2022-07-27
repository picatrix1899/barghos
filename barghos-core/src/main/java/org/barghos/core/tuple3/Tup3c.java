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

package org.barghos.core.tuple3;

import java.io.Serializable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple3.Tup3cC;
import org.barghos.core.api.tuple3.Tup3cR;

/**
 * This class represents a 3-dimensional char tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup3c implements Tup3cC, Serializable
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
	 * The z component.
	 */
	public char z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup3c()
	{
		set((char)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupcR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupcR} to adopt the values from.
	 */
	public Tup3c(TupcR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3cR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3cR} to adopt the values from.
	 */
	public Tup3c(Tup3cR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup3c(char value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * @param z The initial z value of the tuple.
	 */
	public Tup3c(char x, char y, char z)
	{
		set(x, y, z);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup3c(char[] v)
	{
		setArray(v);
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
	public char getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c setX(char x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c setY(char y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c setZ(char z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c set(Tup3cR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c set(char value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c set(char x, char y, char z)
	{
		return setX(x).setY(y).setZ(z);
	}

	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		result = prime * result + getZ();
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup3cR)
		{
			Tup3cR other = (Tup3cR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			if(getZ() != other.getZ()) return false;
			
			return true;
		}
		
		if(obj instanceof TupcR)
		{
			TupcR other = (TupcR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			if(getZ() != other.getByIndex(2)) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c clone()
	{
		return new Tup3c(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup3c(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c set(TupcR t)
	{
		return (Tup3c)Tup3cC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c setArray(char... values)
	{
		return (Tup3c)Tup3cC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3c setByIndex(int index, char value)
	{
		return (Tup3c)Tup3cC.super.setByIndex(index, value);
	}
}