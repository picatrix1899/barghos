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

import java.math.BigDecimal;

import org.barghos.core.tuple2.PTup2bigd;
import org.barghos.core.tuple2.Tup2bigd;

/**
 * This class provides component tests for the class {@link Tup2bigd}.
 * 
 * @since 1.0.0.0
 */
class Tup2bigdTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2bigd#Tup2bigd()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertEquals(BigDecimal.ZERO, t.x);
		assertEquals(BigDecimal.ZERO, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2bigd#Tup2bigd(org.barghos.core.api.tuple2.Tup2bigdR) Tup2bigd.Tup2bigd(Tup2bigdR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2bigd t = new Tup2bigd(PTup2bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2bigd#Tup2bigd(BigDecimal)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(1.1), t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2bigd#Tup2bigd(BigDecimal, BigDecimal)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#setX(BigDecimal)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.setX(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#setY(BigDecimal)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.setY(BigDecimal.valueOf(2.2)));
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2bigd#set(org.barghos.core.api.tuple2.Tup2bigdR) Tup2bigd.set(Tup2bigdR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.set(PTup2bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2))));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#set(BigDecimal)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(1.1), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#set(BigDecimal, BigDecimal)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#clone()} generates a new instance of
	 * {@link Tup2bigd} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		Tup2bigd result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(BigDecimal.valueOf(1.1), result.getX());
		assertEquals(BigDecimal.valueOf(2.2), result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals("tup2bigd(x=1.1, y=2.2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2bigd#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(""));
		assertFalse(t.equals(new Tup2bigd(BigDecimal.valueOf(2.2), BigDecimal.valueOf(2.2)))); // x wrong
		assertFalse(t.equals(new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(3.3)))); // y wrong
		
		assertTrue(t.equals(new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2))));
		assertTrue(t.equals(PTup2bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2))));
	}
}