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

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple4.PTup4bigi;
import org.barghos.core.tuple4.Tup4bigi;

/**
 * This class provides component tests for the class {@link Tup4bigi}.
 * 
 * @since 1.0.0.0
 */
class Tup4bigiTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4bigi#Tup4bigi()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertEquals(BigInteger.ZERO, t.x);
		assertEquals(BigInteger.ZERO, t.y);
		assertEquals(BigInteger.ZERO, t.z);
		assertEquals(BigInteger.ZERO, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4bigi#Tup4bigi(org.barghos.core.api.tuple4.Tup4bigiR) Tup4bigi.Tup4bigi(Tup4bigiR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4bigi t = new Tup4bigi(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
		assertEquals(BigInteger.valueOf(4), t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4bigi#Tup4bigi(BigInteger)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(1), t.y);
		assertEquals(BigInteger.valueOf(1), t.z);
		assertEquals(BigInteger.valueOf(1), t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4bigi#Tup4bigi(BigInteger, BigInteger, BigInteger, BigInteger)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
		assertEquals(BigInteger.valueOf(4), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setX(BigInteger)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setX(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setY(BigInteger)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setY(BigInteger.valueOf(2)));
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setZ(BigInteger)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setZ(BigInteger.valueOf(3)));
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setW(BigInteger)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setW(BigInteger.valueOf(4)));
		assertEquals(BigInteger.valueOf(4), t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4bigi#set(org.barghos.core.api.tuple4.Tup4bigiR) Tup4bigi.set(Tup4bigiR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.set(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))));
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
		assertEquals(BigInteger.valueOf(4), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#set(BigInteger)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.set(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(1), t.y);
		assertEquals(BigInteger.valueOf(1), t.z);
		assertEquals(BigInteger.valueOf(1), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#set(BigInteger, BigInteger, BigInteger, BigInteger)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
		assertEquals(BigInteger.valueOf(3), t.z);
		assertEquals(BigInteger.valueOf(4), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3),BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(4), t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#clone()} generates a new instance of
	 * {@link Tup4bigi} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigi result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(1), result.getX());
		assertEquals(BigInteger.valueOf(2), result.getY());
		assertEquals(BigInteger.valueOf(3), result.getZ());
		assertEquals(BigInteger.valueOf(4), result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals("tup4bigi(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4bigi#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(""));
		assertFalse(t.equals(new Tup4bigi(BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)))); // x wrong
		assertFalse(t.equals(new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(3), BigInteger.valueOf(3), BigInteger.valueOf(4)))); // y wrong
		assertFalse(t.equals(new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(4), BigInteger.valueOf(4)))); // z wrong
		assertFalse(t.equals(new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(5)))); // w wrong
		
		assertTrue(t.equals(new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))));
		assertTrue(t.equals(PTup4bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))));
	}
}