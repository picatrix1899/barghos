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

import org.barghos.core.api.tuple.TupobjBase;
import org.barghos.core.api.tuple.TupobjR;

/**
 * This interface represents any modifiable 4-dimensional object tuples.
 * 
 * @author picatrix1899
 */
public interface Tup4objBase extends Tup4objR, TupobjBase
{
	/**
	 * Sets the x value of the tuple.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objBase setX(Object x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objBase setY(Object y);
	
	/**
	 * Sets the z value of the tuple.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objBase setZ(Object z);
	
	/**
	 * Sets the w value of the tuple.
	 * 
	 * @param w The new w value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objBase setW(Object w);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup4objR}.
	 * 
	 * @param t An existing implementation of {@link Tup4objR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4objBase set(Tup4objR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objBase set(Object value)
	{
		return set(value, value, value, value);
	}
	
	/**
	 * Sets the values to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * @param z The new z value.
	 * @param w The new w value.
	 * 
	 * @return The current tuple.
	 */
	default Tup4objBase set(Object x, Object y, Object z, Object w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objBase setByIndex(int index, Object value)
	{
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
			case 3: return setW(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objBase setArray(Object... values)
	{
		Object[] v = values;
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objBase set(TupobjR t)
	{
		Object[] v = t.getArray();
		return set(v[0], v[1], v[2], v[3]);
	}
}