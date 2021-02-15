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

import org.barghos.core.tuple3.PTup3s;
import org.barghos.core.tuple3.Tup3s;

/**
 * This class provides component tests for the class {@link Tup3s}.
 * 
 * @since 1.0.0.0
 */
class Tup3sTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3s#Tup3s()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3s t = new Tup3s();
		
		assertEquals((short)0, t.x);
		assertEquals((short)0, t.y);
		assertEquals((short)0, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3s#Tup3s(org.barghos.core.api.tuple3.Tup3sR) Tup3s.Tup3s(Tup3sR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3s t = new Tup3s(PTup3s.gen((short)1, (short)2, (short)3));
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3s#Tup3s(short)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3s t = new Tup3s((short)1);
		
		assertEquals((short)1, t.x);
		assertEquals((short)1, t.y);
		assertEquals((short)1, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3s#Tup3s(short, short, short)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#setX(short)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3s t = new Tup3s();
		
		assertSame(t, t.setX((short)1));
		assertEquals((short)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#setY(short)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3s t = new Tup3s();
		
		assertSame(t, t.setY((short)2));
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#setZ(short)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3s t = new Tup3s();
		
		assertSame(t, t.setZ((short)3));
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3s#set(org.barghos.core.api.tuple3.Tup3sR) Tup3s.set(Tup3sR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3s t = new Tup3s();
		
		assertSame(t, t.set(PTup3s.gen((short)1, (short)2, (short)3)));
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#set(short)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3s t = new Tup3s();
		
		assertSame(t, t.set((short)1));
		assertEquals((short)1, t.x);
		assertEquals((short)1, t.y);
		assertEquals((short)1, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#set(short, short, short)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3s t = new Tup3s();
		
		assertSame(t, t.set((short)1, (short)2, (short)3));
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		assertEquals((short)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		assertEquals((short)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3s#clone()} generates a new instance of
	 * {@link Tup3s} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		Tup3s result = t.clone();
		
		assertNotSame(t, result);
		assertEquals((short)1, result.getX());
		assertEquals((short)2, result.getY());
		assertEquals((short)3, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3s#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		assertEquals("tup3s(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3s#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3s t = new Tup3s((short)1, (short)2, (short)3);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3s((short)2, (short)2, (short)3))); // x wrong
		assertFalse(t.equals(new Tup3s((short)1, (short)3, (short)3))); // y wrong
		assertFalse(t.equals(new Tup3s((short)1, (short)2, (short)4))); // z wrong
		
		assertTrue(t.equals(new Tup3s((short)1, (short)2, (short)3)));
		assertTrue(t.equals(PTup3s.gen((short)1, (short)2, (short)3)));
	}
}