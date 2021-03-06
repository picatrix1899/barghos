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

import org.barghos.core.tuple3.PTup3d;
import org.barghos.core.tuple3.Tup3d;

/**
 * This class provides component tests for the class {@link Tup3d}.
 * 
 * @since 1.0.0.0
 */
class Tup3dTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3d#Tup3d()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3d t = new Tup3d();
		
		assertEquals(0.0, t.x);
		assertEquals(0.0, t.y);
		assertEquals(0.0, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3d#Tup3d(org.barghos.core.api.tuple3.Tup3dR) Tup3d.Tup3d(Tup3dR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3d t = new Tup3d(PTup3d.gen(1.2, 3.4, 5.6));
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3d#Tup3d(double)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3d t = new Tup3d(1.2);
		
		assertEquals(1.2, t.x);
		assertEquals(1.2, t.y);
		assertEquals(1.2, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3d#Tup3d(double, double, double)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3d t = new Tup3d(1.2, 3.4, 5.6);
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#setX(double)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.setX(1.2));
		assertEquals(1.2, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#setY(double)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.setY(1.2));
		assertEquals(1.2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#setZ(double)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.setZ(1.2));
		assertEquals(1.2, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3d#set(org.barghos.core.api.tuple3.Tup3dR) Tup3d.set(Tup3dR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.set(PTup3d.gen(1.2, 3.4, 5.6)));
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#set(double)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.set(1.2));
		assertEquals(1.2, t.x);
		assertEquals(1.2, t.y);
		assertEquals(1.2, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#set(double, double, double)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.set(1.2, 3.4, 5.6));
		
		assertEquals(1.2, t.x);
		assertEquals(3.4, t.y);
		assertEquals(5.6, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3d t = new Tup3d(1.2, 2.3, 3.4);
		
		assertEquals(1.2, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3d t = new Tup3d(1.2, 2.3, 3.4);
		
		assertEquals(2.3, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3d t = new Tup3d(1.2, 2.3, 3.4);
		
		assertEquals(3.4, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#clone()} generates a new instance of
	 * {@link Tup3d} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3d t = new Tup3d(1.2, 3.4, 5.6);
		
		Tup3d result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1.2, result.getX());
		assertEquals(3.4, result.getY());
		assertEquals(5.6, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3d t = new Tup3d(1.2, 3.4, 5.6);
		
		assertEquals("tup3d(x=1.2, y=3.4, z=5.6)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3d#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3d t = new Tup3d(1.2, 3.4, 5.6);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0));
		assertFalse(t.equals(new Tup3d(3.4, 3.4, 5.6))); // x wrong
		assertFalse(t.equals(new Tup3d(1.2, 4.5, 5.6))); // y wrong
		assertFalse(t.equals(new Tup3d(1.2, 3.4, 7.8))); // z wrong
		
		assertTrue(t.equals(new Tup3d(1.2, 3.4, 5.6)));
		assertTrue(t.equals(PTup3d.gen(1.2, 3.4, 5.6)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getNewInstance(double, double, double)}
	 * returns a new instance of {@link Tup3d} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3d t = new Tup3d(1.0, 1.0, 1.0);

		Tup3d result = t.getNewInstance(2.0, 3.0, 4.0);
		
		assertNotSame(t, result);
		assertEquals(2.0, result.getX());
		assertEquals(3.0, result.getY());
		assertEquals(4.0, result.getZ());
	}
}