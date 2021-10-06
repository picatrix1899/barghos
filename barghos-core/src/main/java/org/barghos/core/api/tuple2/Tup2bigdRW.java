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

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple.TupbigdRW;

/**
 * This interface grants read and write access to any 2-dimensional big decimal tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2bigdRW extends Tup2bigdR, Tup2bigdW, TupbigdRW
{
	@Override
	Tup2bigdRW setX(BigDecimal x);
	
	@Override
	Tup2bigdRW setY(BigDecimal y);
	
	@Override
	default Tup2bigdRW set(Tup2bigdR t)
	{
		return (Tup2bigdRW)Tup2bigdW.super.set(t);
	}
	
	@Override
	default Tup2bigdRW set(BigDecimal value)
	{
		return (Tup2bigdRW)Tup2bigdW.super.set(value);
	}
	
	@Override
	default Tup2bigdRW set(BigDecimal x, BigDecimal y)
	{
		return (Tup2bigdRW)Tup2bigdW.super.set(x, y);
	}

	@Override
	default Tup2bigdRW getNewInstance(Tup2bigdR t)
	{
		return (Tup2bigdRW)Tup2bigdR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2bigdRW getNewInstance(BigDecimal value)
	{
		return (Tup2bigdRW)Tup2bigdR.super.getNewInstance(value);
	}
	
	@Override
	Tup2bigdRW getNewInstance(BigDecimal x, BigDecimal y);

	@Override
	default int getDimensions()
	{
		return Tup2bigdR.super.getDimensions();
	}
	
	@Override
	default Tup2bigdRW getNewInstanceFromArray(BigDecimal... values)
	{
		return (Tup2bigdRW)Tup2bigdR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2bigdRW setByIndex(int index, BigDecimal value)
	{
		return (Tup2bigdRW)Tup2bigdW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2bigdRW setArray(BigDecimal... values)
	{
		return (Tup2bigdRW)Tup2bigdW.super.setArray(values);
	}
	
	@Override
	default Tup2bigdRW set(TupbigdR t)
	{
		return (Tup2bigdRW)Tup2bigdW.super.set(t);
	}
	
	@Override
	default Tup2bigdRW getNewInstance(TupbigdR t)
	{
		return (Tup2bigdRW)Tup2bigdR.super.getNewInstance(t);
	}
}