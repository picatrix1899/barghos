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
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple3.Tup3bC;
import org.barghos.core.api.tuple3.Tup3bR;

/**
 * This class represents a 3-dimensional byte tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup3b implements Tup3bC, Serializable
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
	 * The z component.
	 */
	public byte z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup3b()
	{
		set((byte)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbR} to adopt the values from.
	 */
	public Tup3b(TupbR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3bR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3bR} to adopt the values from.
	 */
	public Tup3b(Tup3bR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup3b(byte value)
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
	public Tup3b(byte x, byte y, byte z)
	{
		set(x, y, z);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup3b(byte[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b setX(byte x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b setY(byte y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b setZ(byte z)
	{
		this.z = z;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup3b set(Tup3bR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b set(byte value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b set(byte x, byte y, byte z)
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
		
		if(obj instanceof Tup3bR)
		{
			Tup3bR other = (Tup3bR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			if(getZ() != other.getZ()) return false;
			
			return true;
		}
		
		if(obj instanceof TupbR)
		{
			TupbR other = (TupbR) obj;
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
	public Tup3b clone()
	{
		return new Tup3b(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup3b(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b set(TupbR t)
	{
		return (Tup3b)Tup3bC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b setArray(byte... values)
	{
		return (Tup3b)Tup3bC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3b setByIndex(int index, byte value)
	{
		return (Tup3b)Tup3bC.super.setByIndex(index, value);
	}
}