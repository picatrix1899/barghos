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

package org.barghos.core.tuple2;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;

/**
 * This class represents a 2-dimensional float tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup2f implements Tup2fRW, Serializable, FormattableToString
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
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2f()
	{		
		set(0.0f);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupfR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2f(TupfR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2fR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2f(Tup2fR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2f(float value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2f(float[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2f(float x, float y)
	{
		set(x, y);
	}
	
	@Override
	public float getX()
	{
		return this.x;
	}
	
	@Override
	public float getY()
	{
		return this.y;
	}
	
	@Override
	public Tup2f setX(float x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup2f setY(float y)
	{
		this.y = y;
		
		return this;
	}
	
	@Override
	public Tup2f set(Tup2fR t)
	{
		return (Tup2f)Tup2fRW.super.set(t);
	}
	
	@Override
	public Tup2f set(float value)
	{
		return (Tup2f)Tup2fRW.super.set(value);
	}
	
	@Override
	public Tup2f set(float x, float y)
	{
		return (Tup2f)Tup2fRW.super.set(x, y);
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(getX());
		result = prime * result + Float.floatToIntBits(getY());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2fR)
		{
			Tup2fR other = (Tup2fR) obj;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
			
			return true;
		}
		
		if(obj instanceof TupfR)
		{
			TupfR other = (TupfR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getByIndex(0))) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getByIndex(1))) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "tup2f(x=" + getX() + ", y=" + getY() + ")";
	}
	
	@Override
	public Tup2f clone()
	{
		return new Tup2f(this);
	}
	
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		
		return values;
	}
	
	@Override
	public Tup2f getNewInstance(float x, float y)
	{
		return new Tup2f(x, y);
	}
	
	@Override
	public Tup2f getNewInstance(float value)
	{
		return (Tup2f)Tup2fRW.super.getNewInstance(value);
	}
	
	@Override
	public Tup2f getNewInstance(Tup2fR t)
	{
		return (Tup2f)Tup2fRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup2f getNewInstance(TupfR t)
	{
		return (Tup2f)Tup2fRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup2f getNewInstanceFromArray(float... values)
	{
		return (Tup2f)Tup2fRW.super.getNewInstanceFromArray(values);
	}
	
	@Override
	public Tup2f set(TupfR t)
	{
		return (Tup2f)Tup2fRW.super.set(t);
	}
	
	@Override
	public Tup2f setArray(float... values)
	{
		return (Tup2f)Tup2fRW.super.setArray(values);
	}
	
	@Override
	public Tup2f setByIndex(int index, float value)
	{
		return (Tup2f)Tup2fRW.super.setByIndex(index, value);
	}
}