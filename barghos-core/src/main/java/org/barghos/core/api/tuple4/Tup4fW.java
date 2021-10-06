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

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfW;

/**
 * This interface grants writeonly access to any 4-dimensional float tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4fW extends TupfW
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
	Tup4fW setX(float x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup4fW setY(float y);
	
	/**
	 * Sets the z value of the tuple.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup4fW setZ(float z);
	
	/**
	 * Sets the w value of the tuple.
	 * 
	 * @param w The new w value.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup4fW setW(float w);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup4fR}.
	 * 
	 * @param t An existing implementation of {@link Tup4fR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	default Tup4fW set(Tup4fR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	default Tup4fW set(float value)
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
	 * 
	 * @since 1.0.0.0
	 */
	default Tup4fW set(float x, float y, float z, float w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
	}
	
	@Override
	default int getDimensions()
	{
		return 4;
	}
	
	@Override
	default Tup4fW setByIndex(int index, float value)
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
	
	@Override
	default Tup4fW setArray(float... values)
	{
		float[] v = values;
		return set(v[0], v[1], v[2], v[3]);
	}
	
	@Override
	default Tup4fW set(TupfR t)
	{
		float[] v = t.getArray();
		return set(v[0], v[1], v[2], v[3]);
	}
}