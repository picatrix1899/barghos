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

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple.TupbigdRW;

/**
 * This interface grants read and write access to any 3-dimensional big decimal tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3bigdRW extends Tup3bigdR, Tup3bigdW, TupbigdRW
{
	@Override
	Tup3bigdRW setX(BigDecimal x);
	
	@Override
	Tup3bigdRW setY(BigDecimal y);
	
	@Override
	Tup3bigdRW setZ(BigDecimal z);
	
	@Override
	default Tup3bigdRW set(Tup3bigdR t)
	{
		return (Tup3bigdRW)Tup3bigdW.super.set(t);
	}
	
	@Override
	default Tup3bigdRW set(BigDecimal value)
	{
		return (Tup3bigdRW)Tup3bigdW.super.set(value);
	}
	
	@Override
	default Tup3bigdRW set(BigDecimal x, BigDecimal y, BigDecimal z)
	{
		return (Tup3bigdRW)Tup3bigdW.super.set(x, y, z);
	}

	@Override
	default Tup3bigdRW getNewInstance(Tup3bigdR t)
	{
		return (Tup3bigdRW)Tup3bigdR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3bigdRW getNewInstance(BigDecimal value)
	{
		return (Tup3bigdRW)Tup3bigdR.super.getNewInstance(value);
	}
	
	@Override
	Tup3bigdRW getNewInstance(BigDecimal x, BigDecimal y, BigDecimal z);
	
	@Override
	default int getDimensions()
	{
		return Tup3bigdR.super.getDimensions();
	}
	
	@Override
	default Tup3bigdRW getNewInstanceFromArray(BigDecimal... values)
	{
		return (Tup3bigdRW)Tup3bigdR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3bigdRW setByIndex(int index, BigDecimal value)
	{
		return (Tup3bigdRW)Tup3bigdW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3bigdRW setArray(BigDecimal... values)
	{
		return (Tup3bigdRW)Tup3bigdW.super.setArray(values);
	}
	
	@Override
	default Tup3bigdRW set(TupbigdR t)
	{
		return (Tup3bigdRW)Tup3bigdW.super.set(t);
	}
	
	@Override
	default Tup3bigdRW getNewInstance(TupbigdR t)
	{
		return (Tup3bigdRW)Tup3bigdR.super.getNewInstance(t);
	}
}