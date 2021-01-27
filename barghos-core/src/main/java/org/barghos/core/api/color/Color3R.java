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

/**
 * This interface grants readonly access to any RGB-Color.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Color3R extends Tup3fR
{
	/**
	 * Returns the red component in unitspace (0 - 1).
	 * 
	 * @return The red component.
	 * 
	 * @since 1.0.0.0
	 */
	float getUnityR();
	
	/**
	 * Returns the green component in unitspace (0 - 1).
	 * 
	 * @return The green component.
	 * 
	 * @since 1.0.0.0
	 */
	float getUnityG();
	
	/**
	 * Returns the blue component in unitspace (0 - 1).
	 * 
	 * @return The blue component.
	 * 
	 * @since 1.0.0.0
	 */
	float getUnityB();
	
	/**
	 * Returns the red component in colorrange (0 - 255).
	 * 
	 * @return The red component.
	 * 
	 * @since 1.0.0.0
	 */
	int getR();
	
	/**
	 * Returns the green component in colorrange (0 - 255).
	 * 
	 * @return The green component.
	 * 
	 * @since 1.0.0.0
	 */
	int getG();
	
	/**
	 * Returns the blue component in colorrange (0 - 255).
	 * 
	 * @return The blue component.
	 * 
	 * @since 1.0.0.0
	 */
	int getB();
	
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
}