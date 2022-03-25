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
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple4.Tup4bigiBase;
import org.barghos.core.api.tuple4.Tup4bigiR;

/**
 * This class represents a 4-dimensional {@link BigInteger} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup4bigi implements Tup4bigiBase, Serializable, FormattableToString
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
	 * The w component.
	 * This must not be null.
	 */
	public BigInteger w;
	
	/**
	 * Creates a new instance with all components set to {@link BigInteger#ZERO}.
	 */
	public Tup4bigi()
	{
		set(BigInteger.ZERO);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigiR} to adopt the values from.
	 */
	public Tup4bigi(TupbigiR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4bigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4bigiR} to adopt the values from.
	 */
	public Tup4bigi(Tup4bigiR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup4bigi(BigInteger value)
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
	public Tup4bigi(BigInteger x, BigInteger y, BigInteger z, BigInteger w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup4bigi(BigInteger[] v)
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
	public BigInteger getW()
	{
		return this.w;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi setX(BigInteger x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi setY(BigInteger y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi setZ(BigInteger z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi setW(BigInteger w)
	{
		this.w = w;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi set(Tup4bigiR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi set(BigInteger value)
	{
		return set(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi set(BigInteger x, BigInteger y, BigInteger z, BigInteger w)
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
		
		if(obj instanceof Tup4bigiR)
		{
			Tup4bigiR other = (Tup4bigiR) obj;
			if(getX().compareTo(other.getX()) != 0) return false;
			if(getY().compareTo(other.getY()) != 0) return false;
			if(getZ().compareTo(other.getZ()) != 0) return false;
			if(getW().compareTo(other.getW()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigiR)
		{
			TupbigiR other = (TupbigiR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX().compareTo(other.getByIndex(0)) != 0) return false;
			if(getY().compareTo(other.getByIndex(1)) != 0) return false;
			if(getZ().compareTo(other.getByIndex(2)) != 0) return false;
			if(getW().compareTo(other.getByIndex(3)) != 0) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi clone()
	{
		return new Tup4bigi(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup4bigi(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		values.put("z", getZ());
		values.put("w", getW());
		
		return values;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi set(TupbigiR t)
	{
		return (Tup4bigi)Tup4bigiBase.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi setArray(BigInteger... values)
	{
		return (Tup4bigi)Tup4bigiBase.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4bigi setByIndex(int index, BigInteger value)
	{
		return (Tup4bigi)Tup4bigiBase.super.setByIndex(index, value);
	}
}