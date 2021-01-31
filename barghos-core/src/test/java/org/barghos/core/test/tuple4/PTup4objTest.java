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

import org.barghos.core.tuple4.PTup4obj;
import org.barghos.core.tuple4.Tup4obj;

/**
 * This class provides component tests for the class {@link PTup4obj}.
 * 
 * @since 1.0.0.0
 */
class PTup4objTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4obj} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4obj t = PTup4obj.gen(new Tup4obj(1, "arg2", 3.3, 'd'));
		
		assertEquals(1, t.getX());
		assertEquals("arg2", t.getY());
		assertEquals(3.3, t.getZ());
		assertEquals('d', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4obj} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4obj t = PTup4obj.gen(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
		assertEquals(1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4obj} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4obj t = PTup4obj.gen(1, "arg2", 3.3, 'd');
		
		assertEquals(1, t.getX());
		assertEquals("arg2", t.getY());
		assertEquals(3.3, t.getZ());
		assertEquals('d', t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4obj#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4obj t = PTup4obj.gen(1, "arg2", 3.3, 'd');
		
		assertEquals("ptup4obj(x=1, y=arg2, z=3.3, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4obj#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4obj t = PTup4obj.gen(1, "arg2", 3.3, 'd');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4obj.gen("arg1", "arg2", 3.3, 'd'))); // x wrong
		assertFalse(t.equals(PTup4obj.gen(1, 3.3, 3.3, 'd'))); // y wrong
		assertFalse(t.equals(PTup4obj.gen(1, "arg2", 'c', 'd'))); // z wrong
		assertFalse(t.equals(PTup4obj.gen(1, "arg2", 'c', 4.4f))); // w wrong
		
		assertTrue(t.equals(new Tup4obj(1, "arg2", 3.3, 'd')));
		assertTrue(t.equals(PTup4obj.gen(1, "arg2", 3.3, 'd')));	
	}
}