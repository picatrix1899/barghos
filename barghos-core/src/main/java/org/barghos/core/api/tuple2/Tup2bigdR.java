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

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;

/**
 * This interface grants readonly access to any 2-dimensional big decimal tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2bigdR extends TupbigdR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	BigDecimal getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	BigDecimal getY();
	
	@Override
	default boolean isZero()
	{
		return getX().compareTo(BigDecimal.ZERO) == 0 &&
				getY().compareTo(BigDecimal.ZERO) == 0;
	}
	
	@Override
	default boolean isZeroWithMargin(BigDecimal tolerance)
	{
		return getX().abs().compareTo(tolerance) <= 0 &&
				getY().abs().compareTo(tolerance) <= 0;
	}
	
	@Override
	default boolean isValid()
	{
		return getX() != null &&
				getY() != null;
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
	default Tup2bigdR getNewInstance(Tup2bigdR t)
	{
		return getNewInstance(t.getX(), t.getY());
	}
	
	@Override
	default Tup2bigdR getNewInstance(BigDecimal value)
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
	Tup2bigdR getNewInstance(BigDecimal x, BigDecimal y);
	
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	@Override
	default BigDecimal getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	@Override
	default BigDecimal[] getArray()
	{
		return new BigDecimal[] {getX(), getY()};
	}
	
	@Override
	default Tup2bigdR getNewInstanceFromArray(BigDecimal... values)
	{
		BigDecimal[] v = values;
		return getNewInstance(v[0], v[1]);
	}
	
	@Override
	default Tup2bigdR getNewInstance(TupbigdR t)
	{
		BigDecimal[] v = t.getArray();
		return getNewInstance(v[0], v[1]);
	}
}