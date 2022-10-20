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
//import org.barghos.tuple.api.t2.Tup2oR;
//
///**
// * Represents an immutable readonly 2-dimensional {@link Object} tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @param <X> The type of the x component.
// * @param <Y> The type of the y component.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup2o<X,Y> implements Tup2oR<X,Y>
//{
//	/**
//	 * The x component.
//	 */
//	public final X x;
//	
//	/**
//	 * The y component.
//	 */
//	public final Y y;
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2o} from an existing instance of {@link Tup2oR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2oR} to adopt the values from.
//	 */
//	public ImmutableTup2o(Tup2oR<X,Y> t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2o} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 */
//	public ImmutableTup2o(X x, Y y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public X getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Y getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc} */
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
//	/** {@inheritDoc} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		
//		if(obj instanceof Tup2oR)
//		{
//			@SuppressWarnings("unchecked")
//			Tup2oR<X,Y> other = (Tup2oR<X,Y>) obj;
//			if(!this.x.equals(other.getX())) return false;
//			if(!this.y.equals(other.getY())) return false;
//			
//			return true;
//		}
//		
//		return false;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public String toString()
//	{
//		return "immutableTup2o(x=" + this.x + ", y=" + this.y + ")";
//	}
//}