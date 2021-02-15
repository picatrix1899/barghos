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

import org.barghos.core.tuple4.PTup4b;
import org.barghos.core.tuple4.Tup4b;

/**
 * This class provides component tests for the class {@link Tup4b}.
 * 
 * @since 1.0.0.0
 */
class Tup4bTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4b#Tup4b()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4b t = new Tup4b();
		
		assertEquals((byte)0, t.x);
		assertEquals((byte)0, t.y);
		assertEquals((byte)0, t.z);
		assertEquals((byte)0, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4b#Tup4b(org.barghos.core.api.tuple4.Tup4bR) Tup4b.Tup4b(Tup4bR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4b t = new Tup4b(PTup4b.gen((byte)1, (byte)2, (byte)3, (byte)4));
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
		assertEquals((byte)4, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4b#Tup4b(byte)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4b t = new Tup4b((byte)1);
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)1, t.y);
		assertEquals((byte)1, t.z);
		assertEquals((byte)1, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4b#Tup4b(byte, byte, byte, byte)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
		assertEquals((byte)4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setX(byte)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setX((byte)1));
		assertEquals((byte)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setY(byte)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setY((byte)2));
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setZ(byte)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setZ((byte)3));
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#setW(byte)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.setW((byte)4));
		assertEquals((byte)4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4b#set(org.barghos.core.api.tuple4.Tup4bR) Tup4b.set(Tup4bR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.set(PTup4b.gen((byte)1, (byte)2, (byte)3, (byte)4)));
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
		assertEquals((byte)4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#set(byte)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.set((byte)1));
		assertEquals((byte)1, t.x);
		assertEquals((byte)1, t.y);
		assertEquals((byte)1, t.z);
		assertEquals((byte)1, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#set(byte, byte, byte, byte)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4b t = new Tup4b();
		
		assertSame(t, t.set((byte)1, (byte)2, (byte)3, (byte)4));
		
		assertEquals((byte)1, t.x);
		assertEquals((byte)2, t.y);
		assertEquals((byte)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals((byte)4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4b#clone()} generates a new instance of
	 * {@link Tup4b} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		Tup4b result = t.clone();
		
		assertNotSame(t, result);
		assertEquals((byte)1, result.getX());
		assertEquals((byte)2, result.getY());
		assertEquals((byte)3, result.getZ());
		assertEquals((byte)4, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4b#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertEquals("tup4b(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4b#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4b t = new Tup4b((byte)1, (byte)2, (byte)3, (byte)4);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4b((byte)2, (byte)2, (byte)3, (byte)4))); // x wrong
		assertFalse(t.equals(new Tup4b((byte)1, (byte)3, (byte)3, (byte)4))); // y wrong
		assertFalse(t.equals(new Tup4b((byte)1, (byte)2, (byte)4, (byte)4))); // z wrong
		assertFalse(t.equals(new Tup4b((byte)1, (byte)2, (byte)3, (byte)5))); // w wrong
		
		assertTrue(t.equals(new Tup4b((byte)1, (byte)2, (byte)3, (byte)4)));
		assertTrue(t.equals(PTup4b.gen((byte)1, (byte)2, (byte)3, (byte)4)));
	}
}