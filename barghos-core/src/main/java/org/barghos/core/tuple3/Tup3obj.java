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

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple3.Tup3objC;
import org.barghos.core.api.tuple3.Tup3objR;

/**
 * This class represents a 3-dimensional {@link Object} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup3obj implements Tup3objC, Serializable
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
	 * The z component.
	 * This must not be null.
	 */
	public Object z;
	
	/**
	 * Creates a new instance with all components set to null.
	 */
	public Tup3obj() { }
	
	/**
	 * Creates a new instance from an existing instance of {@link TupobjR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupobjR} to adopt the values from.
	 */
	public Tup3obj(TupobjR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3objR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3objR} to adopt the values from.
	 */
	public Tup3obj(Tup3objR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup3obj(Object value)
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
	public Tup3obj(Object x, Object y, Object z)
	{
		set(x, y, z);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup3obj(Object[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Object getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Object getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Object getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj setX(Object x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj setY(Object y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj setZ(Object z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj set(Tup3objR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj set(Object value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj set(Object x, Object y, Object z)
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
		
		if(obj instanceof Tup3objR)
		{
			Tup3objR other = (Tup3objR) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			if(!getZ().equals(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof TupobjR)
		{
			TupobjR other = (TupobjR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(!getX().equals(other.getByIndex(0))) return false;
			if(!getY().equals(other.getByIndex(1))) return false;
			if(!getZ().equals(other.getByIndex(2))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj clone()
	{
		return new Tup3obj(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup3obj(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj set(TupobjR t)
	{
		return (Tup3obj)Tup3objC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj setArray(Object... values)
	{
		return (Tup3obj)Tup3objC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup3obj setByIndex(int index, Object value)
	{
		return (Tup3obj)Tup3objC.super.setByIndex(index, value);
	}
}