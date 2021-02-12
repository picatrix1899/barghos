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

import org.barghos.core.tuple3.PTup3l;
import org.barghos.core.tuple3.Tup3l;

/**
 * This class provides component tests for the class {@link Tup3l}.
 * 
 * @since 1.0.0.0
 */
class Tup3lTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3l#Tup3l()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3l t = new Tup3l();
		
		assertEquals(0l, t.x);
		assertEquals(0l, t.y);
		assertEquals(0l, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3l#Tup3l(org.barghos.core.api.tuple3.Tup3lR) Tup3l.Tup3l(Tup3lR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3l t = new Tup3l(PTup3l.gen(1l, 2l, 3l));
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3l#Tup3l(long)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3l t = new Tup3l(1l);
		
		assertEquals(1l, t.x);
		assertEquals(1l, t.y);
		assertEquals(1l, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3l#Tup3l(long, long, long)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#setX(long)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3l t = new Tup3l();
		
		assertSame(t, t.setX(1l));
		assertEquals(1l, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#setY(long)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3l t = new Tup3l();
		
		assertSame(t, t.setY(2l));
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#setZ(long)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3l t = new Tup3l();
		
		assertSame(t, t.setZ(3l));
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3l#set(org.barghos.core.api.tuple3.Tup3lR) Tup3l.set(Tup3lR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3l t = new Tup3l();
		
		assertSame(t, t.set(PTup3l.gen(1l, 2l, 3l)));
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#set(long)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3l t = new Tup3l();
		
		assertSame(t, t.set(1l));
		assertEquals(1l, t.x);
		assertEquals(1l, t.y);
		assertEquals(1l, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#set(long, long, long)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3l t = new Tup3l();
		
		assertSame(t, t.set(1l, 2l, 3l));
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		assertEquals(3l, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3l#clone()} generates a new instance of
	 * {@link Tup3l} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		Tup3l result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1l, result.getX());
		assertEquals(2l, result.getY());
		assertEquals(3l, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3l#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		assertEquals("tup3l(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3l#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3l(2l, 2l, 3l))); // x wrong
		assertFalse(t.equals(new Tup3l(1l, 3l, 3l))); // y wrong
		assertFalse(t.equals(new Tup3l(1l, 2l, 4l))); // y wrong
		
		assertTrue(t.equals(new Tup3l(1l, 2l, 3l)));
		assertTrue(t.equals(PTup3l.gen(1l, 2l, 3l)));
	}
}