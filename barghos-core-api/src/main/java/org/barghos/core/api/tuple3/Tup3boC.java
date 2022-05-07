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

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple.TupboC;
import org.barghos.core.api.tuple.TupboR;

/**
 * This interface represents any modifiable 3-dimensional boolean tuples.
 * 
 * @author picatrix1899
 */
public interface Tup3boC extends Tup3boR, TupboC
{
	/**
	 * Sets the x value of the tuple.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current tuple.
	 */
	Tup3boC setX(boolean x);
	
	/**
	 * Sets the y value of the tuple.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current tuple.
	 */
	Tup3boC setY(boolean y);
	
	/**
	 * Sets the z value of the tuple.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 */
	Tup3boC setZ(boolean z);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup3boR}.
	 * 
	 * @param t An existing implementation of {@link Tup3boR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3boC set(Tup3boR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC set(boolean value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * @param z The new z value.
	 * 
	 * @return The current tuple.
	 */
	default Tup3boC set(boolean x, boolean y, boolean z)
	{
		return setX(x).setY(y).setZ(z);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC setByIndex(int index, boolean value)
	{
		switch(index)
		{
			case COMP_X: return setX(value);
			case COMP_Y: return setY(value);
			case COMP_Z: return setZ(value);
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC setArray(boolean... v)
	{
		return set(v[COMP_X], v[COMP_Y], v[COMP_Z]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC set(TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC shallowClone()
	{
		return clone();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC deepClone()
	{
		return clone();
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3boC clone();
}