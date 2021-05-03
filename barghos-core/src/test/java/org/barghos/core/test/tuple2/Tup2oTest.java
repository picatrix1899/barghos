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

import org.barghos.core.tuple2.PTup2o;
import org.barghos.core.tuple2.Tup2o;

/**
 * This class provides component tests for the class {@link Tup2o}.
 * 
 * @since 1.0.0.0
 */
class Tup2oTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2o#Tup2o()} aktually works and
	 * that the components are set to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>();
		
		assertNull(t.x);
		assertNull(t.y);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup2o#Tup2o(org.barghos.core.api.tuple2.Tup2oR) Tup2o.Tup2o(Tup2oR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(PTup2o.gen(1, "arg2"));
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup2o#Tup2o(Object, Object)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(1, "arg2");
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#setX(Object)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>();
		
		assertSame(t, t.setX(1));
		assertEquals(1, (int)t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#setY(Object)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2o#set(org.barghos.core.api.tuple2.Tup2oR) Tup2o.set(Tup2oR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>();
		
		assertSame(t, t.set(PTup2o.gen(1, "arg2")));
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#set(Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>();
		
		assertSame(t, t.set(1, "arg2"));
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(1, "arg2");
		
		assertEquals(1, (int)t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(1, "arg2");
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#clone()} generates a new instance of
	 * {@link Tup2o} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(1, "arg2");
		
		Tup2o<Integer,String> result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, (int)result.getX());
		assertEquals("arg2", result.getY());
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(1, "arg2");
		
		assertEquals("tup2o(x=1, y=arg2)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup2o#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup2o<Integer,String> t = new Tup2o<>(1, "arg2");
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup2o<>("arg2", "arg2"))); // x wrong
		assertFalse(t.equals(new Tup2o<>(1, 1))); // y wrong
		
		assertTrue(t.equals(new Tup2o<>(1, "arg2")));
		assertTrue(t.equals(PTup2o.gen(1, "arg2")));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#getNewInstance(Object, Object)}
	 * returns a new instance of {@link Tup2o} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup2o<Long,Long> t = new Tup2o<>(1l, 1l);

		Tup2o<Long,Long> result = t.getNewInstance(2l, 3l);
		
		assertNotSame(t, result);
		assertEquals(2l, (long)result.getX());
		assertEquals(3l, (long)result.getY());
	}
}