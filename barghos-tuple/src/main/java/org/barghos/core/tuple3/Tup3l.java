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
//import java.io.Serializable;
//
//import org.barghos.tuple.api.tn.TuplR;
//import org.barghos.tuple.api.tn3.Tup3lC;
//import org.barghos.tuple.api.tn3.Tup3lR;
//
///**
// * This class represents a 3-dimensional long tuple.
// * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
// * where the data of a vector describes the same logical structure.
// * 
// * @author picatrix1899
// */
//public class Tup3l implements Tup3lC, Serializable
//{
//	/**
//	 * The class version for serialization.
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	/**
//	 * The x component.
//	 */
//	public long x;
//	
//	/**
//	 * The y component.
//	 */
//	public long y;
//	
//	/**
//	 * The z component.
//	 */
//	public long z;
//	
//	/**
//	 * Creates a new instance with all components set to 0.
//	 * 
//	 * @since 1.0.0.0
//	 */
//	public Tup3l()
//	{
//		set(0);
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link TuplR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
//	 */
//	public Tup3l(TuplR t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link Tup3lR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup3lR} to adopt the values from.
//	 */
//	public Tup3l(Tup3lR t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance with all values set to a single value.
//	 * 
//	 * @param value The value used as the initial value for all values of the tuple.
//	 */
//	public Tup3l(long value)
//	{
//		set(value);
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param x The initial x value of the tuple.
//	 * @param y The initial y value of the tuple.
//	 * @param z The initial z value of the tuple.
//	 */
//	public Tup3l(long x, long y, long z)
//	{
//		set(x, y, z);
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public Tup3l(long[] v)
//	{
//		setArray(v);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public long getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public long getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public long getZ()
//	{
//		return this.z;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l setX(long x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l setY(long y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l setZ(long z)
//	{
//		this.z = z;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l set(Tup3lR t)
//	{
//		return set(t.getX(), t.getY(), t.getZ());
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l set(long value)
//	{
//		return set(value, value, value);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l set(long x, long y, long z)
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
//		result = prime * result + (int) (getX() ^ (getX() >>> 32));
//		result = prime * result + (int) (getY() ^ (getY() >>> 32));
//		result = prime * result + (int) (getZ() ^ (getZ() >>> 32));
//		return result;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		
//		if(obj instanceof Tup3lR)
//		{
//			Tup3lR other = (Tup3lR) obj;
//			if(getX() != other.getX()) return false;
//			if(getY() != other.getY()) return false;
//			if(getZ() != other.getZ()) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TuplR)
//		{
//			TuplR other = (TuplR) obj;
//			if(getDimensions() != other.getDimensions()) return false;
//			if(getX() != other.getByIndex(0)) return false;
//			if(getY() != other.getByIndex(1)) return false;
//			if(getZ() != other.getByIndex(2)) return false;
//			
//			return true;
//		}
//		
//		return false;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l clone()
//	{
//		return new Tup3l(this);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "tup3l(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l set(TuplR t)
//	{
//		return (Tup3l)Tup3lC.super.set(t);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l setArray(long... values)
//	{
//		return (Tup3l)Tup3lC.super.setArray(values);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup3l setByIndex(int index, long value)
//	{
//		return (Tup3l)Tup3lC.super.setByIndex(index, value);
//	}
//}