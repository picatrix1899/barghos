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

import org.barghos.core.tuple4.PTup4s;
import org.barghos.core.tuple4.Tup4s;

/**
 * This class provides component tests for the class {@link PTup4s}.
 * 
 * @since 1.0.0.0
 */
class PTup4sTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4s} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4s t = PTup4s.gen(new Tup4s((short)1, (short)2, (short)3, (short)4));
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4s} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ScalarTest()
	{
		PTup4s t = PTup4s.gen((short)1);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)1, t.getY());
		assertEquals((short)1, t.getZ());
		assertEquals((short)1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4s} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4s t = PTup4s.gen((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4s#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4s t = PTup4s.gen((short)1, (short)2, (short)3, (short)4);
		
		assertEquals("ptup4s(x=1, y=3, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4s#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4s t = PTup4s.gen((short)1, (short)2, (short)3, (short)4);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4s.gen((short)2, (short)2, (short)3, (short)4))); // x wrong
		assertFalse(t.equals(PTup4s.gen((short)1, (short)3, (short)3, (short)4))); // y wrong
		assertFalse(t.equals(PTup4s.gen((short)1, (short)2, (short)4, (short)4))); // z wrong
		assertFalse(t.equals(PTup4s.gen((short)1, (short)2, (short)3, (short)5))); // z wrong
		
		assertTrue(t.equals(new Tup4s((short)1, (short)2, (short)3, (short)4)));
		assertTrue(t.equals(PTup4s.gen((short)1, (short)2, (short)3, (short)4)));	
	}
}