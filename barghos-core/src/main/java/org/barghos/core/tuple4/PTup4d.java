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

package org.barghos.core.tuple4;

import org.barghos.core.api.tuple4.Tup4dR;

import org.barghos.core.Barghos;
import org.barghos.core.util.ArgumentNullException;

/**
 * Represents a persistent 4-dimensional double tuple.
 * This is a readonly version of a 4-dimensional tuple with extended protection against modification.
 * It can be used as a more flexible way to create constants.
 * 
 * <p>
 * This class should not be inherited, not direct by extending nor anonymous,
 * as this would render the protection mechanism used as useless.
 * To get an instance you call one of the static generator methods.
 * </p>
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public abstract class PTup4d implements Tup4dR
{
	private PTup4d() { }
	
	/**
	 * Generates a new readonly {@link PTup4d} from an existing instance of {@link Tup4dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup4dR} to adopt the values from.
	 * 
	 * @return A new readonly {@link PTup4d}.
	 * 
	 * @since 1.0.0.0
	 */
	public static PTup4d gen(Tup4dR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return gen(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Generates a new readonly {@link PTup4d} with all values set to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 * 
	 * @return A new readonly {@link PTup4d}.
	 * 
	 * @since 1.0.0.0
	 */
	public static PTup4d gen(double value)
	{
		return gen(value, value, value, value);
	}
	
	/**
	 * Generates a new readonly {@link PTup4d} with the values set to the corresponding parameters.
	 * 
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.
	 * @param w The w value.
	 * 
	 * @return A new readonly {@link PTup4d}.
	 * 
	 * @since 1.0.0.0
	 */
	public static PTup4d gen(double x, double y, double z, double w)
	{
		return new PTup4d()
		{
			@Override
			public double getX() { return x; }
			
			@Override
			public double getY() { return y; }
			
			@Override
			public double getZ() { return z; }
			
			@Override
			public double getW() { return w; }
		};
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp = Double.doubleToLongBits(getX());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getY());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getZ());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getW());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Tup4dR)) return false;
		
		Tup4dR other = (Tup4dR) obj;
		if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
		if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
		if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getZ())) return false;
		if(Double.doubleToLongBits(getW()) != Double.doubleToLongBits(other.getW())) return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return "ptup4d(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", w=" + getW() + ")";
	}
}