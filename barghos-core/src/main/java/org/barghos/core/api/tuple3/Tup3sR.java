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

import org.barghos.core.api.tuple.TupsR;

/**
 * This interface grants readonly access to any 3-dimensional short tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup3sR extends TupsR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	short getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	short getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	short getZ();
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX() == (short)0 &&
				getY() == (short)0 &&
				getZ() == (short)0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(short tolerance)
	{
		return Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance &&
				Math.abs(getZ()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 3;
	}
	
	/** {@inheritDoc}} */
	@Override
	default short getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			case 2: return getZ();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default short[] getArray()
	{
		return new short[] {getX(), getY(), getZ()};
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup3sR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Tup3sR of(final short x, final short y, final short z)
	{
		return new Tup3sR() {
			public short getX()
			{
				return x;
			}

			public short getY()
			{
				return y;
			}

			public short getZ()
			{
				return z;
			}
		};
	}
}