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

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;

/**
 * This interface grants read and write access to any 2-dimensional byte tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2bRW extends Tup2bR, Tup2bW, TupbRW
{
	@Override
	Tup2bRW setX(byte x);
	
	@Override
	Tup2bRW setY(byte y);
	
	@Override
	default Tup2bRW set(Tup2bR t)
	{
		return (Tup2bRW)Tup2bW.super.set(t);
	}
	
	@Override
	default Tup2bRW set(byte value)
	{
		return (Tup2bRW)Tup2bW.super.set(value);
	}
	
	@Override
	default Tup2bRW set(byte x, byte y)
	{
		return (Tup2bRW)Tup2bW.super.set(x, y);
	}
	
	@Override
	default Tup2bRW getNewInstance(Tup2bR t)
	{
		return (Tup2bRW)Tup2bR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2bRW getNewInstance(byte value)
	{
		return (Tup2bRW)Tup2bR.super.getNewInstance(value);
	}
	
	@Override
	Tup2bRW getNewInstance(byte x, byte y);
	
	@Override
	default int getDimensions()
	{
		return Tup2bR.super.getDimensions();
	}
	
	@Override
	default Tup2bRW getNewInstanceFromArray(byte... values)
	{
		return (Tup2bRW)Tup2bR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2bRW setByIndex(int index, byte value)
	{
		return (Tup2bRW)Tup2bW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2bRW setArray(byte... values)
	{
		return (Tup2bRW)Tup2bW.super.setArray(values);
	}
	
	@Override
	default Tup2bRW set(TupbR t)
	{
		return (Tup2bRW)Tup2bW.super.set(t);
	}
	
	@Override
	default Tup2bRW getNewInstance(TupbR t)
	{
		return (Tup2bRW)Tup2bR.super.getNewInstance(t);
	}
}