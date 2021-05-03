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

import org.barghos.core.tuple4.PTup4o;
import org.barghos.core.tuple4.Tup4o;

/**
 * This class provides component tests for the class {@link PTup4o}.
 * 
 * @since 1.0.0.0
 */
class PTup4oTest
{
	/**
	 * This test ensures, that an instance of {@link PTup4o} generated from an existing tuple,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_TupleTest()
	{
		PTup4o<Integer,String,Double,Character> t = PTup4o.gen(new Tup4o<>(1, "arg2", 3.3, 'd'));
		
		assertEquals(1, (int)t.getX());
		assertEquals("arg2", t.getY());
		assertEquals(3.3, (double)t.getZ());
		assertEquals('d', (char)t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link PTup4o} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void gen_ComponentsTest()
	{
		PTup4o<Integer,String,Double, Character> t = PTup4o.gen(1, "arg2", 3.3, 'd');
		
		assertEquals(1, (int)t.getX());
		assertEquals("arg2", t.getY());
		assertEquals(3.3, (double)t.getZ());
		assertEquals('d', (char)t.getW());
	}
	
	/**
	 * This test ensures, that the {@link PTup4o#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		PTup4o<Integer,String,Double,Character> t = PTup4o.gen(1, "arg2", 3.3, 'd');
		
		assertEquals("ptup4o(x=1, y=arg2, z=3.3, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link PTup4o#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		PTup4o<Integer,String,Double,Character> t = PTup4o.gen(1, "arg2", 3.3, 'd');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(PTup4o.gen("arg1", "arg2", 3.3, 'd'))); // x wrong
		assertFalse(t.equals(PTup4o.gen(1, 2.2, 3.3, 'd'))); // y wrong
		assertFalse(t.equals(PTup4o.gen(1, "arg2", 'c', 'd'))); // z wrong
		assertFalse(t.equals(PTup4o.gen(1, "arg2", 'c', 4.4f))); // w wrong
		
		assertTrue(t.equals(new Tup4o<>(1, "arg2", 3.3, 'd')));
		assertTrue(t.equals(PTup4o.gen(1, "arg2", 3.3, 'd')));	
	}
	
	/**
	 * This test ensures, that the function {@link PTup4o#getNewInstance(Object, Object, Object, Object)}
	 * returns a new instance of {@link PTup4o} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		PTup4o<Long,Long,Long,Long> t = PTup4o.gen(1l, 1l, 1l, 1l);

		PTup4o<Long,Long,Long,Long> result = t.getNewInstance(2l, 3l, 4l, 5l);
		
		assertNotSame(t, result);
		assertEquals(2l, (long)result.getX());
		assertEquals(3l, (long)result.getY());
		assertEquals(4l, (long)result.getZ());
		assertEquals(5l, (long)result.getW());
	}
}