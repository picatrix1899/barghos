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

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcRW;

/**
 * This interface grants read and write access to any 2-dimensional char tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup2cRW extends Tup2cR, Tup2cW, TupcRW
{
	@Override
	Tup2cRW setX(char x);
	
	@Override
	Tup2cRW setY(char y);
	
	@Override
	default Tup2cRW set(Tup2cR t)
	{
		return (Tup2cRW)Tup2cW.super.set(t);
	}
	
	@Override
	default Tup2cRW set(char value)
	{
		return (Tup2cRW)Tup2cW.super.set(value);
	}
	
	@Override
	default Tup2cRW set(char x, char y)
	{
		return (Tup2cRW)Tup2cW.super.set(x, y);
	}
	
	@Override
	default Tup2cRW getNewInstance(Tup2cR t)
	{
		return (Tup2cRW)Tup2cR.super.getNewInstance(t);
	}
	
	@Override
	default Tup2cRW getNewInstance(char value)
	{
		return (Tup2cRW)Tup2cR.super.getNewInstance(value);
	}
	
	@Override
	Tup2cRW getNewInstance(char x, char y);
	
	@Override
	default int getDimensions()
	{
		return Tup2cR.super.getDimensions();
	}
	
	@Override
	default Tup2cRW getNewInstanceFromArray(char... values)
	{
		return (Tup2cRW)Tup2cR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup2cRW setByIndex(int index, char value)
	{
		return (Tup2cRW)Tup2cW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup2cRW setArray(char... values)
	{
		return (Tup2cRW)Tup2cW.super.setArray(values);
	}
	
	@Override
	default Tup2cRW set(TupcR t)
	{
		return (Tup2cRW)Tup2cW.super.set(t);
	}
	
	@Override
	default Tup2cRW getNewInstance(TupcR t)
	{
		return (Tup2cRW)Tup2cR.super.getNewInstance(t);
	}
}