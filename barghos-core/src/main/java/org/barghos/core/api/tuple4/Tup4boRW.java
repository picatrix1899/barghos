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

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple.TupboRW;

/**
 * This interface grants read and write access to any 4-dimensional boolean tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4boRW extends Tup4boR, Tup4boW, TupboRW
{
	@Override
	Tup4boRW setX(boolean x);
	
	@Override
	Tup4boRW setY(boolean y);
	
	@Override
	Tup4boRW setZ(boolean z);
	
	@Override
	Tup4boRW setW(boolean w);
	
	@Override
	default Tup4boRW set(Tup4boR t)
	{
		return (Tup4boRW)Tup4boW.super.set(t);
	}
	
	@Override
	default Tup4boRW set(boolean value)
	{
		return (Tup4boRW)Tup4boW.super.set(value);
	}
	
	@Override
	default Tup4boRW set(boolean x, boolean y, boolean z, boolean w)
	{
		return (Tup4boRW)Tup4boW.super.set(x, y, z, w);
	}

	@Override
	default Tup4boRW getNewInstance(Tup4boR t)
	{
		return (Tup4boRW)Tup4boR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4boRW getNewInstance(boolean value)
	{
		return (Tup4boRW)Tup4boR.super.getNewInstance(value);
	}
	
	@Override
	Tup4boRW getNewInstance(boolean x, boolean y, boolean z, boolean w);
	
	@Override
	default int getDimensions()
	{
		return Tup4boR.super.getDimensions();
	}
	
	@Override
	default Tup4boRW getNewInstanceFromArray(boolean... values)
	{
		return (Tup4boRW)Tup4boR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4boRW setByIndex(int index, boolean value)
	{
		return (Tup4boRW)Tup4boW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4boRW setArray(boolean... values)
	{
		return (Tup4boRW)Tup4boW.super.setArray(values);
	}
	
	@Override
	default Tup4boRW set(TupboR t)
	{
		return (Tup4boRW)Tup4boW.super.set(t);
	}
	
	@Override
	default Tup4boRW getNewInstance(TupboR t)
	{
		return (Tup4boRW)Tup4boR.super.getNewInstance(t);
	}
}