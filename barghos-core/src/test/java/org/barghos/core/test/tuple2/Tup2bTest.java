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

import org.barghos.core.tuple2.PTup2b;
import org.barghos.core.tuple2.Tup2b;

/**
 * This class provides component tests for the class {@link Tup2b}.
 * 
 * @since 1.0.0.0
 */
class Tup2bTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2b#Tup2b()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2b t = new Tup2b();
		
		assertEquals((byte)0, t.x);
		assertEquals((byte)0, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2b#Tup2b(org.barghos.core.api.tuple2.Tup2bR) Tup2b.Tup2b(Tup2bR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2b t = new Tup2b(PTup2b.gen((byte)1, (byte)2));
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2b#Tup2b(byte)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2b t = new Tup2b((byte)1);
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)1, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2b#Tup2b(byte, byte)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#setX(byte)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.setX((byte)1));
		assertEquals((byte)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#setY(byte)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.setY((byte)2));
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2b#set(org.barghos.core.api.tuple2.Tup2bR) Tup2b.set(Tup2bR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.set(PTup2b.gen((byte)1, (byte)2)));
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#set(byte)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.set((byte)1));
		assertEquals((byte)1, t.x);
		assertEquals((byte)1, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#set(byte, byte)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.set((byte)1, (byte)2));
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#clone()} generates a new instance of
	 * {@link Tup2b} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		Tup2b result = t.clone();
		
		assertNotSame(t, result);
		assertEquals((byte)1, result.getX());
		assertEquals((byte)2, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals("tup2b(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2b#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2b((byte)2, (byte)2))); // x wrong
		assertFalse(t.equals(new Tup2b((byte)1, (byte)3))); // y wrong
		
		assertTrue(t.equals(new Tup2b((byte)1, (byte)2)));
		assertTrue(t.equals(PTup2b.gen((byte)1, (byte)2)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#getNewInstance(byte, byte)}
	 * returns a new instance of {@link Tup2b} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)1);

		Tup2b result = t.getNewInstance((byte)2, (byte)3);
		
		assertNotSame(t, result);
		assertEquals((byte)2, result.getX());
		assertEquals((byte)3, result.getY());
	}
}