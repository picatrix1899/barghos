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

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiRW;

/**
 * This interface grants read and write access to any 4-dimensional integer tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4iRW extends Tup4iR, Tup4iW, TupiRW
{
	@Override
	Tup4iRW setX(int x);
	
	@Override
	Tup4iRW setY(int y);
	
	@Override
	Tup4iRW setZ(int z);
	
	@Override
	Tup4iRW setW(int w);
	
	@Override
	default Tup4iRW set(Tup4iR t)
	{
		return (Tup4iRW)Tup4iW.super.set(t);
	}
	
	@Override
	default Tup4iRW set(int value)
	{
		return (Tup4iRW)Tup4iW.super.set(value);
	}
	
	@Override
	default Tup4iRW set(int x, int y, int z, int w)
	{
		return (Tup4iRW)Tup4iW.super.set(x, y, z, w);
	}

	@Override
	default Tup4iRW getNewInstance(Tup4iR t)
	{
		return (Tup4iRW)Tup4iR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4iRW getNewInstance(int value)
	{
		return (Tup4iRW)Tup4iR.super.getNewInstance(value);
	}
	
	@Override
	Tup4iRW getNewInstance(int x, int y, int z, int w);
	
	@Override
	default int getDimensions()
	{
		return Tup4iR.super.getDimensions();
	}
	
	@Override
	default Tup4iRW getNewInstanceFromArray(int... values)
	{
		return (Tup4iRW)Tup4iR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4iRW setByIndex(int index, int value)
	{
		return (Tup4iRW)Tup4iW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4iRW setArray(int... values)
	{
		return (Tup4iRW)Tup4iW.super.setArray(values);
	}
	
	@Override
	default Tup4iRW set(TupiR t)
	{
		return (Tup4iRW)Tup4iW.super.set(t);
	}
	
	@Override
	default Tup4iRW getNewInstance(TupiR t)
	{
		return (Tup4iRW)Tup4iR.super.getNewInstance(t);
	}
}