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
import java.math.BigInteger;

import org.barghos.tuple.api.tn.TupbigiR;
import org.barghos.tuple.api.tn2.Tup2bigiC;
import org.barghos.tuple.api.tn2.Tup2bigiR;

/**
 * This class represents a 2-dimensional {@link BigInteger} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2bigi implements Tup2bigiC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public BigInteger x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public BigInteger y;
	
	/**
	 * Creates a new instance with all components set to {@link BigInteger#ZERO}.
	 */
	public Tup2bigi()
	{
		this.x = BigInteger.ZERO;
		this.y = BigInteger.ZERO;
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigiR} to adopt the values from.
	 */
	public Tup2bigi(TupbigiR t)
	{
		BigInteger[] v = t.toArray(new BigInteger[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2bigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bigiR} to adopt the values from.
	 */
	public Tup2bigi(Tup2bigiR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2bigi(BigInteger value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2bigi(BigInteger[] v)
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
	public Tup2bigi(BigInteger x, BigInteger y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger getByIndex(int index)
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
		return	this.x.compareTo(BigInteger.ZERO) == 0 &&
				this.y.compareTo(BigInteger.ZERO) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean isZero(BigInteger tolerance)
	{
		return	this.x.abs().compareTo(tolerance) == 0 &&
				this.y.abs().compareTo(tolerance) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean isValid()
	{
		return	this.x != null &&
				this.y != null;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger[] toArray()
	{
		return new BigInteger[] {this.x, this.y};
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigInteger[] toArray(BigInteger[] res)
	{
		res[COMP_X] = this.x;
		res[COMP_Y] = this.y;
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi setX(BigInteger x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi setY(BigInteger y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi set(Tup2bigiR t)
	{
		this.x = t.getX();
		this.y = t.getY();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi set(BigInteger value)
	{
		this.x = value;
		this.y = value;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi set(BigInteger x, BigInteger y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi set(TupbigiR t)
	{
		BigInteger[] v = t.toArray(new BigInteger[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi setArray(BigInteger... values)
	{
		this.x = values[COMP_X];
		this.y = values[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi setByIndex(int index, BigInteger value)
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
		result = prime * result + this.x.hashCode();
		result = prime * result + this.y.hashCode();
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2bigiR)
		{
			Tup2bigiR other = (Tup2bigiR) obj;
			if(this.x.compareTo(other.getX()) != 0) return false;
			if(this.y.compareTo(other.getY()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigiR)
		{
			TupbigiR other = (TupbigiR) obj;
			if(2 != other.getDimensions()) return false;
			if(this.x.compareTo(other.getByIndex(0)) != 0) return false;
			if(this.y.compareTo(other.getByIndex(1)) != 0) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "tup2bigi(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi shallowClone()
	{
		return new Tup2bigi(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi deepClone()
	{
		return new Tup2bigi(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigi clone()
	{
		return new Tup2bigi(this.x, this.y);
	}
}