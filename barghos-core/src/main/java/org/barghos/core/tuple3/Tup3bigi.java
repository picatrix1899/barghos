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
import java.math.BigInteger;
import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple3.Tup3bigiC;
import org.barghos.core.api.tuple3.Tup3bigiR;

/**
 * This class represents a 3-dimensional {@link BigInteger} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup3bigi implements Tup3bigiC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public BigInteger x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public BigInteger y;
	
	/**
	 * The z component.
	 * This must not be null.
	 */
	public BigInteger z;
	
	/**
	 * Creates a new instance with all components set to {@link BigInteger#ZERO}.
	 */
	public Tup3bigi()
	{
		set(BigInteger.ZERO);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigiR} to adopt the values from.
	 */
	public Tup3bigi(TupbigiR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3bigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3bigiR} to adopt the values from.
	 */
	public Tup3bigi(Tup3bigiR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup3bigi(BigInteger value)
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
	public Tup3bigi(BigInteger x, BigInteger y, BigInteger z)
	{
		set(x, y, z);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup3bigi(BigInteger[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi setX(BigInteger x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi setY(BigInteger y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi setZ(BigInteger z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi set(Tup3bigiR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi set(BigInteger value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi set(BigInteger x, BigInteger y, BigInteger z)
	{
		return setX(x).setY(y).setZ(z);
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		result = prime * result + getZ().hashCode();
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup3bigiR)
		{
			Tup3bigiR other = (Tup3bigiR) obj;
			if(getX().compareTo(other.getX()) != 0) return false;
			if(getY().compareTo(other.getY()) != 0) return false;
			if(getZ().compareTo(other.getZ()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigiR)
		{
			TupbigiR other = (TupbigiR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX().compareTo(other.getByIndex(0)) != 0) return false;
			if(getY().compareTo(other.getByIndex(1)) != 0) return false;
			if(getZ().compareTo(other.getByIndex(2)) != 0) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi clone()
	{
		return new Tup3bigi(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup3bigi(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi set(TupbigiR t)
	{
		return (Tup3bigi)Tup3bigiC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi setArray(BigInteger... values)
	{
		return (Tup3bigi)Tup3bigiC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigi setByIndex(int index, BigInteger value)
	{
		return (Tup3bigi)Tup3bigiC.super.setByIndex(index, value);
	}
}