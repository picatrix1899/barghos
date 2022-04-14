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

package org.barghos.core.api.tuple3;

import java.math.BigInteger;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupbigiR;

/**
 * This interface grants readonly access to any 3-dimensional big integer tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup3bigiR extends TupbigiR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	BigInteger getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	BigInteger getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	BigInteger getZ();

	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX().compareTo(BigInteger.ZERO) == 0 &&
				getY().compareTo(BigInteger.ZERO) == 0 &&
				getZ().compareTo(BigInteger.ZERO) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(BigInteger tolerance)
	{
		return getX().abs().compareTo(tolerance) <= 0 &&
				getY().abs().compareTo(tolerance) <= 0 &&
				getZ().abs().compareTo(tolerance) <= 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isValid()
	{
		return getX() != null &&
				getY() != null &&
				getZ() != null;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 3;
	}
	
	/** {@inheritDoc}} */
	@Override
	default BigInteger getByIndex(int index)
	{
		switch(index)
		{
			case COMP_X: return getX();
			case COMP_Y: return getY();
			case COMP_Z: return getZ();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default BigInteger[] toArray(BigInteger[] res)
	{
		res[COMP_X] = getX();
		res[COMP_Y] = getY();
		res[COMP_Z] = getZ();
		
		return res;
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup3bigiR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Tup3bigiR of(final BigInteger x, final BigInteger y, final BigInteger z)
	{
		return new Tup3bigiR() {
			public BigInteger getX()
			{
				return x;
			}

			public BigInteger getY()
			{
				return y;
			}

			public BigInteger getZ()
			{
				return z;
			}
		};
	}
}