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
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple3.Tup3oR;

import org.barghos.core.tuple3.Tup3o;

/**
 * This class provides component tests for the class {@link Tup3o}.
 * 
 * @since 1.0.0.0
 */
class Tup3oTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3o#Tup3o()} sets the components to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>();
		
		assertEquals(null, t.x);
		assertEquals(null, t.y);
		assertEquals(null, t.z);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3o} generated from an existing instance of {@link Tup3oR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple3Test()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> original = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		
		Tup3o<Integer,Double,String> t = new Tup3o<>(original);
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		assertEquals("a", t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3o} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>(1, 1.0, "a");
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		assertEquals("a", t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#setX(Object)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>();
		
		assertSame(t, t.setX(1));
		assertEquals(1, (int)t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#setY(Object)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>();
		
		assertSame(t, t.setY(1.0));
		assertEquals(1.0, (double)t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#setZ(Object)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>();
		
		assertSame(t, t.setZ("a"));
		assertEquals("a", t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3o#set(org.barghos.core.api.tuple2.Tup3oR) Tup3o.set(Tup3oR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		@SuppressWarnings("unchecked")
		Tup3o<Integer,Double,String> t = (Tup3o<Integer,Double,String>)mock(Tup3o.class);
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		
		when(t.set(1, 1.0, "a")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#set(Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		@SuppressWarnings("unchecked")
		Tup3o<Integer,Double,String> t = (Tup3o<Integer,Double,String>)mock(Tup3o.class);

		when(t.set(1, 1.0, "a")).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a"));

		verify(t).set(1, 1.0, "a");
		
		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		
		verifyNoMoreInteractions(t);
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
		Tup3o<Integer,Double,String> t = new Tup3o<>(1, 1.0, "a");
		
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
		Tup3o<Integer,Double,String> t = new Tup3o<>(1, 1.0, "a");
		
		assertEquals(1.0, (double)t.getY());
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
		Tup3o<Integer,Double,String> t = new Tup3o<>(1, 1.0, "a");
		
		assertEquals("a", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>(1, 1.0, "a");

		assertEquals(-1106216831, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3o<Integer,Double,String> original = new Tup3o<>(1, 1.0, "a");
		Tup3o<Integer,Double,String> t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3oR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3oR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3oR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3oR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup3o<Integer,Double,String> t1 = new Tup3o<>(1, 1.0, "a");
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3o#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3o<Integer,Double,String> t = new Tup3o<>(1, 1.0, "a");
		
		assertEquals("tup3o(x=1, y=1.0, z=a)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#getNewInstance(Object, Object, Object)}
	 * returns a new instance of {@link Tup3o} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup3o<Integer,Double,String> original = new Tup3o<>(1, 1.0, "a");
		Tup3o<Integer,Double,String> newInstance = original.getNewInstance(2, 2.0, "b");
		
		assertEquals(1, (int)original.getX());
		assertEquals(1.0, (double)original.getY());
		assertEquals("a", original.getZ());
		assertEquals(2, (int)newInstance.getX());
		assertEquals(2.0, (double)newInstance.getY());
		assertEquals("b", newInstance.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3o#getNewInstance(Tup3oR)}
	 * returns a new instance of {@link Tup3o} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> original = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		@SuppressWarnings("unchecked")
		Tup3o<Integer,Double,String> newInstance = (Tup3o<Integer,Double,String>)mock(Tup3o.class);
		
		@SuppressWarnings("unchecked")
		Tup3o<Integer,Double,String> t = (Tup3o<Integer,Double,String>)mock(Tup3o.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(t.getNewInstance(1, 1.0, "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, original);
	}
}