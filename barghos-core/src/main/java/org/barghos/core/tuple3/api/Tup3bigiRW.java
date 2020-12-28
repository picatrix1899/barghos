/*
MIT License

Copyright (c) 2020 picatrix1899 (Florian Zilkenat)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.tuple3.api;

import java.math.BigInteger;

/**
 * This interface grants read and write access to any 3-dimensional big integer tuple.
 * It should be prefered by design before direct usage of the original instance in method parameters.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup3bigiRW extends Tup3bigiR, Tup3bigiW
{
	@Override
	Tup3bigiRW setX(BigInteger x);
	
	@Override
	Tup3bigiRW setY(BigInteger y);
	
	@Override
	Tup3bigiRW setZ(BigInteger z);
	
	@Override
	Tup3bigiRW set(Tup3bigiR t);
	
	@Override
	Tup3bigiRW set(BigInteger value);
	
	@Override
	Tup3bigiRW set(BigInteger x, BigInteger y, BigInteger z);
}
