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

import org.barghos.core.tuple2.PTup2f;
import org.barghos.core.tuple2.Tup2f;

/**
 * This class provides component tests for the class {@link Tup2f}.
 * 
 * @since 1.0.0.0
 */
class Tup2fTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2f#Tup2f()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2f t = new Tup2f();
		
		assertEquals(0.0f, t.x);
		assertEquals(0.0f, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2f#Tup2f(org.barghos.core.api.tuple2.Tup2fR) Tup2f.Tup2f(Tup2fR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2f t = new Tup2f(PTup2f.gen(1.2f, 3.4f));
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2f#Tup2f(float)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2f t = new Tup2f(1.2f);
		
		assertEquals(1.2f, t.x);
		assertEquals(1.2f, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2f#Tup2f(float, float)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2f t = new Tup2f(1.2f, 3.4f);
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#setX(float)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.setX(1.2f));
		assertEquals(1.2f, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#setY(float)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.setY(1.2f));
		assertEquals(1.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2f#set(org.barghos.core.api.tuple2.Tup2fR) Tup2f.set(Tup2fR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.set(PTup2f.gen(1.2f, 3.4f)));
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#set(float)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.set(1.2f));
		assertEquals(1.2f, t.x);
		assertEquals(1.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#set(float, float)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.set(1.2f, 3.4f));
		
		assertEquals(1.2f, t.x);
		assertEquals(3.4f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2f t = new Tup2f(1.2f, 2.3f);
		
		assertEquals(1.2f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2f t = new Tup2f(1.2f, 2.3f);
		
		assertEquals(2.3f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#clone()} generates a new instance of
	 * {@link Tup2f} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2f t = new Tup2f(1.2f, 3.4f);
		
		Tup2f result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1.2f, result.getX());
		assertEquals(3.4f, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2f t = new Tup2f(1.2f, 3.4f);
		
		assertEquals("tup2f(x=1.2, y=3.4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2f#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2f t = new Tup2f(1.2f, 3.4f);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup2f(3.4f, 3.4f))); // x wrong
		assertFalse(t.equals(new Tup2f(1.2f, 4.5f))); // y wrong
		
		assertTrue(t.equals(new Tup2f(1.2f, 3.4f)));
		assertTrue(t.equals(PTup2f.gen(1.2f, 3.4f)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#getNewInstance(float, float)}
	 * returns a new instance of {@link Tup2f} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2f t = new Tup2f(1.0f, 1.0f);

		Tup2f result = t.getNewInstance(2.0f, 3.0f);
		
		assertNotSame(t, result);
		assertEquals(2.0f, result.getX());
		assertEquals(3.0f, result.getY());
	}
}