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

import org.barghos.core.api.tuple.TupsBase;
import org.barghos.core.api.tuple.TupsR;

/**
 * This interface represents any modifiable 2-dimensional short tuple.
 * 
 * @author picatrix1899
 */
public interface Tup2sBase extends Tup2sR, TupsBase
{
	/**
	 * Sets the x value of the tuple.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current tuple.
	 */
	Tup2sBase setX(short x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 */
	Tup2sBase setY(short y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2sR}.
	 * 
	 * @param t An existing implementation of {@link Tup2sR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2sBase set(Tup2sR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2sBase set(short value)
	{
		return set(value, value);
	}
	
	/**
	 * Sets the values to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 */
	default Tup2sBase set(short x, short y)
	{
		return setX(x).setY(y);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2sBase setByIndex(int index, short value)
	{
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2sBase setArray(short... values)
	{
		short[] v = values;
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2sBase set(TupsR t)
	{
		short[] v = t.getArray();
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	Tup2sBase clone();
}