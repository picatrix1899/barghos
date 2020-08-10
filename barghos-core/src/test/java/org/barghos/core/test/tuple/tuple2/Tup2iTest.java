/*
MIT License

Copyright (c) 2019 picatrix1899

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

package org.barghos.core.test.tuple.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.barghos.core.tuple2.PTup2i;
import org.barghos.core.tuple2.Tup2i;

import org.junit.jupiter.api.Test;

class Tup2iTest
{

	@Test
	void ctorEmptyTest()
	{
		Tup2i t = new Tup2i();
		assertEquals(0, t.getX());
		assertEquals(0, t.getY());
	}

	@Test
	void ctorCloneTest()
	{
		Tup2i t = new Tup2i(PTup2i.gen(1, 3));
		assertEquals(1, t.getX());
		assertEquals(3, t.getY());
	}
	
	@Test
	void ctorScalarTest()
	{
		Tup2i t = new Tup2i(1);
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
	}
	
	@Test
	void ctorComponentsTest()
	{
		Tup2i t = new Tup2i(1, 3);
		assertEquals(1, t.getX());
		assertEquals(3, t.getY());
	}
	
	@Test
	void setXTest()
	{
		Tup2i t = new Tup2i();
		Tup2i result = t.setX(1);
		assertEquals(1, t.getX());
		assertSame(t, result);
	}
	
	@Test
	void setYTest()
	{
		Tup2i t = new Tup2i();
		Tup2i result = t.setY(1);
		assertEquals(1, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void setCloneTest()
	{
		Tup2i t = new Tup2i();
		Tup2i result = t.set(new Tup2i(1, 3));
		assertEquals(1, t.getX());
		assertEquals(3, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void setScalarTest()
	{
		Tup2i t = new Tup2i();
		Tup2i result = t.set(1);
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void setComponentsTest()
	{
		Tup2i t = new Tup2i();
		Tup2i result = t.set(1, 3);
		assertEquals(1, t.getX());
		assertEquals(3, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void cloneTest()
	{
		Tup2i t = new Tup2i(1, 3);
		Tup2i result = t.clone();
		assertEquals(1, result.getX());
		assertEquals(3, result.getY());
		assertNotSame(t, result);
	}
	
	@Test
	void hashcodeTest()
	{
		Tup2i t = new Tup2i(1, 3);
		assertTrue(t.hashCode() != 0);
	}
	
	@Test
	void toStringTest()
	{
		Tup2i t = new Tup2i(1, 3);
		assertEquals("tup2i(x=1, y=3)", t.toString());
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2i t = new Tup2i(1, 3);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup2i(3, 5)));
		assertFalse(t.equals(new Tup2i(1, 5)));
		
		assertTrue(t.equals(new Tup2i(1, 3)));
		assertTrue(t.equals(PTup2i.gen(1, 3)));
	}
}
