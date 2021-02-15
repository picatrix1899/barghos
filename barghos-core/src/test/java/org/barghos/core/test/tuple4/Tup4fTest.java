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

import org.barghos.core.tuple4.PTup4f;
import org.barghos.core.tuple4.Tup4f;

/**
 * This class provides component tests for the class {@link Tup4f}.
 * 
 * @since 1.0.0.0
 */
class Tup4fTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4f#Tup4f()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4f t = new Tup4f();
		
		assertEquals(0.0f, t.x);
		assertEquals(0.0f, t.y);
		assertEquals(0.0f, t.z);
		assertEquals(0.0f, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4f#Tup4f(org.barghos.core.api.tuple4.Tup4fR) Tup4f.Tup4f(Tup4fR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4f t = new Tup4f(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f));
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
		assertEquals(7.8f, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4f#Tup4f(float)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4f t = new Tup4f(1.2f);
		
		assertEquals(1.2f, t.x);
		assertEquals(1.2f, t.y);
		assertEquals(1.2f, t.z);
		assertEquals(1.2f, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4f#Tup4f(float, float, float, float)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4f t = new Tup4f(1.2f, 3.4f, 5.6f, 7.8f);
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
		assertEquals(7.8f, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setX(float)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setX(1.2f));
		assertEquals(1.2f, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setY(float)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setY(1.2f));
		assertEquals(1.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setZ(float)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setZ(1.2f));
		assertEquals(1.2f, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setW(float)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setW(1.2f));
		assertEquals(1.2f, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4f#set(org.barghos.core.api.tuple4.Tup4fR) Tup4f.set(Tup4fR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.set(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f)));
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
		assertEquals(7.8f, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#set(float)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.set(1.2f));
		assertEquals(1.2f, t.x);
		assertEquals(1.2f, t.y);
		assertEquals(1.2f, t.z);
		assertEquals(1.2f, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#set(float, float, float, float)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.set(1.2f, 3.4f, 5.6f, 7.8f));
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
		assertEquals(7.8f, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4f t = new Tup4f(1.2f, 2.3f, 3.4f, 4.5f);
		
		assertEquals(1.2f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4f t = new Tup4f(1.2f, 2.3f, 3.4f, 4.5f);
		
		assertEquals(2.3f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4f t = new Tup4f(1.2f, 2.3f, 3.4f, 4.5f);
		
		assertEquals(3.4f, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4f t = new Tup4f(1.2f, 2.3f, 3.4f, 4.5f);
		
		assertEquals(4.5f, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#clone()} generates a new instance of
	 * {@link Tup4f} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4f t = new Tup4f(1.2f, 3.4f, 5.6f, 7.8f);
		
		Tup4f result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1.2f, result.getX());
		assertEquals(3.4f, result.getY());
		assertEquals(5.6f, result.getZ());
		assertEquals(7.8f, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4f t = new Tup4f(1.2f, 3.4f, 5.6f, 7.8f);
		
		assertEquals("tup4f(x=1.2, y=3.4, z=5.6, w=7.8)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4f#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4f t = new Tup4f(1.2f, 3.4f, 5.6f, 7.8f);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup4f(3.4f, 3.4f, 5.6f, 7.8f))); // x wrong
		assertFalse(t.equals(new Tup4f(1.2f, 5.6f, 5.6f, 7.8f))); // y wrong
		assertFalse(t.equals(new Tup4f(1.2f, 3.4f, 7.8f, 7.8f))); // z wrong
		assertFalse(t.equals(new Tup4f(1.2f, 3.4f, 5.6f, 9.1f))); // w wrong
		
		assertTrue(t.equals(new Tup4f(1.2f, 3.4f, 5.6f, 7.8f)));
		assertTrue(t.equals(PTup4f.gen(1.2f, 3.4f, 5.6f, 7.8f)));
	}
}