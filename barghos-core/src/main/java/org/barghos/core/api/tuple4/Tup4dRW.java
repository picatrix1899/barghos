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

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupdRW;

/**
 * This interface grants read and write access to any 4-dimensional double tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4dRW extends Tup4dR, Tup4dW, TupdRW
{
	@Override
	Tup4dRW setX(double x);
	
	@Override
	Tup4dRW setY(double y);
	
	@Override
	Tup4dRW setZ(double z);
	
	@Override
	Tup4dRW setW(double w);
	
	@Override
	default Tup4dRW set(Tup4dR t)
	{
		return (Tup4dRW)Tup4dW.super.set(t);
	}
	
	@Override
	default Tup4dRW set(double value)
	{
		return (Tup4dRW)Tup4dW.super.set(value);
	}
	
	@Override
	default Tup4dRW set(double x, double y, double z, double w)
	{
		return (Tup4dRW)Tup4dW.super.set(x, y, z, w);
	}

	@Override
	default Tup4dRW getNewInstance(Tup4dR t)
	{
		return (Tup4dRW)Tup4dR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4dRW getNewInstance(double value)
	{
		return (Tup4dRW)Tup4dR.super.getNewInstance(value);
	}
	
	@Override
	Tup4dRW getNewInstance(double x, double y, double z, double w);
	
	@Override
	default int getDimensions()
	{
		return Tup4dR.super.getDimensions();
	}
	
	@Override
	default Tup4dRW getNewInstanceFromArray(double... values)
	{
		return (Tup4dRW)Tup4dR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4dRW setByIndex(int index, double value)
	{
		return (Tup4dRW)Tup4dW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4dRW setArray(double... values)
	{
		return (Tup4dRW)Tup4dW.super.setArray(values);
	}
	
	@Override
	default Tup4dRW set(TupdR t)
	{
		return (Tup4dRW)Tup4dW.super.set(t);
	}
	
	@Override
	default Tup4dRW getNewInstance(TupdR t)
	{
		return (Tup4dRW)Tup4dR.super.getNewInstance(t);
	}
}