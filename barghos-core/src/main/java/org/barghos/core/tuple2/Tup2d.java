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
import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dRW;

/**
 * This class represents a 2-dimensional double tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup2d implements Tup2dRW, Serializable, FormattableToString
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public double x;
	
	/**
	 * The y component.
	 */
	public double y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2d()
	{
		set(0.0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2d(TupdR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2d(Tup2dR t)
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
	public Tup2d(double value)
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
	public Tup2d(double[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2d(double x, double y)
	{
		set(x, y);
	}
	
	@Override
	public double getX()
	{
		return this.x;
	}
	
	@Override
	public double getY()
	{
		return this.y;
	}
	
	@Override
	public Tup2d setX(double x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup2d setY(double y)
	{
		this.y = y;
		
		return this;
	}

	@Override
	public Tup2d set(Tup2dR t)
	{
		return (Tup2d)Tup2dRW.super.set(t);
	}
	
	@Override
	public Tup2d set(double value)
	{
		return (Tup2d)Tup2dRW.super.set(value);
	}
	
	@Override
	public Tup2d set(double x, double y)
	{
		return (Tup2d)Tup2dRW.super.set(x, y);
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp = Double.doubleToLongBits(getX());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getY());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2dR)
		{
			Tup2dR other = (Tup2dR) obj;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
			
			return true;
		}
		
		if(obj instanceof TupdR)
		{
			TupdR other = (TupdR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getByIndex(0))) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getByIndex(1))) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "tup2d(x=" + getX() + ", y=" + getY() + ")";
	}
	
	@Override
	public Tup2d clone()
	{
		return new Tup2d(this);
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
	public Tup2d getNewInstance(double x, double y)
	{
		return new Tup2d(x, y);
	}
	
	@Override
	public Tup2d getNewInstance(double value)
	{
		return (Tup2d)Tup2dRW.super.getNewInstance(value);
	}
	
	@Override
	public Tup2d getNewInstance(Tup2dR t)
	{
		return (Tup2d)Tup2dRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup2d getNewInstance(TupdR t)
	{
		return (Tup2d)Tup2dRW.super.getNewInstance(t);
	}
	
	@Override
	public Tup2d getNewInstanceFromArray(double... values)
	{
		return (Tup2d)Tup2dRW.super.getNewInstanceFromArray(values);
	}
	
	@Override
	public Tup2d set(TupdR t)
	{
		return (Tup2d)Tup2dRW.super.set(t);
	}
	
	@Override
	public Tup2d setArray(double... values)
	{
		return (Tup2d)Tup2dRW.super.setArray(values);
	}
	
	@Override
	public Tup2d setByIndex(int index, double value)
	{
		return (Tup2d)Tup2dRW.super.setByIndex(index, value);
	}
}