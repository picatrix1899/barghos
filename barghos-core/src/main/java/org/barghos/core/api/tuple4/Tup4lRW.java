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

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple.TuplRW;

/**
 * This interface grants read and write access to any 4-dimensional long tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4lRW extends Tup4lR, Tup4lW, TuplRW
{
	@Override
	Tup4lRW setX(long x);
	
	@Override
	Tup4lRW setY(long y);
	
	@Override
	Tup4lRW setZ(long z);
	
	@Override
	Tup4lRW setW(long w);
	
	@Override
	default Tup4lRW set(Tup4lR t)
	{
		return (Tup4lRW)Tup4lW.super.set(t);
	}
	
	@Override
	default Tup4lRW set(long value)
	{
		return (Tup4lRW)Tup4lW.super.set(value);
	}
	
	@Override
	default Tup4lRW set(long x, long y, long z, long w)
	{
		return (Tup4lRW)Tup4lW.super.set(x, y, z, w);
	}

	@Override
	default Tup4lRW getNewInstance(Tup4lR t)
	{
		return (Tup4lRW)Tup4lR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4lRW getNewInstance(long value)
	{
		return (Tup4lRW)Tup4lR.super.getNewInstance(value);
	}
	
	@Override
	Tup4lRW getNewInstance(long x, long y, long z, long w);
	
	@Override
	default int getDimensions()
	{
		return Tup4lR.super.getDimensions();
	}
	
	@Override
	default Tup4lRW getNewInstanceFromArray(long... values)
	{
		return (Tup4lRW)Tup4lR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4lRW setByIndex(int index, long value)
	{
		return (Tup4lRW)Tup4lW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4lRW setArray(long... values)
	{
		return (Tup4lRW)Tup4lW.super.setArray(values);
	}
	
	@Override
	default Tup4lRW set(TuplR t)
	{
		return (Tup4lRW)Tup4lW.super.set(t);
	}
	
	@Override
	default Tup4lRW getNewInstance(TuplR t)
	{
		return (Tup4lRW)Tup4lR.super.getNewInstance(t);
	}
}