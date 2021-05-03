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

import org.barghos.core.tuple2.PTup2i;
import org.barghos.core.tuple2.Tup2i;

/**
 * This class provides component tests for the class {@link Tup2i}.
 * 
 * @since 1.0.0.0
 */
class Tup2iTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2i#Tup2i()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2i t = new Tup2i();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2i#Tup2i(org.barghos.core.api.tuple2.Tup2iR) Tup2i.Tup2i(Tup2iR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2i t = new Tup2i(PTup2i.gen(1, 2));
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2i#Tup2i(int)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2i t = new Tup2i(1);
		
		assertEquals(1, t.x);
		assertEquals(1, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2i#Tup2i(int, int)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#setX(int)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#setY(int)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.setY(2));
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2i#set(org.barghos.core.api.tuple2.Tup2iR) Tup2i.set(Tup2iR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.set(PTup2i.gen(1, 2)));
		assertEquals(1, t.x);
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#set(int)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.set(1));
		assertEquals(1, t.x);
		assertEquals(1, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#set(int, int)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.set(1, 2));
		
		assertEquals(1, t.x);
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#clone()} generates a new instance of
	 * {@link Tup2i} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		Tup2i result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, result.getX());
		assertEquals(2, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals("tup2i(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2i#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2i t = new Tup2i(1, 2);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2i(2, 2))); // x wrong
		assertFalse(t.equals(new Tup2i(1, 3))); // y wrong
		
		assertTrue(t.equals(new Tup2i(1, 2)));
		assertTrue(t.equals(PTup2i.gen(1, 2)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getNewInstance(int, int)}
	 * returns a new instance of {@link Tup2i} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2i t = new Tup2i(1, 1);

		Tup2i result = t.getNewInstance(2, 3);
		
		assertNotSame(t, result);
		assertEquals(2, result.getX());
		assertEquals(3, result.getY());
	}
}