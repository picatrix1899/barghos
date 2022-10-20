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
//import org.barghos.tuple.api.t2.Tup2boR;
//import org.barghos.tuple.api.tn.TupboR;
//
///**
// * Represents an immutable readonly 2-dimensional boolean tuple.
// * It can be used as a more flexible way to create constants.
// * 
// * @author picatrix1899
// */
//public class ImmutableTup2bo implements Tup2boR
//{
//	/**
//	 * The x component.
//	 */
//	public final boolean x;
//	
//	/**
//	 * The y component.
//	 */
//	public final boolean y;
//	
//	/**
//	 * The immutable hashCode.
//	 */
//	protected transient int hashCode;
//	
//	/**
//	 * The flag that shows that the hashCode has already been calculated.
//	 */
//	protected transient boolean isHashCodeCalculated;
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2bo} from an existing instance of {@link TupboR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupboR} to adopt the values from.
//	 */
//	public ImmutableTup2bo(TupboR t)
//	{
//		boolean[] v = t.toArray(new boolean[2]);
//		
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2bo} from an existing instance of {@link Tup2boR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2boR} to adopt the values from.
//	 */
//	public ImmutableTup2bo(Tup2boR t)
//	{
//		this.x = t.getX();
//		this.y = t.getY();
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2bo} with all values set to a single value.
//	 * 
//	 * @param value The value used for all values of the tuple.
//	 */
//	public ImmutableTup2bo(boolean value)
//	{
//		this.x = value;
//		this.y = value;
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2bo} with the values set to the corresponding parameters.
//	 * 
//	 * @param v The x and y values as an array.
//	 */
//	public ImmutableTup2bo(boolean[] v)
//	{
//		this.x = v[COMP_X];
//		this.y = v[COMP_Y];
//	}
//	
//	/**
//	 * Generates a new readonly {@link ImmutableTup2bo} with the values set to the corresponding parameters.
//	 * 
//	 * @param x The x value.
//	 * @param y The y value.
//	 */
//	public ImmutableTup2bo(boolean x, boolean y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean getByIndex(int index)
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
//	public boolean[] toArray()
//	{
//		return new boolean[] {this.x, this.y};
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean[] toArray(boolean[] res)
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
//		if(!this.isHashCodeCalculated) calculateHashCode();
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
//		if(obj instanceof Tup2boR)
//		{
//			Tup2boR other = (Tup2boR) obj;
//			if(this.x != other.getX()) return false;
//			if(this.y != other.getY()) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupboR)
//		{
//			TupboR other = (TupboR) obj;
//			if(2 != other.getDimensions()) return false;
//			if(this.x != other.getByIndex(0)) return false;
//			if(this.y != other.getByIndex(1)) return false;
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
//		return "immutableTup2bo(x=" + this.x + ", y=" + this.y + ")";
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public ImmutableTup2bo clone()
//	{
//		return new ImmutableTup2bo(this.x, this.y);
//	}
//	
//	/**
//	 * This method calculates the hashCode and stores it in the member for later use.
//	 */
//	protected void calculateHashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (this.x ? 1 : 0);
//		result = prime * result + (this.y ? 1 : 0);
//		
//		this.hashCode = result;
//	}
//}