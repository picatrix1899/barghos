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

import org.barghos.core.tuple3.PTup3i;
import org.barghos.core.tuple3.Tup3i;

/**
 * This class provides component tests for the class {@link Tup3i}.
 * 
 * @since 1.0.0.0
 */
class Tup3iTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3i#Tup3i()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3i t = new Tup3i();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
		assertEquals(0, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3i#Tup3i(org.barghos.core.api.tuple3.Tup3iR) Tup3i.Tup3i(Tup3iR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3i t = new Tup3i(PTup3i.gen(1, 2, 3));
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3i#Tup3i(int)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3i t = new Tup3i(1);
		
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3i#Tup3i(int, int, int)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#setX(int)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3i t = new Tup3i();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#setY(int)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3i t = new Tup3i();
		
		assertSame(t, t.setY(2));
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#setZ(int)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3i t = new Tup3i();
		
		assertSame(t, t.setZ(3));
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3i#set(org.barghos.core.api.tuple3.Tup3iR) Tup3i.set(Tup3iR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3i t = new Tup3i();
		
		assertSame(t, t.set(PTup3i.gen(1, 2, 3)));
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#set(int)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3i t = new Tup3i();
		
		assertSame(t, t.set(1));
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#set(int, int, int)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3i t = new Tup3i();
		
		assertSame(t, t.set(1, 2, 3));
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		
		assertEquals(3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#clone()} generates a new instance of
	 * {@link Tup3i} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		
		Tup3i result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, result.getX());
		assertEquals(2, result.getY());
		assertEquals(3, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3i#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		
		assertEquals("tup3i(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3i#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3i t = new Tup3i(1, 2, 3);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3i(2, 2, 3))); // x wrong
		assertFalse(t.equals(new Tup3i(1, 3, 3))); // y wrong
		assertFalse(t.equals(new Tup3i(1, 2, 4))); // z wrong
		
		assertTrue(t.equals(new Tup3i(1, 2, 3)));
		assertTrue(t.equals(PTup3i.gen(1, 2, 3)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3i#getNewInstance(int, int, int)}
	 * returns a new instance of {@link Tup3i} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3i t = new Tup3i(1, 1, 1);

		Tup3i result = t.getNewInstance(2, 3, 4);
		
		assertNotSame(t, result);
		assertEquals(2, result.getX());
		assertEquals(3, result.getY());
		assertEquals(4, result.getZ());
	}
}