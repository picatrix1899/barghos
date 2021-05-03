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

package org.barghos.core.test.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple3.PTup3obj;
import org.barghos.core.tuple3.Tup3obj;

/**
 * This class provides component tests for the class {@link Tup3obj}.
 * 
 * @since 1.0.0.0
 */
class Tup3objTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3obj#Tup3obj()} aktually works and
	 * that the components are set to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertNull(t.x);
		assertNull(t.y);
		assertNull(t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3obj#Tup3obj(org.barghos.core.api.tuple3.Tup3objR) Tup3obj.Tup3obj(Tup3objR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3obj t = new Tup3obj(PTup3obj.gen(1, "arg2", 3.3));
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3obj#Tup3obj(Object)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3obj t = new Tup3obj(1);
		
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3obj#Tup3obj(Object, Object, Object)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#setX(Object)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#setY(Object)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#setZ(Object)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.setZ(3.3));
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3obj#set(org.barghos.core.api.tuple3.Tup3objR) Tup3obj.set(Tup3objR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.set(PTup3obj.gen(1, "arg2", 3.3)));
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#set(Object)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.set(1));
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#set(Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3obj t = new Tup3obj();
		
		assertSame(t, t.set(1, "arg2", 3.3));
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		assertEquals(3.3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#clone()} generates a new instance of
	 * {@link Tup3obj} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		Tup3obj result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, result.getX());
		assertEquals("arg2", result.getY());
		assertEquals(3.3, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3obj#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		assertEquals("tup3obj(x=1, y=arg2, z=3.3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3obj#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3obj t = new Tup3obj(1, "arg2", 3.3);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3obj("arg2", "arg2", 3.3))); // x wrong
		assertFalse(t.equals(new Tup3obj(1, 3.3, 3.3))); // y wrong
		assertFalse(t.equals(new Tup3obj(1, "arg2", "wrong"))); // z wrong
		
		assertTrue(t.equals(new Tup3obj(1, "arg2", 3.3)));
		assertTrue(t.equals(PTup3obj.gen(1, "arg2", 3.3)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3obj#getNewInstance(Object, Object, Object)}
	 * returns a new instance of {@link Tup3obj} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3obj t = new Tup3obj(1l, 1l, 1l);
		
		Tup3obj result = t.getNewInstance(2l, 3l, 4l);
		
		assertNotSame(t, result);
		assertEquals(2l, result.getX());
		assertEquals(3l, result.getY());
		assertEquals(4l, result.getZ());
	}
}