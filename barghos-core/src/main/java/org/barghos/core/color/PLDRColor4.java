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

import org.barghos.core.api.color.LDRColor4R;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.core.api.tuple4.Tup4iR;
import org.barghos.core.api.util.ArgumentNullException;
import org.barghos.core.Barghos;

/**
 * This class is a readonly version of a low dynamic range (LDR/Standard) RGBA-Color.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public abstract class PLDRColor4 implements LDRColor4R
{
	/**
	 * This class should not be instanciated. It has to be generated by the <code>gen</code> functions.
	 */
	private PLDRColor4() { }
	
	/**
	 * This generate a readonly PLDRColor4 with the components adopted from t.
	 * The values of t are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param t A tuple that the components are adopted from.
	 * 
	 * @return A new readonly PLDRColor4 with the given components.
	 * 
	 * @since 1.0.0.0
	 */
	public static PLDRColor4 gen(Tup4fR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return gen(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * This generate a readonly PLDRColor4 with the components set to scalar.
	 * The scalar is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param scalar A value that the components are set to.
	 * 
	 * @return A new readonly PLDRColor4 with the given components.
	 * 
	 * @since 1.0.0.0
	 */
	public static PLDRColor4 gen(float scalar)
	{
		return gen(scalar, scalar, scalar, scalar);
	}
	
	/**
	 * This generate a readonly PLDRColor4 with the components set to r, g, b and a.
	 * r, g, b and are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param r The red component in unitspace.
	 * @param g The green component in unitspace.
	 * @param b The blue component in unitspace.
	 * @param a The alpha component in unitspace.
	 * 
	 * @return A new readonly PLDRColor4 with the given components.
	 * 
	 * @since 1.0.0.0
	 */
	public static PLDRColor4 gen(float r, float g, float b, float a)
	{
		return new PLDRColor4()
		{
			@Override
			public float getUnityR()
			{
				return clampF(r);
			}
			
			@Override
			public float getUnityG()
			{
				return clampF(g);
			}
			
			@Override
			public float getUnityB()
			{
				return clampF(b);
			}
			
			@Override
			public float getUnityA()
			{
				return clampF(a);
			}
			
			@Override
			public int getR()
			{
				return clampI(Math.round(r * 255));
			}
			
			@Override
			public int getG()
			{
				return clampI(Math.round(g * 255));
			}
			
			@Override
			public int getB()
			{
				return clampI(Math.round(b * 255));
			}
			
			@Override
			public int getA()
			{
				return clampI(Math.round(a * 255));
			}
		};
	}
	
	/**
	 * This generate a readonly PLDRColor4 with the components adopted from t.
	 * The values of t are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param t A tuple that the components are adopted from.
	 * 
	 * @return A new readonly PLDRColor4 with the given components.
	 * 
	 * @since 1.0.0.0
	 */
	public static PLDRColor4 gen(Tup4iR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return gen(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * This generate a readonly PLDRColor4 with the components set to scalar.
	 * The scalar is interpreted as in colorrange (0 - 255) and are clamped to these limit.
	 * 
	 * @param scalar A value that the components are set to.
	 * 
	 * @return A new readonly PLDRColor4 with the given components.
	 * 
	 * @since 1.0.0.0
	 */
	public static PLDRColor4 gen(int scalar)
	{
		return gen(scalar, scalar, scalar, scalar);
	}
	
	/**
	 * This generate a readonly PLDRColor4 with the components set to r, g, b and a.
	 * r, g, b and a are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param r The red component in colorspace.
	 * @param g The green component in colorspace.
	 * @param b The blue component in colorspace.
	 * @param a The alpha component in colorspace.
	 * 
	 * @return A new readonly PLDRColor4 with the given components.
	 * 
	 * @since 1.0.0.0
	 */
	public static PLDRColor4 gen(int r, int g, int b, int a)
	{
		return new PLDRColor4()
		{
			@Override
			public float getUnityR()
			{
				return clampF(r * 0.00392156862f);
			}
			
			@Override
			public float getUnityG()
			{
				return clampF(g * 0.00392156862f);
			}
			
			@Override
			public float getUnityB()
			{
				return clampF(b * 0.00392156862f);
			}
			
			@Override
			public float getUnityA()
			{
				return clampF(a * 0.00392156862f);
			}
			
			@Override
			public int getR()
			{
				return clampI(r);
			}
			
			@Override
			public int getG()
			{
				return clampI(g);
			}
			
			@Override
			public int getB()
			{
				return clampI(b);
			}
			
			@Override
			public int getA()
			{
				return clampI(a);
			}
		};
	}
	
	@Override
	public PLDRColor4 getNewInstance(float x, float y, float z)
	{
		return gen(x, y, z, 1.0f);
	}
	
	@Override
	public PLDRColor4 getNewInstance(float x, float y, float z, float w)
	{
		return gen(x, y, z, w);
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
	protected float clampF(float value)
	{
		return value > 1.0f ? 1.0f : value < 0.0f ? 0.0f : value;
	}
	
	/**
	 * Clamps the float value to color space from 0 to 255.
	 * 
	 * @param value The value to be clamped.
	 * 
	 * @return The clamped value.
	 * 
	 * @since 1.0.0.0
	 */
	protected int clampI(int value)
	{
		return value > 255 ? 255 : value < 0 ? 0 : value;
	}
}