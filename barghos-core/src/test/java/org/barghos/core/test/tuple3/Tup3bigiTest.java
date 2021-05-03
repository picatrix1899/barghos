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

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple3.PTup3bigi;
import org.barghos.core.tuple3.Tup3bigi;

/**
 * This class provides component tests for the class {@link Tup3bigi}.
 * 
 * @since 1.0.0.0
 */
class Tup3bigiTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3bigi#Tup3bigi()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertEquals(BigInteger.ZERO, t.x);
		assertEquals(BigInteger.ZERO, t.y);
		assertEquals(BigInteger.ZERO, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3bigi#Tup3bigi(org.barghos.core.api.tuple3.Tup3bigiR) Tup3bigi.Tup3bigi(Tup3bigiR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3bigi t = new Tup3bigi(PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3bigi#Tup3bigi(BigInteger)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(1), t.y);
		assertEquals(BigInteger.valueOf(1), t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3bigi#Tup3bigi(BigInteger, BigInteger, BigInteger)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#setX(BigInteger)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertSame(t, t.setX(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#setY(BigInteger)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertSame(t, t.setY(BigInteger.valueOf(2)));
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#setZ(BigInteger)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertSame(t, t.setZ(BigInteger.valueOf(3)));
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3bigi#set(org.barghos.core.api.tuple3.Tup3bigiR) Tup3bigi.set(Tup3bigiR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertSame(t, t.set(PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))));
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#set(BigInteger)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertSame(t, t.set(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(1), t.y);
		assertEquals(BigInteger.valueOf(1), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#set(BigInteger, BigInteger, BigInteger)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3bigi t = new Tup3bigi();
		
		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#clone()} generates a new instance of
	 * {@link Tup3bigi} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		Tup3bigi result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(1), result.getX());
		assertEquals(BigInteger.valueOf(2), result.getY());
		assertEquals(BigInteger.valueOf(3), result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertEquals("tup3bigi(x=1, y=2, z=3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3bigi#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(""));
		assertFalse(t.equals(new Tup3bigi(BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(3)))); // x wrong
		assertFalse(t.equals(new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(3), BigInteger.valueOf(3)))); // y wrong
		assertFalse(t.equals(new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(4)))); // z wrong
		
		assertTrue(t.equals(new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))));
		assertTrue(t.equals(PTup3bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigi#getNewInstance(BigInteger, BigInteger, BigInteger)}
	 * returns a new instance of {@link Tup3bigi} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));

		Tup3bigi result = t.getNewInstance(BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(2), result.getX());
		assertEquals(BigInteger.valueOf(3), result.getY());
		assertEquals(BigInteger.valueOf(4), result.getZ());
	}
}