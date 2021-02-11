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

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple2.PTup2bigi;
import org.barghos.core.tuple2.Tup2bigi;

/**
 * This class provides component tests for the class {@link Tup2bigi}.
 * 
 * @since 1.0.0.0
 */
class Tup2bigiTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2bigi#Tup2bigi()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertEquals(BigInteger.ZERO, t.x);
		assertEquals(BigInteger.ZERO, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2bigi#Tup2bigi(org.barghos.core.api.tuple2.Tup2bigiR) Tup2bigi.Tup2bigi(Tup2bigiR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2bigi t = new Tup2bigi(PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2)));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2bigi#Tup2bigi(BigInteger)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(1), t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2bigi#Tup2bigi(BigInteger, BigInteger)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#setX(BigInteger)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.setX(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#setY(BigInteger)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.setY(BigInteger.valueOf(2)));
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2bigi#set(org.barghos.core.api.tuple2.Tup2bigiR) Tup2bigi.set(Tup2bigiR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.set(PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2))));
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#set(BigInteger)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.set(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(1), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#set(BigInteger, BigInteger)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2)));
		
		assertEquals(BigInteger.valueOf(1), t.x);
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#clone()} generates a new instance of
	 * {@link Tup2bigi} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigi result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(BigInteger.valueOf(1), result.getX());
		assertEquals(BigInteger.valueOf(2), result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals("tup2bigi(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2bigi#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(""));
		assertFalse(t.equals(new Tup2bigi(BigInteger.valueOf(2), BigInteger.valueOf(2)))); // x wrong
		assertFalse(t.equals(new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(3)))); // y wrong
		
		assertTrue(t.equals(new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2))));
		assertTrue(t.equals(PTup2bigi.gen(BigInteger.valueOf(1), BigInteger.valueOf(2))));
	}
}