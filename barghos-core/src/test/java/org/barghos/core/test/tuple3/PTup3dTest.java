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

import org.barghos.core.tuple3.PTup3d;
import org.barghos.core.tuple3.Tup3d;

/**
 * This class provides component tests for the class {@link PTup3d}.
 * 
 * @since 1.0.0.0
 */
class PTup3dTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3d} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3d t = PTup3d.gen(new Tup3d(1.1, 2.2, 3.3));
		
		assertEquals(1.1, t.getX());
		assertEquals(2.2, t.getY());
		assertEquals(3.3, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3d} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3d t = PTup3d.gen(1.1);
		
		assertEquals(1.1, t.getX());
		assertEquals(1.1, t.getY());
		assertEquals(1.1, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3d} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3d t = PTup3d.gen(1.1, 2.2, 3.3);
		
		assertEquals(1.1, t.getX());
		assertEquals(2.2, t.getY());
		assertEquals(3.3, t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3d t = PTup3d.gen(1.1, 2.2, 3.3);
		
		assertEquals("ptup3d(x=1.1, y=2.2, z=3.3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3d#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3d t = PTup3d.gen(1.1, 2.2, 3.3);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3d.gen(2.2, 2.2, 3.3))); // x wrong
		assertFalse(t.equals(PTup3d.gen(1.1, 3.3, 3.3))); // y wrong
		assertFalse(t.equals(PTup3d.gen(1.1, 2.2, 4.4))); // z wrong
		
		assertTrue(t.equals(new Tup3d(1.1, 2.2, 3.3)));
		assertTrue(t.equals(PTup3d.gen(1.1, 2.2, 3.3)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3d#getNewInstance(double, double, double)}
	 * returns a new instance of {@link PTup3d} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3d t = PTup3d.gen(1.0, 1.0, 1.0);

		PTup3d result = t.getNewInstance(2.0, 3.0, 4.0);
		
		assertNotSame(t, result);
		assertEquals(2.0, result.getX());
		assertEquals(3.0, result.getY());
		assertEquals(4.0, result.getZ());
	}
}