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

import org.barghos.core.tuple3.PTup3c;
import org.barghos.core.tuple3.Tup3c;

/**
 * This class provides component tests for the class {@link PTup3c}.
 * 
 * @since 1.0.0.0
 */
class PTup3cTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3c} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3c t = PTup3c.gen(new Tup3c('a', 'b', 'c'));
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3c} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3c t = PTup3c.gen('a');
		
		assertEquals('a', t.getX());
		assertEquals('a', t.getY());
		assertEquals('a', t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3c} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3c t = PTup3c.gen('a', 'b', 'c');
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		assertEquals('c', t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3c#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3c t = PTup3c.gen('a', 'b', 'c');
		
		assertEquals("ptup3c(x=a, y=b, z=c)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3c#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3c t = PTup3c.gen('a', 'b', 'c');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3c.gen('b', 'b', 'c'))); // x wrong
		assertFalse(t.equals(PTup3c.gen('a', 'c', 'c'))); // y wrong
		assertFalse(t.equals(PTup3c.gen('a', 'b', 'd'))); // z wrong
		
		assertTrue(t.equals(new Tup3c('a', 'b', 'c')));
		assertTrue(t.equals(PTup3c.gen('a', 'b', 'c')));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3c#getNewInstance(char, char, char)}
	 * returns a new instance of {@link PTup3c} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3c t = PTup3c.gen('a', 'a', 'a');

		PTup3c result = t.getNewInstance('b', 'c', 'd');
		
		assertNotSame(t, result);
		assertEquals('b', result.getX());
		assertEquals('c', result.getY());
		assertEquals('d', result.getZ());
	}
}