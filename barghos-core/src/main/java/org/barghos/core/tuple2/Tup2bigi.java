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
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.tuple2.Tup2bigiR;
import org.barghos.core.api.tuple2.Tup2bigiRW;

/**
 * This class represents a 2-dimensional big integer tuple.
 * A tuple unlike a vector contains data that is not necessarly in any relation to each other,
 * where the data of a vector describes the same logical structure.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Tup2bigi implements Tup2bigiRW, Serializable, FormattableToString
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
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2bigi()
	{
		set(BigInteger.ZERO);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2bigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2bigiR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2bigi(Tup2bigiR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2bigi(BigInteger value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Tup2bigi(BigInteger x, BigInteger y)
	{
		set(x, y);
	}
	
	@Override
	public BigInteger getX()
	{
		return this.x;
	}
	
	@Override
	public BigInteger getY()
	{
		return this.y;
	}
	
	@Override
	public Tup2bigi setX(BigInteger x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Tup2bigi setY(BigInteger y)
	{
		this.y = y;
		
		return this;
	}
	
	@Override
	public Tup2bigi set(Tup2bigiR t)
	{
		return set(t.getX(), t.getY());
	}
	
	@Override
	public Tup2bigi set(BigInteger value)
	{
		return set(value, value);
	}
	
	@Override
	public Tup2bigi set(BigInteger x, BigInteger y)
	{
		return setX(x).setY(y);
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Tup2bigiR)) return false;
		
		Tup2bigiR other = (Tup2bigiR) obj;
		if(getX().compareTo(other.getX()) != 0) return false;
		if(getY().compareTo(other.getY()) != 0) return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return "tup2bigi(x=" + getX() + ", y=" + getY() + ")";
	}
	
	@Override
	public Tup2bigi clone()
	{
		return new Tup2bigi(this);
	}
	
	@Override
	public Map<String,Object> getValueMapping()
	{
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("x", getX());
		values.put("y", getY());
		
		return values;
	}

	@Override
	public Tup2bigi getNewInstance(BigInteger x, BigInteger y)
	{
		return new Tup2bigi(x, y);
	}
}