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

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;

/**
 * This interface grants read and write access to any 4-dimensional byte tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4bRW extends Tup4bR, Tup4bW, TupbRW
{
	@Override
	Tup4bRW setX(byte x);
	
	@Override
	Tup4bRW setY(byte y);
	
	@Override
	Tup4bRW setZ(byte z);
	
	@Override
	Tup4bRW setW(byte w);
	
	@Override
	default Tup4bRW set(Tup4bR t)
	{
		return (Tup4bRW)Tup4bW.super.set(t);
	}
	
	@Override
	default Tup4bRW set(byte value)
	{
		return (Tup4bRW)Tup4bW.super.set(value);
	}
	
	@Override
	default Tup4bRW set(byte x, byte y, byte z, byte w)
	{
		return (Tup4bRW)Tup4bW.super.set(x, y, z, w);
	}

	@Override
	default Tup4bRW getNewInstance(Tup4bR t)
	{
		return (Tup4bRW)Tup4bR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4bRW getNewInstance(byte value)
	{
		return (Tup4bRW)Tup4bR.super.getNewInstance(value);
	}
	
	@Override
	Tup4bRW getNewInstance(byte x, byte y, byte z, byte w);
	
	@Override
	default int getDimensions()
	{
		return Tup4bR.super.getDimensions();
	}
	
	@Override
	default Tup4bRW getNewInstanceFromArray(byte... values)
	{
		return (Tup4bRW)Tup4bR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4bRW setByIndex(int index, byte value)
	{
		return (Tup4bRW)Tup4bW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4bRW setArray(byte... values)
	{
		return (Tup4bRW)Tup4bW.super.setArray(values);
	}
	
	@Override
	default Tup4bRW set(TupbR t)
	{
		return (Tup4bRW)Tup4bW.super.set(t);
	}
	
	@Override
	default Tup4bRW getNewInstance(TupbR t)
	{
		return (Tup4bRW)Tup4bR.super.getNewInstance(t);
	}
}