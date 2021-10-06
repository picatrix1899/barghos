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

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple.TuplRW;

/**
 * This interface grants read and write access to any 3-dimensional long tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3lRW extends Tup3lR, Tup3lW, TuplRW
{
	@Override
	Tup3lRW setX(long x);
	
	@Override
	Tup3lRW setY(long y);
	
	@Override
	Tup3lRW setZ(long z);
	
	@Override
	default Tup3lRW set(Tup3lR t)
	{
		return (Tup3lRW)Tup3lW.super.set(t);
	}
	
	@Override
	default Tup3lRW set(long value)
	{
		return (Tup3lRW)Tup3lW.super.set(value);
	}
	
	@Override
	default Tup3lRW set(long x, long y, long z)
	{
		return (Tup3lRW)Tup3lW.super.set(x, y, z);
	}

	@Override
	default Tup3lRW getNewInstance(Tup3lR t)
	{
		return (Tup3lRW)Tup3lR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3lRW getNewInstance(long value)
	{
		return (Tup3lRW)Tup3lR.super.getNewInstance(value);
	}
	
	@Override
	Tup3lRW getNewInstance(long x, long y, long z);
	
	@Override
	default int getDimensions()
	{
		return Tup3lR.super.getDimensions();
	}
	
	@Override
	default Tup3lRW getNewInstanceFromArray(long... values)
	{
		return (Tup3lRW)Tup3lR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3lRW setByIndex(int index, long value)
	{
		return (Tup3lRW)Tup3lW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3lRW setArray(long... values)
	{
		return (Tup3lRW)Tup3lW.super.setArray(values);
	}
	
	@Override
	default Tup3lRW set(TuplR t)
	{
		return (Tup3lRW)Tup3lW.super.set(t);
	}
	
	@Override
	default Tup3lRW getNewInstance(TuplR t)
	{
		return (Tup3lRW)Tup3lR.super.getNewInstance(t);
	}
}