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

import java.io.Serializable;
import java.nio.LongBuffer;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple2.Tup2lC;
import org.barghos.core.api.tuple2.Tup2lR;

/**
 * This class represents a 2-dimensional long tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2l implements Tup2lC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public long x;
	
	/**
	 * The y component.
	 */
	public long y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup2l()
	{
		this.x = 0l;
		this.y = 0l;
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TuplR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
	 */
	public Tup2l(TuplR t)
	{
		long[] v = t.toArray(new long[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2lR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2lR} to adopt the values from.
	 */
	public Tup2l(Tup2lR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2l(long value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2l(long[] v)
	{
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 */
	public Tup2l(long x, long y)
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
	public Tup2l setX(long x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setY(long y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2l set(Tup2lR t)
	{
		this.x = t.getX();
		this.y = t.getY();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l set(long value)
	{
		this.x = value;
		this.y = value;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l set(long x, long y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l set(TuplR t)
	{
		long[] v = t.toArray(new long[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setArray(long... values)
	{
		this.x = values[COMP_X];
		this.y = values[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l setByIndex(int index, long value)
	{
		if(index < 0 || index >= 2) throw new IndexOutOfBoundsException(index);
		
		switch(index)
		{
			case COMP_X: this.x = value;
			case COMP_Y: this.y = value;
		}
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.x ^ (this.x >>> 32));
		result = prime * result + (int) (this.y ^ (this.y >>> 32));
		return result;
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
		return "tup2l(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l shallowClone()
	{
		return new Tup2l(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l deepClone()
	{
		return new Tup2l(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2l clone()
	{
		return new Tup2l(this.x, this.y);
	}
}