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

import org.barghos.core.tuple3.PTup3bo;
import org.barghos.core.tuple3.Tup3bo;

/**
 * This class provides component tests for the class {@link Tup3bo}.
 * 
 * @since 1.0.0.0
 */
class Tup3boTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3bo#Tup3bo()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertEquals(false, t.x);
		assertEquals(false, t.y);
		assertEquals(false, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3bo#Tup3bo(org.barghos.core.api.tuple3.Tup3boR) Tup3bo.Tup3bo(Tup3boR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3bo t = new Tup3bo(PTup3bo.gen(false, true, true));
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3bo#Tup3bo(boolean)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3bo t = new Tup3bo(true);
		
		assertEquals(true, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3bo#Tup3bo(boolean, boolean, boolean)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#setX(boolean)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.setX(true));
		assertEquals(true, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#setY(boolean)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.setY(true));
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#setZ(boolean)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.setZ(true));
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3bo#set(org.barghos.core.api.tuple3.Tup3boR) Tup3bo.set(Tup3boR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.set(PTup3bo.gen(false, true, true)));
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#set(boolean)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.set(true));
		assertEquals(true, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#set(false, true, true)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.set(false, true, true));
		
		assertEquals(false, t.x);
		assertEquals(true, t.y);
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		assertEquals(false, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		assertEquals(true, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		assertEquals(true, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#clone()} generates a new instance of
	 * {@link Tup3bo} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		Tup3bo result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(false, result.getX());
		assertEquals(true, result.getY());
		assertEquals(true, result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		assertEquals("tup3bo(x=false, y=true, z=true)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3bo#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3bo t = new Tup3bo(false, true, true);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3bo(true, true, true))); // x wrong
		assertFalse(t.equals(new Tup3bo(false, false, true))); // y wrong
		assertFalse(t.equals(new Tup3bo(false, true, false))); // z wrong
		
		assertTrue(t.equals(new Tup3bo(false, true, true)));
		assertTrue(t.equals(PTup3bo.gen(false, true, true)));
	}
}