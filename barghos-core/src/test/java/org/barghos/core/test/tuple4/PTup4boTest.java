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

import org.barghos.core.tuple4.PTup4bo;
import org.barghos.core.tuple4.Tup4bo;

/**
 * This class provides component tests for the class {@link PTup4bo}.
 * 
 * @since 1.0.0.0
 */
class PTup4boTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4bo} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4bo t = PTup4bo.gen(new Tup4bo(false, true, false, true));
		
		assertFalse(t.getX());
		assertTrue(t.getY());
		assertFalse(t.getZ());
		assertTrue(t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4bo} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4bo t = PTup4bo.gen(true);
		
		assertTrue(t.getX());
		assertTrue(t.getY());
		assertTrue(t.getZ());
		assertTrue(t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4bo} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4bo t = PTup4bo.gen(false, true, false, true);
		
		assertFalse(t.getX());
		assertTrue(t.getY());
		assertFalse(t.getZ());
		assertTrue(t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4bo t = PTup4bo.gen(false, true, false, true);
		
		assertEquals("ptup4bo(x=false, y=true, z=false, w=true)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4bo#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4bo t = PTup4bo.gen(false, true, false, true);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4bo.gen(true, false, false, true))); // x wrong
		assertFalse(t.equals(PTup4bo.gen(false, false, false, true))); // y wrong
		assertFalse(t.equals(PTup4bo.gen(false, false, true, true))); // z wrong
		assertFalse(t.equals(PTup4bo.gen(false, true, false, false))); // w wrong
		
		assertTrue(t.equals(new Tup4bo(false, true, false, true)));
		assertTrue(t.equals(PTup4bo.gen(false, true, false, true)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup4bo#getNewInstance(boolean, boolean, boolean, boolean)}
	 * returns a new instance of {@link PTup4bo} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup4bo t = PTup4bo.gen(false, true, false, true);

		PTup4bo result = t.getNewInstance(true, false, true, false);
		
		assertNotSame(t, result);
		assertEquals(true, result.getX());
		assertEquals(false, result.getY());
		assertEquals(true, result.getZ());
		assertEquals(false, result.getW());
	}
}