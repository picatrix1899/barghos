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

import org.barghos.core.tuple4.PTup4obj;
import org.barghos.core.tuple4.Tup4obj;

/**
 * This class provides component tests for the class {@link Tup4obj}.
 * 
 * @since 1.0.0.0
 */
class Tup4objTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4obj#Tup4obj()} aktually works and
	 * that the components are set to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertNull(t.x);
		assertNull(t.y);
		assertNull(t.z);
		assertNull(t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4obj#Tup4obj(org.barghos.core.api.tuple4.Tup4objR) Tup4obj.Tup4obj(Tup4objR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4obj t = new Tup4obj(PTup4obj.gen(1, "arg2", 3.3, 'd'));
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4obj#Tup4obj(Object)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4obj t = new Tup4obj(1);
		
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
		assertEquals(1, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4obj#Tup4obj(Object, Object, Object, Object)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setX(Object)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setY(Object)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setZ(Object)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setZ(3.3));
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setW(Object)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setW('d'));
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4obj#set(org.barghos.core.api.tuple4.Tup4objR) Tup4obj.set(Tup4objR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.set(PTup4obj.gen(1, "arg2", 3.3, 'd')));
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#set(Object)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.set(1));
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
		assertEquals(1, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#set(Object, Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.set(1, "arg2", 3.3, 'd'));
		
		assertEquals(1, t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertEquals(3.3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertEquals('d', t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#clone()} generates a new instance of
	 * {@link Tup4obj} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		Tup4obj result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, result.getX());
		assertEquals("arg2", result.getY());
		assertEquals(3.3, result.getZ());
		assertEquals('d', result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertEquals("tup4obj(x=1, y=arg2, z=3.3, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4obj#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4obj t = new Tup4obj(1, "arg2", 3.3, 'd');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4obj("arg2", "arg2", 3.3, 'd'))); // x wrong
		assertFalse(t.equals(new Tup4obj(1, 3.3, 3.3, 'd'))); // y wrong
		assertFalse(t.equals(new Tup4obj(1, "arg2", "wrong", 'd'))); // z wrong
		assertFalse(t.equals(new Tup4obj(1, "arg2", 3.3, 4.4))); // w wrong
		
		assertTrue(t.equals(new Tup4obj(1, "arg2", 3.3, 'd')));
		assertTrue(t.equals(PTup4obj.gen(1, "arg2", 3.3, 'd')));
	}
}