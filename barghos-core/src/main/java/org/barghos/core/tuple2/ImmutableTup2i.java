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
import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple2.Tup2iR;

/**
 * Represents an immutable readonly 2-dimensional integer tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup2i implements Tup2iR, FormattableToString
{
	/** 
	 * The x component.
	 */
	public final int x;
	
	/**
	 * The y component.
	 */
	public final int y;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup2i} from an existing instance of {@link TupiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupiR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup2i(TupiR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2i} from an existing instance of {@link Tup2iR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2iR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup2i(Tup2iR t)
	{
		this(t.getX(), t.getY());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2i} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup2i(int value)
	{
		this(value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2i} with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup2i(int[] v)
	{
		this.x = v[0];
		this.y = v[1];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2i} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup2i(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int getX()
	{
		return this.x;
	}
	
	@Override
	public int getY()
	{
		return this.y;
	}
	
	@Override
	public int hashCode()
	{
		if(!this.isHashCodeGenerated) generateHashCode();
		return this.hashCode;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(obj instanceof Tup2iR)
		{
			Tup2iR other = (Tup2iR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TupiR)
		{
			TupiR other = (TupiR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup2i(x=" + getX() + ", y=" + getY() + ")";
	}
	
	@Override
	public ImmutableTup2i clone()
	{
		return new ImmutableTup2i(this);
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
	public ImmutableTup2i getNewInstance(int x, int y)
	{
		return new ImmutableTup2i(x, y);
	}
	
	@Override
	public ImmutableTup2i getNewInstance(int value)
	{
		return (ImmutableTup2i)Tup2iR.super.getNewInstance(value);
	}
	
	@Override
	public ImmutableTup2i getNewInstance(Tup2iR t)
	{
		return (ImmutableTup2i)Tup2iR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup2i getNewInstance(TupiR t)
	{
		return (ImmutableTup2i)Tup2iR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup2i getNewInstanceFromArray(int... values)
	{
		return (ImmutableTup2i)Tup2iR.super.getNewInstanceFromArray(values);
	}
	
	/**
	 * This method generates the hashCode and stores it in the member for later use.
	 */
	protected void generateHashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX();
		result = prime * result + getY();
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}