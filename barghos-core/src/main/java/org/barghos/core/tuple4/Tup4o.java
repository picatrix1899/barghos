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
import org.barghos.core.api.tuple4.Tup4oRW;
import org.barghos.core.api.util.ArgumentNullException;
import org.barghos.core.Barghos;

/**
 * This class represents a 4-dimensional object tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup4o<X,Y,Z,W> implements Tup4oRW<X,Y,Z,W>, FormattableToString
{
	/**
	 * The x component.
	 * This must not be null.
	 */
	public X x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public Y y;
	
	/**
	 * The z component.
	 * This must not be null.
	 */
	public Z z;
	
	/**
	 * The w component.
	 * This must not be null.
	 */
	public W w;
	
	/**
	 * Creates a new instance with all components set to null.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4o() { }
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup4oR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4oR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup4o(Tup4oR<X,Y,Z,W> t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
			if(t.getX() == null) throw new ArgumentNullException("t.getX()");
			if(t.getY() == null) throw new ArgumentNullException("t.getY()");
			if(t.getZ() == null) throw new ArgumentNullException("t.getZ()");
		}
		
		set(t);
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
	public Tup4o(X x, Y y, Z z, W w)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(x == null) throw new ArgumentNullException("x");
			if(y == null) throw new ArgumentNullException("y");
			if(z == null) throw new ArgumentNullException("z");
			if(w == null) throw new ArgumentNullException("w");
		}
		
		set(x, y, z, w);
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
	public Tup4o<X,Y,Z,W> setX(X x)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(x == null) throw new ArgumentNullException("x");
		}
		
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup4o<X,Y,Z,W> setY(Y y)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(y == null) throw new ArgumentNullException("y");
		}
		
		this.y = y;
		
		return this;
	}
	
	@Override
	public Tup4o<X,Y,Z,W> setZ(Z z)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(z == null) throw new ArgumentNullException("z");
		}
		
		this.z = z;
		
		return this;
	}
	
	@Override
	public Tup4o<X,Y,Z,W> setW(W w)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(w == null) throw new ArgumentNullException("w");
		}
		
		this.w = w;
		
		return this;
	}
	
	@Override
	public Tup4o<X,Y,Z,W> set(Tup4oR<X,Y,Z,W> t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
			if(t.getX() == null) throw new ArgumentNullException("t.getX()");
			if(t.getY() == null) throw new ArgumentNullException("t.getY()");
			if(t.getZ() == null) throw new ArgumentNullException("t.getZ()");
		}
		
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	public Tup4o<X,Y,Z,W> set(X x, Y y, Z z, W w)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(x == null) throw new ArgumentNullException("x");
			if(y == null) throw new ArgumentNullException("y");
			if(z == null) throw new ArgumentNullException("z");
			if(w == null) throw new ArgumentNullException("w");
		}
		
		return setX(x).setY(y).setZ(z).setW(w);
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		result = prime * result + getZ().hashCode();
		result = prime * result + getW().hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Tup4oR)) return false;
		
		@SuppressWarnings("unchecked")
		Tup4oR<X,Y,Z,W> other = (Tup4oR<X,Y,Z,W>) obj;
		if(!getX().equals(other.getX())) return false;
		if(!getY().equals(other.getY())) return false;
		if(!getZ().equals(other.getZ())) return false;
		if(!getW().equals(other.getW())) return false;
		return true;
	}
	
	@Override
	public Tup4o<X,Y,Z,W> clone()
	{
		return new Tup4o<X,Y,Z,W>(this);
	}
	
	@Override
	public String toString()
	{
		return "tup4o(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
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
	public Tup4o<X,Y,Z,W> getNewInstance(X x, Y y, Z z, W w)
	{
		return new Tup4o<>(x, y, z, w);
	}
}