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

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple4.Tup4objR;

import org.barghos.core.tuple4.Tup4obj;

/**
 * This class provides component tests for the class {@link Tup4obj}.
 * 
 * @since 1.0.0.0
 */
class Tup4objTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4obj#Tup4obj()} sets the components to null.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertEquals(null, t.x);
		assertEquals(null, t.y);
		assertEquals(null, t.z);
		assertEquals(null, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4obj} generated from an existing instance of {@link TupobjR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		
		Tup4obj t = new Tup4obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4obj} generated from an existing instance of {@link Tup4objR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4objR original = mock(Tup4objR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		
		Tup4obj t = new Tup4obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4obj} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4obj t = new Tup4obj(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
		assertEquals(1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4obj} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4obj t = new Tup4obj(new Object[] {1, 1.0, "a", 'a'});
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4obj} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals("a", t.getZ());
		assertEquals('a', t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setX(Object)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setY(Object)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setY(1.0));
		assertEquals(1.0, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setZ(Object)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setZ("a"));
		assertEquals("a", t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#setW(Object)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4obj t = new Tup4obj();
		
		assertSame(t, t.setW('a'));
		assertEquals('a', t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4obj#set(org.barghos.core.api.tuple2.Tup4objR) Tup4obj.set(Tup4objR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup4obj t = mock(Tup4obj.class);
		
		Tup4objR t2 = mock(Tup4objR.class);
	
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
	 * This test ensures, that the function {@link Tup4obj#set(Object)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4obj t = mock(Tup4obj.class);

		when(t.set(1)).thenCallRealMethod();

		when(t.set(1, 1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#set(Object, Object, Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4obj t = mock(Tup4obj.class);

		when(t.set(1, 1.0, "a", 'a')).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		when(t.setZ('a')).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a", 'a'));

		verify(t).set(1, 1.0, "a", 'a');
		
		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		verify(t).setW('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');
		
		assertEquals(1.0, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');
		
		assertEquals("a", t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');
		
		assertEquals('a', t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');

		assertEquals(-1106216831, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4obj original = new Tup4obj(1, 1.0, "a", 'a');
		Tup4obj t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4objR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingXTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingYTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingZTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4objR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingWTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('b');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("a");
		when(t2.getByIndex(3)).thenReturn('a');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("b");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4obj t1 = new Tup4obj(1, 1.0, "a", 'a');
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		when(t2.getByIndex(2)).thenReturn("a");
		when(t2.getByIndex(3)).thenReturn('b');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4obj#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4obj t = new Tup4obj(1, 1.0, "a", 'a');
		
		assertEquals("tup4obj(x=1, y=1.0, z=a, w=a)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getNewInstance(Object, Object, Object, Object)}
	 * returns a new instance of {@link Tup4obj} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4obj original = new Tup4obj(1, 1.0, "a", 'a');
		Tup4obj newInstance = original.getNewInstance("a", 'a', 1, 1.0);
		
		assertEquals(1, original.getX());
		assertEquals(1.0, original.getY());
		assertEquals("a", original.getZ());
		assertEquals('a', original.getW());
		assertEquals("a", newInstance.getX());
		assertEquals('a', newInstance.getY());
		assertEquals(1, newInstance.getZ());
		assertEquals(1.0, newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4obj#getNewInstance(Object)} calls
	 * the function {@link Tup4obj#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4obj newInstance = mock(Tup4obj.class);
		Tup4obj t = mock(Tup4obj.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4obj#getNewInstance(Tup4objR)}
	 * returns a new instance of {@link Tup4obj} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4objR original = mock(Tup4objR.class);
		Tup4obj newInstance = mock(Tup4obj.class);
		Tup4obj t = mock(Tup4obj.class);
		
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
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4obj#getNewInstance(TupobjR)} calls
	 * the function {@link Tup4obj#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		Tup4obj newInstance = mock(Tup4obj.class);
		Tup4obj t = mock(Tup4obj.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4obj#getNewInstanceFromArray(Object[])} calls
	 * the function {@link Tup4obj#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4obj newInstance = mock(Tup4obj.class);
		Tup4obj t = mock(Tup4obj.class);
		
		when(t.getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'})).thenCallRealMethod();

		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'}));
		
		verify(t).getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'});
		
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t);
	}
}