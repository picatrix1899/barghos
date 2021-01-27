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

package org.barghos.core.test.tuple.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.barghos.core.tuple2.PTup2l;
import org.barghos.core.tuple2.Tup2l;

import org.junit.jupiter.api.Test;

class Tup2lTest
{

	@Test
	void ctorEmptyTest()
	{
		Tup2l t = new Tup2l();
		assertEquals(0l, t.getX());
		assertEquals(0l, t.getY());
	}

	@Test
	void ctorCloneTest()
	{
		Tup2l t = new Tup2l(PTup2l.gen(1l, 3l));
		assertEquals(1l, t.getX());
		assertEquals(3l, t.getY());
	}
	
	@Test
	void ctorScalarTest()
	{
		Tup2l t = new Tup2l(1l);
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
	}
	
	@Test
	void ctorComponentsTest()
	{
		Tup2l t = new Tup2l(1l, 3l);
		assertEquals(1l, t.getX());
		assertEquals(3l, t.getY());
	}
	
	@Test
	void setXTest()
	{
		Tup2l t = new Tup2l();
		Tup2l result = t.setX(1l);
		assertEquals(1l, t.getX());
		assertSame(t, result);
	}
	
	@Test
	void setYTest()
	{
		Tup2l t = new Tup2l();
		Tup2l result = t.setY(1l);
		assertEquals(1l, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void setCloneTest()
	{
		Tup2l t = new Tup2l();
		Tup2l result = t.set(new Tup2l(1l, 3l));
		assertEquals(1l, t.getX());
		assertEquals(3l, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void setScalarTest()
	{
		Tup2l t = new Tup2l();
		Tup2l result = t.set(1l);
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void setComponentsTest()
	{
		Tup2l t = new Tup2l();
		Tup2l result = t.set(1l, 3l);
		assertEquals(1l, t.getX());
		assertEquals(3l, t.getY());
		assertSame(t, result);
	}
	
	@Test
	void cloneTest()
	{
		Tup2l t = new Tup2l(1l, 3l);
		Tup2l result = t.clone();
		assertEquals(1l, result.getX());
		assertEquals(3l, result.getY());
		assertNotSame(t, result);
	}
	
	@Test
	void hashcodeTest()
	{
		Tup2l t = new Tup2l(1l, 3l);
		assertTrue(t.hashCode() != 0);
	}
	
	@Test
	void toStringTest()
	{
		Tup2l t = new Tup2l(1, 3);
		assertEquals("tup2l(x=1, y=3)", t.toString());
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2l t = new Tup2l(1l, 3l);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0l));
		assertFalse(t.equals(new Tup2l(3l, 5l)));
		assertFalse(t.equals(new Tup2l(1l, 5l)));
		
		assertTrue(t.equals(new Tup2l(1l, 3l)));
		assertTrue(t.equals(PTup2l.gen(1l, 3l)));
	}
}
