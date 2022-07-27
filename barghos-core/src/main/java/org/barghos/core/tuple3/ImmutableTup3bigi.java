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

package org.barghos.core.tuple3;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple3.Tup3bigiR;

/**
 * Represents an immutable readonly 3-dimensional {@link BigInteger} tuple.
 * It can be used as a more flexible way to create constants.
 * 
 * @author picatrix1899
 */
public class ImmutableTup3bigi implements Tup3bigiR
{
	/**
	 * The x component.
	 */
	public final BigInteger x;
	
	/**
	 * The y component.
	 */
	public final BigInteger y;
	
	/**
	 * The z component.
	 */
	public final BigInteger z;
	
	/**
	 * The immutable hashCode.
	 */
	protected transient int hashCode;
	
	/**
	 * The flag that shows that the hashCode has already been generated.
	 */
	protected transient boolean isHashCodeGenerated;
	
	/**
	 * Generates a new readonly {@link ImmutableTup3bigi} from an existing instance of {@link TupbigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupbigiR} to adopt the values from.
	 */
	public ImmutableTup3bigi(TupbigiR t)
	{
		this(t.toArray());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3bigi} from an existing instance of {@link Tup3bigiR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3bigiR} to adopt the values from.
	 */
	public ImmutableTup3bigi(Tup3bigiR t)
	{
		this(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3bigi} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 */
	public ImmutableTup3bigi(BigInteger value)
	{
		this(value, value, value);
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3bigi} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.
	 */
	public ImmutableTup3bigi(BigInteger x, BigInteger y, BigInteger z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Generates a new readonly {@link ImmutableTup3bigi} with the values set to the corresponding parameters.
	 * 
	 * @param v The values as an array.
	 */
	public ImmutableTup3bigi(BigInteger[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
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
	public BigInteger getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		if(!isHashCodeGenerated) generateHashCode();
		
		return this.hashCode;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup3bigiR)
		{
			Tup3bigiR other = (Tup3bigiR) obj;
			if(getX().compareTo(other.getX()) != 0) return false;
			if(getY().compareTo(other.getY()) != 0) return false;
			if(getZ().compareTo(other.getZ()) != 0) return false;
			
			return true;
		}
		
		if(obj instanceof TupbigiR)
		{
			TupbigiR other = (TupbigiR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(getX().compareTo(other.getByIndex(0)) != 0) return false;
			if(getY().compareTo(other.getByIndex(1)) != 0) return false;
			if(getZ().compareTo(other.getByIndex(2)) != 0) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "immutableTup3bigi(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc}} */
	@Override
	public ImmutableTup3bigi clone()
	{
		return new ImmutableTup3bigi(this);
	}
	
	/**
	 * This method generates the hashCode and stores it in the member for later use.
	 */
	protected void generateHashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + getX().hashCode();
		result = prime * result + getY().hashCode();
		result = prime * result + getZ().hashCode();
		
		this.hashCode = result;
		this.isHashCodeGenerated = true;
	}
}