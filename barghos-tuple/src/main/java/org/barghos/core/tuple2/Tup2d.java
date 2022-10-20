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
//package org.barghos.core.tuple2;
//
//import static org.barghos.tuple.api.tn.TupleConstants.*;
//
//import java.io.Serializable;
//import java.nio.DoubleBuffer;
//
//import org.barghos.tuple.api.tn.TupdR;
//import org.barghos.tuple.api.tn2.Tup2dC;
//import org.barghos.tuple.api.tn2.Tup2dR;
//
///**
// * This class represents a 2-dimensional double tuple.
// * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
// * where the data of a vector describes the same logical structure.
// * 
// * @author picatrix1899
// */
//public class Tup2d implements Tup2dC, Serializable
//{
//	/**
//	 * The class version for serialization.
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	/**
//	 * The x component.
//	 */
//	public double x;
//	
//	/**
//	 * The y component.
//	 */
//	public double y;
//	
//	/**
//	 * Creates a new instance with all components set to 0.
//	 */
//	public Tup2d()
//	{
//		this.x = 0.0;
//		this.y = 0.0;
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link TupdR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
//	 */
//	public Tup2d(TupdR t)
//	{
//		double[] v = t.toArray(new double[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link Tup2dR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
//	 */
//	public Tup2d(Tup2dR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//	}
//	
//	/**
//	 * Creates a new instance with all values set to a single value.
//	 * 
//	 * @param value The value used as the initial value for all values of the tuple.
//	 */
//	public Tup2d(double value)
//	{
//		this.x = value;
//		this.y = value;
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param v The x and y values as an array.
//	 */
//	public Tup2d(double[] v)
//	{
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param x The initial x value of the tuple.
//	 * @param y The initial y value of the tuple.
//	 */
//	public Tup2d(double x, double y)
//	{
//		this.x = x;
//		this.y = y;
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
//	public double getByIndex(int index)
//	{
//		switch(index)
//		{
//			case COMP_X: return this.x;
//			case COMP_Y: return this.y;
//		}
//		
//		throw new IndexOutOfBoundsException(index);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean isExactlyZero()
//	{
//		return	this.x == 0 &&
//				this.y == 0;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean isZero(double tolerance)
//	{
//		return	Math.abs(this.x) <= tolerance &&
//				Math.abs(this.y) <= tolerance;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean isFinite()
//	{
//		return	Double.isFinite(this.x) &&
//				Double.isFinite(this.y);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double[] toArray()
//	{
//		return new double[] {this.x, this.y};
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public double[] toArray(double[] res)
//	{
//		res[COMP_X] = this.x;
//		res[COMP_Y] = this.y;
//		
//		return res;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public DoubleBuffer toBuffer(DoubleBuffer buffer)
//	{
//		buffer.put(this.x);
//		buffer.put(this.y);
//		
//		return buffer;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d setX(double x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d setY(double y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d set(Tup2dR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d set(double value)
//	{
//		this.x = value;
//		this.y = value;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d set(double x, double y)
//	{
//		this.x = x;
//		this.y = y;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d set(TupdR t)
//	{
//		double[] v = t.toArray(new double[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d setArray(double... values)
//	{
//		this.x = values[COMP_X];
//		this.y = values[COMP_Y];
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d setByIndex(int index, double value)
//	{
//		if(index < 0 || index >= 2) throw new IndexOutOfBoundsException(index);
//		
//		switch(index)
//		{
//			case COMP_X: this.x = value;
//			case COMP_Y: this.y = value;
//		}
//		
//		return this;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		long temp = Double.doubleToLongBits(this.x);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(this.y);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
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
//		if(obj instanceof Tup2dR)
//		{
//			Tup2dR other = (Tup2dR) obj;
//			if(Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.getX())) return false;
//			if(Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.getY())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupdR)
//		{
//			TupdR other = (TupdR) obj;
//			if(2 != other.getDimensions()) return false;
//			if(Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.getByIndex(0))) return false;
//			if(Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.getByIndex(1))) return false;
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
//		return "tup2d(x=" + this.x + ", y=" + this.y + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d shallowClone()
//	{
//		return new Tup2d(this.x, this.y);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d deepClone()
//	{
//		return new Tup2d(this.x, this.y);
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Tup2d clone()
//	{
//		return new Tup2d(this.x, this.y);
//	}
//}