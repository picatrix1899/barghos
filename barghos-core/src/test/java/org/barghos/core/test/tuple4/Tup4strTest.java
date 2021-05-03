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

package org.barghos.core.test.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple4.PTup4str;
import org.barghos.core.tuple4.Tup4str;

/**
 * This class provides component tests for the class {@link Tup4str}.
 * 
 * @since 1.0.0.0
 */
class Tup4strTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4str#Tup4str()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4str t = new Tup4str();
		
		assertEquals("", t.x);
		assertEquals("", t.y);
		assertEquals("", t.z);
		assertEquals("", t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4str#Tup4str(org.barghos.core.api.tuple4.Tup4strR) Tup4str.Tup4str(Tup4strR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4str t = new Tup4str(PTup4str.gen("arg1", "arg2", "arg3", "arg4"));
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
		assertEquals("arg4", t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4str#Tup4str(String)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4str t = new Tup4str("arg1");
		
		assertEquals("arg1", t.x);
		assertEquals("arg1", t.y);
		assertEquals("arg1", t.z);
		assertEquals("arg1", t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4str#Tup4str(String, String, String, String)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
		assertEquals("arg4", t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setX(String)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setX("arg1"));
		assertEquals("arg1", t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setY(String)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setZ(String)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setZ("arg1"));
		assertEquals("arg1", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setW(String)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setW("arg1"));
		assertEquals("arg1", t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4str#set(org.barghos.core.api.tuple4.Tup4strR) Tup4str.set(Tup4strR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.set(PTup4str.gen("arg1", "arg2", "arg3", "arg4")));
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
		assertEquals("arg4", t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#set(String)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.set("arg1"));
		assertEquals("arg1", t.x);
		assertEquals("arg1", t.y);
		assertEquals("arg1", t.z);
		assertEquals("arg1", t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#set(String, String, String, String)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.set("arg1", "arg2", "arg3", "arg4"));
		
		assertEquals("arg1", t.x);
		assertEquals("arg2", t.y);
		assertEquals("arg3", t.z);
		assertEquals("arg4", t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertEquals("arg1", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertEquals("arg3", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertEquals("arg4", t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#clone()} generates a new instance of
	 * {@link Tup4str} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		Tup4str result = t.clone();
		
		assertNotSame(t, result);
		assertEquals("arg1", result.getX());
		assertEquals("arg2", result.getY());
		assertEquals("arg3", result.getZ());
		assertEquals("arg4", result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertEquals("tup4str(x=arg1, y=arg2, z=arg3, w=arg4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4str#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4str t = new Tup4str("arg1", "arg2", "arg3", "arg4");
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4str("arg2", "arg2", "arg3", "arg4"))); // x wrong
		assertFalse(t.equals(new Tup4str("arg1", "arg3", "arg3", "arg4"))); // y wrong
		assertFalse(t.equals(new Tup4str("arg1", "arg2", "arg4", "arg4"))); // z wrong
		assertFalse(t.equals(new Tup4str("arg1", "arg2", "arg3", "arg5"))); // z wrong
		
		assertTrue(t.equals(new Tup4str("arg1", "arg2", "arg3", "arg4")));
		assertTrue(t.equals(PTup4str.gen("arg1", "arg2", "arg3", "arg4")));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getNewInstance(String, String, String, String)}
	 * returns a new instance of {@link Tup4str} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup4str t = new Tup4str("a", "a", "a", "a");

		Tup4str result = t.getNewInstance("b", "c", "d", "e");
		
		assertNotSame(t, result);
		assertEquals("b", result.getX());
		assertEquals("c", result.getY());
		assertEquals("d", result.getZ());
		assertEquals("e", result.getW());
	}
}