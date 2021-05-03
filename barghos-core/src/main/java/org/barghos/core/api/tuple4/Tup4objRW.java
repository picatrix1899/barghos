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
 * This interface grants read and write access to any 4-dimensional object tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4objRW extends Tup4objR, Tup4objW
{
	@Override
	Tup4objRW setX(Object x);
	
	@Override
	Tup4objRW setY(Object y);
	
	@Override
	Tup4objRW setZ(Object z);
	
	@Override
	Tup4objRW setW(Object w);
	
	@Override
	Tup4objRW set(Tup4objR t);
	
	@Override
	Tup4objRW set(Object value);
	
	@Override
	Tup4objRW set(Object x, Object y, Object z, Object w);
	
	@Override
	default Tup4objRW getNewInstance(Tup4objR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	default Tup4objRW getNewInstance(Object value)
	{
		return getNewInstance(value, value, value, value);
	}
	
	@Override
	Tup4objRW getNewInstance(Object x, Object y, Object z, Object w);
}