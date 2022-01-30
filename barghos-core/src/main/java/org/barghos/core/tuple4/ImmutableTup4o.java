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
import org.barghos.core.api.tuple4.Tup4oR;

/**
 * Represents an immutable readonly 4-dimensional {@link Object} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class ImmutableTup4o<X,Y,Z,W> implements Tup4oR<X,Y,Z,W>, FormattableToString
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
	 * The w component.
	 */
	public final W w;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup4o} from an existing instance of {@link Tup4oR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4oR} to adopt the values from.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4o(Tup4oR<X,Y,Z,W> t)
	{
		this(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup4o} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.
	 * @param w The w value.

	 * @since 1.0.0.0
	 */
	public ImmutableTup4o(X x, Y y, Z z, W w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
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
	public W getW()
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
		
		if(obj instanceof Tup4oR)
		{
			@SuppressWarnings("unchecked")
			Tup4oR<X,Y,Z,W> other = (Tup4oR<X,Y,Z,W>) obj;
			if(!getX().equals(other.getX())) return false;
			if(!getY().equals(other.getY())) return false;
			if(!getZ().equals(other.getZ())) return false;
			if(!getW().equals(other.getW())) return false;
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "immutableTup4o(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}
	
	@Override
	public ImmutableTup4o<X,Y,Z,W> clone()
	{
		return new ImmutableTup4o<X,Y,Z,W>(this);
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
	public ImmutableTup4o<X,Y,Z,W> getNewInstance(X x, Y y, Z z, W w)
	{
		return new ImmutableTup4o<X,Y,Z,W>(x, y, z, w);
	}
	
	@Override
	public ImmutableTup4o<X,Y,Z,W> getNewInstance(Tup4oR<X,Y,Z,W> t)
	{
		return (ImmutableTup4o<X,Y,Z,W>)Tup4oR.super.getNewInstance(t);
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