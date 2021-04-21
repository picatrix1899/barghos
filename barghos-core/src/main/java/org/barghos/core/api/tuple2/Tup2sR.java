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

/**
 * This interface grants readonly access to any 2-dimensional short tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2sR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	short getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	short getY();
	
	/**
	 * Returns true if all components are finite and therefore not NaN or Infinity.
	 * 
	 * @return True if all components are finite.
	 */
	default boolean isFinite()
	{
		return true;
	}
	
	/**
	 * Returns true if all components are exactly zero.
	 * 
	 * @return True if all components are exactly zero.
	 */
	default boolean isZero()
	{
		return getX() == (short)0 &&
				getY() == (short)0;
	}
	
	/**
	 * Returns true if all components are zero within inclusive the given tolerance.
	 * 
	 * @param tolerance The tolerance around zero, that should still count as zero.
	 * 
	 * @return True if all components are technically zero.
	 */
	default boolean isZero(short tolerance)
	{
		return Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance;
	}
	
	/**
	 * Returns true if all the components are valid.
	 * What values are considered valid or invalid depends on the tuple type.
	 * 
	 * @return True if all the components are valid.
	 */
	default boolean isValid()
	{
		return true;
	}
}