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

import java.math.BigInteger;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.util.ExtractParam;

/**
 * This interface grants readonly access to any 2-dimensional big integer tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup2bigiR extends TupbigiR
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	BigInteger getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	BigInteger getY();
	
	/** {@inheritDoc}} */
	@Override
	default boolean isExactlyZero()
	{
		return	getX().compareTo(BigInteger.ZERO) == 0 &&
				getY().compareTo(BigInteger.ZERO) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(BigInteger tolerance)
	{
		return	getX().abs().compareTo(tolerance) <= 0 &&
				getY().abs().compareTo(tolerance) <= 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isValid()
	{
		return	getX() != null &&
				getY() != null;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	/** {@inheritDoc}} */
	@Override
	default BigInteger getByIndex(int index)
	{
		switch(index)
		{
			case COMP_X: return getX();
			case COMP_Y: return getY();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default BigInteger[] toArray(@ExtractParam BigInteger[] res)
	{
		res[COMP_X] = getX();
		res[COMP_Y] = getY();
		
		return res;
	}
}