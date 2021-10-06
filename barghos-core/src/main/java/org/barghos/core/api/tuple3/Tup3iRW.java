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

package org.barghos.core.api.tuple3;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiRW;

/**
 * This interface grants read and write access to any 3-dimensional integer tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3iRW extends Tup3iR, Tup3iW, TupiRW
{
	@Override
	Tup3iRW setX(int x);
	
	@Override
	Tup3iRW setY(int y);
	
	@Override
	Tup3iRW setZ(int z);
	
	@Override
	default Tup3iRW set(Tup3iR t)
	{
		return (Tup3iRW)Tup3iW.super.set(t);
	}
	
	@Override
	default Tup3iRW set(int value)
	{
		return (Tup3iRW)Tup3iW.super.set(value);
	}
	
	@Override
	default Tup3iRW set(int x, int y, int z)
	{
		return (Tup3iRW)Tup3iW.super.set(x, y, z);
	}

	@Override
	default Tup3iRW getNewInstance(Tup3iR t)
	{
		return (Tup3iRW)Tup3iR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3iRW getNewInstance(int value)
	{
		return (Tup3iRW)Tup3iR.super.getNewInstance(value);
	}
	
	@Override
	Tup3iRW getNewInstance(int x, int y, int z);
	
	@Override
	default int getDimensions()
	{
		return Tup3iR.super.getDimensions();
	}
	
	@Override
	default Tup3iRW getNewInstanceFromArray(int... values)
	{
		return (Tup3iRW)Tup3iR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3iRW setByIndex(int index, int value)
	{
		return (Tup3iRW)Tup3iW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3iRW setArray(int... values)
	{
		return (Tup3iRW)Tup3iW.super.setArray(values);
	}
	
	@Override
	default Tup3iRW set(TupiR t)
	{
		return (Tup3iRW)Tup3iW.super.set(t);
	}
	
	@Override
	default Tup3iRW getNewInstance(TupiR t)
	{
		return (Tup3iRW)Tup3iR.super.getNewInstance(t);
	}
}