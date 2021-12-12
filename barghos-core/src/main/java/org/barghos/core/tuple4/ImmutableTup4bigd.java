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

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple4.Tup4bigdR;

/**
 * Represents an immutable readonly 4-dimensional {@link BigDecimal} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup4bigd implements Tup4bigdR, FormattableToString
{
	/**
	 * The x component.
	 */
	public final BigDecimal x;
	
	/**
	 * The y component.
	 */
	public final BigDecimal y;
	
	/**
	 * The z component.
	 */
	public final BigDecimal z;
	
	/**
	 * The w component.
	 */
	public final BigDecimal w;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup4bigd} from an existing instance of {@link TupbigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigdR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup4bigd(TupbigdR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4bigd} from an existing instance of {@link Tup4bigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4bigdR} to adopt the values from.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4bigd(Tup4bigdR t)
	{
		this(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4bigd} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4bigd(BigDecimal value)
	{
		this(value, value, value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4bigd} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.
	 * @param w The w value.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4bigd(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4bigd} with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup4bigd(BigDecimal[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
		this.w = v[3];
	}
	
	@Override
	public BigDecimal getX()
	{
		return this.x;
	}
	
	@Override
	public BigDecimal getY()
	{
		return this.y;
	}
	
	@Override
	public BigDecimal getZ()
	{
		return this.z;
	}
	
	@Override
	public BigDecimal getW()
	{
		return this.w;
	}
	
	@Override
	public int hashCode()
	{
		if(!isHashCodeGenerated) generateHashCode();
		
		return this.hashCode;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup4bigdR)
		{
			Tup4bigdR other = (Tup4bigdR) obj;
			if(getX().compareTo(other.getX()) != 0) return false;
			if(getY().compareTo(other.getY()) != 0) return false;
			if(getZ().compareTo(other.getZ()) != 0) return false;
			if(getW().compareTo(other.getW()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigdR)
		{
			TupbigdR other = (TupbigdR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX().compareTo(other.getByIndex(0)) != 0) return false;
			if(getY().compareTo(other.getByIndex(1)) != 0) return false;
			if(getZ().compareTo(other.getByIndex(2)) != 0) return false;
			if(getW().compareTo(other.getByIndex(3)) != 0) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup4bigd(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}
	
	@Override
	public ImmutableTup4bigd clone()
	{
		return new ImmutableTup4bigd(this);
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
	public ImmutableTup4bigd getNewInstance(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w)
	{
		return new ImmutableTup4bigd(x, y, z, w);
	}
	
	@Override
	public ImmutableTup4bigd getNewInstance(BigDecimal value)
	{
		return (ImmutableTup4bigd)Tup4bigdR.super.getNewInstance(value);
	}
	
	@Override
	public ImmutableTup4bigd getNewInstance(Tup4bigdR t)
	{
		return (ImmutableTup4bigd)Tup4bigdR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup4bigd getNewInstance(TupbigdR t)
	{
		return (ImmutableTup4bigd)Tup4bigdR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup4bigd getNewInstanceFromArray(BigDecimal... values)
	{
		return (ImmutableTup4bigd)Tup4bigdR.super.getNewInstanceFromArray(values);
	}
	
	/**
	 * This method generates the hashCode and stores it in the member for later use.
	 */
	protected void generateHashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		result = prime * result + getZ().hashCode();
		result = prime * result + getW().hashCode();
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}