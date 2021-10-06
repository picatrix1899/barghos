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

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple.TupsRW;

/**
 * This interface grants read and write access to any 3-dimensional short tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3sRW extends Tup3sR, Tup3sW, TupsRW
{
	@Override
	Tup3sRW setX(short x);
	
	@Override
	Tup3sRW setY(short y);
	
	@Override
	Tup3sRW setZ(short z);
	
	@Override
	default Tup3sRW set(Tup3sR t)
	{
		return (Tup3sRW)Tup3sW.super.set(t);
	}
	
	@Override
	default Tup3sRW set(short value)
	{
		return (Tup3sRW)Tup3sW.super.set(value);
	}
	
	@Override
	default Tup3sRW set(short x, short y, short z)
	{
		return (Tup3sRW)Tup3sW.super.set(x, y, z);
	}

	@Override
	default Tup3sRW getNewInstance(Tup3sR t)
	{
		return (Tup3sRW)Tup3sR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3sRW getNewInstance(short value)
	{
		return (Tup3sRW)Tup3sR.super.getNewInstance(value);
	}
	
	@Override
	Tup3sRW getNewInstance(short x, short y, short z);
	
	@Override
	default int getDimensions()
	{
		return Tup3sR.super.getDimensions();
	}
	
	@Override
	default Tup3sRW getNewInstanceFromArray(short... values)
	{
		return (Tup3sRW)Tup3sR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3sRW setByIndex(int index, short value)
	{
		return (Tup3sRW)Tup3sW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3sRW setArray(short... values)
	{
		return (Tup3sRW)Tup3sW.super.setArray(values);
	}
	
	@Override
	default Tup3sRW set(TupsR t)
	{
		return (Tup3sRW)Tup3sW.super.set(t);
	}
	
	@Override
	default Tup3sRW getNewInstance(TupsR t)
	{
		return (Tup3sRW)Tup3sR.super.getNewInstance(t);
	}
}