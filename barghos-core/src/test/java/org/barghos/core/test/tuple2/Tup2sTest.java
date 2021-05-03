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

import org.barghos.core.tuple2.PTup2s;
import org.barghos.core.tuple2.Tup2s;

/**
 * This class provides component tests for the class {@link Tup2s}.
 * 
 * @since 1.0.0.0
 */
class Tup2sTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2s#Tup2s()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2s t = new Tup2s();
		
		assertEquals((short)0, t.x);
		assertEquals((short)0, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2s#Tup2s(org.barghos.core.api.tuple2.Tup2sR) Tup2s.Tup2s(Tup2sR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2s t = new Tup2s(PTup2s.gen((short)1, (short)2));
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2s#Tup2s(short)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2s t = new Tup2s((short)1);
		
		assertEquals((short)1, t.x);
		assertEquals((short)1, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2s#Tup2s(short, short)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#setX(short)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.setX((short)1));
		assertEquals((short)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#setY(short)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.setY((short)2));
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2s#set(org.barghos.core.api.tuple2.Tup2sR) Tup2s.set(Tup2sR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.set(PTup2s.gen((short)1, (short)2)));
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#set(short)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.set((short)1));
		assertEquals((short)1, t.x);
		assertEquals((short)1, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#set(short, short)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.set((short)1, (short)2));
		
		assertEquals((short)1, t.x);
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals((short)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#clone()} generates a new instance of
	 * {@link Tup2s} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		Tup2s result = t.clone();
		
		assertNotSame(t, result);
		assertEquals((short)1, result.getX());
		assertEquals((short)2, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals("tup2s(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2s#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2s((short)2, (short)2))); // x wrong
		assertFalse(t.equals(new Tup2s((short)1, (short)3))); // y wrong
		
		assertTrue(t.equals(new Tup2s((short)1, (short)2)));
		assertTrue(t.equals(PTup2s.gen((short)1, (short)2)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#getNewInstance(short, short)}
	 * returns a new instance of {@link Tup2s} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2s t = new Tup2s((short)1, (short)1);

		Tup2s result = t.getNewInstance((short)2, (short)3);
		
		assertNotSame(t, result);
		assertEquals((short)2, result.getX());
		assertEquals((short)3, result.getY());
	}
}