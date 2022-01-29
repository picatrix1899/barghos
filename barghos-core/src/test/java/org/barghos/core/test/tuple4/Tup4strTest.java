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

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple4.Tup4strR;

import org.barghos.core.tuple4.Tup4str;
/**
 * This class provides component tests for the class {@link Tup4str}.
 * 
 * @since 1.0.0.0
 */
class Tup4strTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4str#Tup4str()} sets the components to "".
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4str t = new Tup4str();
		
		assertEquals("", t.x);
		assertEquals("", t.y);
		assertEquals("", t.z);
		assertEquals("", t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4str} generated from an existing instance of {@link TupstrR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		
		when(original.getArray()).thenReturn(new String[] {"a", "b", "c", "d"});
		
		Tup4str t = new Tup4str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
		assertEquals("d", t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4str} generated from an existing instance of {@link Tup4strR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4strR original = mock(Tup4strR.class);
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		when(original.getZ()).thenReturn("c");
		when(original.getW()).thenReturn("d");
		
		Tup4str t = new Tup4str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
		assertEquals("d", t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4str} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4str t = new Tup4str("a");
		
		assertEquals("a", t.getX());
		assertEquals("a", t.getY());
		assertEquals("a", t.getZ());
		assertEquals("a", t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4str} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4str t = new Tup4str(new String[] {"a", "b", "c", "d"});
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
		assertEquals("d", t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4str} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		assertEquals("c", t.getZ());
		assertEquals("d", t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setX(String)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setX("a"));
		assertEquals("a", t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setY(String)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setY("b"));
		assertEquals("b", t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setZ(String)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setZ("c"));
		assertEquals("c", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#setW(String)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4str t = new Tup4str();
		
		assertSame(t, t.setW("d"));
		assertEquals("d", t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4str#set(org.barghos.core.api.tuple2.Tup4strR) Tup4str.set(Tup4strR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup4str t = mock(Tup4str.class);
		
		Tup4strR t2 = mock(Tup4strR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("c");
		when(t2.getW()).thenReturn("d");
		
		when(t.set("a", "b", "c", "d")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set("a", "b", "c", "d");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#set(String)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4str t = mock(Tup4str.class);

		when(t.set("a")).thenCallRealMethod();

		when(t.set("a", "a", "a", "a")).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");

		verify(t).set("a", "a", "a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#set(String, String, String, String)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4str t = mock(Tup4str.class);

		when(t.set("a", "b", "c", "d")).thenCallRealMethod();

		when(t.setX("a")).thenReturn(t);
		when(t.setY("b")).thenReturn(t);
		when(t.setZ("c")).thenReturn(t);
		when(t.setW("d")).thenReturn(t);
		
		assertSame(t, t.set("a", "b", "c", "d"));

		verify(t).set("a", "b", "c", "d");
		
		verify(t).setX("a");
		verify(t).setY("b");
		verify(t).setZ("c");
		verify(t).setW("d");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");
		
		assertEquals("a", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");
		
		assertEquals("b", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");
		
		assertEquals("c", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");
		
		assertEquals("d", t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");

		assertEquals(126145, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4str original = new Tup4str("a", "b", "c", "d");
		Tup4str t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4strR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		Tup4strR t2 = mock(Tup4strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("c");
		when(t2.getW()).thenReturn("d");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4strR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		Tup4strR t2 = mock(Tup4strR.class);
		
		when(t2.getX()).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4strR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		Tup4strR t2 = mock(Tup4strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4strR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		Tup4strR t2 = mock(Tup4strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4strR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		Tup4strR t2 = mock(Tup4strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t2.getZ()).thenReturn("c");
		when(t2.getW()).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		when(t2.getByIndex(2)).thenReturn("c");
		when(t2.getByIndex(3)).thenReturn("d");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		when(t2.getByIndex(2)).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4str t1 = new Tup4str("a", "b", "c", "d");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		when(t2.getByIndex(2)).thenReturn("c");
		when(t2.getByIndex(3)).thenReturn("e");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4str t = new Tup4str("a", "b", "c", "d");
		
		assertEquals("tup4str(x=a, y=b, z=c, w=d)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getNewInstance(String, String, String, String)}
	 * returns a new instance of {@link Tup4str} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4str original = new Tup4str("a", "b", "c", "d");
		Tup4str newInstance = original.getNewInstance("c", "d", "e", "f");
		
		assertEquals("a", original.getX());
		assertEquals("b", original.getY());
		assertEquals("c", original.getZ());
		assertEquals("d", original.getW());
		assertEquals("c", newInstance.getX());
		assertEquals("d", newInstance.getY());
		assertEquals("e", newInstance.getZ());
		assertEquals("f", newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4str#getNewInstance(String)} calls
	 * the function {@link Tup4str#getNewInstance(String, String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4str newInstance = mock(Tup4str.class);
		Tup4str t = mock(Tup4str.class);
		
		when(t.getNewInstance("a")).thenCallRealMethod();

		when(t.getNewInstance("a", "a", "a", "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance("a"));
		
		verify(t).getNewInstance("a");
		
		verify(t).getNewInstance("a", "a", "a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4str#getNewInstance(Tup4strR)}
	 * returns a new instance of {@link Tup4str} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4strR original = mock(Tup4strR.class);
		Tup4str newInstance = mock(Tup4str.class);
		Tup4str t = mock(Tup4str.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		when(original.getZ()).thenReturn("c");
		when(original.getW()).thenReturn("d");
		when(t.getNewInstance("a", "b", "c", "d")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance("a", "b", "c", "d");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4str#getNewInstance(TupstrR)} calls
	 * the function {@link Tup4str#getNewInstance(String, String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		Tup4str newInstance = mock(Tup4str.class);
		Tup4str t = mock(Tup4str.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new String[] {"a", "b", "c", "d"});
		when(t.getNewInstance("a", "b", "c", "d")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance("a", "b", "c", "d");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4str#getNewInstanceFromArray(String[])} calls
	 * the function {@link Tup4str#getNewInstance(String, String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4str newInstance = mock(Tup4str.class);
		Tup4str t = mock(Tup4str.class);
		
		when(t.getNewInstanceFromArray(new String[] {"a", "b", "c", "d"})).thenCallRealMethod();

		when(t.getNewInstance("a", "b", "c", "d")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new String[] {"a", "b", "c", "d"}));
		
		verify(t).getNewInstanceFromArray(new String[] {"a", "b", "c", "d"});
		
		verify(t).getNewInstance("a", "b", "c", "d");
		
		verifyNoMoreInteractions(t);
	}
}