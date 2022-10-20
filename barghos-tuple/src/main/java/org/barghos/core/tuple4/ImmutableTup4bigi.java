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
//import java.math.BigInteger;
//
//import org.barghos.tuple.api.tn.TupbigiR;
//import org.barghos.tuple.api.tn4.Tup4bigiR;
//
///**
// * Represents an immutable readonly 4-dimensional {@link BigInteger} tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup4bigi implements Tup4bigiR
//{
//	/**
//	 * The x component.
//	 */
//	public final BigInteger x;
//	
//	/**
//	 * The y component.
//	 */
//	public final BigInteger y;
//	
//	/**
//	 * The z component.
//	 */
//	public final BigInteger z;
//	
//	/**
//	 * The w component.
//	 */
//	public final BigInteger w;
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
//	 * Generates a new readonly {@link ImmutableTup4bigi} from an existing instance of {@link TupbigiR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupbigiR} to adopt the values from.
//	 */
//	public ImmutableTup4bigi(TupbigiR t)
//	{
//		this(t.toArray());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4bigi} from an existing instance of {@link Tup4bigiR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup4bigiR} to adopt the values from.
//	 */
//	public ImmutableTup4bigi(Tup4bigiR t)
//	{
//		this(t.getX(), t.getY(), t.getZ(), t.getW());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4bigi} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup4bigi(BigInteger value)
//	{
//		this(value, value, value, value);
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4bigi} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 * @param z The z value.
//	 * @param w The w value.
//	 */
//	public ImmutableTup4bigi(BigInteger x, BigInteger y, BigInteger z, BigInteger w)
//	{
//		this.x = x;
//		this.y = y;
//		this.z = z;
//		this.w = w;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup4bigi} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public ImmutableTup4bigi(BigInteger[] v)
//	{
//		this.x = v[0];
//		this.y = v[1];
//		this.z = v[2];
//		this.w = v[3];
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public BigInteger getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public BigInteger getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public BigInteger getZ()
//	{
//		return this.z;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public BigInteger getW()
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
//		if(obj instanceof Tup4bigiR)
//		{
//			Tup4bigiR other = (Tup4bigiR) obj;
//			if(getX().compareTo(other.getX()) != 0) return false;
//			if(getY().compareTo(other.getY()) != 0) return false;
//			if(getZ().compareTo(other.getZ()) != 0) return false;
//			if(getW().compareTo(other.getW()) != 0) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupbigiR)
//		{
//			TupbigiR other = (TupbigiR) obj;
//			if(getDimensions() != other.getDimensions()) return false;
//			if(getX().compareTo(other.getByIndex(0)) != 0) return false;
//			if(getY().compareTo(other.getByIndex(1)) != 0) return false;
//			if(getZ().compareTo(other.getByIndex(2)) != 0) return false;
//			if(getW().compareTo(other.getByIndex(3)) != 0) return false;
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
//		return "immutableTup4bigi(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup4bigi clone()
//	{
//		return new ImmutableTup4bigi(this);
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
//		result = prime * result + getW().hashCode();
//		
//		this.hashCode = result;
//		this.isHashCodeGenerated = true;
//	}
//}