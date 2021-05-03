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

/**
 * This interface grants read and write access to any 4-dimensional double tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4dRW extends Tup4dR, Tup4dW
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
	Tup4dRW set(Tup4dR t);
	
	@Override
	Tup4dRW set(double value);
	
	@Override
	Tup4dRW set(double x, double y, double z, double w);
	
	@Override
	default Tup4dRW getNewInstance(Tup4dR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	default Tup4dRW getNewInstance(double value)
	{
		return getNewInstance(value, value, value, value);
	}
	
	@Override
	Tup4dRW getNewInstance(double x, double y, double z, double w);
}