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

import org.barghos.core.tuple2.PTup2str;
import org.barghos.core.tuple2.Tup2str;

/**
 * This class provides component tests for the class {@link PTup2str}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PTup2strTest
{
	/**
	 * This test ensures, that an instance of {@link PTup2str} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup2str t = PTup2str.gen(new Tup2str("arg1", "arg2"));
		
		assertEquals("arg1", t.getX());
		assertEquals("arg2", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2str} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup2str t = PTup2str.gen("arg1");
		
		assertEquals("arg1", t.getX());
		assertEquals("arg1", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2str} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup2str t = PTup2str.gen("arg1", "arg2");
		
		assertEquals("arg1", t.getX());
		assertEquals("arg2", t.getY());
	}
	
	/**
	 * This test ensures, that the {@link PTup2str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup2str t = PTup2str.gen("arg1", "arg2");
		
		assertEquals("ptup2str(x=arg1, y=arg2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup2str#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup2str t = PTup2str.gen("arg1", "arg2");
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup2str.gen("wrong", "arg2"))); // x wrong
		assertFalse(t.equals(PTup2str.gen("arg1", "wrong"))); // y wrong
		
		assertTrue(t.equals(new Tup2str("arg1", "arg2")));
		assertTrue(t.equals(PTup2str.gen("arg1", "arg2")));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup2str#getNewInstance(String, String)}
	 * returns a new instance of {@link PTup2str} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup2str t = PTup2str.gen("a", "a");

		PTup2str result = t.getNewInstance("b", "c");
		
		assertNotSame(t, result);
		assertEquals("b", result.getX());
		assertEquals("c", result.getY());
	}
}