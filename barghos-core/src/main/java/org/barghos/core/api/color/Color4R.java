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

package org.barghos.core.api.color;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple4.Tup4fR;

/**
 * This interface grants readonly access to any RGBA-Color.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Color4R extends Color3R, Tup4fR
{
	/**
	 * Returns the alpha component in unitspace (0 - 1).
	 * 
	 * @return The alpha component.
	 * 
	 * @since 1.0.0.0
	 */
	float getUnityA();
	
	/**
	 * Returns the alpha component in colorrange (0 - 255).
	 * 
	 * @return The alpha component.
	 * 
	 * @since 1.0.0.0
	 */
	int getA();
	
	/**
	 * Returns the red component in unitspace (0 - 1).
	 * 
	 * @return The red component.
	 * 
	 * @since 1.0.0.0
	 */
	default float getX() { return getUnityR(); }
	
	/**
	 * Returns the green component in unitspace (0 - 1).
	 * 
	 * @return The green component.
	 * 
	 * @since 1.0.0.0
	 */
	default float getY() { return getUnityG(); }
	
	/**
	 * Returns the blue component in unitspace (0 - 1).
	 * 
	 * @return The blue component.
	 * 
	 * @since 1.0.0.0
	 */
	default float getZ() { return getUnityB(); }
	
	/**
	 * Returns the alpha component in unitspace (0 - 1).
	 * 
	 * @return The alpha component.
	 * 
	 * @since 1.0.0.0
	 */
	default float getW() { return getUnityA(); }

	@Override
	default boolean isValid()
	{
		return Tup4fR.super.isValid();
	}

	@Override
	default boolean isZero()
	{
		return Tup4fR.super.isZero();
	}

	@Override
	default boolean isZero(float tolerance)
	{
		return Tup4fR.super.isZero(tolerance);
	}

	@Override
	default boolean isFinite()
	{
		return Tup4fR.super.isFinite();
	}
	
	@Override
	default Color4R getNewInstance(Tup3fR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ());
	}
	
	@Override
	default Color4R getNewInstance(Tup4fR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	default Color4R getNewInstance(float value)
	{
		return getNewInstance(value, value, value, value);
	}
	
	@Override
	Color4R getNewInstance(float x, float y, float z);
	
	@Override
	Color4R getNewInstance(float x, float y, float z, float w);
}