///*******************************************************************************
// * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
// * 
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// * 
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// * 
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// ******************************************************************************/
//
//package org.barghos.core.tuple3;
//
//import org.barghos.tuple.api.t3.Tup3oC;
//import org.barghos.tuple.api.t3.Tup3oR;
//
///**
// * This class represents a 3-dimensional {@link Object} tuple.
// * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
// * where the data of a vector describes the same logical structure.
// * 
// * @param <X> The type of the x component.
// * @param <Y> The type of the y component.
// * @param <Z> The type of the z component.
// * 
// * @author picatrix1899
// */
//public class Tup3o<X,Y,Z> implements Tup3oC<X,Y,Z>
//{
//	/**
//	 * The x component.
//	 * This must not be null.
//	 */
//	public X x;
//	
//	/**
//	 * The y component.
//	 * This must not be null.
//	 */
//	public Y y;
//	
//	/**
//	 * The z component.
//	 * This must not be null.
//	 */
//	public Z z;
//	
//	/**
//	 * Creates a new instance with all components set to null.
//	 */
//	public Tup3o() { }
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link Tup3oR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup3oR} to adopt the values from.
//	 */
//	public Tup3o(Tup3oR<X,Y,Z> t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param x The initial x value of the tuple.
//	 * @param y The initial y value of the tuple.
//	 * @param z The initial z value of the tuple.
//	 */
//	public Tup3o(X x, Y y, Z z)
//	{
//		set(x, y, z);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public X getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Y getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Z getZ()
//	{
//		return this.z;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3o<X,Y,Z> setX(X x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3o<X,Y,Z> setY(Y y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3o<X,Y,Z> setZ(Z z)
//	{
//		this.z = z;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3o<X,Y,Z> set(Tup3oR<X,Y,Z> t)
//	{
//		return set(t.getX(), t.getY(), t.getZ());
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3o<X,Y,Z> set(X x, Y y, Z z)
//	{
//		return setX(x).setY(y).setZ(z);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + getX().hashCode();
//		result = prime * result + getY().hashCode();
//		result = prime * result + getZ().hashCode();
//		return result;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		if(!(obj instanceof Tup3oR)) return false;
//		
//		@SuppressWarnings("unchecked")
//		Tup3oR<X,Y,Z> other = (Tup3oR<X,Y,Z>) obj;
//		if(!getX().equals(other.getX())) return false;
//		if(!getY().equals(other.getY())) return false;
//		if(!getZ().equals(other.getZ())) return false;
//		return true;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3o<X,Y,Z> clone()
//	{
//		return new Tup3o<X,Y,Z>(this);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "tup3o(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
//	}
//}