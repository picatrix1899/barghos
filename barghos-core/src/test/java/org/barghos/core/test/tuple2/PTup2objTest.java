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

import org.barghos.core.tuple2.PTup2obj;
import org.barghos.core.tuple2.Tup2obj;

/**
 * This class provides component tests for the class {@link PTup2obj}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PTup2objTest
{
	/**
	 * This test ensures, that an instance of {@link PTup2obj} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup2obj t = PTup2obj.gen(new Tup2obj(1, "arg2"));
		
		assertEquals(1, t.getX());
		assertEquals("arg2", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2obj} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup2obj t = PTup2obj.gen(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2obj} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup2obj t = PTup2obj.gen(1, "arg2");
		
		assertEquals(1, t.getX());
		assertEquals("arg2", t.getY());
	}
	
	/**
	 * This test ensures, that the {@link PTup2obj#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup2obj t = PTup2obj.gen(1, "arg2");
		
		assertEquals("ptup2obj(x=1, y=arg2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup2obj#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup2obj t = PTup2obj.gen(1, "arg2");
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup2obj.gen("arg1", "arg2"))); // x wrong
		assertFalse(t.equals(PTup2obj.gen(1, 1))); // y wrong
		
		assertTrue(t.equals(new Tup2obj(1, "arg2")));
		assertTrue(t.equals(PTup2obj.gen(1, "arg2")));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup2obj#getNewInstance(Object, Object)}
	 * returns a new instance of {@link PTup2obj} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup2obj t = PTup2obj.gen(1l, "a");

		PTup2obj result = t.getNewInstance(2.0f, 'b');
		
		assertNotSame(t, result);
		assertEquals(2.0f, result.getX());
		assertEquals('b', result.getY());
	}
}