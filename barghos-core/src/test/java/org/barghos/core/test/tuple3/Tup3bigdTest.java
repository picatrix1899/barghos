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

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple3.PTup3bigd;
import org.barghos.core.tuple3.Tup3bigd;

/**
 * This class provides component tests for the class {@link Tup3bigd}.
 * 
 * @since 1.0.0.0
 */
class Tup3bigdTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3bigd#Tup3bigd()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertEquals(BigDecimal.ZERO, t.x);
		assertEquals(BigDecimal.ZERO, t.y);
		assertEquals(BigDecimal.ZERO, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3bigd#Tup3bigd(org.barghos.core.api.tuple3.Tup3bigdR) Tup3bigd.Tup3bigd(Tup3bigdR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3bigd t = new Tup3bigd(PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3bigd#Tup3bigd(BigDecimal)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(1.1), t.y);
		assertEquals(BigDecimal.valueOf(1.1), t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3bigd#Tup3bigd(BigDecimal, BigDecimal, BigDecimal)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#setX(BigDecimal)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.setX(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#setY(BigDecimal)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.setY(BigDecimal.valueOf(2.2)));
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#setZ(BigDecimal)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.setZ(BigDecimal.valueOf(3.3)));
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3bigd#set(org.barghos.core.api.tuple3.Tup3bigdR) Tup3bigd.set(Tup3bigdR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.set(PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#set(BigDecimal)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(1.1), t.y);
		assertEquals(BigDecimal.valueOf(1.1), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#set(BigDecimal, BigDecimal, BigDecimal)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#clone()} generates a new instance of
	 * {@link Tup3bigd} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		Tup3bigd result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(BigDecimal.valueOf(1.1), result.getX());
		assertEquals(BigDecimal.valueOf(2.2), result.getY());
		assertEquals(BigDecimal.valueOf(3.3), result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals("tup3bigd(x=1.1, y=2.2, z=3.3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3bigd#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(""));
		assertFalse(t.equals(new Tup3bigd(BigDecimal.valueOf(2.2), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3)))); // x wrong
		assertFalse(t.equals(new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(3.3), BigDecimal.valueOf(3.3)))); // y wrong
		assertFalse(t.equals(new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(4.4)))); // z wrong
		
		assertTrue(t.equals(new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))));
		assertTrue(t.equals(PTup3bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))));
	}
}