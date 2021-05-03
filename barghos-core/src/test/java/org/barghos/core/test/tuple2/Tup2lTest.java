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

import org.barghos.core.tuple2.PTup2l;
import org.barghos.core.tuple2.Tup2l;

/**
 * This class provides component tests for the class {@link Tup2l}.
 * 
 * @since 1.0.0.0
 */
class Tup2lTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2l#Tup2l()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2l t = new Tup2l();
		
		assertEquals(0l, t.x);
		assertEquals(0l, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2l#Tup2l(org.barghos.core.api.tuple2.Tup2lR) Tup2l.Tup2l(Tup2lR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2l t = new Tup2l(PTup2l.gen(1l, 2l));
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2l#Tup2l(long)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2l t = new Tup2l(1l);
		
		assertEquals(1l, t.x);
		assertEquals(1l, t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2l#Tup2l(long, long)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#setX(long)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.setX(1l));
		assertEquals(1l, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#setY(long)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.setY(2l));
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2l#set(org.barghos.core.api.tuple2.Tup2lR) Tup2l.set(Tup2lR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.set(PTup2l.gen(1l, 2l)));
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#set(long)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.set(1l));
		assertEquals(1l, t.x);
		assertEquals(1l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#set(long, long)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.set(1l, 2l));
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#clone()} generates a new instance of
	 * {@link Tup2l} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		Tup2l result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1l, result.getX());
		assertEquals(2l, result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals("tup2l(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2l#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2l(2l, 2l))); // x wrong
		assertFalse(t.equals(new Tup2l(1l, 3l))); // y wrong
		
		assertTrue(t.equals(new Tup2l(1l, 2l)));
		assertTrue(t.equals(PTup2l.gen(1l, 2l)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#getNewInstance(long, long)}
	 * returns a new instance of {@link Tup2l} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2l t = new Tup2l(1l, 1l);

		Tup2l result = t.getNewInstance(2l, 3l);
		
		assertNotSame(t, result);
		assertEquals(2l, result.getX());
		assertEquals(3l, result.getY());
	}
}