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
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple4.Tup4oR;

import org.barghos.core.tuple4.Tup4o;

/**
 * This class provides component tests for the class {@link Tup4o}.
 * 
 * @since 1.0.0.0
 */
class Tup4oTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4o#Tup4o()} sets the components to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>();
		
		assertEquals(null, t.x);
		assertEquals(null, t.y);
		assertEquals(null, t.z);
		assertEquals(null, t.w);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4o} generated from an existing instance of {@link Tup4oR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple3Test()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> original = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(original);
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', (char)t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4o} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', (char)t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setX(Object)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>();
		
		assertSame(t, t.setX(1));
		assertEquals(1, (int)t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setY(Object)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>();
		
		assertSame(t, t.setY(1.0));
		assertEquals(1.0, (double)t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setZ(Object)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>();
		
		assertSame(t, t.setZ("a"));
		assertEquals("a", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#setW(Object)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>();
		
		assertSame(t, t.setW('a'));
		assertEquals('a', (char)t.w);
	}
	
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4o#set(org.barghos.core.api.tuple2.Tup4oR) Tup4o.set(Tup4oR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		@SuppressWarnings("unchecked")
		Tup4o<Integer,Double,String,Character> t = (Tup4o<Integer,Double,String,Character>)mock(Tup4o.class);
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		
		when(t.set(1, 1.0, "a", 'a')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#set(Object, Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		@SuppressWarnings("unchecked")
		Tup4o<Integer,Double,String,Character> t = (Tup4o<Integer,Double,String,Character>)mock(Tup4o.class);

		when(t.set(1, 1.0, "a", 'a')).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		when(t.setW('a')).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a", 'a'));

		verify(t).set(1, 1.0, "a", 'a');
		
		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		verify(t).setW('a');
		
		verifyNoMoreInteractions(t);
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
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');
		
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
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertEquals(1.0, (double)t.getY());
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
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertEquals("a", t.getZ());
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
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertEquals('a', (char)t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');

		assertEquals(67016704, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4o<Integer,Double,String,Character> original = new Tup4o<>(1, 1.0, "a", 'a');
		Tup4o<Integer,Double,String,Character> t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4oR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4oR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4o<Integer,Double,String,Character> t1 = new Tup4o<>(1, 1.0, "a", 'a');
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('b');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4o#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4o<Integer,Double,String,Character> t = new Tup4o<>(1, 1.0, "a", 'a');
		
		assertEquals("tup4o(x=1, y=1.0, z=a, w=a)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#getNewInstance(Object, Object, Object, Object)}
	 * returns a new instance of {@link Tup4o} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4o<Integer,Double,String,Character> original = new Tup4o<>(1, 1.0, "a", 'a');
		Tup4o<Integer,Double,String,Character> newInstance = original.getNewInstance(2, 2.0, "b", 'b');
		
		assertEquals(1, (int)original.getX());
		assertEquals(1.0, (double)original.getY());
		assertEquals("a", original.getZ());
		assertEquals('a', (char)original.getW());
		assertEquals(2, (int)newInstance.getX());
		assertEquals(2.0, (double)newInstance.getY());
		assertEquals("b", newInstance.getZ());
		assertEquals('b', (char)newInstance.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4o#getNewInstance(Tup4oR)}
	 * returns a new instance of {@link Tup4o} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> original = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		@SuppressWarnings("unchecked")
		Tup4o<Integer,Double,String,Character> newInstance = (Tup4o<Integer,Double,String,Character>)mock(Tup4o.class);
		
		@SuppressWarnings("unchecked")
		Tup4o<Integer,Double,String,Character> t = (Tup4o<Integer,Double,String,Character>)mock(Tup4o.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, original);
	}
}