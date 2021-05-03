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

import org.barghos.core.tuple4.PTup4d;
import org.barghos.core.tuple4.Tup4d;

/**
 * This class provides component tests for the class {@link PTup4d}.
 * 
 * @since 1.0.0.0
 */
class PTup4dTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4d} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4d t = PTup4d.gen(new Tup4d(1.1, 2.2, 3.3, 4.4));
		
		assertEquals(1.1, t.getX());
		assertEquals(2.2, t.getY());
		assertEquals(3.3, t.getZ());
		assertEquals(4.4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4d} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4d t = PTup4d.gen(1.1);
		
		assertEquals(1.1, t.getX());
		assertEquals(1.1, t.getY());
		assertEquals(1.1, t.getZ());
		assertEquals(1.1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4d} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4d t = PTup4d.gen(1.1, 2.2, 3.3, 4.4);
		
		assertEquals(1.1, t.getX());
		assertEquals(2.2, t.getY());
		assertEquals(3.3, t.getZ());
		assertEquals(4.4, t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4d t = PTup4d.gen(1.1, 2.2, 3.3, 4.4);
		
		assertEquals("ptup4d(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4d#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4d t = PTup4d.gen(1.1, 2.2, 3.3, 4.4);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4d.gen(2.2, 2.2, 3.3, 4.4))); // x wrong
		assertFalse(t.equals(PTup4d.gen(1.1, 3.3, 3.3, 4.4))); // y wrong
		assertFalse(t.equals(PTup4d.gen(1.1, 2.2, 4.4, 4.4))); // z wrong
		assertFalse(t.equals(PTup4d.gen(1.1, 2.2, 3.3, 5.5))); // w wrong
		
		assertTrue(t.equals(new Tup4d(1.1, 2.2, 3.3, 4.4)));
		assertTrue(t.equals(PTup4d.gen(1.1, 2.2, 3.3, 4.4)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup4d#getNewInstance(double, double, double, double)}
	 * returns a new instance of {@link PTup4d} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup4d t = PTup4d.gen(1.0, 1.0, 1.0, 1.0);

		PTup4d result = t.getNewInstance(2.0, 3.0, 4.0, 5.0);
		
		assertNotSame(t, result);
		assertEquals(2.0, result.getX());
		assertEquals(3.0, result.getY());
		assertEquals(4.0, result.getZ());
		assertEquals(5.0, result.getW());
	}
}