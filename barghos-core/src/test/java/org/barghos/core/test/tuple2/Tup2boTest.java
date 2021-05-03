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

import org.barghos.core.tuple2.PTup2bo;
import org.barghos.core.tuple2.Tup2bo;

/**
 * This class provides component tests for the class {@link Tup2bo}.
 * 
 * @since 1.0.0.0
 */
class Tup2boTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2bo#Tup2bo()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertEquals(false, t.x);
		assertEquals(false, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2bo#Tup2bo(org.barghos.core.api.tuple2.Tup2boR) Tup2bo.Tup2bo(Tup2boR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2bo t = new Tup2bo(PTup2bo.gen(false, true));
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2bo#Tup2bo(boolean)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2bo t = new Tup2bo(true);
		
		assertEquals(true, t.x);
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2bo#Tup2bo(boolean, boolean)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#setX(boolean)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.setX(true));
		assertEquals(true, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#setY(boolean)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.setY(true));
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2bo#set(org.barghos.core.api.tuple2.Tup2boR) Tup2bo.set(Tup2boR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.set(PTup2bo.gen(false, true)));
		assertEquals(false, t.x);
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#set(boolean)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.set(true));
		assertEquals(true, t.x);
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#set(boolean, boolean)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.set(false, true));
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals(false, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals(true, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#clone()} generates a new instance of
	 * {@link Tup2bo} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		Tup2bo result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(false, result.getX());
		assertEquals(true, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals("tup2bo(x=false, y=true)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2bo#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2bo(true, true))); // x wrong
		assertFalse(t.equals(new Tup2bo(false, false))); // y wrong
		
		assertTrue(t.equals(new Tup2bo(false, true)));
		assertTrue(t.equals(PTup2bo.gen(false, true)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#getNewInstance(boolean, boolean)}
	 * returns a new instance of {@link Tup2bo} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2bo t = new Tup2bo(false, true);

		Tup2bo result = t.getNewInstance(true, false);
		
		assertNotSame(t, result);
		assertEquals(true, result.getX());
		assertEquals(false, result.getY());
	}
}