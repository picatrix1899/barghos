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

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import org.barghos.core.tuple4.PTup4bigd;
import org.barghos.core.tuple4.Tup4bigd;

/**
 * This class provides component tests for the class {@link Tup4bigd}.
 * 
 * @since 1.0.0.0
 */
class Tup4bigdTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4bigd#Tup4bigd()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertEquals(BigDecimal.ZERO, t.x);
		assertEquals(BigDecimal.ZERO, t.y);
		assertEquals(BigDecimal.ZERO, t.z);
		assertEquals(BigDecimal.ZERO, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4bigd#Tup4bigd(org.barghos.core.api.tuple4.Tup4bigdR) Tup4bigd.Tup4bigd(Tup4bigdR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4bigd t = new Tup4bigd(PTup4bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
		assertEquals(BigDecimal.valueOf(4.4), t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4bigd#Tup4bigd(BigDecimal)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(1.1), t.y);
		assertEquals(BigDecimal.valueOf(1.1), t.z);
		assertEquals(BigDecimal.valueOf(1.1), t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4bigd#Tup4bigd(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
		assertEquals(BigDecimal.valueOf(4.4), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setX(BigDecimal)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setX(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setY(BigDecimal)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setY(BigDecimal.valueOf(2.2)));
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setZ(BigDecimal)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setZ(BigDecimal.valueOf(3.3)));
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setW(BigDecimal)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setW(BigDecimal.valueOf(4.4)));
		assertEquals(BigDecimal.valueOf(4.4), t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4bigd#set(org.barghos.core.api.tuple4.Tup4bigdR) Tup4bigd.set(Tup4bigdR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.set(PTup4bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4))));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
		assertEquals(BigDecimal.valueOf(4.4), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#set(BigDecimal)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(1.1), t.y);
		assertEquals(BigDecimal.valueOf(1.1), t.z);
		assertEquals(BigDecimal.valueOf(1.1), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#set(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4)));
		
		assertEquals(BigDecimal.valueOf(1.1), t.x);
		assertEquals(BigDecimal.valueOf(2.2), t.y);
		assertEquals(BigDecimal.valueOf(3.3), t.z);
		assertEquals(BigDecimal.valueOf(4.4), t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup34bigd#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(4.4), t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#clone()} generates a new instance of
	 * {@link Tup4bigd} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		Tup4bigd result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(BigDecimal.valueOf(1.1), result.getX());
		assertEquals(BigDecimal.valueOf(2.2), result.getY());
		assertEquals(BigDecimal.valueOf(3.3), result.getZ());
		assertEquals(BigDecimal.valueOf(4.4), result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals("tup4bigd(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4bigd#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(""));
		assertFalse(t.equals(new Tup4bigd(BigDecimal.valueOf(2.2), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4)))); // x wrong
		assertFalse(t.equals(new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(3.3), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4)))); // y wrong
		assertFalse(t.equals(new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(4.4), BigDecimal.valueOf(4.4)))); // z wrong
		assertFalse(t.equals(new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(5.5)))); // w wrong
		
		assertTrue(t.equals(new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4))));
		assertTrue(t.equals(PTup4bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4))));
	}
}