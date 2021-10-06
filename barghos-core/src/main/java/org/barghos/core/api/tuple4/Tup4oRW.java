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
 * This interface grants read and write access to any 3-dimensional object tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4oRW<X,Y,Z,W> extends Tup4oR<X,Y,Z,W>, Tup4oW<X,Y,Z,W>
{
	@Override
	Tup4oRW<X,Y,Z,W> setX(X x);
	
	@Override
	Tup4oRW<X,Y,Z,W> setY(Y y);
	
	@Override
	Tup4oRW<X,Y,Z,W> setZ(Z z);
	
	@Override
	Tup4oRW<X,Y,Z,W> setW(W w);
	
	@Override
	default Tup4oRW<X,Y,Z,W> set(Tup4oR<X,Y,Z,W> t)
	{
		return (Tup4oRW<X,Y,Z,W>)Tup4oW.super.set(t);
	}
	
	@Override
	default Tup4oRW<X,Y,Z,W> set(X x, Y y, Z z, W w)
	{
		return (Tup4oRW<X,Y,Z,W>)Tup4oW.super.set(x, y, z, w);
	}
	
	@Override
	default Tup4oRW<X,Y,Z,W> getNewInstance(Tup4oR<X,Y,Z,W> t)
	{
		return (Tup4oRW<X,Y,Z,W>)Tup4oR.super.getNewInstance(t);
	}
	
	@Override
	Tup4oRW<X,Y,Z,W> getNewInstance(X x, Y y, Z z, W w);
}