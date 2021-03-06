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

import org.barghos.core.tuple2.PTup2d;
import org.barghos.core.tuple2.Tup2d;

/**
 * This class provides component tests for the class {@link Tup2d}.
 * 
 * @since 1.0.0.0
 */
class Tup2dTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2d#Tup2d()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2d t = new Tup2d();
		
		assertEquals(0.0, t.x);
		assertEquals(0.0, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2d#Tup2d(org.barghos.core.api.tuple2.Tup2dR) Tup2d.Tup2d(Tup2dR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2d t = new Tup2d(PTup2d.gen(1.2, 3.4));
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2d#Tup2d(double)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2d t = new Tup2d(1.2);
		
		assertEquals(1.2, t.x);
		assertEquals(1.2, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2d#Tup2d(double, double)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2d t = new Tup2d(1.2, 3.4);
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#setX(double)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2d t = new Tup2d();
		
		assertSame(t, t.setX(1.2));
		assertEquals(1.2, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#setY(double)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2d t = new Tup2d();
		
		assertSame(t, t.setY(1.2));
		assertEquals(1.2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2d#set(org.barghos.core.api.tuple2.Tup2dR) Tup2d.set(Tup2dR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2d t = new Tup2d();
		
		assertSame(t, t.set(PTup2d.gen(1.2, 3.4)));
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#set(double)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2d t = new Tup2d();
		
		assertSame(t, t.set(1.2));
		assertEquals(1.2, t.x);
		assertEquals(1.2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#set(double, double)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2d t = new Tup2d();
		
		assertSame(t, t.set(1.2, 3.4));
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2d t = new Tup2d(1.2, 2.3);
		
		assertEquals(1.2, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2d t = new Tup2d(1.2, 2.3);
		
		assertEquals(2.3, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#clone()} generates a new instance of
	 * {@link Tup2d} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2d t = new Tup2d(1.2, 3.4);
		
		Tup2d result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1.2, result.getX());
		assertEquals(3.4, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2d t = new Tup2d(1.2, 3.4);
		
		assertEquals("tup2d(x=1.2, y=3.4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2d#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2d t = new Tup2d(1.2, 3.4);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup2d(3.4, 3.4))); // x wrong
		assertFalse(t.equals(new Tup2d(1.2, 4.5))); // y wrong
		
		assertTrue(t.equals(new Tup2d(1.2, 3.4)));
		assertTrue(t.equals(PTup2d.gen(1.2, 3.4)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2d#getNewInstance(double, double)}
	 * returns a new instance of {@link Tup2d} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2d t = new Tup2d(1.0, 1.0);

		Tup2d result = t.getNewInstance(2.0, 3.0);
		
		assertNotSame(t, result);
		assertEquals(2.0, result.getX());
		assertEquals(3.0, result.getY());
	}
}