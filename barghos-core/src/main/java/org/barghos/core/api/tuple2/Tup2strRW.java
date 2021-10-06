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

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple.TupstrRW;

/**
 * This interface grants read and write access to any 2-dimensional string tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2strRW extends Tup2strR, Tup2strW, TupstrRW
{
	@Override
	Tup2strRW setX(String x);
	
	@Override
	Tup2strRW setY(String y);
	
	@Override
	default Tup2strRW set(Tup2strR t)
	{
		return (Tup2strRW)Tup2strW.super.set(t);
	}
	
	@Override
	default Tup2strRW set(String value)
	{
		return (Tup2strRW)Tup2strW.super.set(value);
	}
	
	@Override
	default Tup2strRW set(String x, String y)
	{
		return (Tup2strRW)Tup2strW.super.set(x, y);
	}
	
	@Override
	default Tup2strRW getNewInstance(Tup2strR t)
	{
		return (Tup2strRW)Tup2strR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2strRW getNewInstance(String value)
	{
		return (Tup2strRW)Tup2strR.super.getNewInstance(value);
	}
	
	@Override
	Tup2strRW getNewInstance(String x, String y);
	
	@Override
	default int getDimensions()
	{
		return Tup2strR.super.getDimensions();
	}
	
	@Override
	default Tup2strRW getNewInstanceFromArray(String... values)
	{
		return (Tup2strRW)Tup2strR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2strRW setByIndex(int index, String value)
	{
		return (Tup2strRW)Tup2strW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2strRW setArray(String... values)
	{
		return (Tup2strRW)Tup2strW.super.setArray(values);
	}
	
	@Override
	default Tup2strRW set(TupstrR t)
	{
		return (Tup2strRW)Tup2strW.super.set(t);
	}
	
	@Override
	default Tup2strRW getNewInstance(TupstrR t)
	{
		return (Tup2strRW)Tup2strR.super.getNewInstance(t);
	}
}