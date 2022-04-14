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

import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;

/**
 * Represents an immutable readonly 2-dimensional double tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 */
public class ImmutableTup2d implements Tup2dR, FormattableToString
{
	/**
	 * The x component.
	 */
	public final double x;
	
	/**
	 * The y component.
	 */
	public final double y;

	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup2d} from an existing instance of {@link TupdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 */
	public ImmutableTup2d(TupdR t)
	{
		this(t.toArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2d} from an existing instance of {@link Tup2dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
	 */
	public ImmutableTup2d(Tup2dR t)
	{
		this(t.getX(), t.getY());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2d} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 */
	public ImmutableTup2d(double value)
	{
		this(value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2d} with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public ImmutableTup2d(double[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2d} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 */
	public ImmutableTup2d(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public double getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public double getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		if(!this.isHashCodeGenerated) generateHashCode();
		return this.hashCode;
	}
	
	/** {@inheritDoc}} */
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
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "immutableTup2d(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public ImmutableTup2d clone()
	{
		return new ImmutableTup2d(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		
		return values;
	}
	
	/**
	 * This method generates the hashCode and stores it in the member for later use.
	 */
	protected void generateHashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp = Double.doubleToLongBits(getX());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getY());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}