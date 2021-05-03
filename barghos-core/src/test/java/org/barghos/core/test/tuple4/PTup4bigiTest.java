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

package org.barghos.core.test.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.tuple4.PTup4bigi;
import org.barghos.core.tuple4.Tup4bigi;

/**
 * This class provides component tests for the class {@link PTup4bigi}.
 * 
 * @since 1.0.0.0
 */
class PTup4bigiTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4bigi} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4bigi t = PTup4bigi.gen(new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4bigi} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4bigi t = PTup4bigi.gen(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
		assertEquals(BigInteger.valueOf(1), t.getZ());
		assertEquals(BigInteger.valueOf(1), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4bigi} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4bigi t = PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4bigi t = PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals("ptup4bigi(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4bigi#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4bigi t = PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4bigi.gen(BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)))); // x wrong
		assertFalse(t.equals(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(3), BigInteger.valueOf(3), BigInteger.valueOf(4)))); // y wrong
		assertFalse(t.equals(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(4), BigInteger.valueOf(4)))); // z wrong
		assertFalse(t.equals(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(5)))); // w wrong
		
		assertTrue(t.equals(new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))));
		assertTrue(t.equals(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)}
	 * returns a new instance of {@link PTup4bigi} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup4bigi t = PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));

		PTup4bigi result = t.getNewInstance(BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4), BigInteger.valueOf(5));
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(2), result.getX());
		assertEquals(BigInteger.valueOf(3), result.getY());
		assertEquals(BigInteger.valueOf(4), result.getZ());
		assertEquals(BigInteger.valueOf(5), result.getW());
	}
}