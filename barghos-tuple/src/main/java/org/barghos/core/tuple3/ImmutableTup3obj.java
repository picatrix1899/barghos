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
//import org.barghos.tuple.api.t3.Tup3objR;
//import org.barghos.tuple.api.tn.TupobjR;
//
///**
// * Represents an immutable readonly 3-dimensional {@link Object} tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup3obj implements Tup3objR
//{
//	/**
//	 * The x component.
//	 */
//	public final Object x;
//	
//	/**
//	 * The y component.
//	 */
//	public final Object y;
//	
//	/**
//	 * The z component.
//	 */
//	public final Object z;
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
//	 * Generates a new readonly {@link ImmutableTup3obj} from an existing instance of {@link TupobjR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupobjR} to adopt the values from.
//	 */
//	public ImmutableTup3obj(TupobjR t)
//	{
//		this(t.toArray());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3obj} from an existing instance of {@link Tup3objR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup3objR} to adopt the values from.
//	 */
//	public ImmutableTup3obj(Tup3objR t)
//	{
//		this(t.getX(), t.getY(), t.getZ());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3obj} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup3obj(Object value)
//	{
//		this(value, value, value);
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3obj} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 * @param z The z value.
//	 */
//	public ImmutableTup3obj(Object x, Object y, Object z)
//	{
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3obj} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public ImmutableTup3obj(Object[] v)
//	{
//		this.x = v[0];
//		this.y = v[1];
//		this.z = v[2];
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Object getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Object getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Object getZ()
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
//		if(obj instanceof Tup3objR)
//		{
//			Tup3objR other = (Tup3objR) obj;
//			if(!getX().equals(other.getX())) return false;
//			if(!getY().equals(other.getY())) return false;
//			if(!getZ().equals(other.getZ())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupobjR)
//		{
//			TupobjR other = (TupobjR) obj;
//			if(getDimensions() != other.getDimensions()) return false;
//			if(!getX().equals(other.getByIndex(0))) return false;
//			if(!getY().equals(other.getByIndex(1))) return false;
//			if(!getZ().equals(other.getByIndex(2))) return false;
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
//		return "immutableTup3obj(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup3obj clone()
//	{
//		return new ImmutableTup3obj(this);
//	}
//	
//	/**
//	 * This method generates the hashCode and stores it in the member for later use.
//	 */
//	protected void generateHashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + getX().hashCode();
//		result = prime * result + getY().hashCode();
//		result = prime * result + getZ().hashCode();
//		
//		this.hashCode = result;
//		this.isHashCodeGenerated = true;
//	}
//}