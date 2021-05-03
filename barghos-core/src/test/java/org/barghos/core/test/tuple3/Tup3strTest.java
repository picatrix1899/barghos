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

import org.barghos.core.tuple3.PTup3str;
import org.barghos.core.tuple3.Tup3str;

/**
 * This class provides component tests for the class {@link Tup3str}.
 * 
 * @since 1.0.0.0
 */
class Tup3strTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3str#Tup3str()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3str t = new Tup3str();
		
		assertEquals("", t.x);
		assertEquals("", t.y);
		assertEquals("", t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3str#Tup3str(org.barghos.core.api.tuple3.Tup3strR) Tup3str.Tup3str(Tup3strR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3str t = new Tup3str(PTup3str.gen("arg1", "arg2", "arg3"));
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3str#Tup3str(String)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3str t = new Tup3str("arg1");
		
		assertEquals("arg1", t.x);
		assertEquals("arg1", t.y);
		assertEquals("arg1", t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3str#Tup3str(String, String, String)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#setX(String)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.setX("arg1"));
		assertEquals("arg1", t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#setY(String)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#setZ(String)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.setZ("arg1"));
		assertEquals("arg1", t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3str#set(org.barghos.core.api.tuple3.Tup3strR) Tup3str.set(Tup3strR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.set(PTup3str.gen("arg1", "arg2", "arg3")));
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#set(String)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.set("arg1"));
		assertEquals("arg1", t.x);
		assertEquals("arg1", t.y);
		assertEquals("arg1", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#set(String, String, String)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.set("arg1", "arg2", "arg3"));
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		assertEquals("arg1", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		assertEquals("arg3", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#clone()} generates a new instance of
	 * {@link Tup3str} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		Tup3str result = t.clone();
		
		assertNotSame(t, result);
		assertEquals("arg1", result.getX());
		assertEquals("arg2", result.getY());
		assertEquals("arg3", result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		assertEquals("tup3str(x=arg1, y=arg2, z=arg3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3str#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3str("arg2", "arg2", "arg3"))); // x wrong
		assertFalse(t.equals(new Tup3str("arg1", "arg3", "arg3"))); // y wrong
		assertFalse(t.equals(new Tup3str("arg1", "arg2", "arg4"))); // z wrong
		
		assertTrue(t.equals(new Tup3str("arg1", "arg2", "arg3")));
		assertTrue(t.equals(PTup3str.gen("arg1", "arg2", "arg3")));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getNewInstance(String, String, String)}
	 * returns a new instance of {@link Tup3str} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3str t = new Tup3str("a", "a", "a");

		Tup3str result = t.getNewInstance("b", "c", "d");
		
		assertNotSame(t, result);
		assertEquals("b", result.getX());
		assertEquals("c", result.getY());
		assertEquals("d", result.getZ());
	}
}