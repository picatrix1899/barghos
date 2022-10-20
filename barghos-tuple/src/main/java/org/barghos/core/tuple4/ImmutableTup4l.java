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
//package org.barghos.core.tuple4;
//
//import org.barghos.tuple.api.tn.TuplR;
//import org.barghos.tuple.api.tn4.Tup4lR;
//
///**
// * Represents an immutable readonly 4-dimensional int tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup4l implements Tup4lR
//{
//	/**
//	 * The x component.
//	 */
//	public final long x;
//	
//	/**
//	 * The y component.
//	 */
//	public final long y;
//	
//	/**
//	 * The z component.
//	 */
//	public final long z;
//	
//	/**
//	 * The w component.
//	 */
//	public final long w;
//	
//	/**
//	 * The immutable hashCode.
//	 */
//	protected transient int hashCode;
//	
//	/**
//	 * The flag that shows that the hashCode has already been generated.
//	 */
//	protected transient boolean isHashCodeGenerated;
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4l} from an existing instance of {@link TuplR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
//	 */
//	public ImmutableTup4l(TuplR t)
//	{
//		this(t.toArray());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4l} from an existing instance of {@link Tup4lR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup4lR} to adopt the values from.
//	 */
//	public ImmutableTup4l(Tup4lR t)
//	{
//		this(t.getX(), t.getY(), t.getZ(), t.getW());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4l} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup4l(long value)
//	{
//		this(value, value, value, value);
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4l} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 * @param z The z value.
//	 * @param w The w value.
//	 */
//	public ImmutableTup4l(long x, long y, long z, long w)
//	{
//		this.x = x;
//		this.y = y;
//		this.z = z;
//		this.w = w;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4l} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public ImmutableTup4l(long[] v)
//	{
//		this.x = v[0];
//		this.y = v[1];
//		this.z = v[2];
//		this.w = v[3];
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
//	public long getW()
//	{
//		return this.w;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		if(!isHashCodeGenerated) generateHashCode();
//		
//		return this.hashCode;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		
//		if(obj instanceof Tup4lR)
//		{
//			Tup4lR other = (Tup4lR) obj;
//			if(getX() != other.getX()) return false;
//			if(getY() != other.getY()) return false;
//			if(getZ() != other.getZ()) return false;
//			if(getW() != other.getW()) return false;
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
//			if(getW() != other.getByIndex(3)) return false;
//			
//			return true;
//		}
//		
//		return false;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "immutableTup4l(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup4l clone()
//	{
//		return new ImmutableTup4l(this);
//	}
//	
//	/**
//	 * This method generates the hashCode and stores it in the member for later use.
//	 */
//	protected void generateHashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (getX() ^ (getX() >>> 32));
//		result = prime * result + (int) (getY() ^ (getY() >>> 32));
//		result = prime * result + (int) (getZ() ^ (getZ() >>> 32));
//		result = prime * result + (int) (getW() ^ (getW() >>> 32));
//		
//		this.hashCode = result;
//		this.isHashCodeGenerated = true;
//	}
//}