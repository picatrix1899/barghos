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

import org.barghos.core.tuple4.PTup4l;
import org.barghos.core.tuple4.Tup4l;

/**
 * This class provides component tests for the class {@link PTup4l}.
 * 
 * @since 1.0.0.0
 */
class PTup4lTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4l} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4l t = PTup4l.gen(new Tup4l(1l, 2l, 3l, 4l));
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4l} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4l t = PTup4l.gen(1l);
		
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
		assertEquals(1l, t.getZ());
		assertEquals(1l, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4l} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4l t = PTup4l.gen(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		assertEquals(3l, t.getZ());
		assertEquals(4l, t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4l#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4l t = PTup4l.gen(1l, 2l, 3l, 4l);
		
		assertEquals("ptup4l(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4l#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4l t = PTup4l.gen(1l, 2l, 3l, 4l);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4l.gen(2l, 2l, 3l, 4l))); // x wrong
		assertFalse(t.equals(PTup4l.gen(1l, 3l, 3l, 4l))); // y wrong
		assertFalse(t.equals(PTup4l.gen(1l, 2l, 4l, 4l))); // z wrong
		assertFalse(t.equals(PTup4l.gen(1l, 2l, 3l, 5l))); // z wrong
		
		assertTrue(t.equals(new Tup4l(1l, 2l, 3l, 4l)));
		assertTrue(t.equals(PTup4l.gen(1l, 2l, 3l, 4l)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup4l#getNewInstance(long, long, long, long)}
	 * returns a new instance of {@link PTup4l} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup4l t = PTup4l.gen(1l, 1l, 1l, 1l);

		PTup4l result = t.getNewInstance(2l, 3l, 4l, 5l);
		
		assertNotSame(t, result);
		assertEquals(2l, result.getX());
		assertEquals(3l, result.getY());
		assertEquals(4l, result.getZ());
		assertEquals(5l, result.getW());
	}
}