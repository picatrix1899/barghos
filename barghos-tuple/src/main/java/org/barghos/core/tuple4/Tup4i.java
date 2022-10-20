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
//import java.io.Serializable;
//
//import org.barghos.tuple.api.tn.TupiR;
//import org.barghos.tuple.api.tn4.Tup4iC;
//import org.barghos.tuple.api.tn4.Tup4iR;
//
///**
// * This class represents a 4-dimensional integer tuple.
// * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
// * where the data of a vector describes the same logical structure.
// * 
// * @author picatrix1899
// */
//public class Tup4i implements Tup4iC, Serializable
//{
//	/**
//	 * The class version for serialization.
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	/**
//	 * The x component.
//	 */
//	public int x;
//	
//	/**
//	 * The y component.
//	 */
//	public int y;
//	
//	/**
//	 * The z component.
//	 */
//	public int z;
//	
//	/**
//	 * The w component.
//	 */
//	public int w;
//	
//	/**
//	 * Creates a new instance with all components set to 0.
//	 */
//	public Tup4i()
//	{
//		set(0);
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link TupiR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupiR} to adopt the values from.
//	 */
//	public Tup4i(TupiR t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link Tup4iR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup4iR} to adopt the values from.
//	 */
//	public Tup4i(Tup4iR t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance with all values set to a single value.
//	 * 
//	 * @param value The value used as the initial value for all values of the tuple.#
//	 */
//	public Tup4i(int value)
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
//	 * @param w The initial w value of the tuple.
//	 */
//	public Tup4i(int x, int y, int z, int w)
//	{
//		set(x, y, z, w);
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param v The values as an array.
//	 */
//	public Tup4i(int[] v)
//	{
//		setArray(v);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int getZ()
//	{
//		return this.z;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int getW()
//	{
//		return this.w;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i setX(int x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i setY(int y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i setZ(int z)
//	{
//		this.z = z;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i setW(int w)
//	{
//		this.w = w;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i set(Tup4iR t)
//	{
//		return set(t.getX(), t.getY(), t.getZ(), t.getW());
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i set(int value)
//	{
//		return set(value, value, value, value);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i set(int x, int y, int z, int w)
//	{
//		return setX(x).setY(y).setZ(z).setW(w);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + getX();
//		result = prime * result + getY();
//		result = prime * result + getZ();
//		result = prime * result + getW();
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
//		if(obj instanceof Tup4iR)
//		{
//			Tup4iR other = (Tup4iR) obj;
//			if(getX() != other.getX()) return false;
//			if(getY() != other.getY()) return false;
//			if(getZ() != other.getZ()) return false;
//			if(getW() != other.getW()) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupiR)
//		{
//			TupiR other = (TupiR) obj;
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
//	public Tup4i clone()
//	{
//		return new Tup4i(this);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "tup4i(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i set(TupiR t)
//	{
//		return (Tup4i)Tup4iC.super.set(t);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i setArray(int... values)
//	{
//		return (Tup4i)Tup4iC.super.setArray(values);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup4i setByIndex(int index, int value)
//	{
//		return (Tup4i)Tup4iC.super.setByIndex(index, value);
//	}
//}