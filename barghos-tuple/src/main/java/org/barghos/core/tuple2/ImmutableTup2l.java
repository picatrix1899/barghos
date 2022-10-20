/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.tuple2;

import static org.barghos.tuple.api.tn.TupleConstants.*;

import java.nio.LongBuffer;

import org.barghos.tuple.api.tn.TuplR;
import org.barghos.tuple.api.tn2.Tup2lR;

/**
 * Represents an immutable readonly 2-dimensional byte tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 */
public class ImmutableTup2l implements Tup2lR
{
	/**
	 * The x component.
	 */
	public final long x;
	
	/**
	 * The y component.
	 */
	public final long y;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been calculated.
	 */
	protected transient boolean isHashCodeCalculated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup2l} from an existing instance of {@link TuplR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
	 */
	public ImmutableTup2l(TuplR t)
	{
		long[] v = t.toArray(new long[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2l} from an existing instance of {@link Tup2lR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2lR} to adopt the values from.
	 */
	public ImmutableTup2l(Tup2lR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2l} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 */
	public ImmutableTup2l(long value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2i} with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public ImmutableTup2l(long[] v)
	{
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2l} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 */
	public ImmutableTup2l(long x, long y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public long getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public long getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public long getByIndex(int index)
	{
		switch(index)
		{
			case COMP_X: return this.x;
			case COMP_Y: return this.y;
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean isExactlyZero()
	{
		return	this.x == 0 &&
				this.y == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean isZero(long tolerance)
	{
		return	Math.abs(this.x) <= tolerance &&
				Math.abs(this.y) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	public long[] toArray()
	{
		return new long[] {this.x, this.y};
	}
	
	/** {@inheritDoc}} */
	@Override
	public long[] toArray(long[] res)
	{
		res[COMP_X] = this.x;
		res[COMP_Y] = this.y;
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public LongBuffer toBuffer(LongBuffer buffer)
	{
		buffer.put(this.x);
		buffer.put(this.y);
		
		return buffer;
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		if(!this.isHashCodeCalculated) calculateHashCode();
		
		return this.hashCode;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(obj instanceof Tup2lR)
		{
			Tup2lR other = (Tup2lR) obj;
			if(this.x != other.getX()) return false;
			if(this.y != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TuplR)
		{
			TuplR other = (TuplR) obj;
			if(2 != other.getDimensions()) return false;
			if(this.x != other.getByIndex(0)) return false;
			if(this.y != other.getByIndex(1)) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "immutableTup2l(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public ImmutableTup2l clone()
	{
		return new ImmutableTup2l(this.x, this.y);
	}
	
	/**
	 * This method calculates the hashCode and stores it in the member for later use.
	 */
	protected void calculateHashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.x ^ (this.x >>> 32));
		result = prime * result + (int) (this.y ^ (this.y >>> 32));
		
		this.hashCode = result;
		this.isHashCodeCalculated = true;
	}
}