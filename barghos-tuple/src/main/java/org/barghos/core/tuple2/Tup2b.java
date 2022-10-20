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

import java.io.Serializable;
import java.nio.ByteBuffer;

import org.barghos.tuple.api.tn.TupbR;
import org.barghos.tuple.api.tn2.Tup2bC;
import org.barghos.tuple.api.tn2.Tup2bR;

/**
 * This class represents a 2-dimensional byte tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2b implements Tup2bC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 */
	public byte x;
	
	/**
	 * The y component.
	 */
	public byte y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Tup2b()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbR} to adopt the values from.
	 */
	public Tup2b(TupbR t)
	{
		byte[] v = t.toArray(new byte[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2bR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bR} to adopt the values from.
	 */
	public Tup2b(Tup2bR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2b(byte value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2b(byte[] v)
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
	public Tup2b(byte x, byte y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte getByIndex(int index)
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
	public boolean isZero(byte tolerance)
	{
		return	Math.abs(this.x) <= tolerance &&
				Math.abs(this.y) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte[] toArray()
	{
		return new byte[] {this.x, this.y};
	}
	
	/** {@inheritDoc}} */
	@Override
	public byte[] toArray(byte[] res)
	{
		res[COMP_X] = this.x;
		res[COMP_Y] = this.y;
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public ByteBuffer toBuffer(ByteBuffer buffer)
	{
		buffer.put(this.x);
		buffer.put(this.y);
		
		return buffer;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b setX(byte x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b setY(byte y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b set(Tup2bR t)
	{
		this.x = t.getX();
		this.y = t.getY();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b set(byte value)
	{
		this.x = value;
		this.y = value;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b set(byte x, byte y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2b set(TupbR t)
	{
		byte[] v = t.toArray(new byte[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b setArray(byte... values)
	{
		this.x = values[COMP_X];
		this.y = values[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b setByIndex(int index, byte value)
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
		result = prime * result + this.x;
		result = prime * result + this.y;
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2bR)
		{
			Tup2bR other = (Tup2bR) obj;
			if(this.x != other.getX()) return false;
			if(this.y != other.getY()) return false;
			
			return true;
		}
		
		if(obj instanceof TupbR)
		{
			TupbR other = (TupbR) obj;
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
		return "tup2b(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b shallowClone()
	{
		return new Tup2b(this.x, this.y);
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2b deepClone()
	{
		return new Tup2b(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2b clone()
	{
		return new Tup2b(this.x, this.y);
	}
}