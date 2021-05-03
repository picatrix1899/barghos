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

import org.barghos.core.tuple4.PTup4s;
import org.barghos.core.tuple4.Tup4s;

/**
 * This class provides component tests for the class {@link Tup4s}.
 * 
 * @since 1.0.0.0
 */
class Tup4sTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4s#Tup4s()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4s t = new Tup4s();
		
		assertEquals((short)0, t.x);
		assertEquals((short)0, t.y);
		assertEquals((short)0, t.z);
		assertEquals((short)0, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4s#Tup4s(org.barghos.core.api.tuple4.Tup4sR) Tup4s.Tup4s(Tup4sR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4s t = new Tup4s(PTup4s.gen((short)1, (short)2, (short)3, (short)4));
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
		assertEquals((short)4, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4s#Tup4s(short)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4s t = new Tup4s((short)1);
		
		assertEquals((short)1, t.x);
		assertEquals((short)1, t.y);
		assertEquals((short)1, t.z);
		assertEquals((short)1, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4s#Tup4s(short, short, short, short)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
		assertEquals((short)4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setX(short)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setX((short)1));
		assertEquals((short)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setY(short)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setY((short)2));
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setZ(short)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setZ((short)3));
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setW(short)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setW((short)4));
		assertEquals((short)4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4s#set(org.barghos.core.api.tuple4.Tup4sR) Tup4s.set(Tup4sR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.set(PTup4s.gen((short)1, (short)2, (short)3, (short)4)));
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
		assertEquals((short)4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#set(short)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.set((short)1));
		assertEquals((short)1, t.x);
		assertEquals((short)1, t.y);
		assertEquals((short)1, t.z);
		assertEquals((short)1, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#set(short, short, short, short)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.set((short)1, (short)2, (short)3, (short)4));
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
		assertEquals((short)3, t.z);
		assertEquals((short)4, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#clone()} generates a new instance of
	 * {@link Tup4s} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4s result = t.clone();
		
		assertNotSame(t, result);
		assertEquals((short)1, result.getX());
		assertEquals((short)2, result.getY());
		assertEquals((short)3, result.getZ());
		assertEquals((short)4, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals("tup4s(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4s#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4s((short)2, (short)2, (short)3, (short)4))); // x wrong
		assertFalse(t.equals(new Tup4s((short)1, (short)3, (short)3, (short)4))); // y wrong
		assertFalse(t.equals(new Tup4s((short)1, (short)2, (short)4, (short)4))); // z wrong
		assertFalse(t.equals(new Tup4s((short)1, (short)2, (short)3, (short)5))); // w wrong
		
		assertTrue(t.equals(new Tup4s((short)1, (short)2, (short)3, (short)4)));
		assertTrue(t.equals(PTup4s.gen((short)1, (short)2, (short)3, (short)4)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getNewInstance(short, short, short, short)}
	 * returns a new instance of {@link Tup4s} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup4s t = new Tup4s((short)1, (short)1, (short)1, (short)1);

		Tup4s result = t.getNewInstance((short)2, (short)3, (short)4, (short)5);
		
		assertNotSame(t, result);
		assertEquals((short)2, result.getX());
		assertEquals((short)3, result.getY());
		assertEquals((short)4, result.getZ());
		assertEquals((short)5, result.getW());
	}
}