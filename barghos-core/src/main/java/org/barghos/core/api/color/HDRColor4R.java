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
 * This interface grants selective readonly access for high dynamic range (HDR) RGBA-Colors only.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface HDRColor4R extends HDRColor3R, Color4R
{
	@Override
	default HDRColor4R getNewInstance(Tup3fR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ());
	}
	
	@Override
	default HDRColor4R getNewInstance(Tup4fR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	default HDRColor4R getNewInstance(float value)
	{
		return getNewInstance(value, value, value, value);
	}
	
	@Override
	HDRColor4R getNewInstance(float x, float y, float z);
	
	@Override
	HDRColor4R getNewInstance(float x, float y, float z, float w);
}
