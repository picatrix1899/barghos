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

import org.barghos.core.api.tuple.TupdR;

/**
 * This interface grants readonly access to any 3-dimensional double tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Tup3dR extends TupdR
{
	/**
	 * The COMP_X constant contains the index of the x-component of the tuple.
	 */
	public static final int COMP_X = 0;
	
	/**
	 * The COMP_Y constant contains the index of the y-component of the tuple.
	 */
	public static final int COMP_Y = 1;
	
	/**
	 * The COMP_Z constant contains the index of the z-component of the tuple.
	 */
	public static final int COMP_Z = 2;
	
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 */
	double getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 */
	double getY();
	
	/**
	 * Returns the z value from the tuple.
	 * 
	 * @return The z value from the tuple.
	 */
	double getZ();
	
	/** {@inheritDoc}} */
	@Override
	default boolean isFinite()
	{
		return Double.isFinite(getX()) &&
				Double.isFinite(getY()) &&
				Double.isFinite(getZ());
	}

	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return getX() == 0.0 &&
				getY() == 0.0 &&
				getZ() == 0.0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZeroWithMargin(double tolerance)
	{
		return Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance &&
				Math.abs(getZ()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 3;
	}
	
	/** {@inheritDoc}} */
	@Override
	default double getByIndex(int index)
	{
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			case 2: return getZ();
		}
		
		throw new IndexOutOfBoundsException(index);
	}
	
	/** {@inheritDoc}} */
	@Override
	default double[] getArray()
	{
		return new double[] {getX(), getY(), getZ()};
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Tup3dR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Tup3dR of(final double x, final double y, final double z)
	{
		return new Tup3dR() {
			public double getX()
			{
				return x;
			}

			public double getY()
			{
				return y;
			}

			public double getZ()
			{
				return z;
			}
		};
	}
}