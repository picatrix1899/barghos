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
//import org.barghos.tuple.api.tn.TuplR;
//import org.barghos.tuple.api.tn3.Tup3lR;
//
///**
// * Represents an immutable readonly 3-dimensional int tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup3l implements Tup3lR
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
//	 * Generates a new readonly {@link ImmutableTup3l} from an existing instance of {@link TuplR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
//	 */
//	public ImmutableTup3l(TuplR t)
//	{
//		this(t.toArray());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3l} from an existing instance of {@link Tup3lR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup3lR} to adopt the values from.
//	 */
//	public ImmutableTup3l(Tup3lR t)
//	{
//		this(t.getX(), t.getY(), t.getZ());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3l} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup3l(long value)
//	{
//		this(value, value, value);
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3l} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 * @param z The z value.
//	 */
//	public ImmutableTup3l(long x, long y, long z)
//	{
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3l} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public ImmutableTup3l(long[] v)
//	{
//		this.x = v[0];
//		this.y = v[1];
//		this.z = v[2];
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
//	public String toString()
//	{
//		return "immutableTup3l(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup3l clone()
//	{
//		return new ImmutableTup3l(this);
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
//		
//		this.hashCode = result;
//		this.isHashCodeGenerated = true;
//	}
//}