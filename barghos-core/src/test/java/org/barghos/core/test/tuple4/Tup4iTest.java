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

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple4.Tup4iR;

import org.barghos.core.tuple4.Tup4i;

/**
 * This class provides component tests for the class {@link Tup4i}.
 * 
 * @since 1.0.0.0
 */
class Tup4iTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4i#Tup4i()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4i t = new Tup4i();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
		assertEquals(0, t.z);
		assertEquals(0, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4i} generated from an existing instance of {@link TupiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		
		Tup4i t = new Tup4i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4i} generated from an existing instance of {@link Tup4iR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4iR original = mock(Tup4iR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(original.getW()).thenReturn(4);
		
		Tup4i t = new Tup4i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4i} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4i t = new Tup4i(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
		assertEquals(1, t.getZ());
		assertEquals(1, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4i} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4i t = new Tup4i(new int[] {1, 2, 3, 4});
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4i} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		assertEquals(3, t.getZ());
		assertEquals(4, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setX(int)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setY(int)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setY(2));
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setZ(int)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setZ(3));
		assertEquals(3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#setW(int)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4i t = new Tup4i();
		
		assertSame(t, t.setW(4));
		assertEquals(4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4i#set(org.barghos.core.api.tuple2.Tup4iR) Tup4i.set(Tup4iR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4i t = mock(Tup4i.class);
		
		Tup4iR t2 = mock(Tup4iR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t2.getW()).thenReturn(4);
		
		when(t.set(1, 2, 3, 4)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#set(int)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4i t = mock(Tup4i.class);

		when(t.set(1)).thenCallRealMethod();

		when(t.set(1, 1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#set(int, int, int, int)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4i t = mock(Tup4i.class);

		when(t.set(1, 2, 3, 4)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		when(t.setZ(3)).thenReturn(t);
		when(t.setW(4)).thenReturn(t);
		
		assertSame(t, t.set(1, 2, 3, 4));

		verify(t).set(1, 2, 3, 4);
		
		verify(t).setX(1);
		verify(t).setY(2);
		verify(t).setZ(3);
		verify(t).setW(4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getY()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals(4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4i original = new Tup4i(1, 2, 3, 4);
		Tup4i t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4iR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t2.getW()).thenReturn(4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4iR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t2.getW()).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(3);
		when(t2.getByIndex(3)).thenReturn(4);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}

	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4i t1 = new Tup4i(1, 2, 3, 4);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		when(t2.getByIndex(2)).thenReturn(3);
		when(t2.getByIndex(3)).thenReturn(5);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4i#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4i t = new Tup4i(1, 2, 3, 4);
		
		assertEquals("tup4i(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getNewInstance(int, int, int, int)}
	 * returns a new instance of {@link Tup4i} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4i original = new Tup4i(1, 2, 3, 4);
		Tup4i newInstance = original.getNewInstance(3, 4, 5, 6);
		
		assertEquals(1, original.getX());
		assertEquals(2, original.getY());
		assertEquals(3, original.getZ());
		assertEquals(4, original.getW());
		assertEquals(3, newInstance.getX());
		assertEquals(4, newInstance.getY());
		assertEquals(5, newInstance.getZ());
		assertEquals(6, newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4i#getNewInstance(int)} calls
	 * the function {@link Tup4i#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4i newInstance = mock(Tup4i.class);
		Tup4i t = mock(Tup4i.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4i#getNewInstance(Tup4iR)}
	 * returns a new instance of {@link Tup4i} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4iR original = mock(Tup4iR.class);
		Tup4i newInstance = mock(Tup4i.class);
		Tup4i t = mock(Tup4i.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(original.getW()).thenReturn(4);
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4i#getNewInstance(TupiR)} calls
	 * the function {@link Tup4i#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		Tup4i newInstance = mock(Tup4i.class);
		Tup4i t = mock(Tup4i.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4i#getNewInstanceFromArray(int[])} calls
	 * the function {@link Tup4i#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4i newInstance = mock(Tup4i.class);
		Tup4i t = mock(Tup4i.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2, 3, 4})).thenCallRealMethod();

		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2, 3, 4}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2, 3, 4});
		
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t);
	}
}