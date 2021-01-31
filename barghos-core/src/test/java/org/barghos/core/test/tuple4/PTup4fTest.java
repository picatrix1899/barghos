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

import org.barghos.core.tuple4.PTup4f;
import org.barghos.core.tuple4.Tup4f;

/**
 * This class provides component tests for the class {@link PTup4f}.
 * 
 * @since 1.0.0.0
 */
class PTup4fTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4f} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4f t = PTup4f.gen(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f));
		
		assertEquals(1.1f, t.getX());
		assertEquals(2.2f, t.getY());
		assertEquals(3.3f, t.getZ());
		assertEquals(4.4f, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4f} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4f t = PTup4f.gen(1.1f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(1.1f, t.getY());
		assertEquals(1.1f, t.getZ());
		assertEquals(1.1f, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4f} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4f t = PTup4f.gen(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(2.2f, t.getY());
		assertEquals(3.3f, t.getZ());
		assertEquals(4.4f, t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4f#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4f t = PTup4f.gen(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals("ptup4f(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4f#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4f t = PTup4f.gen(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4f.gen(2.2f, 2.2f, 3.3f, 4.4f))); // x wrong
		assertFalse(t.equals(PTup4f.gen(1.1f, 3.3f, 3.3f, 4.4f))); // y wrong
		assertFalse(t.equals(PTup4f.gen(1.1f, 2.2f, 4.4f, 4.4f))); // z wrong
		assertFalse(t.equals(PTup4f.gen(1.1f, 2.2f, 3.3f, 5.5f))); // w wrong
		
		assertTrue(t.equals(new Tup4f(1.1f, 2.2f, 3.3f, 4.4f)));
		assertTrue(t.equals(PTup4f.gen(1.1f, 2.2f, 3.3f, 4.4f)));	
	}
}