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
//import org.barghos.tuple.api.tn.TupdR;
//import org.barghos.tuple.api.tn3.Tup3dR;
//
///**
// * Represents an immutable readonly 3-dimensional double tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup3d implements Tup3dR
//{
//	/**
//	 * The x component.
//	 */
//	public final double x;
//	
//	/**
//	 * The y component.
//	 */
//	public final double y;
//	
//	/**
//	 * The z component.
//	 */
//	public final double z;
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
//	 * Generates a new readonly {@link ImmutableTup3d} from an existing instance of {@link TupdR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
//	 */
//	public ImmutableTup3d(TupdR t)
//	{
//		this(t.toArray());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3d} from an existing instance of {@link Tup3dR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup3dR} to adopt the values from.
//	 */
//	public ImmutableTup3d(Tup3dR t)
//	{
//		this(t.getX(), t.getY(), t.getZ());
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3d} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup3d(double value)
//	{
//		this(value, value, value);
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3d} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 * @param z The z value.
//	 */
//	public ImmutableTup3d(double x, double y, double z)
//	{
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup3d} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public ImmutableTup3d(double[] v)
//	{
//		this.x = v[0];
//		this.y = v[1];
//		this.z = v[2];
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double getZ()
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
//		if(obj instanceof Tup3dR)
//		{
//			Tup3dR other = (Tup3dR) obj;
//			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
//			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
//			if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getZ())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupdR)
//		{
//			TupdR other = (TupdR) obj;
//			if(getDimensions() != other.getDimensions()) return false;
//			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getByIndex(0))) return false;
//			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getByIndex(1))) return false;
//			if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getByIndex(2))) return false;
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
//		return "immutableTup3d(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup3d clone()
//	{
//		return new ImmutableTup3d(this);
//	}
//	
//	/**
//	 * This method generates the hashCode and stores it in the member for later use.
//	 */
//	protected void generateHashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		long temp = Double.doubleToLongBits(getX());
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(getY());
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(getZ());
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		
//		this.hashCode = result;
//		this.isHashCodeGenerated = true;
//	}
//}