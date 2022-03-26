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

package org.barghos.core.api.tuple2;

import org.barghos.core.api.tuple.TupboR;

/**
 * This interface grants readonly access to any 2-dimensional boolean tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup2boR extends TupboR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	boolean getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	boolean getY();
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean[] getArray()
	{
		return new boolean[] {getX(), getY()};
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup2boR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Tup2boR of(final boolean x, final boolean y)
	{
		return new Tup2boR() {
			public boolean getX()
			{
				return x;
			}

			public boolean getY()
			{
				return y;
			}
		};
	}
}