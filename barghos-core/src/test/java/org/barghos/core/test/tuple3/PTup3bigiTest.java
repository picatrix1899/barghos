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

package org.barghos.core.test.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.tuple3.PTup3bigi;
import org.barghos.core.tuple3.Tup3bigi;

/**
 * This class provides component tests for the class {@link PTup3bigi}.
 * 
 * @since 1.0.0.0
 */
class PTup3bigiTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3bigi} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3bigi t = PTup3bigi.gen(new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3bigi} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3bigi t = PTup3bigi.gen(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
		assertEquals(BigInteger.valueOf(1), t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3bigi} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3bigi t = PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3bigi t = PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals("ptup3bigi(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3bigi#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3bigi t = PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3bigi.gen(BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(3)))); // x wrong
		assertFalse(t.equals(PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(3), BigInteger.valueOf(3)))); // y wrong
		assertFalse(t.equals(PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(4)))); // z wrong
		
		assertTrue(t.equals(new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))));
		assertTrue(t.equals(PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3bigi#getNewInstance(BigInteger, BigInteger, BigInteger)}
	 * returns a new instance of {@link PTup3bigi} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3bigi t = PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));

		PTup3bigi result = t.getNewInstance(BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(2), result.getX());
		assertEquals(BigInteger.valueOf(3), result.getY());
		assertEquals(BigInteger.valueOf(4), result.getZ());
	}
}