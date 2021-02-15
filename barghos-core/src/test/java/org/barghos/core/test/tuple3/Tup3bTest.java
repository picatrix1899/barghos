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

import org.barghos.core.tuple3.PTup3b;
import org.barghos.core.tuple3.Tup3b;

/**
 * This class provides component tests for the class {@link Tup3b}.
 * 
 * @since 1.0.0.0
 */
class Tup3bTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3b#Tup3b()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3b t = new Tup3b();
		
		assertEquals((byte)0, t.x);
		assertEquals((byte)0, t.y);
		assertEquals((byte)0, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3b#Tup3b(org.barghos.core.api.tuple3.Tup3bR) Tup3b.Tup3b(Tup3bR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3b t = new Tup3b(PTup3b.gen((byte)1, (byte)2, (byte)3));
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3b#Tup3b(byte)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3b t = new Tup3b((byte)1);
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)1, t.y);
		assertEquals((byte)1, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3b#Tup3b(byte, byte, byte)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#setX(byte)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.setX((byte)1));
		assertEquals((byte)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#setY(byte)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.setY((byte)2));
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#setZ(byte)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.setZ((byte)3));
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3b#set(org.barghos.core.api.tuple3.Tup3bR) Tup3b.set(Tup3bR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.set(PTup3b.gen((byte)1, (byte)2, (byte)3)));
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#set(byte)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.set((byte)1));
		assertEquals((byte)1, t.x);
		assertEquals((byte)1, t.y);
		assertEquals((byte)1, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#set(byte, byte, byte)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3b t = new Tup3b();
		
		assertSame(t, t.set((byte)1, (byte)2, (byte)3));
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals((byte)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3b#clone()} generates a new instance of
	 * {@link Tup3b} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		Tup3b result = t.clone();
		
		assertNotSame(t, result);
		assertEquals((byte)1, result.getX());
		assertEquals((byte)2, result.getY());
		assertEquals((byte)3, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3b#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertEquals("tup3b(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3b#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3b t = new Tup3b((byte)1, (byte)2, (byte)3);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3b((byte)2, (byte)2, (byte)3))); // x wrong
		assertFalse(t.equals(new Tup3b((byte)1, (byte)3, (byte)3))); // y wrong
		assertFalse(t.equals(new Tup3b((byte)1, (byte)2, (byte)4))); // z wrong
		
		assertTrue(t.equals(new Tup3b((byte)1, (byte)2, (byte)3)));
		assertTrue(t.equals(PTup3b.gen((byte)1, (byte)2, (byte)3)));
	}
}