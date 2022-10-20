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
//import org.barghos.tuple.api.t2.Tup2objR;
//import org.barghos.tuple.api.tn.TupobjR;
//
///**
// * Represents an immutable readonly 2-dimensional {@link Object} tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup2obj implements Tup2objR
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
//	 * Generates a new readonly {@link ImmutableTup2obj} from an existing instance of {@link TupobjR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupobjR} to adopt the values from.
//	 */
//	public ImmutableTup2obj(TupobjR t)
//	{
//		Object[] v = t.toArray(new Object[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2obj} from an existing instance of {@link Tup2objR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2objR} to adopt the values from.
//	 */
//	public ImmutableTup2obj(Tup2objR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2obj} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup2obj(Object value)
//	{
//		this.x = value;
//		this.y = value;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2obj} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The x and y values as an array.
//	 */
//	public ImmutableTup2obj(Object[] v)
//	{
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2obj} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//
//	 */
//	public ImmutableTup2obj(Object x, Object y)
//	{
//		this.x = x;
//		this.y = y;
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
//	public Object getByIndex(int index)
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
//	public boolean isValid()
//	{
//		return	this.x != null &&
//				this.y != null;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Object[] toArray()
//	{
//		return new Object[] {this.x, this.y};
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public Object[] toArray(Object[] res)
//	{
//		res[COMP_X] = this.x;
//		res[COMP_Y] = this.y;
//		
//		return res;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + this.x.hashCode();
//		result = prime * result + this.y.hashCode();
//		
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
//		if(obj instanceof Tup2objR)
//		{
//			Tup2objR other = (Tup2objR) obj;
//			if(!this.x.equals(other.getX())) return false;
//			if(!this.y.equals(other.getY())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupobjR)
//		{
//			TupobjR other = (TupobjR) obj;
//			if(2 != other.getDimensions()) return false;
//			if(!this.x.equals(other.getByIndex(0))) return false;
//			if(!this.y.equals(other.getByIndex(1))) return false;
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
//		return "immutableTup2obj(x=" + this.x + ", y=" + this.y + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup2obj clone()
//	{
//		return new ImmutableTup2obj(this.x, this.y);
//	}
//}