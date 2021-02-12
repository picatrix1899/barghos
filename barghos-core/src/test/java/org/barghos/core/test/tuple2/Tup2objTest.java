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

package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple2.PTup2obj;
import org.barghos.core.tuple2.Tup2obj;

/**
 * This class provides component tests for the class {@link Tup2obj}.
 * 
 * @since 1.0.0.0
 */
class Tup2objTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2obj#Tup2obj()} aktually works and
	 * that the components are set to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertNull(t.x);
		assertNull(t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2obj#Tup2obj(org.barghos.core.api.tuple2.Tup2objR) Tup2obj.Tup2obj(Tup2objR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2obj t = new Tup2obj(PTup2obj.gen(1, "arg2"));
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2obj#Tup2obj(Object)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2obj t = new Tup2obj(1);
		
		assertEquals(1, t.x);
		assertEquals(1, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2obj#Tup2obj(Object, Object)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2obj t = new Tup2obj(1, "arg2");
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#setX(Object)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#setY(Object)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2obj#set(org.barghos.core.api.tuple2.Tup2objR) Tup2obj.set(Tup2objR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.set(PTup2obj.gen(1, "arg2")));
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#set(Object)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.set(1));
		assertEquals(1, t.x);
		assertEquals(1, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#set(Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.set(1, "arg2"));
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2obj t = new Tup2obj(1, "arg2");
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2obj t = new Tup2obj(1, "arg2");
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#clone()} generates a new instance of
	 * {@link Tup2obj} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2obj t = new Tup2obj(1, "arg2");
		
		Tup2obj result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, result.getX());
		assertEquals("arg2", result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2obj t = new Tup2obj(1, "arg2");
		
		assertEquals("tup2obj(x=1, y=arg2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2obj#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2obj t = new Tup2obj(1, "arg2");
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2obj("arg2", "arg2"))); // x wrong
		assertFalse(t.equals(new Tup2obj(1, 1))); // y wrong
		
		assertTrue(t.equals(new Tup2obj(1, "arg2")));
		assertTrue(t.equals(PTup2obj.gen(1, "arg2")));
	}
}