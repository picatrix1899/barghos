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

import org.barghos.core.api.tuple.TupfR;

/**
 * This interface grants readonly access to any 2-dimensional float tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2fR extends TupfR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	float getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	float getY();
	
	@Override
	default boolean isFinite()
	{
		return Float.isFinite(getX()) &&
				Float.isFinite(getY());
	}
	
	@Override
	default boolean isZero()
	{
		return getX() == 0.0f &&
				getY() == 0.0f;
	}
	
	@Override
	default boolean isZeroWithMargin(float tolerance)
	{
		return Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance;
	}
	
	/**
	 * Returns a new instance of the type of the origin instance with the components adopted
	 * from t.
	 * 
	 * <p>
	 * This can be used for type continuety.
	 * This way even while only using abstractions it is possible to create
	 * new instances of the original. It is similar to the {@link Object#clone()}
	 * function but the {@link Object#clone()} function requires the returned instance to be
	 * writable.
	 * This function on the other hand allows for example the usage of factories.
	 * 
	 * @param t The tuple to adopt the components from.
	 * 
	 * @return A new instance of the type of the origin instance
	 */
	default Tup2fR getNewInstance(Tup2fR t)
	{
		return getNewInstance(t.getX(), t.getY());
	}
	
	@Override
	default Tup2fR getNewInstance(float value)
	{
		return getNewInstance(value, value);
	}
	
	/**
	 * Returns a new instance of the type of the origin instance with the components set to
	 * the corresponding parameters.
	 * 
	 * <p>
	 * This can be used for type continuety.
	 * This way even while only using abstractions it is possible to create
	 * new instances of the original. It is similar to the {@link Object#clone()}
	 * function but the {@link Object#clone()} function requires the returned instance to be
	 * writable. This function on the other hand allows for example the usage of factories.
	 * 
	 * @param x The value used for the x component.
	 * @param y The value used for the y component.
	 * 
	 * @return A new instance of the type of the origin instance
	 */
	Tup2fR getNewInstance(float x, float y);
	
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	@Override
	default float getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	@Override
	default float[] getArray()
	{
		return new float[] {getX(), getY()};
	}
	
	@Override
	default Tup2fR getNewInstanceFromArray(float... values)
	{
		float[] v = values;
		return getNewInstance(v[0], v[1]);
	}
	
	@Override
	default Tup2fR getNewInstance(TupfR t)
	{
		float[] v = t.getArray();
		return getNewInstance(v[0], v[1]);
	}
}