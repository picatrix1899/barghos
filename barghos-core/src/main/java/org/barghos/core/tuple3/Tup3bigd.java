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
import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple3.Tup3bigdC;
import org.barghos.core.api.tuple3.Tup3bigdR;

/**
 * This class represents a 3-dimensional {@link BigDecimal} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup3bigd implements Tup3bigdC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public BigDecimal x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public BigDecimal y;
	
	/**
	 * The z component.
	 * This must not be null.
	 */
	public BigDecimal z;
	
	/**
	 * Creates a new instance with all components set to {@link BigDecimal#ZERO}.
	 */
	public Tup3bigd()
	{
		set(BigDecimal.ZERO);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigdR} to adopt the values from.
	 */
	public Tup3bigd(TupbigdR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3bigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3bigdR} to adopt the values from.
	 */
	public Tup3bigd(Tup3bigdR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup3bigd(BigDecimal value)
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
	public Tup3bigd(BigDecimal x, BigDecimal y, BigDecimal z)
	{
		set(x, y, z);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup3bigd(BigDecimal[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd setX(BigDecimal x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd setY(BigDecimal y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd setZ(BigDecimal z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd set(Tup3bigdR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd set(BigDecimal value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd set(BigDecimal x, BigDecimal y, BigDecimal z)
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

		if(obj instanceof Tup3bigdR)
		{
			Tup3bigdR other = (Tup3bigdR) obj;
			if(getX().compareTo(other.getX()) != 0) return false;
			if(getY().compareTo(other.getY()) != 0) return false;
			if(getZ().compareTo(other.getZ()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigdR)
		{
			TupbigdR other = (TupbigdR) obj;
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
	public Tup3bigd clone()
	{
		return new Tup3bigd(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup3bigd(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd set(TupbigdR t)
	{
		return (Tup3bigd)Tup3bigdC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd setArray(BigDecimal... values)
	{
		return (Tup3bigd)Tup3bigdC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3bigd setByIndex(int index, BigDecimal value)
	{
		return (Tup3bigd)Tup3bigdC.super.setByIndex(index, value);
	}
}