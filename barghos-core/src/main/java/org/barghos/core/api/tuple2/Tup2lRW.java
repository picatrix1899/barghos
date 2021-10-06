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

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple.TuplRW;

/**
 * This interface grants read and write access to any 2-dimensional integer tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2lRW extends Tup2lR, Tup2lW, TuplRW
{
	@Override
	Tup2lRW setX(long x);
	
	@Override
	Tup2lRW setY(long y);
	
	@Override
	default Tup2lRW set(Tup2lR t)
	{
		return (Tup2lRW)Tup2lW.super.set(t);
	}
	
	@Override
	default Tup2lRW set(long value)
	{
		return (Tup2lRW)Tup2lW.super.set(value);
	}
	
	@Override
	default Tup2lRW set(long x, long y)
	{
		return (Tup2lRW)Tup2lW.super.set(x, y);
	}
	
	@Override
	default Tup2lRW getNewInstance(Tup2lR t)
	{
		return (Tup2lRW)Tup2lR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2lRW getNewInstance(long value)
	{
		return (Tup2lRW)Tup2lR.super.getNewInstance(value);
	}
	
	@Override
	Tup2lRW getNewInstance(long x, long y);
	
	@Override
	default int getDimensions()
	{
		return Tup2lR.super.getDimensions();
	}
	
	@Override
	default Tup2lRW getNewInstanceFromArray(long... values)
	{
		return (Tup2lRW)Tup2lR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2lRW setByIndex(int index, long value)
	{
		return (Tup2lRW)Tup2lW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2lRW setArray(long... values)
	{
		return (Tup2lRW)Tup2lW.super.setArray(values);
	}
	
	@Override
	default Tup2lRW set(TuplR t)
	{
		return (Tup2lRW)Tup2lW.super.set(t);
	}
	
	@Override
	default Tup2lRW getNewInstance(TuplR t)
	{
		return (Tup2lRW)Tup2lR.super.getNewInstance(t);
	}
}