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

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple3.Tup3strR;

import org.barghos.core.tuple3.Tup3str;
/**
 * This class provides component tests for the class {@link Tup3str}.
 */
class Tup3strTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3str#Tup3str()} sets the components to "".
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3str t = new Tup3str();
		
		assertEquals("", t.x);
		assertEquals("", t.y);
		assertEquals("", t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3str} generated from an existing instance of {@link TupstrR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		
		when(original.getArray()).thenReturn(new String[] {"a", "b", "c"});
		
		Tup3str t = new Tup3str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3str} generated from an existing instance of {@link Tup3strR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup3strR original = mock(Tup3strR.class);
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		when(original.getZ()).thenReturn("c");
		
		Tup3str t = new Tup3str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3str} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3str t = new Tup3str("a");
		
		assertEquals("a", t.getX());
		assertEquals("a", t.getY());
		assertEquals("a", t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3str} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3str t = new Tup3str(new String[] {"a", "b", "c"});
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3str} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3str t = new Tup3str("a", "b", "c");
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#setX(String)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.setX("a"));
		assertEquals("a", t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#setY(String)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.setY("b"));
		assertEquals("b", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#setZ(String)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup3str t = new Tup3str();
		
		assertSame(t, t.setZ("c"));
		assertEquals("c", t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3str#set(org.barghos.core.api.tuple2.Tup3strR) Tup3str.set(Tup3strR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup3str t = mock(Tup3str.class);
		
		Tup3strR t2 = mock(Tup3strR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("c");
		
		when(t.set("a", "b", "c")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set("a", "b", "c");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#set(String)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3str t = mock(Tup3str.class);

		when(t.set("a")).thenCallRealMethod();

		when(t.set("a", "a", "a")).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");

		verify(t).set("a", "a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#set(String, String, String)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3str t = mock(Tup3str.class);

		when(t.set("a", "b", "c")).thenCallRealMethod();

		when(t.setX("a")).thenReturn(t);
		when(t.setY("b")).thenReturn(t);
		when(t.setZ("c")).thenReturn(t);
		
		assertSame(t, t.set("a", "b", "c"));

		verify(t).set("a", "b", "c");
		
		verify(t).setX("a");
		verify(t).setY("b");
		verify(t).setZ("c");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup3str t = new Tup3str("a", "b", "c");
		
		assertEquals("a", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup3str t = new Tup3str("a", "b", "c");
		
		assertEquals("b", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#getY()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup3str t = new Tup3str("a", "b", "c");
		
		assertEquals("c", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3str t = new Tup3str("a", "b", "c");

		assertEquals(126145, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3str#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3str original = new Tup3str("a", "b", "c");
		Tup3str t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3strR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		Tup3strR t2 = mock(Tup3strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("c");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3strR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		Tup3strR t2 = mock(Tup3strR.class);
		
		when(t2.getX()).thenReturn("d");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3strR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		Tup3strR t2 = mock(Tup3strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("d");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3strR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		Tup3strR t2 = mock(Tup3strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("d");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		when(t2.getByIndex(2)).thenReturn("c");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn("d");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("d");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3str t1 = new Tup3str("a", "b", "c");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		when(t2.getByIndex(2)).thenReturn("d");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3str#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup3str t = new Tup3str("a", "b", "c");
		
		assertEquals("tup3str(x=a, y=b, z=c)", t.toString());
	}
}