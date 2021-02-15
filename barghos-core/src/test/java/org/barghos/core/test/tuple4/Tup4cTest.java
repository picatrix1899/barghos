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

import org.barghos.core.tuple4.PTup4c;
import org.barghos.core.tuple4.Tup4c;

/**
 * This class provides component tests for the class {@link Tup4c}.
 * 
 * @since 1.0.0.0
 */
class Tup4cTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4c#Tup4c()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4c t = new Tup4c();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
		assertEquals(0, t.z);
		assertEquals(0, t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4c#Tup4c(org.barghos.core.api.tuple4.Tup4cR) Tup4c.Tup4c(Tup4cR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4c t = new Tup4c(PTup4c.gen('a', 'b', 'c', 'd'));
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4c#Tup4c(char)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup4c t = new Tup4c('a');
		
		assertEquals('a', t.x);
		assertEquals('a', t.y);
		assertEquals('a', t.z);
		assertEquals('a', t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4c#Tup4c(char, char, char, char)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setX(char)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setX('a'));
		assertEquals('a', t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setY(char)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setY('a'));
		assertEquals('a', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setZ(char)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setZ('a'));
		assertEquals('a', t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#setW(char)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.setW('a'));
		assertEquals('a', t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4c#set(org.barghos.core.api.tuple4.Tup4cR) Tup4c.set(Tup4cR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.set(PTup4c.gen('a', 'b', 'c', 'd')));
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#set(char)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.set('a'));
		assertEquals('a', t.x);
		assertEquals('a', t.y);
		assertEquals('a', t.z);
		assertEquals('a', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#set(char, char, char, char)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4c t = new Tup4c();
		
		assertSame(t, t.set('a', 'b', 'c', 'd'));
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
		assertEquals('d', t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('c', t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals('d', t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4c#clone()} generates a new instance of
	 * {@link Tup4c} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		Tup4c result = t.clone();
		
		assertNotSame(t, result);
		assertEquals('a', result.getX());
		assertEquals('b', result.getY());
		assertEquals('c', result.getZ());
		assertEquals('d', result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4c#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertEquals("tup4c(x=a, y=b, z=c, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4c#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4c('b', 'b', 'c', 'd'))); // x wrong
		assertFalse(t.equals(new Tup4c('a', 'c', 'c', 'd'))); // y wrong
		assertFalse(t.equals(new Tup4c('a', 'b', 'd', 'd'))); // z wrong
		assertFalse(t.equals(new Tup4c('a', 'b', 'c', 'e'))); // w wrong
		
		assertTrue(t.equals(new Tup4c('a', 'b', 'c', 'd')));
		assertTrue(t.equals(PTup4c.gen('a', 'b', 'c', 'd')));
	}
}