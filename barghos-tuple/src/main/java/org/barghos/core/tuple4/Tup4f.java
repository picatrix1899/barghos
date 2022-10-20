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

import org.barghos.tuple.api.t4.Tup4fC;
import org.barghos.tuple.api.t4.Tup4fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class represents a 3-dimensional float tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup4f implements Tup4fC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public float x;
	
	/**
	 * The y component.
	 */
	public float y;
	
	/**
	 * The z component.
	 */
	public float z;
	
	/**
	 * The w component.
	 */
	public float w;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup4f()
	{
		set(0.0f);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupfR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 */
	public Tup4f(TupfR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4fR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4fR} to adopt the values from.
	 */
	public Tup4f(Tup4fR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup4f(float value)
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
	public Tup4f(float x, float y, float z, float w)
	{
		set(x, y, z, w);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public Tup4f(float[] v)
	{
		setArray(v);
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getW()
	{
		return this.w;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f setX(float x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f setY(float y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f setZ(float z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f setW(float w)
	{
		this.w = w;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f set(Tup4fR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f set(float value)
	{
		return set(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f set(float x, float y, float z, float w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(getX());
		result = prime * result + Float.floatToIntBits(getY());
		result = prime * result + Float.floatToIntBits(getZ());
		result = prime * result + Float.floatToIntBits(getW());
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup4fR)
		{
			Tup4fR other = (Tup4fR) obj;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getZ())) return false;
			if(Float.floatToIntBits(getW()) != Float.floatToIntBits(other.getW())) return false;
			
			return true;
		}
		
		if(obj instanceof TupfR)
		{
			TupfR other = (TupfR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getByIndex(0))) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getByIndex(1))) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getByIndex(2))) return false;
			if(Float.floatToIntBits(getW()) != Float.floatToIntBits(other.getByIndex(3))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f clone()
	{
		return new Tup4f(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup4f(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}

	/** {@inheritDoc}} */
	@Override
	public Tup4f set(TupfR t)
	{
		return (Tup4f)Tup4fC.super.set(t);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f setArray(float... values)
	{
		return (Tup4f)Tup4fC.super.setArray(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup4f setByIndex(int index, float value)
	{
		return (Tup4f)Tup4fC.super.setByIndex(index, value);
	}
}