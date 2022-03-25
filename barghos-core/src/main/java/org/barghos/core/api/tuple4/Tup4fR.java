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

/**
 * This interface grants readonly access to any 4-dimensional float tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup4fR extends TupfR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	float getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	float getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	float getZ();
	
	/**
	 * Returns the w value from the tuple.
	 * 
	 * @return The w value from the tuple.
	 */
	float getW();
	
	/** {@inheritDoc}} */
	@Override
	default boolean isFinite()
	{
		return Float.isFinite(getX()) &&
				Float.isFinite(getY()) &&
				Float.isFinite(getZ()) &&
				Float.isFinite(getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX() == 0.0f &&
				getY() == 0.0f &&
				getZ() == 0.0f &&
				getW() == 0.0f;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(float tolerance)
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
	default float getByIndex(int index)
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
	default float[] getArray()
	{
		return new float[] {getX(), getY(), getZ(), getW()};
	}
}