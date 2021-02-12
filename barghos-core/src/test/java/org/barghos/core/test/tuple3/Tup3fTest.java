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

import org.barghos.core.tuple3.PTup3f;
import org.barghos.core.tuple3.Tup3f;

/**
 * This class provides component tests for the class {@link Tup3f}.
 * 
 * @since 1.0.0.0
 */
class Tup3fTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3f#Tup3f()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3f t = new Tup3f();
		
		assertEquals(0.0f, t.x);
		assertEquals(0.0f, t.y);
		assertEquals(0.0f, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3f#Tup3f(org.barghos.core.api.tuple3.Tup3fR) Tup3f.Tup3f(Tup3fR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3f t = new Tup3f(PTup3f.gen(1.2f, 3.4f, 5.6f));
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3f#Tup3f(float)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3f t = new Tup3f(1.2f);
		
		assertEquals(1.2f, t.x);
		assertEquals(1.2f, t.y);
		assertEquals(1.2f, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3f#Tup3f(float, float, float)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3f t = new Tup3f(1.2f, 3.4f, 5.6f);
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#setX(float)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.setX(1.2f));
		assertEquals(1.2f, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#setY(float)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.setY(1.2f));
		assertEquals(1.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#setZ(float)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.setZ(1.2f));
		assertEquals(1.2f, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3f#set(org.barghos.core.api.tuple3.Tup3fR) Tup3f.set(Tup3fR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.set(PTup3f.gen(1.2f, 3.4f, 5.6f)));
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#set(float)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.set(1.2f));
		assertEquals(1.2f, t.x);
		assertEquals(1.2f, t.y);
		assertEquals(1.2f, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#set(float, float, float)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.set(1.2f, 3.4f, 5.6f));
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
		assertEquals(5.6f, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3f t = new Tup3f(1.2f, 2.3f, 3.4f);
		
		assertEquals(1.2f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3f t = new Tup3f(1.2f, 2.3f, 3.4f);
		
		assertEquals(2.3f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3f t = new Tup3f(1.2f, 2.3f, 3.4f);
		
		assertEquals(3.4f, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#clone()} generates a new instance of
	 * {@link Tup3f} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3f t = new Tup3f(1.2f, 3.4f, 5.6f);
		
		Tup3f result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1.2f, result.getX());
		assertEquals(3.4f, result.getY());
		assertEquals(5.6f, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3f t = new Tup3f(1.2f, 3.4f, 5.6f);
		
		assertEquals("tup3f(x=1.2, y=3.4, z=5.6)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3f#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3f t = new Tup3f(1.2f, 3.4f, 5.6f);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup3f(3.4f, 3.4f, 5.6f))); // x wrong
		assertFalse(t.equals(new Tup3f(1.2f, 5.6f, 5.6f))); // y wrong
		assertFalse(t.equals(new Tup3f(1.2f, 3.4f, 7.8f))); // z wrong
		
		assertTrue(t.equals(new Tup3f(1.2f, 3.4f, 5.6f)));
		assertTrue(t.equals(PTup3f.gen(1.2f, 3.4f, 5.6f)));
	}
}