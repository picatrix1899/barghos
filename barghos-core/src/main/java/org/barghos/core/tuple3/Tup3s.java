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

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple3.Tup3sC;
import org.barghos.core.api.tuple3.Tup3sR;

/**
 * This class represents a 3-dimensional short tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup3s implements Tup3sC, Serializable
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
	 * The z component.
	 */
	public short z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup3s()
	{
		set((short)0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupsR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupsR} to adopt the values from.
	 */
	public Tup3s(TupsR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3sR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3sR} to adopt the values from.
	 */
	public Tup3s(Tup3sR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.

	 */
	public Tup3s(short value)
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
	public Tup3s(short x, short y, short z)
	{
		set(x, y, z);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup3s(short[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public short getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public short getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public short getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s setX(short x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s setY(short y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s setZ(short z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s set(Tup3sR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s set(short value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s set(short x, short y, short z)
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
		
		if(obj instanceof Tup3sR)
		{
			Tup3sR other = (Tup3sR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			if(getZ() != other.getZ()) return false;
			
			return true;
		}
		
		if(obj instanceof TupsR)
		{
			TupsR other = (TupsR) obj;
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
	public Tup3s clone()
	{
		return new Tup3s(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup3s(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s set(TupsR t)
	{
		return (Tup3s)Tup3sC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s setArray(short... values)
	{
		return (Tup3s)Tup3sC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3s setByIndex(int index, short value)
	{
		return (Tup3s)Tup3sC.super.setByIndex(index, value);
	}
}