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

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcRW;

/**
 * This interface grants read and write access to any 3-dimensional char tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3cRW extends Tup3cR, Tup3cW, TupcRW
{
	@Override
	Tup3cRW setX(char x);
	
	@Override
	Tup3cRW setY(char y);
	
	@Override
	Tup3cRW setZ(char z);
	
	@Override
	default Tup3cRW set(Tup3cR t)
	{
		return (Tup3cRW)Tup3cW.super.set(t);
	}
	
	@Override
	default Tup3cRW set(char value)
	{
		return (Tup3cRW)Tup3cW.super.set(value);
	}
	
	@Override
	default Tup3cRW set(char x, char y, char z)
	{
		return (Tup3cRW)Tup3cW.super.set(x, y, z);
	}

	@Override
	default Tup3cRW getNewInstance(Tup3cR t)
	{
		return (Tup3cRW)Tup3cR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3cRW getNewInstance(char value)
	{
		return (Tup3cRW)Tup3cR.super.getNewInstance(value);
	}
	
	@Override
	Tup3cRW getNewInstance(char x, char y, char z);
	
	@Override
	default int getDimensions()
	{
		return Tup3cR.super.getDimensions();
	}
	
	@Override
	default Tup3cRW getNewInstanceFromArray(char... values)
	{
		return (Tup3cRW)Tup3cR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3cRW setByIndex(int index, char value)
	{
		return (Tup3cRW)Tup3cW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3cRW setArray(char... values)
	{
		return (Tup3cRW)Tup3cW.super.setArray(values);
	}
	
	@Override
	default Tup3cRW set(TupcR t)
	{
		return (Tup3cRW)Tup3cW.super.set(t);
	}
	
	@Override
	default Tup3cRW getNewInstance(TupcR t)
	{
		return (Tup3cRW)Tup3cR.super.getNewInstance(t);
	}
}