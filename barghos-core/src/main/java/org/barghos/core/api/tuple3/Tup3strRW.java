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

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple.TupstrRW;

/**
 * This interface grants read and write access to any 3-dimensional string tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3strRW extends Tup3strR, Tup3strW, TupstrRW
{
	@Override
	Tup3strRW setX(String x);
	
	@Override
	Tup3strRW setY(String y);
	
	@Override
	Tup3strRW setZ(String z);
	
	@Override
	default Tup3strRW set(Tup3strR t)
	{
		return (Tup3strRW)Tup3strW.super.set(t);
	}
	
	@Override
	default Tup3strRW set(String value)
	{
		return (Tup3strRW)Tup3strW.super.set(value);
	}
	
	@Override
	default Tup3strRW set(String x, String y, String z)
	{
		return (Tup3strRW)Tup3strW.super.set(x, y, z);
	}

	@Override
	default Tup3strRW getNewInstance(Tup3strR t)
	{
		return (Tup3strRW)Tup3strR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3strRW getNewInstance(String value)
	{
		return (Tup3strRW)Tup3strR.super.getNewInstance(value);
	}
	
	@Override
	Tup3strRW getNewInstance(String x, String y, String z);
	
	@Override
	default int getDimensions()
	{
		return Tup3strR.super.getDimensions();
	}
	
	@Override
	default Tup3strRW getNewInstanceFromArray(String... values)
	{
		return (Tup3strRW)Tup3strR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3strRW setByIndex(int index, String value)
	{
		return (Tup3strRW)Tup3strW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3strRW setArray(String... values)
	{
		return (Tup3strRW)Tup3strW.super.setArray(values);
	}
	
	@Override
	default Tup3strRW set(TupstrR t)
	{
		return (Tup3strRW)Tup3strW.super.set(t);
	}
	
	@Override
	default Tup3strRW getNewInstance(TupstrR t)
	{
		return (Tup3strRW)Tup3strR.super.getNewInstance(t);
	}
}