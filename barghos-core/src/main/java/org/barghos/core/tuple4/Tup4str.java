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

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple4.Tup4strC;
import org.barghos.core.api.tuple4.Tup4strR;

/**
 * This class represents a 4-dimensional string tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup4str implements Tup4strC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public String x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public String y;
	
	/**
	 * The z component.
	 * This must not be null.
	 */
	public String z;
	
	/**
	 * The w component.
	 * This must not be null.
	 */
	public String w;
	
	/**
	 * Creates a new instance with all components set to "".
	 */
	public Tup4str()
	{
		set("");
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupstrR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupstrR} to adopt the values from.
	 */
	public Tup4str(TupstrR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4strR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4strR} to adopt the values from.
	 */
	public Tup4str(Tup4strR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup4str(String value)
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
	public Tup4str(String x, String y, String z, String w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup4str(String[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String getW()
	{
		return this.w;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str setX(String x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str setY(String y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str setZ(String z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str setW(String w)
	{
		this.w = w;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str set(Tup4strR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str set(String value)
	{
		return set(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str set(String x, String y, String z, String w)
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
		
		if(obj instanceof Tup4strR)
		{
			Tup4strR other = (Tup4strR) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			if(!getZ().equals(other.getZ())) return false;
			if(!getW().equals(other.getW())) return false;
			
			return true;
		}
		
		if(obj instanceof TupstrR)
		{
			TupstrR other = (TupstrR) obj;
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
	public Tup4str clone()
	{
		return new Tup4str(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup4str(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}

	/** {@inheritDoc}} */
	@Override
	public Tup4str set(TupstrR t)
	{
		return (Tup4str)Tup4strC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str setArray(String... values)
	{
		return (Tup4str)Tup4strC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4str setByIndex(int index, String value)
	{
		return (Tup4str)Tup4strC.super.setByIndex(index, value);
	}
}