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

import org.barghos.core.api.util.Validateable;

/**
 * This interface grants readonly access to any 3-dimensional object tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup3oR<X,Y,Z> extends Validateable
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	X getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	Y getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	Z getZ();
	
	/** {@inheritDoc}} */
	@Override
	default boolean isValid()
	{
		return getX() != null &&
				getY() != null &&
				getZ() != null;
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup3oR} with the given values.
	 * The given values are used directly and are not cloned. Therefore to make the used objects immutable
	 * they have to be immutable before input. As the resulting instance is just a minimal implementation of the 
	 * interface it does not provide clone, equals, hashCode or toString operations.
	 * 
	 * @param <X> The type of the x component.
	 * @param <Y> The type of the y component.
	 * @param <Z> The type of the z component.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static <X,Y,Z> Tup3oR<X,Y,Z> of(final X x, final Y y, final Z z)
	{
		return new Tup3oR<X,Y,Z>() {
			public X getX()
			{
				return x;
			}

			public Y getY()
			{
				return y;
			}

			public Z getZ()
			{
				return z;
			}
		};
	}
}