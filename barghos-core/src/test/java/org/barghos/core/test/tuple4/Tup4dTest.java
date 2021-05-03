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

import org.barghos.core.tuple4.PTup4d;
import org.barghos.core.tuple4.Tup4d;

/**
 * This class provides component tests for the class {@link Tup4d}.
 * 
 * @since 1.0.0.0
 */
class Tup4dTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4d#Tup4d()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4d t = new Tup4d();
		
		assertEquals(0.0, t.x);
		assertEquals(0.0, t.y);
		assertEquals(0.0, t.z);
		assertEquals(0.0, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4d#Tup4d(org.barghos.core.api.tuple4.Tup4dR) Tup4d.Tup4d(Tup4dR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4d t = new Tup4d(PTup4d.gen(1.2, 3.4, 5.6, 7.8));
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
		assertEquals(7.8, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4d#Tup4d(double)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4d t = new Tup4d(1.2);
		
		assertEquals(1.2, t.x);
		assertEquals(1.2, t.y);
		assertEquals(1.2, t.z);
		assertEquals(1.2, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4d#Tup4d(double, double, double, double)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4d t = new Tup4d(1.2, 3.4, 5.6, 7.8);
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
		assertEquals(7.8, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setX(double)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setX(1.2));
		assertEquals(1.2, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setY(double)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setY(1.2));
		assertEquals(1.2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setZ(double)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setZ(1.2));
		assertEquals(1.2, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setW(double)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setW(1.2));
		assertEquals(1.2, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4d#set(org.barghos.core.api.tuple4.Tup4dR) Tup4d.set(Tup4dR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.set(PTup4d.gen(1.2, 3.4, 5.6, 7.8)));
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
		assertEquals(7.8, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#set(double)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.set(1.2));
		assertEquals(1.2, t.x);
		assertEquals(1.2, t.y);
		assertEquals(1.2, t.z);
		assertEquals(1.2, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#set(double, double, double, double)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.set(1.2, 3.4, 5.6, 7.8));
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
		assertEquals(7.8, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4d t = new Tup4d(1.2, 2.3, 3.4, 4.5);
		
		assertEquals(1.2, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4d t = new Tup4d(1.2, 2.3, 3.4, 4.5);
		
		assertEquals(2.3, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4d t = new Tup4d(1.2, 2.3, 3.4, 4.5);
		
		assertEquals(3.4, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4d t = new Tup4d(1.2, 2.3, 3.4, 4.5);
		
		assertEquals(4.5, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#clone()} generates a new instance of
	 * {@link Tup4d} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4d t = new Tup4d(1.2, 3.4, 5.6, 7.8);
		
		Tup4d result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1.2, result.getX());
		assertEquals(3.4, result.getY());
		assertEquals(5.6, result.getZ());
		assertEquals(7.8, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4d t = new Tup4d(1.2, 3.4, 5.6, 7.8);
		
		assertEquals("tup4d(x=1.2, y=3.4, z=5.6, w=7.8)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4d#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4d t = new Tup4d(1.2, 3.4, 5.6, 7.8);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup4d(3.4, 3.4, 5.6, 7.8))); // x wrong
		assertFalse(t.equals(new Tup4d(1.2, 4.5, 5.6, 7.8))); // y wrong
		assertFalse(t.equals(new Tup4d(1.2, 3.4, 7.8, 7.8))); // z wrong
		assertFalse(t.equals(new Tup4d(1.2, 3.4, 5.6, 9.1))); // w wrong
		
		assertTrue(t.equals(new Tup4d(1.2, 3.4, 5.6, 7.8)));
		assertTrue(t.equals(PTup4d.gen(1.2, 3.4, 5.6, 7.8)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getNewInstance(double, double, double, double)}
	 * returns a new instance of {@link Tup4d} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup4d t = new Tup4d(1.0, 1.0, 1.0, 1.0);

		Tup4d result = t.getNewInstance(2.0, 3.0, 4.0, 5.0);
		
		assertNotSame(t, result);
		assertEquals(2.0, result.getX());
		assertEquals(3.0, result.getY());
		assertEquals(4.0, result.getZ());
		assertEquals(5.0, result.getW());
	}
}