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

import org.barghos.core.tuple4.PTup4i;
import org.barghos.core.tuple4.Tup4i;

/**
 * This class provides component tests for the class {@link Tup4i}.
 * 
 * @since 1.0.0.0
 */
class Tup4iTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4i#Tup4i()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4i t = new Tup4i();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
		assertEquals(0, t.z);
		assertEquals(0, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4i#Tup4i(org.barghos.core.api.tuple4.Tup4iR) Tup4i.Tup4i(Tup4iR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4i t = new Tup4i(PTup4i.gen(1, 2, 3, 4));
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
		assertEquals(4, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4i#Tup4i(int)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4i t = new Tup4i(1);
		
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
		assertEquals(1, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4i#Tup4i(int, int, int, int)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
		assertEquals(4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setX(int)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setY(int)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setY(2));
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setZ(int)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setZ(3));
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setW(int)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setW(4));
		assertEquals(4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4i#set(org.barghos.core.api.tuple4.Tup4iR) Tup4i.set(Tup4iR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.set(PTup4i.gen(1, 2, 3, 4)));
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
		assertEquals(4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#set(int)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.set(1));
		assertEquals(1, t.x);
		assertEquals(1, t.y);
		assertEquals(1, t.z);
		assertEquals(1, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#set(int, int, int, int)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.set(1, 2, 3, 4));
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
		assertEquals(3, t.z);
		assertEquals(4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#clone()} generates a new instance of
	 * {@link Tup4i} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		Tup4i result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, result.getX());
		assertEquals(2, result.getY());
		assertEquals(3, result.getZ());
		assertEquals(4, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals("tup4i(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4i#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4i(2, 2, 3, 4))); // x wrong
		assertFalse(t.equals(new Tup4i(1, 3, 3, 4))); // y wrong
		assertFalse(t.equals(new Tup4i(1, 2, 4, 4))); // z wrong
		assertFalse(t.equals(new Tup4i(1, 2, 3, 5))); // w wrong
		
		assertTrue(t.equals(new Tup4i(1, 2, 3, 4)));
		assertTrue(t.equals(PTup4i.gen(1, 2, 3, 4)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getNewInstance(int, int, int, int)}
	 * returns a new instance of {@link Tup4i} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup4i t = new Tup4i(1, 1, 1, 1);

		Tup4i result = t.getNewInstance(2, 3, 4, 5);
		
		assertNotSame(t, result);
		assertEquals(2, result.getX());
		assertEquals(3, result.getY());
		assertEquals(4, result.getZ());
		assertEquals(5, result.getW());
	}
}