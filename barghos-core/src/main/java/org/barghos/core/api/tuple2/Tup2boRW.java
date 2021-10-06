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

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple.TupboRW;

/**
 * This interface grants read and write access to any 2-dimensional boolean tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2boRW extends Tup2boR, Tup2boW, TupboRW
{
	@Override
	Tup2boRW setX(boolean x);
	
	@Override
	Tup2boRW setY(boolean y);
	
	@Override
	default Tup2boRW set(Tup2boR t)
	{
		return (Tup2boRW)Tup2boW.super.set(t);
	}
	
	@Override
	default Tup2boRW set(boolean value)
	{
		return (Tup2boRW)Tup2boW.super.set(value);
	}
	
	@Override
	default Tup2boRW set(boolean x, boolean y)
	{
		return (Tup2boRW)Tup2boW.super.set(x, y);
	}
	
	@Override
	default Tup2boRW getNewInstance(Tup2boR t)
	{
		return (Tup2boRW)Tup2boR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2boRW getNewInstance(boolean value)
	{
		return (Tup2boRW)Tup2boR.super.getNewInstance(value);
	}
	
	@Override
	Tup2boRW getNewInstance(boolean x, boolean y);
	
	@Override
	default int getDimensions()
	{
		return Tup2boR.super.getDimensions();
	}
	
	@Override
	default Tup2boRW getNewInstanceFromArray(boolean... values)
	{
		return (Tup2boRW)Tup2boR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2boRW setByIndex(int index, boolean value)
	{
		return (Tup2boRW)Tup2boW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2boRW setArray(boolean... values)
	{
		return (Tup2boRW)Tup2boW.super.setArray(values);
	}
	
	@Override
	default Tup2boRW set(TupboR t)
	{
		return (Tup2boRW)Tup2boW.super.set(t);
	}
	
	@Override
	default Tup2boRW getNewInstance(TupboR t)
	{
		return (Tup2boRW)Tup2boR.super.getNewInstance(t);
	}
}