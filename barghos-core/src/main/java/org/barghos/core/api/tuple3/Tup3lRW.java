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

/**
 * This interface grants read and write access to any 3-dimensional long tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3lRW extends Tup3lR, Tup3lW
{
	@Override
	Tup3lRW setX(long x);
	
	@Override
	Tup3lRW setY(long y);
	
	@Override
	Tup3lRW setZ(long z);
	
	@Override
	Tup3lRW set(Tup3lR t);
	
	@Override
	Tup3lRW set(long value);
	
	@Override
	Tup3lRW set(long x, long y, long z);
	
	@Override
	default Tup3lRW getNewInstance(Tup3lR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ());
	}
	
	@Override
	default Tup3lRW getNewInstance(long value)
	{
		return getNewInstance(value, value, value);
	}
	
	@Override
	Tup3lRW getNewInstance(long x, long y, long z);
}