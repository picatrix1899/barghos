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

package org.barghos.core.tuple3;

import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple3.Tup3strR;

/**
 * Represents an immutable readonly 3-dimensional {@link String} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup3str implements Tup3strR, FormattableToString
{
	/**
	 * The x component.
	 */
	public final String x;
	
	/**
	 * The y component.
	 */
	public final String y;
	
	/**
	 * The z component.
	 */
	public final String z;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup3str} from an existing instance of {@link TupstrR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupstrR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup3str(TupstrR t)
	{
		this(t.getArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3str} from an existing instance of {@link Tup3strR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3strR} to adopt the values from.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3str(Tup3strR t)
	{
		this(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3str} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3str(String value)
	{
		this(value, value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3str} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3str(String x, String y, String z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3str} with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public ImmutableTup3str(String[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
	}
	
	@Override
	public String getX()
	{
		return this.x;
	}
	
	@Override
	public String getY()
	{
		return this.y;
	}
	
	@Override
	public String getZ()
	{
		return this.z;
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
		
		if(obj instanceof Tup3strR)
		{
			Tup3strR other = (Tup3strR) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			if(!getZ().equals(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof TupstrR)
		{
			TupstrR other = (TupstrR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(!getX().equals(other.getByIndex(0))) return false;
			if(!getY().equals(other.getByIndex(1))) return false;
			if(!getZ().equals(other.getByIndex(2))) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup3str(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	@Override
	public ImmutableTup3str clone()
	{
		return new ImmutableTup3str(this);
	}
	
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		values.put("z", getZ());
		
		return values;
	}
	
	@Override
	public ImmutableTup3str getNewInstance(String x, String y, String z)
	{
		return new ImmutableTup3str(x, y, z);
	}
	
	@Override
	public ImmutableTup3str getNewInstance(String value)
	{
		return (ImmutableTup3str)Tup3strR.super.getNewInstance(value);
	}
	
	@Override
	public ImmutableTup3str getNewInstance(Tup3strR t)
	{
		return (ImmutableTup3str)Tup3strR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup3str getNewInstance(TupstrR t)
	{
		return (ImmutableTup3str)Tup3strR.super.getNewInstance(t);
	}
	
	@Override
	public ImmutableTup3str getNewInstanceFromArray(String... values)
	{
		return (ImmutableTup3str)Tup3strR.super.getNewInstanceFromArray(values);
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
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}