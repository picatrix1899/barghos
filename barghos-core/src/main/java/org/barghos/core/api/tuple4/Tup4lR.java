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

package org.barghos.core.api.tuple4;

import org.barghos.core.api.tuple.TuplR;

/**
 * This interface grants readonly access to any 4-dimensional long tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup4lR extends TuplR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	long getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	long getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	long getZ();
	
	/**
	 * Returns the w value from the tuple.
	 * 
	 * @return The w value from the tuple.
	 */
	long getW();

	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX() == 0l &&
				getY() == 0l &&
				getZ() == 0l &&
				getW() == 0l;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(long tolerance)
	{
		return Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance &&
				Math.abs(getZ()) <= tolerance &&
				Math.abs(getW()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default long getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			case 2: return getZ();
			case 3: return getW();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default long[] getArray()
	{
		return new long[] {getX(), getY(), getZ(), getW()};
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup4lR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * @param w The value of the w component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Tup4lR of(final long x, final long y, final long z, final long w)
	{
		return new Tup4lR() {
			public long getX()
			{
				return x;
			}

			public long getY()
			{
				return y;
			}

			public long getZ()
			{
				return z;
			}

			public long getW()
			{
				return w;
			}
		};
	}
}