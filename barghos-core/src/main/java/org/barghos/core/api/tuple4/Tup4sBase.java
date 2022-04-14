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

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupsBase;
import org.barghos.core.api.tuple.TupsR;

/**
 * This interface represents any modifiable 4-dimensional short tuples.
 * 
 * @author picatrix1899
 */
public interface Tup4sBase extends Tup4sR, TupsBase
{
	/**
	 * Sets the x value of the tuple.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current tuple.
	 */
	Tup4sBase setX(short x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 */
	Tup4sBase setY(short y);
	
	/**
	 * Sets the z value of the tuple.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 */
	Tup4sBase setZ(short z);
	
	/**
	 * Sets the w value of the tuple.
	 * 
	 * @param w The new w value.
	 * 
	 * @return The current tuple.
	 */
	Tup4sBase setW(short w);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup4sR}.
	 * 
	 * @param t An existing implementation of {@link Tup4sR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4sBase set(Tup4sR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4sBase set(short value)
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
	default Tup4sBase set(short x, short y, short z, short w)
	{
		return setX(x).setY(y).setZ(z).setW(w);
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4sBase setByIndex(int index, short value)
	{
		switch(index)
		{
			case COMP_X: return setX(value);
			case COMP_Y: return setY(value);
			case COMP_Z: return setZ(value);
			case COMP_W: return setW(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4sBase setArray(short... v)
	{
		return set(v[COMP_X], v[COMP_Y], v[COMP_Z], v[COMP_W]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4sBase set(TupsR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	Tup4sBase clone();
}