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

import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple4.Tup4cR;

/**
 * Represents an immutable readonly 4-dimensional char tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup4c implements Tup4cR, FormattableToString
{
	/**
	 * The x component.
	 */
	public final char x;
	
	/**
	 * The y component.
	 */
	public final char y;
	
	/**
	 * The z component.
	 */
	public final char z;
	
	/**
	 * The w component.
	 */
	public final char w;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup4c} from an existing instance of {@link TupcR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupcR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup4c(TupcR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4c} from an existing instance of {@link Tup4cR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4cR} to adopt the values from.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4c(Tup4cR t)
	{
		this(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4c} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4c(char value)
	{
		this(value, value, value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4c} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.
	 * @param w The w value.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4c(char x, char y, char z, char w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4c} with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup4c(char[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
		this.w = v[3];
	}
	
	@Override
	public char getX()
	{
		return this.x;
	}
	
	@Override
	public char getY()
	{
		return this.y;
	}
	
	@Override
	public char getZ()
	{
		return this.z;
	}
	
	@Override
	public char getW()
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
		
		if(obj instanceof Tup4cR)
		{
			Tup4cR other = (Tup4cR) obj;
			if(getX() != other.getX()) return false;
			if(getY() != other.getY()) return false;
			if(getZ() != other.getZ()) return false;
			if(getW() != other.getW()) return false;
			
			return true;
		}
		
		if(obj instanceof TupcR)
		{
			TupcR other = (TupcR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX() != other.getByIndex(0)) return false;
			if(getY() != other.getByIndex(1)) return false;
			if(getZ() != other.getByIndex(2)) return false;
			if(getW() != other.getByIndex(3)) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup4c(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() +  ")";
	}
	
	@Override
	public ImmutableTup4c clone()
	{
		return new ImmutableTup4c(this);
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
	public ImmutableTup4c getNewInstance(char x, char y, char z, char w)
	{
		return new ImmutableTup4c(x, y, z, w);
	}
	
	@Override
	public ImmutableTup4c getNewInstance(char value)
	{
		return (ImmutableTup4c)Tup4cR.super.getNewInstance(value);
	}
	
	@Override
	public ImmutableTup4c getNewInstance(Tup4cR t)
	{
		return (ImmutableTup4c)Tup4cR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup4c getNewInstance(TupcR t)
	{
		return (ImmutableTup4c)Tup4cR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup4c getNewInstanceFromArray(char... values)
	{
		return (ImmutableTup4c)Tup4cR.super.getNewInstanceFromArray(values);
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
		result = prime * result + getZ();
		result = prime * result + getW();
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}