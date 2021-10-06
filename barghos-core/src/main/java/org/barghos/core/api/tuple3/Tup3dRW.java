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

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupdRW;

/**
 * This interface grants read and write access to any 3-dimensional double tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3dRW extends Tup3dR, Tup3dW, TupdRW
{
	@Override
	Tup3dRW setX(double x);
	
	@Override
	Tup3dRW setY(double y);
	
	@Override
	Tup3dRW setZ(double z);
	
	@Override
	default Tup3dRW set(Tup3dR t)
	{
		return (Tup3dRW)Tup3dW.super.set(t);
	}
	
	@Override
	default Tup3dRW set(double value)
	{
		return (Tup3dRW)Tup3dW.super.set(value);
	}
	
	@Override
	default Tup3dRW set(double x, double y, double z)
	{
		return (Tup3dRW)Tup3dW.super.set(x, y, z);
	}

	@Override
	default Tup3dRW getNewInstance(Tup3dR t)
	{
		return (Tup3dRW)Tup3dR.super.getNewInstance(t);
	}
	
	@Override
	default Tup3dRW getNewInstance(double value)
	{
		return (Tup3dRW)Tup3dR.super.getNewInstance(value);
	}
	
	@Override
	Tup3dRW getNewInstance(double x, double y, double z);
	
	@Override
	default int getDimensions()
	{
		return Tup3dR.super.getDimensions();
	}
	
	@Override
	default Tup3dRW getNewInstanceFromArray(double... values)
	{
		return (Tup3dRW)Tup3dR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup3dRW setByIndex(int index, double value)
	{
		return (Tup3dRW)Tup3dW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup3dRW setArray(double... values)
	{
		return (Tup3dRW)Tup3dW.super.setArray(values);
	}
	
	@Override
	default Tup3dRW set(TupdR t)
	{
		return (Tup3dRW)Tup3dW.super.set(t);
	}
	
	@Override
	default Tup3dRW getNewInstance(TupdR t)
	{
		return (Tup3dRW)Tup3dR.super.getNewInstance(t);
	}
}