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

import org.barghos.core.tuple4.PTup4l;
import org.barghos.core.tuple4.Tup4l;

/**
 * This class provides component tests for the class {@link Tup4l}.
 * 
 * @since 1.0.0.0
 */
class Tup4lTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4l#Tup4l()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4l t = new Tup4l();
		
		assertEquals(0l, t.x);
		assertEquals(0l, t.y);
		assertEquals(0l, t.z);
		assertEquals(0l, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4l#Tup4l(org.barghos.core.api.tuple4.Tup4lR) Tup4l.Tup4l(Tup4lR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4l t = new Tup4l(PTup4l.gen(1l, 2l, 3l, 4l));
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
		assertEquals(4l, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4l#Tup4l(long)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4l t = new Tup4l(1l);
		
		assertEquals(1l, t.x);
		assertEquals(1l, t.y);
		assertEquals(1l, t.z);
		assertEquals(1l, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4l#Tup4l(long, long, long, long)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
		assertEquals(4l, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setX(long)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setX(1l));
		assertEquals(1l, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setY(long)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setY(2l));
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setZ(long)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setZ(3l));
		assertEquals(3l, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#setW(long)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.setW(4l));
		assertEquals(4l, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4l#set(org.barghos.core.api.tuple4.Tup4lR) Tup4l.set(Tup4lR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.set(PTup4l.gen(1l, 2l, 3l, 4l)));
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
		assertEquals(4l, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#set(long)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.set(1l));
		assertEquals(1l, t.x);
		assertEquals(1l, t.y);
		assertEquals(1l, t.z);
		assertEquals(1l, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#set(long, long, long, long)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4l t = new Tup4l();
		
		assertSame(t, t.set(1l, 2l, 3l, 4l));
		
		assertEquals(1l, t.x);
		assertEquals(2l, t.y);
		assertEquals(3l, t.z);
		assertEquals(4l, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(3l, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals(4l, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#clone()} generates a new instance of
	 * {@link Tup4l} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		Tup4l result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1l, result.getX());
		assertEquals(2l, result.getY());
		assertEquals(3l, result.getZ());
		assertEquals(4l, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4l#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertEquals("tup4l(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4l#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4l t = new Tup4l(1l, 2l, 3l, 4l);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4l(2l, 2l, 3l, 4l))); // x wrong
		assertFalse(t.equals(new Tup4l(1l, 3l, 3l, 4l))); // y wrong
		assertFalse(t.equals(new Tup4l(1l, 2l, 4l, 4l))); // z wrong
		assertFalse(t.equals(new Tup4l(1l, 2l, 3l, 5l))); // w wrong
		
		assertTrue(t.equals(new Tup4l(1l, 2l, 3l, 4l)));
		assertTrue(t.equals(PTup4l.gen(1l, 2l, 3l, 4l)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4l#getNewInstance(long, long, long, long)}
	 * returns a new instance of {@link Tup4l} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup4l t = new Tup4l(1l, 1l, 1l, 1l);

		Tup4l result = t.getNewInstance(2l, 3l, 4l, 5l);
		
		assertNotSame(t, result);
		assertEquals(2l, result.getX());
		assertEquals(3l, result.getY());
		assertEquals(4l, result.getZ());
		assertEquals(5l, result.getW());
	}
}