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

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple.TupsRW;

/**
 * This interface grants read and write access to any 4-dimensional short tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4sRW extends Tup4sR, Tup4sW, TupsRW
{
	@Override
	Tup4sRW setX(short x);
	
	@Override
	Tup4sRW setY(short y);
	
	@Override
	Tup4sRW setZ(short z);
	
	@Override
	Tup4sRW setW(short w);
	
	@Override
	default Tup4sRW set(Tup4sR t)
	{
		return (Tup4sRW)Tup4sW.super.set(t);
	}
	
	@Override
	default Tup4sRW set(short value)
	{
		return (Tup4sRW)Tup4sW.super.set(value);
	}
	
	@Override
	default Tup4sRW set(short x, short y, short z, short w)
	{
		return (Tup4sRW)Tup4sW.super.set(x, y, z, w);
	}

	@Override
	default Tup4sRW getNewInstance(Tup4sR t)
	{
		return (Tup4sRW)Tup4sR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4sRW getNewInstance(short value)
	{
		return (Tup4sRW)Tup4sR.super.getNewInstance(value);
	}
	
	@Override
	Tup4sRW getNewInstance(short x, short y, short z, short w);
	
	@Override
	default int getDimensions()
	{
		return Tup4sR.super.getDimensions();
	}
	
	@Override
	default Tup4sRW getNewInstanceFromArray(short... values)
	{
		return (Tup4sRW)Tup4sR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4sRW setByIndex(int index, short value)
	{
		return (Tup4sRW)Tup4sW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4sRW setArray(short... values)
	{
		return (Tup4sRW)Tup4sW.super.setArray(values);
	}
	
	@Override
	default Tup4sRW set(TupsR t)
	{
		return (Tup4sRW)Tup4sW.super.set(t);
	}
	
	@Override
	default Tup4sRW getNewInstance(TupsR t)
	{
		return (Tup4sRW)Tup4sR.super.getNewInstance(t);
	}
}