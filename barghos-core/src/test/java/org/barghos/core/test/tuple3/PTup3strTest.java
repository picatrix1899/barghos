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

import org.barghos.core.tuple3.PTup3str;
import org.barghos.core.tuple3.Tup3str;

/**
 * This class provides component tests for the class {@link PTup3str}.
 * 
 * @since 1.0.0.0
 */
class PTup3strTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3str} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3str t = PTup3str.gen(new Tup3str("arg1", "arg2", "arg3"));
		
		assertEquals("arg1", t.getX());
		assertEquals("arg2", t.getY());
		assertEquals("arg3", t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3str} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3str t = PTup3str.gen("arg1");
		
		assertEquals("arg1", t.getX());
		assertEquals("arg1", t.getY());
		assertEquals("arg1", t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3str} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3str t = PTup3str.gen("arg1", "arg2", "arg3");
		
		assertEquals("arg1", t.getX());
		assertEquals("arg2", t.getY());
		assertEquals("arg3", t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3str t = PTup3str.gen("arg1", "arg2", "arg3");
		
		assertEquals("ptup3str(x=arg1, y=arg2, z=arg3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3str#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3str t = PTup3str.gen("arg1", "arg2", "arg3");
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3str.gen("wrong", "arg2", "arg3"))); // x wrong
		assertFalse(t.equals(PTup3str.gen("arg1", "wrong", "arg3"))); // y wrong
		assertFalse(t.equals(PTup3str.gen("arg1", "arg2", "wrong"))); // z wrong
		
		assertTrue(t.equals(new Tup3str("arg1", "arg2", "arg3")));
		assertTrue(t.equals(PTup3str.gen("arg1", "arg2", "arg3")));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3str#getNewInstance(String, String, String)}
	 * returns a new instance of {@link PTup3str} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3str t = PTup3str.gen("a", "a", "a");

		PTup3str result = t.getNewInstance("b", "c", "d");
		
		assertNotSame(t, result);
		assertEquals("b", result.getX());
		assertEquals("c", result.getY());
		assertEquals("d", result.getZ());
	}
}