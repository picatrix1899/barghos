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

package org.barghos.core.api.tuple2;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfRW;

/**
 * This interface grants read and write access to any 2-dimensional float tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2fRW extends Tup2fR, Tup2fW, TupfRW
{
	@Override
	Tup2fRW setX(float x);
	
	@Override
	Tup2fRW setY(float y);
	
	@Override
	default Tup2fRW set(Tup2fR t)
	{
		return (Tup2fRW)Tup2fW.super.set(t);
	}
	
	@Override
	default Tup2fRW set(float value)
	{
		return (Tup2fRW)Tup2fW.super.set(value);
	}
	
	@Override
	default Tup2fRW set(float x, float y)
	{
		return (Tup2fRW)Tup2fW.super.set(x, y);
	}
	
	@Override
	default Tup2fRW getNewInstance(Tup2fR t)
	{
		return (Tup2fRW)Tup2fR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2fRW getNewInstance(float value)
	{
		return (Tup2fRW)Tup2fR.super.getNewInstance(value);
	}
	
	@Override
	Tup2fRW getNewInstance(float x, float y);
	
	@Override
	default int getDimensions()
	{
		return Tup2fR.super.getDimensions();
	}
	
	@Override
	default Tup2fRW getNewInstanceFromArray(float... values)
	{
		return (Tup2fRW)Tup2fR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2fRW setByIndex(int index, float value)
	{
		return (Tup2fRW)Tup2fW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2fRW setArray(float... values)
	{
		return (Tup2fRW)Tup2fW.super.setArray(values);
	}
	
	@Override
	default Tup2fRW set(TupfR t)
	{
		return (Tup2fRW)Tup2fW.super.set(t);
	}
	
	@Override
	default Tup2fRW getNewInstance(TupfR t)
	{
		return (Tup2fRW)Tup2fR.super.getNewInstance(t);
	}
}