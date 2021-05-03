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

import java.math.BigDecimal;

import org.barghos.core.tuple3.PTup3bigd;
import org.barghos.core.tuple3.Tup3bigd;

/**
 * This class provides component tests for the class {@link PTup3bigd}.
 * 
 * @since 1.0.0.0
 */
class PTup3bigdTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3bigd} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3bigd t = PTup3bigd.gen(new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3bigd} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3bigd t = PTup3bigd.gen(BigDecimal.valueOf(1.1));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(BigDecimal.valueOf(1.1), t.getY());
		assertEquals(BigDecimal.valueOf(1.1), t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3bigd} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3bigd t = PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3bigd#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3bigd t = PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals("ptup3bigd(x=1.1, y=2.2, z=3.3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3bigd#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3bigd t = PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3bigd.gen(BigDecimal.valueOf(2.2), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3)))); // x wrong
		assertFalse(t.equals(PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(3.3), BigDecimal.valueOf(3.3)))); // y wrong
		assertFalse(t.equals(PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(4.4)))); // z wrong
		
		assertTrue(t.equals(new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))));
		assertTrue(t.equals(PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3bigd#getNewInstance(BigDecimal, BigDecimal, BigDecimal)}
	 * returns a new instance of {@link PTup3bigd} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3bigd t = PTup3bigd.gen(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0));

		PTup3bigd result = t.getNewInstance(BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		assertNotSame(t, result);
		assertEquals(BigDecimal.valueOf(2.0), result.getX());
		assertEquals(BigDecimal.valueOf(3.0), result.getY());
		assertEquals(BigDecimal.valueOf(4.0), result.getZ());
	}
}