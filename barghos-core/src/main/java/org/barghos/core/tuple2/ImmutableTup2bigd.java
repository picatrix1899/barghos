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

import java.math.BigDecimal;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple2.Tup2bigdR;

/**
 * Represents an immutable readonly 2-dimensional {@link BigDecimal} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 */
public class ImmutableTup2bigd implements Tup2bigdR
{
	/**
	 * The x component.
	 */
	public final BigDecimal x;
	
	/**
	 * The y component.
	 */
	public final BigDecimal y;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been calculated.
	 */
	protected transient boolean isHashCodeCalculated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} from an existing instance of {@link TupbigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigdR} to adopt the values from.
	 */
	public ImmutableTup2bigd(TupbigdR t)
	{
		BigDecimal[] v = t.toArray(new BigDecimal[2]);
		
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} from an existing instance of {@link Tup2bigdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bigdR} to adopt the values from.
	 */
	public ImmutableTup2bigd(Tup2bigdR t)
	{
		this.x = t.getX();
		this.y = t.getY();
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 */
	public ImmutableTup2bigd(BigDecimal value)
	{
		this.x = value;
		this.y = value;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public ImmutableTup2bigd(BigDecimal[] v)
	{
		this.x = v[COMP_X];
		this.y = v[COMP_Y];
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup2bigd} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 */
	public ImmutableTup2bigd(BigDecimal x, BigDecimal y)
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
				this.y.abs().compareTo(tolerance) <= 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal[] toArray()
	{
		return new BigDecimal[] {this.x, this.y};
	}
	
	/** {@inheritDoc}} */
	@Override
	public BigDecimal[] toArray(@ExtractionParam BigDecimal[] res)
	{
		res[COMP_X] = this.x;
		res[COMP_Y] = this.y;
		
		return res;
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
	public int hashCode()
	{
		if(!this.isHashCodeCalculated) calculateHashCode();
		
		return this.hashCode;
	}
	
	/** {@inheritDoc}} */
	@Override
	public ImmutableTup2bigd clone()
	{
		return new ImmutableTup2bigd(this.x, this.y);
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
		return "immutableTup2bigd(x=" + this.x + ", y=" + this.y + ")";
	}
	
	/**
	 * This method calculates the hashCode and stores it in the member for later use.
	 */
	protected void calculateHashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x.hashCode();
		result = prime * result + this.y.hashCode();
		
		this.hashCode = result;
	}
}