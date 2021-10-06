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

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjRW;

/**
 * This interface grants read and write access to any 2-dimensional object tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2objRW extends Tup2objR, Tup2objW, TupobjRW
{
	@Override
	Tup2objRW setX(Object x);
	
	@Override
	Tup2objRW setY(Object y);
	
	@Override
	default Tup2objRW set(Tup2objR t)
	{
		return (Tup2objRW)Tup2objW.super.set(t);
	}
	
	@Override
	default Tup2objRW set(Object value)
	{
		return (Tup2objRW)Tup2objW.super.set(value);
	}
	
	@Override
	default Tup2objRW set(Object x, Object y)
	{
		return (Tup2objRW)Tup2objW.super.set(x, y);
	}
	
	@Override
	default Tup2objRW getNewInstance(Tup2objR t)
	{
		return (Tup2objRW)Tup2objR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2objRW getNewInstance(Object value)
	{
		return (Tup2objRW)Tup2objR.super.getNewInstance(value);
	}
	
	@Override
	Tup2objRW getNewInstance(Object x, Object y);
	
	@Override
	default int getDimensions()
	{
		return Tup2objR.super.getDimensions();
	}
	
	@Override
	default Tup2objRW getNewInstanceFromArray(Object... values)
	{
		return (Tup2objRW)Tup2objR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2objRW setByIndex(int index, Object value)
	{
		return (Tup2objRW)Tup2objW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2objRW setArray(Object... values)
	{
		return (Tup2objRW)Tup2objW.super.setArray(values);
	}
	
	@Override
	default Tup2objRW set(TupobjR t)
	{
		return (Tup2objRW)Tup2objW.super.set(t);
	}
	
	@Override
	default Tup2objRW getNewInstance(TupobjR t)
	{
		return (Tup2objRW)Tup2objR.super.getNewInstance(t);
	}
}