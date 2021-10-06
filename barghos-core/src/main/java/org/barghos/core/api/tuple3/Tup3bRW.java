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

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;

/**
 * This interface grants read and write access to any 3-dimensional byte tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3bRW extends Tup3bR, Tup3bW, TupbRW
{
	@Override
	Tup3bRW setX(byte x);
	
	@Override
	Tup3bRW setY(byte y);
	
	@Override
	Tup3bRW setZ(byte z);
	
	@Override
	default Tup3bRW set(Tup3bR t)
	{
		return (Tup3bRW)Tup3bW.super.set(t);
	}
	
	@Override
	default Tup3bRW set(byte value)
	{
		return (Tup3bRW)Tup3bW.super.set(value);
	}
	
	@Override
	default Tup3bRW set(byte x, byte y, byte z)
	{
		return (Tup3bRW)Tup3bW.super.set(x, y, z);
	}

	@Override
	default Tup3bRW getNewInstance(Tup3bR t)
	{
		return (Tup3bRW)Tup3bR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3bRW getNewInstance(byte value)
	{
		return (Tup3bRW)Tup3bR.super.getNewInstance(value);
	}
	
	@Override
	Tup3bRW getNewInstance(byte x, byte y, byte z);
	
	@Override
	default int getDimensions()
	{
		return Tup3bR.super.getDimensions();
	}
	
	@Override
	default Tup3bRW getNewInstanceFromArray(byte... values)
	{
		return (Tup3bRW)Tup3bR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3bRW setByIndex(int index, byte value)
	{
		return (Tup3bRW)Tup3bW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3bRW setArray(byte... values)
	{
		return (Tup3bRW)Tup3bW.super.setArray(values);
	}
	
	@Override
	default Tup3bRW set(TupbR t)
	{
		return (Tup3bRW)Tup3bW.super.set(t);
	}
	
	@Override
	default Tup3bRW getNewInstance(TupbR t)
	{
		return (Tup3bRW)Tup3bR.super.getNewInstance(t);
	}
}