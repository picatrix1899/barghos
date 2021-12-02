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
import org.barghos.core.api.tuple3.Tup3oR;

/**
 * Represents an immutable readonly 3-dimensional {@link Object} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup3o<X,Y,Z> implements Tup3oR<X,Y,Z>, FormattableToString
{
	/**
	 * The x component.
	 */
	public final X x;
	
	/**
	 * The y component.
	 */
	public final Y y;
	
	/**
	 * The z component.
	 */
	public final Z z;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup3o} from an existing instance of {@link Tup3oR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3oR} to adopt the values from.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3o(Tup3oR<X,Y,Z> t)
	{
		this(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3o} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.

	 * @since 1.0.0.0
	 */
	public ImmutableTup3o(X x, Y y, Z z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public X getX()
	{
		return this.x;
	}
	
	@Override
	public Y getY()
	{
		return this.y;
	}
	
	@Override
	public Z getZ()
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
		
		if(obj instanceof Tup3oR)
		{
			@SuppressWarnings("unchecked")
			Tup3oR<X,Y,Z> other = (Tup3oR<X,Y,Z>) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			if(!getZ().equals(other.getZ())) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup3o(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	@Override
	public ImmutableTup3o<X,Y,Z> clone()
	{
		return new ImmutableTup3o<X,Y,Z>(this);
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
	public ImmutableTup3o<X,Y,Z> getNewInstance(X x, Y y, Z z)
	{
		return new ImmutableTup3o<X,Y,Z>(x, y, z);
	}
	
	@Override
	public ImmutableTup3o<X,Y,Z> getNewInstance(Tup3oR<X,Y,Z> t)
	{
		return (ImmutableTup3o<X,Y,Z>)Tup3oR.super.getNewInstance(t);
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