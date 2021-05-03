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

import org.barghos.core.tuple3.PTup3l;
import org.barghos.core.tuple3.Tup3l;

/**
 * This class provides component tests for the class {@link PTup3l}.
 * 
 * @since 1.0.0.0
 */
class PTup3lTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3l} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3l t = PTup3l.gen(new Tup3l(1l, 2l, 3l));
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3l} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3l t = PTup3l.gen(1l);
		
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
		assertEquals(1l, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3l} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3l t = PTup3l.gen(1l, 2l, 3l);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3l#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3l t = PTup3l.gen(1l, 2l, 3l);
		
		assertEquals("ptup3l(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3l#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3l t = PTup3l.gen(1l, 2l, 3l);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3l.gen(2l, 2l, 3l))); // x wrong
		assertFalse(t.equals(PTup3l.gen(1l, 3l, 3l))); // y wrong
		assertFalse(t.equals(PTup3l.gen(1l, 2l, 4l))); // z wrong
		
		assertTrue(t.equals(new Tup3l(1l, 2l, 3l)));
		assertTrue(t.equals(PTup3l.gen(1l, 2l, 3l)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3l#getNewInstance(long, long, long)}
	 * returns a new instance of {@link PTup3l} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3l t = PTup3l.gen(1l, 1l, 1l);
		
		PTup3l result = t.getNewInstance(2l, 3l, 4l);
		
		assertNotSame(t, result);
		assertEquals(2l, result.getX());
		assertEquals(3l, result.getY());
		assertEquals(4l, result.getZ());
	}
}