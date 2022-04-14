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

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupiR;

/**
 * This interface grants readonly access to any 4-dimensional integer tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup4iR extends TupiR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	int getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	int getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	int getZ();
	
	/**
	 * Returns the w value from the tuple.
	 * 
	 * @return The w value from the tuple.
	 */
	int getW();

	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX() == 0 &&
				getY() == 0 &&
				getZ() == 0 &&
				getW() == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(int tolerance)
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
	default int getByIndex(int index)
	{
		switch(index)
		{
			case COMP_X: return getX();
			case COMP_Y: return getY();
			case COMP_Z: return getZ();
			case COMP_W: return getW();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default int[] toArray(int[] res)
	{
		res[COMP_X] = getX();
		res[COMP_Y] = getY();
		res[COMP_Z] = getZ();
		res[COMP_W] = getW();
		
		return res;
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup4iR} with the given values.
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
	public static Tup4iR of(final int x, final int y, final int z, final int w)
	{
		return new Tup4iR() {
			public int getX()
			{
				return x;
			}

			public int getY()
			{
				return y;
			}

			public int getZ()
			{
				return z;
			}

			public int getW()
			{
				return w;
			}
		};
	}
}