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
import org.barghos.core.api.tuple.TupboW;

/**
 * This interface grants writeonly access to any 2-dimensional boolean tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2boW extends TupboW
{
	/**
	 * Sets the x value of the tuple.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup2boW setX(boolean x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup2boW setY(boolean y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2boR}.
	 * 
	 * @param t An existing implementation of {@link Tup2boR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	default Tup2boW set(Tup2boR t)
	{
		return set(t.getX(), t.getY());
	}
	
	@Override
	default Tup2boW set(boolean value)
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
	 * 
	 * @since 1.0.0.0
	 */
	default Tup2boW set(boolean x, boolean y)
	{
		return setX(x).setY(y);
	}
	
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	@Override
	default Tup2boW setByIndex(int index, boolean value)
	{
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	@Override
	default Tup2boW setArray(boolean... values)
	{
		boolean[] v = values;
		return set(v[0], v[1]);
	}
	
	@Override
	default Tup2boW set(TupboR t)
	{
		boolean[] v = t.getArray();
		return set(v[0], v[1]);
	}
}