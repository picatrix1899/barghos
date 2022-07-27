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

package org.barghos.core.tuple4;

import java.io.Serializable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple4.Tup4objC;
import org.barghos.core.api.tuple4.Tup4objR;

/**
 * This class represents a 4-dimensional {@link Object} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup4obj implements Tup4objC, Serializable
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
	 * The w component.
	 * This must not be null.
	 */
	public Object w;
	
	/**
	 * Creates a new instance with all components set to null.
	 */
	public Tup4obj() { }
	
	/**
	 * Creates a new instance from an existing instance of {@link TupobjR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupobjR} to adopt the values from.
	 */
	public Tup4obj(TupobjR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4objR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4objR} to adopt the values from.
	 */
	public Tup4obj(Tup4objR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup4obj(Object value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * @param z The initial z value of the tuple.
	 * @param w The initial w value of the tuple.
	 */
	public Tup4obj(Object x, Object y, Object z, Object w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup4obj(Object[] v)
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
	public Object getW()
	{
		return this.w;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj setX(Object x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj setY(Object y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj setZ(Object z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj setW(Object w)
	{
		this.w = w;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj set(Tup4objR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj set(Object value)
	{
		return set(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj set(Object x, Object y, Object z, Object w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
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
		result = prime * result + getW().hashCode();
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup4objR)
		{
			Tup4objR other = (Tup4objR) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			if(!getZ().equals(other.getZ())) return false;
			if(!getW().equals(other.getW())) return false;
			
			return true;
		}
		
		if(obj instanceof TupobjR)
		{
			TupobjR other = (TupobjR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(!getX().equals(other.getByIndex(0))) return false;
			if(!getY().equals(other.getByIndex(1))) return false;
			if(!getZ().equals(other.getByIndex(2))) return false;
			if(!getW().equals(other.getByIndex(3))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj clone()
	{
		return new Tup4obj(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup4obj(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}

	/** {@inheritDoc}} */
	@Override
	public Tup4obj set(TupobjR t)
	{
		return (Tup4obj)Tup4objC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj setArray(Object... values)
	{
		return (Tup4obj)Tup4objC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4obj setByIndex(int index, Object value)
	{
		return (Tup4obj)Tup4objC.super.setByIndex(index, value);
	}
}