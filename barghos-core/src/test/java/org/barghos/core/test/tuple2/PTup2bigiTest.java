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

package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.tuple2.PTup2bigi;
import org.barghos.core.tuple2.Tup2bigi;

/**
 * This class provides component tests for the class {@link PTup2bigi}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PTup2bigiTest
{
	/**
	 * This test ensures, that an instance of {@link PTup2bigi} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup2bigi t = PTup2bigi.gen(new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2)));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2bigi} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup2bigi t = PTup2bigi.gen(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2bigi} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup2bigi t = PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
	}
	
	/**
	 * This test ensures, that the {@link PTup2bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup2bigi t = PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals("ptup2bigi(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup2bigi#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup2bigi t = PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup2bigi.gen(BigInteger.valueOf(2), BigInteger.valueOf(2)))); // x wrong
		assertFalse(t.equals(PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(3)))); // y wrong
		
		assertTrue(t.equals(new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2))));
		assertTrue(t.equals(PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2))));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup2bigi#getNewInstance(BigInteger, BigInteger)}
	 * returns a new instance of {@link PTup2bigi} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup2bigi t = PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2));

		PTup2bigi result = t.getNewInstance(BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(3), result.getX());
		assertEquals(BigInteger.valueOf(4), result.getY());
	}
}