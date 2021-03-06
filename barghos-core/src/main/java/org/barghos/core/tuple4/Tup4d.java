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
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple4.Tup4dR;
import org.barghos.core.api.tuple4.Tup4dRW;
import org.barghos.core.api.util.ArgumentNullException;
import org.barghos.core.Barghos;

/**
 * This class represents a 4-dimensional double tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup4d implements Tup4dRW, Serializable, FormattableToString
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
	 * The z component.
	 */
	public double z;
	
	/**
	 * The w component.
	 */
	public double w;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4d()
	{
		set(0.0f);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4dR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4d(Tup4dR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4d(double value)
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
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4d(double x, double y, double z, double w)
	{
		set(x, y, z, w);
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
	public double getZ()
	{
		return this.z;
	}
	
	@Override
	public double getW()
	{
		return this.w;
	}
	
	@Override
	public Tup4d setX(double x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup4d setY(double y)
	{
		this.y = y;
		
		return this;
	}
	
	@Override
	public Tup4d setZ(double z)
	{
		this.z = z;
		
		return this;
	}
	
	@Override
	public Tup4d setW(double w)
	{
		this.w = w;
		
		return this;
	}
	
	@Override
	public Tup4d set(Tup4dR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	public Tup4d set(double value)
	{
		return set(value, value, value, value);
	}
	
	@Override
	public Tup4d set(double x, double y, double z, double w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
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
		temp = Double.doubleToLongBits(getZ());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getW());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Tup4dR)) return false;
		
		Tup4dR other = (Tup4dR) obj;
		if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
		if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
		if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getZ())) return false;
		if(Double.doubleToLongBits(getW()) != Double.doubleToLongBits(other.getW())) return false;
		return true;
	}
	
	@Override
	public Tup4d clone()
	{
		return new Tup4d(this);
	}
	
	@Override
	public String toString()
	{
		return "tup4d(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}
	
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
	
	@Override
	public Tup4d getNewInstance(double x, double y, double z, double w)
	{
		return new Tup4d(x, y, z, w);
	}
}