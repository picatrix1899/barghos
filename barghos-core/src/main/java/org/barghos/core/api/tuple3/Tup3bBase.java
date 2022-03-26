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

import org.barghos.core.api.tuple.TupbBase;
import org.barghos.core.api.tuple.TupbR;

/**
 * This interface represents any modifiable 3-dimensional byte tuples.
 * 
 * @author picatrix1899
 */
public interface Tup3bBase extends Tup3bR, TupbBase
{
	/**
	 * Sets the x value of the tuple.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bBase setX(byte x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bBase setY(byte y);
	
	/**
	 * Sets the z value of the tuple.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bBase setZ(byte z);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup3bR}.
	 * 
	 * @param t An existing implementation of {@link Tup3bR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bBase set(Tup3bR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bBase set(byte value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bBase set(byte x, byte y, byte z)
	{
		return setX(x).setY(y).setZ(z);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bBase setByIndex(int index, byte value)
	{
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bBase setArray(byte... values)
	{
		byte[] v = values;
		return set(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bBase set(TupbR t)
	{
		byte[] v = t.getArray();
		return set(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	Tup3bBase clone();
}