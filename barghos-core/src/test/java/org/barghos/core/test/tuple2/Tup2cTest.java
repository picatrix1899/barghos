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

import org.barghos.core.tuple2.PTup2c;
import org.barghos.core.tuple2.Tup2c;

/**
 * This class provides component tests for the class {@link Tup2c}.
 * 
 * @since 1.0.0.0
 */
class Tup2cTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2c#Tup2c()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2c t = new Tup2c();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2c#Tup2c(org.barghos.core.api.tuple2.Tup2cR) Tup2c.Tup2c(Tup2cR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2c t = new Tup2c(PTup2c.gen('a', 'b'));
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2c#Tup2c(char)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup2c t = new Tup2c('a');
		
		assertEquals('a', t.x);
		assertEquals('a', t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2c#Tup2c(char, char)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#setX(char)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.setX('a'));
		assertEquals('a', t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#setY(char)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.setY('a'));
		assertEquals('a', t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2c#set(org.barghos.core.api.tuple2.Tup2cR) Tup2c.set(Tup2cR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.set(PTup2c.gen('a', 'b')));
		assertEquals('a', t.x);
		assertEquals('b', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#set(char)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.set('a'));
		assertEquals('a', t.x);
		assertEquals('a', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#set(char, char)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.set('a', 'b'));
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#clone()} generates a new instance of
	 * {@link Tup2c} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		Tup2c result = t.clone();
		
		assertNotSame(t, result);
		assertEquals('a', result.getX());
		assertEquals('b', result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals("tup2c(x=a, y=b)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2c#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2c('b', 'b'))); // x wrong
		assertFalse(t.equals(new Tup2c('a', 'c'))); // y wrong
		
		assertTrue(t.equals(new Tup2c('a', 'b')));
		assertTrue(t.equals(PTup2c.gen('a', 'b')));
	}
}