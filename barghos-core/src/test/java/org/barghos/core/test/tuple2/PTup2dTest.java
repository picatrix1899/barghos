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

import org.barghos.core.tuple2.PTup2d;
import org.barghos.core.tuple2.Tup2d;

/**
 * This class provides component tests for the class {@link PTup2d}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PTup2dTest
{
	/**
	 * This test ensures, that an instance of {@link PTup2d} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup2d t = PTup2d.gen(new Tup2d(1.1, 2.2));
		
		assertEquals(1.1, t.getX());
		assertEquals(2.2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2d} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup2d t = PTup2d.gen(1.1);
		
		assertEquals(1.1, t.getX());
		assertEquals(1.1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2d} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup2d t = PTup2d.gen(1.1, 2.2);
		
		assertEquals(1.1, t.getX());
		assertEquals(2.2, t.getY());
	}
	
	/**
	 * This test ensures, that the {@link PTup2d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup2d t = PTup2d.gen(1.1, 2.2);
		
		assertEquals("ptup2d(x=1.1, y=2.2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup2d#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup2d t = PTup2d.gen(1.1, 2.2);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup2d.gen(2.2, 2.2))); // x wrong
		assertFalse(t.equals(PTup2d.gen(1.1, 3.3))); // y wrong
		
		assertTrue(t.equals(new Tup2d(1.1, 2.2)));
		assertTrue(t.equals(PTup2d.gen(1.1, 2.2)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup2d#getNewInstance(double, double)}
	 * returns a new instance of {@link PTup2d} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup2d t = PTup2d.gen(1.0, 1.0);

		PTup2d result = t.getNewInstance(2.0, 3.0);
		
		assertNotSame(t, result);
		assertEquals(2.0, result.getX());
		assertEquals(3.0, result.getY());
	}
}