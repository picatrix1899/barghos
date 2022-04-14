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

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple2.Tup2bigdR;

/**
 * Represents an immutable readonly 2-dimensional {@link BigDecimal} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 */
public class ImmutableTup2bigd implements Tup2bigdR, FormattableToString
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
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} from an existing instance of {@link TupbigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigdR} to adopt the values from.
	 */
	public ImmutableTup2bigd(TupbigdR t)
	{
		this(t.toArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} from an existing instance of {@link Tup2bigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bigdR} to adopt the values from.
	 */
	public ImmutableTup2bigd(Tup2bigdR t)
	{
		this(t.getX(), t.getY());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 */
	public ImmutableTup2bigd(BigDecimal value)
	{
		this(value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public ImmutableTup2bigd(BigDecimal[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 */
	public ImmutableTup2bigd(BigDecimal x, BigDecimal y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getY()
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
	public ImmutableTup2bigd clone()
	{
		return new ImmutableTup2bigd(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2bigdR)
		{
			Tup2bigdR other = (Tup2bigdR) obj;
			if(getX().compareTo(other.getX()) != 0) return false;
			if(getY().compareTo(other.getY()) != 0) return false;
		
			return true;
		}
		
		if(obj instanceof TupbigdR)
		{
			TupbigdR other = (TupbigdR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX().compareTo(other.getByIndex(0)) != 0) return false;
			if(getY().compareTo(other.getByIndex(1)) != 0) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "immutableTup2bigd(x=" + getX() + ", y=" + getY() + ")";
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
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}