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

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfRW;

/**
 * This interface grants read and write access to any 4-dimensional float tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4fRW extends Tup4fR, Tup4fW, TupfRW
{
	@Override
	Tup4fRW setX(float x);
	
	@Override
	Tup4fRW setY(float y);
	
	@Override
	Tup4fRW setZ(float z);
	
	@Override
	Tup4fRW setW(float w);
	
	@Override
	default Tup4fRW set(Tup4fR t)
	{
		return (Tup4fRW)Tup4fW.super.set(t);
	}
	
	@Override
	default Tup4fRW set(float value)
	{
		return (Tup4fRW)Tup4fW.super.set(value);
	}
	
	@Override
	default Tup4fRW set(float x, float y, float z, float w)
	{
		return (Tup4fRW)Tup4fW.super.set(x, y, z, w);
	}

	@Override
	default Tup4fRW getNewInstance(Tup4fR t)
	{
		return (Tup4fRW)Tup4fR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4fRW getNewInstance(float value)
	{
		return (Tup4fRW)Tup4fR.super.getNewInstance(value);
	}
	
	@Override
	Tup4fRW getNewInstance(float x, float y, float z, float w);
	
	@Override
	default int getDimensions()
	{
		return Tup4fR.super.getDimensions();
	}
	
	@Override
	default Tup4fRW getNewInstanceFromArray(float... values)
	{
		return (Tup4fRW)Tup4fR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4fRW setByIndex(int index, float value)
	{
		return (Tup4fRW)Tup4fW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4fRW setArray(float... values)
	{
		return (Tup4fRW)Tup4fW.super.setArray(values);
	}
	
	@Override
	default Tup4fRW set(TupfR t)
	{
		return (Tup4fRW)Tup4fW.super.set(t);
	}
	
	@Override
	default Tup4fRW getNewInstance(TupfR t)
	{
		return (Tup4fRW)Tup4fR.super.getNewInstance(t);
	}
}