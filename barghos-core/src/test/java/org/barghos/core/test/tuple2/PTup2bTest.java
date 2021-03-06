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

import org.barghos.core.tuple2.PTup2b;
import org.barghos.core.tuple2.Tup2b;

/**
 * This class provides component tests for the class {@link PTup2b}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class PTup2bTest
{
	/**
	 * This test ensures, that an instance of {@link PTup2b} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup2b t = PTup2b.gen(new Tup2b((byte)1, (byte)2));
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2b} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup2b t = PTup2b.gen((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup2b} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup2b t = PTup2b.gen((byte)1, (byte)2);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
	}
	
	/**
	 * This test ensures, that the {@link PTup2b#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup2b t = PTup2b.gen((byte)1, (byte)2);
		
		assertEquals("ptup2b(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup2b#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup2b t = PTup2b.gen((byte)1, (byte)2);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup2b.gen((byte)2, (byte)2))); // x wrong
		assertFalse(t.equals(PTup2b.gen((byte)1, (byte)3))); // y wrong
		
		assertTrue(t.equals(new Tup2b((byte)1, (byte)2)));
		assertTrue(t.equals(PTup2b.gen((byte)1, (byte)2)));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup2b#getNewInstance(byte, byte)}
	 * returns a new instance of {@link PTup2b} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup2b t = PTup2b.gen((byte)1, (byte)1);

		PTup2b result = t.getNewInstance((byte)2, (byte)3);
		
		assertNotSame(t, result);
		assertEquals((byte)2, result.getX());
		assertEquals((byte)3, result.getY());
	}
}