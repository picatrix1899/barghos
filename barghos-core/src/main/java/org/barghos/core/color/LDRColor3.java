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

package org.barghos.core.color;

import org.barghos.core.api.color.LDRColor3R;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3iR;
import org.barghos.core.util.ArgumentNullException;
import org.barghos.core.Barghos;

/**
 * This class is a simple implementation of an LDRColor3.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class LDRColor3 implements LDRColor3R
{
	/**
	 * The red component safed in unitspace.
	 */
	public float r;
	
	/**
	 * The green component safed in unitspace.
	 */
	public float g;
	
	/**
	 * The blue component safed in unitspace.
	 */
	public float b;
	
	/**
	 * This is the default constructor.
	 * It is commonly used by a pool.
	 * It sets all components to 0.0 what is equal to black color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3() { }
	
	/**
	 * This constructor sets the components to t.
	 * The values of t are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param t A tuple that the components are set to.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3(Tup3fR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		set(t);
	}
	
	/**
	 * This constructor sets the components to t.
	 * The values of t are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param t A tuple that the components are set to.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3(Tup3iR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		set(t);
	}
	
	/**
	 * This constructor sets the components to scalar.
	 * The scalar is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param scalar A value that the components are set to.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3(float scalar)
	{
		set(scalar);
	}
	
	/**
	 * This constructor sets the components to scalar.
	 * The scalar is interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param scalar A value that the components are set to.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3(int scalar)
	{
		set(scalar);
	}
	
	/**
	 * This constructor sets the components to r, g and b.
	 * r, g and b are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param r The red component in unitspace.
	 * @param g The green component in unitspace.
	 * @param b The blue component in unitspace.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3(float r, float g, float b)
	{
		set(r, g, b);
	}
	
	/**
	 * This constructor sets the components to r, g and b.
	 * r, g and b are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param r The red component in colorspace.
	 * @param g The green component in colorspace.
	 * @param b The blue component in colorspace.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3(int r, int g, int b)
	{
		set(r, g, b);
	}
	
	/**
	 * Sets the red component to x.
	 * x is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param x The red component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setX(float x)
	{
		return setUnityR(x);
	}
	
	/**
	 * Sets the green component to y.
	 * y is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param y The green component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setY(float y)
	{
		return setUnityG(y);
	}
	
	/**
	 * Sets the blue component to z.
	 * z is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param z The blue component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setZ(float z)
	{
		return setUnityB(z);
	}
	
	/**
	 * Sets the red component to r.
	 * r is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param r The red component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setUnityR(float r)
	{
		this.r = clamp(r);
		
		return this;
	}
	
	/**
	 * Sets the green component to g.
	 * g is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param g The green component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setUnityG(float g)
	{
		this.g = clamp(g);
		
		return this;
	}
	
	/**
	 * Sets the blue component to b.
	 * b is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param b The blue component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setUnityB(float b)
	{
		this.b = clamp(b);
		
		return this;
	}
	
	/**
	 * Sets the red component to r.
	 * r is interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param r The red component in colorspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setR(int r)
	{
		return setUnityR(r * 0.00392156862f);
	}
	
	/**
	 * Sets the green component to g.
	 * g is interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param g The green component in colorspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setG(int g)
	{
		return setUnityG(g * 0.00392156862f);
	}
	
	/**
	 * Sets the blue component to b.
	 * b is interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param b The blue component in colorspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 setB(int b)
	{
		return setUnityB(b * 0.00392156862f);
	}
	
	/**
	 * Adepts the components from tuple t.
	 * The components are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param t The tuple to adept the components from in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 set(Tup3fR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adepts the components from tuple t.
	 * The components are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param t The tuple to adept the components from in colorspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 set(Tup3iR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets all components to scalar.
	 * The value of scalar is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param scalar The value all components should be set to in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 set(float scalar)
	{
		return set(scalar, scalar, scalar);
	}
	
	/**
	 * Sets all components to scalar.
	 * The value of scalar is interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param scalar The value all components should be set to in colorspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 set(int scalar)
	{
		return set(scalar, scalar, scalar);
	}
	
	/**
	 * Sets the components to r, g and b.
	 * The components are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 *
	 * @param r The red component in unitspace.
	 * @param g The green component in unitspace.
	 * @param b The blue component in unitspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 set(float r, float g, float b)
	{
		return setUnityR(r).setUnityG(g).setUnityB(b);
	}
	
	/**
	 * Sets the components to r, g and b.
	 * The components are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 *
	 * @param r The red component in colorspace.
	 * @param g The green component in colorspace.
	 * @param b The blue component in colorspace.
	 * 
	 * @return The current color.
	 * 
	 * @since 1.0.0.0
	 */
	public LDRColor3 set(int r, int g, int b)
	{
		return setR(r).setG(g).setB(b);
	}
	
	@Override
	public float getUnityR()
	{
		return this.r;
	}
	
	@Override
	public float getUnityG()
	{
		return this.g;
	}
	
	@Override
	public float getUnityB()
	{
		return this.b;
	}
	
	@Override
	public int getR()
	{
		return Math.round(this.r * 255);
	}
	
	@Override
	public int getG()
	{
		return Math.round(this.g * 255);
	}
	
	@Override
	public int getB()
	{
		return Math.round(this.b * 255);
	}
	
	/**
	 * Clamps the float value to unit space from 0.0 to 1.0.
	 * 
	 * @param value The value to be clamped.
	 * 
	 * @return The clamped value.
	 * 
	 * @since 1.0.0.0
	 */
	private float clamp(float value)
	{
		return value > 1.0f ? 1.0f : value < 0.0f ? 0.0f : value;
	}
}