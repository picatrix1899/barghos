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

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple4.Tup4sR;

import org.barghos.core.tuple4.Tup4s;

/**
 * This class provides component tests for the class {@link Tup4s}.
 * 
 * @since 1.0.0.0
 */
class Tup4sTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4s#Tup4s()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4s t = new Tup4s();
		
		assertEquals((short)0, t.x);
		assertEquals((short)0, t.y);
		assertEquals((short)0, t.z);
		assertEquals((short)0, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4s} generated from an existing instance of {@link TupsR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2, (short)3, (short)4});
		
		Tup4s t = new Tup4s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4s} generated from an existing instance of {@link Tup4sR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4sR original = mock(Tup4sR.class);
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		when(original.getZ()).thenReturn((short)3);
		when(original.getZ()).thenReturn((short)4);
		
		Tup4s t = new Tup4s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4s} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4s t = new Tup4s((short)1);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)1, t.getY());
		assertEquals((short)1, t.getZ());
		assertEquals((short)1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4s} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4s t = new Tup4s(new short[] {(short)1, (short)2, (short)3, (short)4});
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4s} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		assertEquals((short)3, t.getZ());
		assertEquals((short)4, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setX(short)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setX((short)1));
		assertEquals((short)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setY(short)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setY((short)2));
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setZ(short)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setZ((short)3));
		assertEquals((short)3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#setW(short)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4s t = new Tup4s();
		
		assertSame(t, t.setW((short)4));
		assertEquals((short)4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4s#set(org.barghos.core.api.tuple2.Tup4sR) Tup4s.set(Tup4sR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4s t = mock(Tup4s.class);
		
		Tup4sR t2 = mock(Tup4sR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t2.getW()).thenReturn((short)4);
		
		when(t.set((short)1, (short)2, (short)3, (short)4)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set((short)1, (short)2, (short)3, (short)4);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#set(short)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4s t = mock(Tup4s.class);

		when(t.set((short)1)).thenCallRealMethod();

		when(t.set((short)1, (short)1, (short)1, (short)1)).thenReturn(t);
		
		assertSame(t, t.set((short)1));
		
		verify(t).set((short)1);

		verify(t).set((short)1, (short)1, (short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#set(short, short, short, short)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4s t = mock(Tup4s.class);

		when(t.set((short)1, (short)2, (short)3, (short)4)).thenCallRealMethod();

		when(t.setX((short)1)).thenReturn(t);
		when(t.setY((short)2)).thenReturn(t);
		when(t.setZ((short)3)).thenReturn(t);
		when(t.setW((short)4)).thenReturn(t);
		
		assertSame(t, t.set((short)1, (short)2, (short)3, (short)4));

		verify(t).set((short)1, (short)2, (short)3, (short)4);
		
		verify(t).setX((short)1);
		verify(t).setY((short)2);
		verify(t).setZ((short)3);
		verify(t).setW((short)4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getY()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals((short)4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);

		assertEquals(66614367, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4s original = new Tup4s((short)1, (short)2, (short)3, (short)4);
		Tup4s t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4sR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t2.getW()).thenReturn((short)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4sR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		Tup4sR t2 = mock(Tup4sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t2.getW()).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		when(t2.getByIndex(2)).thenReturn((short)3);
		when(t2.getByIndex(3)).thenReturn((short)4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}

	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		when(t2.getByIndex(2)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4s t1 = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		when(t2.getByIndex(2)).thenReturn((short)3);
		when(t2.getByIndex(3)).thenReturn((short)5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4s#toString()} function prshorts the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4s t = new Tup4s((short)1, (short)2, (short)3, (short)4);
		
		assertEquals("tup3s(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getNewInstance(short, short, short, short)}
	 * returns a new instance of {@link Tup4s} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4s original = new Tup4s((short)1, (short)2, (short)3, (short)4);
		Tup4s newInstance = original.getNewInstance((short)3, (short)4, (short)5, (short)6);
		
		assertEquals((short)1, original.getX());
		assertEquals((short)2, original.getY());
		assertEquals((short)3, original.getZ());
		assertEquals((short)4, original.getW());
		assertEquals((short)3, newInstance.getX());
		assertEquals((short)4, newInstance.getY());
		assertEquals((short)5, newInstance.getZ());
		assertEquals((short)6, newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4s#getNewInstance(short)} calls
	 * the function {@link Tup4s#getNewInstance(short, short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4s newInstance = mock(Tup4s.class);
		Tup4s t = mock(Tup4s.class);
		
		when(t.getNewInstance((short)1)).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)1, (short)1, (short)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((short)1));
		
		verify(t).getNewInstance((short)1);
		
		verify(t).getNewInstance((short)1, (short)1, (short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4s#getNewInstance(Tup4sR)}
	 * returns a new instance of {@link Tup4s} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4sR original = mock(Tup4sR.class);
		Tup4s newInstance = mock(Tup4s.class);
		Tup4s t = mock(Tup4s.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		when(original.getZ()).thenReturn((short)3);
		when(original.getW()).thenReturn((short)4);
		when(t.getNewInstance((short)1, (short)2, (short)3, (short)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance((short)1, (short)2, (short)3, (short)4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4s#getNewInstance(TupsR)} calls
	 * the function {@link Tup4s#getNewInstance(short, short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		Tup4s newInstance = mock(Tup4s.class);
		Tup4s t = mock(Tup4s.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2, (short)3, (short)4});
		when(t.getNewInstance((short)1, (short)2, (short)3, (short)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((short)1, (short)2, (short)3, (short)4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4s#getNewInstanceFromArray(short[])} calls
	 * the function {@link Tup4s#getNewInstance(short, short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4s newInstance = mock(Tup4s.class);
		Tup4s t = mock(Tup4s.class);
		
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)2, (short)3, (short)4})).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)2, (short)3, (short)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new short[] {(short)1, (short)2, (short)3, (short)4}));
		
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)2, (short)3, (short)4});
		
		verify(t).getNewInstance((short)1, (short)2, (short)3, (short)4);
		
		verifyNoMoreInteractions(t);
	}
}