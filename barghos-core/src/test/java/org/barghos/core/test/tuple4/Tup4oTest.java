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

import org.barghos.core.tuple4.PTup4o;
import org.barghos.core.tuple4.Tup4o;

/**
 * This class provides component tests for the class {@link Tup4o}.
 * 
 * @since 1.0.0.0
 */
class Tup4oTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4o#Tup4o()} aktually works and
	 * that the components are set to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertNull(t.x);
		assertNull(t.y);
		assertNull(t.z);
		assertNull(t.w);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup4o#Tup4o(org.barghos.core.api.tuple4.Tup4oR) Tup4o.Tup4o(Tup4oR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(PTup4o.gen(1, "arg2", 3.3, 'd'));
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
		assertEquals('d', (char)t.w);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup4o#Tup4o(Object, Object, Object, Object)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
		assertEquals('d', (char)t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setX(Object)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertSame(t, t.setX(1));
		assertEquals(1, (int)t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setY(Object)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setZ(Object)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertSame(t, t.setZ(3.3));
		assertEquals(3.3, (double)t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setW(Object)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertSame(t, t.setW('d'));
		assertEquals('d', (double)t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4o#set(org.barghos.core.api.tuple4.Tup4oR) Tup4o.set(Tup4oR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertSame(t, t.set(PTup4o.gen(1, "arg2", 3.3, 'd')));
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
		assertEquals('d', (char)t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#set(Object, Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>();
		
		assertSame(t, t.set(1, "arg2", 3.3, 'd'));
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
		assertEquals('d', (char)t.w);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertEquals(1, (int)t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertEquals(3.3, (double)t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertEquals('d', (char)t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#clone()} generates a new instance of
	 * {@link Tup4o} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		Tup4o<Integer,String,Double,Character> result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, (int)result.getX());
		assertEquals("arg2", result.getY());
		assertEquals(3.3, (double)result.getZ());
		assertEquals('d', (char)result.getW());
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertEquals("tup4o(x=1, y=arg2, z=3.3, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup4o#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup4o<Integer,String,Double,Character> t = new Tup4o<>(1, "arg2", 3.3, 'd');
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup4o<>("arg2", "arg2", 3.3, 'd'))); // x wrong
		assertFalse(t.equals(new Tup4o<>(1, 3.3, 3.3, 'd'))); // y wrong
		assertFalse(t.equals(new Tup4o<>(1, "arg2", "wrong", 'd'))); // z wrong
		assertFalse(t.equals(new Tup4o<>(1, "arg2", 3.3, 4.4))); // z wrong
		
		assertTrue(t.equals(new Tup4o<>(1, "arg2", 3.3, 'd')));
		assertTrue(t.equals(PTup4o.gen(1, "arg2", 3.3, 'd')));
	}
}