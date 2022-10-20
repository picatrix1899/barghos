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
import java.math.BigDecimal;

import org.barghos.tuple.api.tn.TupbigdR;
import org.barghos.tuple.api.tn2.Tup2bigdC;
import org.barghos.tuple.api.tn2.Tup2bigdR;

/**
 * This class represents a 2-dimensional {@link BigDecimal} tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 */
public class Tup2bigd implements Tup2bigdC, Serializable
{
	/**
	 * The class version for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The x component.
	 * This must not be null.
	 */
	public BigDecimal x;
	
	/**
	 * The y component.
	 * This must not be null.
	 */
	public BigDecimal y;
	
	/**
	 * Creates a new instance with all components set to {@link BigDecimal#ZERO}.
	 */
	public Tup2bigd()
	{
		this.x = BigDecimal.ZERO;
		this.y = BigDecimal.ZERO;
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupbigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigdR} to adopt the values from.
	 */
	public Tup2bigd(TupbigdR t)
	{
		BigDecimal[] v = t.toArray(new BigDecimal[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2bigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bigdR} to adopt the values from.
	 */
	public Tup2bigd(Tup2bigdR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Tup2bigd(BigDecimal value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Tup2bigd(BigDecimal[] v)
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
	public Tup2bigd(BigDecimal x, BigDecimal y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal getByIndex(int index)
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
		return	this.x.compareTo(BigDecimal.ZERO) == 0 &&
				this.y.compareTo(BigDecimal.ZERO) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean isZero(BigDecimal tolerance)
	{
		return	this.x.abs().compareTo(tolerance) <= 0 &&
				this.x.abs().compareTo(tolerance) <= 0;
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
	public BigDecimal[] toArray()
	{
		return new BigDecimal[] {this.x, this.y};
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal[] toArray(BigDecimal[] res)
	{
		res[COMP_X] = this.x;
		res[COMP_Y] = this.y;
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd setX(BigDecimal x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd setY(BigDecimal y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd set(Tup2bigdR t)
	{
		this.x = t.getX();
		this.y = t.getY();
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd set(BigDecimal value)
	{
		this.x = value;
		this.y = value;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd set(BigDecimal x, BigDecimal y)
	{
		this.x = x;
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd set(TupbigdR t)
	{
		BigDecimal[] v = t.toArray(new BigDecimal[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd setArray(BigDecimal... values)
	{
		this.x = values[COMP_X];
		this.y = values[COMP_Y];
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd setByIndex(int index, BigDecimal value)
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
		
		if(obj instanceof Tup2bigdR)
		{
			Tup2bigdR other = (Tup2bigdR) obj;
			if(this.x.compareTo(other.getX()) != 0) return false;
			if(this.y.compareTo(other.getY()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigdR)
		{
			TupbigdR other = (TupbigdR) obj;
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
		return "tup2bigd(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd shallowClone()
	{
		return new Tup2bigd(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd deepClone()
	{
		return new Tup2bigd(this.x, this.y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2bigd clone()
	{
		return new Tup2bigd(this.x, this.y);
	}
}