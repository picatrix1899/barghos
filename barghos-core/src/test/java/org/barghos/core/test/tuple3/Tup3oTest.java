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

import org.barghos.core.tuple3.PTup3o;
import org.barghos.core.tuple3.Tup3o;

/**
 * This class provides component tests for the class {@link Tup3o}.
 * 
 * @since 1.0.0.0
 */
class Tup3oTest
{
	/**
	 * This test ensures, that the constructor {@link Tup3o#Tup3o()} aktually works and
	 * that the components are set to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorEmptyTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>();
		
		assertNull(t.x);
		assertNull(t.y);
		assertNull(t.z);
	}
	
	/**
	 * This test ensures, that  the constructor
	 * {@link Tup3o#Tup3o(org.barghos.core.api.tuple3.Tup3oR) Tup3o.Tup3o(Tup3oR)} actually works and
	 * that the components are adopted from the input tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorCloneTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(PTup3o.gen(1, "arg2", 3.3));
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
	}
	
	/**
	 * This test ensures, that the constructor {@link Tup3o#Tup3o(Object, Object, Object)} actually works,
	 * and that the components are set to the respective parameters.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctorComponentsTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2", 3.3);
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#setX(Object)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>();
		
		assertSame(t, t.setX(1));
		assertEquals(1, (int)t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#setY(Object)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>();
		
		assertSame(t, t.setY("arg1"));
		assertEquals("arg1", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#setZ(Object)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>();
		
		assertSame(t, t.setZ(3.3));
		assertEquals(3.3, (double)t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3o#set(org.barghos.core.api.tuple3.Tup3oR) Tup3o.set(Tup3oR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setCloneTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>();
		
		assertSame(t, t.set(PTup3o.gen(1, "arg2", 3.3)));
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#set(Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setComponentsTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>();
		
		assertSame(t, t.set(1, "arg2", 3.3));
		
		assertEquals(1, (int)t.x);
		assertEquals("arg2", t.y);
		assertEquals(3.3, (double)t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2", 3.3);
		
		assertEquals(1, (int)t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2", 3.3);
		
		assertEquals("arg2", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2", 3.3);
		
		assertEquals(3.3, (double)t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#clone()} generates a new instance of
	 * {@link Tup3o} and adopts the components from the original.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void cloneTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2",3.3);
		
		Tup3o<Integer,String,Double> result = t.clone();
		
		assertNotSame(t, result);
		assertEquals(1, (int)result.getX());
		assertEquals("arg2", result.getY());
		assertEquals(3.3, (double)result.getZ());
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2", 3.3);
		
		assertEquals("tup3o(x=1, y=arg2, z=3.3)", t.toString());
	}
	
	/**
	 * This test ensures, that the special policies for the function {@link Tup3o#equals(Object)} are working.
	 * 
	 * @since 1.0.0.0
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void equalsTest()
	{
		Tup3o<Integer,String,Double> t = new Tup3o<>(1, "arg2", 3.3);
		
		assertTrue(t.equals(t));
		assertFalse(t.equals(null));
		assertFalse(t.equals(0.0));
		assertFalse(t.equals(new Tup3o<>("arg2", "arg2", 3.3))); // x wrong
		assertFalse(t.equals(new Tup3o<>(1, 3.3, 3.3))); // y wrong
		assertFalse(t.equals(new Tup3o<>(1, "arg2", "wrong"))); // z wrong
		
		assertTrue(t.equals(new Tup3o<>(1, "arg2", 3.3)));
		assertTrue(t.equals(PTup3o.gen(1, "arg2", 3.3)));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#getNewInstance(Object, Object, Object)}
	 * returns a new instance of {@link Tup3o} with the given values.
	 */
	@Test
	void getNewInstanceTest()
	{
		Tup3o<Long,Long,Long> t = new Tup3o<>(1l, 1l, 1l);
		
		Tup3o<Long,Long,Long> result = t.getNewInstance(2l, 3l, 4l);
		
		assertNotSame(t, result);
		assertEquals(2l, (long)result.getX());
		assertEquals(3l, (long)result.getY());
		assertEquals(4l, (long)result.getZ());
	}
}