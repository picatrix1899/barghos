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

import org.barghos.core.tuple4.PTup4bo;
import org.barghos.core.tuple4.Tup4bo;

/**
 * This class provides component tests for the class {@link Tup4bo}.
 * 
 * @since 1.0.0.0
 */
class Tup4boTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4bo#Tup4bo()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertEquals(false, t.x);
		assertEquals(false, t.y);
		assertEquals(false, t.z);
		assertEquals(false, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4bo#Tup4bo(org.barghos.core.api.tuple4.Tup4boR) Tup4bo.Tup4bo(Tup4boR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4bo t = new Tup4bo(PTup4bo.gen(false, true, true, false));
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
		assertEquals(false, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4bo#Tup4bo(boolean)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4bo t = new Tup4bo(true);
		
		assertEquals(true, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
		assertEquals(true, t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4bo#Tup4bo(boolean, boolean, boolean, boolean)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
		assertEquals(false, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#setX(boolean)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.setX(true));
		assertEquals(true, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#setY(boolean)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.setY(true));
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#setZ(boolean)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.setZ(true));
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#setW(boolean)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.setW(true));
		assertEquals(true, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4bo#set(org.barghos.core.api.tuple4.Tup4boR) Tup4bo.set(Tup4boR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.set(PTup4bo.gen(false, true, true, false)));
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
		assertEquals(false, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#set(boolean)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.set(true));
		assertEquals(true, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
		assertEquals(true, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#set(boolean, boolean, boolean, boolean)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4bo t = new Tup4bo();
		
		assertSame(t, t.set(false, true, true, false));
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
		assertEquals(false, t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertEquals(false, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertEquals(true, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertEquals(true, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertEquals(false, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#clone()} generates a new instance of
	 * {@link Tup4bo} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		Tup4bo result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(false, result.getX());
		assertEquals(true, result.getY());
		assertEquals(true, result.getZ());
		assertEquals(false, result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertEquals("tup4bo(x=false, y=true, z=true, w=false)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4bo#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4bo(true, true, true, false))); // x wrong
		assertFalse(t.equals(new Tup4bo(false, false, true, false))); // y wrong
		assertFalse(t.equals(new Tup4bo(false, true, false, false))); // z wrong
		assertFalse(t.equals(new Tup4bo(false, true, true, true))); // w wrong
		
		assertTrue(t.equals(new Tup4bo(false, true, true, false)));
		assertTrue(t.equals(PTup4bo.gen(false, true, true, false)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bo#getNewInstance(boolean, boolean, boolean, boolean)}
	 * returns a new instance of {@link Tup4bo} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup4bo t = new Tup4bo(false, true, false, true);

		Tup4bo result = t.getNewInstance(true, false, true, false);
		
		assertNotSame(t, result);
		assertEquals(true, result.getX());
		assertEquals(false, result.getY());
		assertEquals(true, result.getZ());
		assertEquals(false, result.getW());
	}
}