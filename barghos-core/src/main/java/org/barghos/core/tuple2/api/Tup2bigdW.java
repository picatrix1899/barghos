/*
MIT License

Copyright (c) 2020 picatrix1899 (Florian Zilkenat)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.tuple2.api;

import java.math.BigDecimal;

/**
 * This interface grants writeonly access to any 2-dimensional big decimal tuples.
 * It should be prefered by design before direct usage of the original instance in method parameters.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2bigdW
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
	Tup2bigdW setX(BigDecimal x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup2bigdW setY(BigDecimal y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2bigdR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bigdR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup2bigdW set(Tup2bigdR t);
	
	/**
	 * Sets all values to a single value.
	 * 
	 * <p>
	 * This is usually used for resetting the tuple back to 0 again, by calling <code>set(BigDecimal.ZERO)</code>.
	 * </p>
	 * 
	 * @param value The value used for all values of the tuple.
	 * 
	 * @return The current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Tup2bigdW set(BigDecimal value);
	
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
	Tup2bigdW set(BigDecimal x, BigDecimal y);
}
