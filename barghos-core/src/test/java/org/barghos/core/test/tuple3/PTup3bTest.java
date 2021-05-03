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

import org.barghos.core.tuple3.PTup3b;
import org.barghos.core.tuple3.Tup3b;

/**
 * This class provides component tests for the class {@link PTup3b}.
 * 
 * @since 1.0.0.0
 */
class PTup3bTest
{
	/**
	 * This test ensures, that an instance of {@link PTup3b} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup3b t = PTup3b.gen(new Tup3b((byte)1, (byte)2, (byte)3));
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3b} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup3b t = PTup3b.gen((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
		assertEquals((byte)1, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup3b} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup3b t = PTup3b.gen((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		assertEquals((byte)3, t.getZ());
	}
	
	/**
	 * This test ensures, that the {@link PTup3b#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup3b t = PTup3b.gen((byte)1, (byte)2, (byte)3);
		
		assertEquals("ptup3b(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup3b#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup3b t = PTup3b.gen((byte)1, (byte)2, (byte)3);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup3b.gen((byte)2, (byte)2, (byte)3))); // x wrong
		assertFalse(t.equals(PTup3b.gen((byte)1, (byte)3, (byte)3))); // y wrong
		assertFalse(t.equals(PTup3b.gen((byte)1, (byte)2, (byte)4))); // z wrong
		
		assertTrue(t.equals(new Tup3b((byte)1, (byte)2, (byte)3)));
		assertTrue(t.equals(PTup3b.gen((byte)1, (byte)2, (byte)3)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup3b#getNewInstance(byte, byte, byte)}
	 * returns a new instance of {@link PTup3b} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup3b t = PTup3b.gen((byte)1, (byte)1, (byte)1);

		PTup3b result = t.getNewInstance((byte)2, (byte)3, (byte)4);
		
		assertNotSame(t, result);
		assertEquals((byte)2, result.getX());
		assertEquals((byte)3, result.getY());
		assertEquals((byte)4, result.getZ());
	}
}