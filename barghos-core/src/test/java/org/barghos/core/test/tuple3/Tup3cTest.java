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

import org.barghos.core.tuple3.PTup3c;
import org.barghos.core.tuple3.Tup3c;

/**
 * This class provides component tests for the class {@link Tup3c}.
 * 
 * @since 1.0.0.0
 */
class Tup3cTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3c#Tup3c()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3c t = new Tup3c();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
		assertEquals(0, t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3c#Tup3c(org.barghos.core.api.tuple3.Tup3cR) Tup3c.Tup3c(Tup3cR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3c t = new Tup3c(PTup3c.gen('a', 'b', 'c'));
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3c#Tup3c(char)} actually works,
	 * and that the components are set to the value.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorScalarTest()
	{
		Tup3c t = new Tup3c('a');
		
		assertEquals('a', t.x);
		assertEquals('a', t.y);
		assertEquals('a', t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3c#Tup3c(char, char, char)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#setX(char)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3c t = new Tup3c();
		
		assertSame(t, t.setX('a'));
		assertEquals('a', t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#setY(char)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3c t = new Tup3c();
		
		assertSame(t, t.setY('a'));
		assertEquals('a', t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#setZ(char)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3c t = new Tup3c();
		
		assertSame(t, t.setZ('a'));
		assertEquals('a', t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3c#set(org.barghos.core.api.tuple3.Tup3cR) Tup3c.set(Tup3cR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3c t = new Tup3c();
		
		assertSame(t, t.set(PTup3c.gen('a', 'b', 'c')));
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#set(char)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setScalarTest()
	{
		Tup3c t = new Tup3c();
		
		assertSame(t, t.set('a'));
		assertEquals('a', t.x);
		assertEquals('a', t.y);
		assertEquals('a', t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#set(char, char, char)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3c t = new Tup3c();
		
		assertSame(t, t.set('a', 'b', 'c'));
		
		assertEquals('a', t.x);
		assertEquals('b', t.y);
		assertEquals('c', t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		assertEquals('c', t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#clone()} generates a new instance of
	 * {@link Tup3c} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		Tup3c result = t.clone();
		
		assertNotSame(t, result);
		assertEquals('a', result.getX());
		assertEquals('b', result.getY());
		assertEquals('c', result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3c#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		assertEquals("tup3c(x=a, y=b, z=c)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3c#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3c('b', 'b', 'c'))); // x wrong
		assertFalse(t.equals(new Tup3c('a', 'c', 'c'))); // y wrong
		assertFalse(t.equals(new Tup3c('a', 'b', 'd'))); // z wrong
		
		assertTrue(t.equals(new Tup3c('a', 'b', 'c')));
		assertTrue(t.equals(PTup3c.gen('a', 'b', 'c')));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3c#getNewInstance(char, char, char)}
	 * returns a new instance of {@link Tup3c} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3c t = new Tup3c('a', 'a', 'a');

		Tup3c result = t.getNewInstance('b', 'c', 'd');
		
		assertNotSame(t, result);
		assertEquals('b', result.getX());
		assertEquals('c', result.getY());
		assertEquals('d', result.getZ());
	}
}