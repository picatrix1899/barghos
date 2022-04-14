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

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupbR;

/**
 * This interface grants readonly access to any 3-dimensional byte tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup3bR extends TupbR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	byte getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	byte getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	byte getZ();
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX() == (byte)0 &&
				getY() == (byte)0 &&
				getZ() == (byte)0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(byte tolerance)
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
	default byte getByIndex(int index)
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
	default byte[] toArray(byte[] res)
	{
		res[COMP_X] = getX();
		res[COMP_Y] = getY();
		res[COMP_Z] = getZ();
		
		return res;
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup3bR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Tup3bR of(final byte x, final byte y, final byte z)
	{
		return new Tup3bR() {
			public byte getX()
			{
				return x;
			}

			public byte getY()
			{
				return y;
			}

			public byte getZ()
			{
				return z;
			}
		};
	}
}