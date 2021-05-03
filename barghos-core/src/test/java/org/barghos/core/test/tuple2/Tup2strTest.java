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

import org.barghos.core.tuple2.PTup2str;
import org.barghos.core.tuple2.Tup2str;

/**
 * This class provides component tests for the class {@link Tup2str}.
 * 
 * @since 1.0.0.0
 */
class Tup2strTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2str#Tup2str()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2str t = new Tup2str();
		
		assertEquals("", t.x);
		assertEquals("", t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2str#Tup2str(org.barghos.core.api.tuple2.Tup2strR) Tup2str.Tup2str(Tup2strR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2str t = new Tup2str(PTup2str.gen("arg1", "arg2"));
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2str#Tup2str(String)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2str t = new Tup2str("arg1");
		
		assertEquals("arg1", t.x);
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2str#Tup2str(String, String)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#setX(String)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.setX("arg1"));
		assertEquals("arg1", t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#setY(String)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2str#set(org.barghos.core.api.tuple2.Tup2strR) Tup2str.set(Tup2strR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.set(PTup2str.gen("arg1", "arg2")));
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#set(String)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.set("arg1"));
		assertEquals("arg1", t.x);
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#set(String, String)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.set("arg1", "arg2"));
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		
		assertEquals("arg1", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#clone()} generates a new instance of
	 * {@link Tup2str} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		
		Tup2str result = t.clone();
		
		assertNotSame(t, result);
		assertEquals("arg1", result.getX());
		assertEquals("arg2", result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		
		assertEquals("tup2str(x=arg1, y=arg2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2str#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2str("arg2", "arg2"))); // x wrong
		assertFalse(t.equals(new Tup2str("arg1", "arg3"))); // y wrong
		
		assertTrue(t.equals(new Tup2str("arg1", "arg2")));
		assertTrue(t.equals(PTup2str.gen("arg1", "arg2")));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getNewInstance(String, String)}
	 * returns a new instance of {@link Tup2str} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2str t = new Tup2str("a", "a");

		Tup2str result = t.getNewInstance("b", "c");
		
		assertNotSame(t, result);
		assertEquals("b", result.getX());
		assertEquals("c", result.getY());
	}
}