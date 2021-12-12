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

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple3.Tup3boR;

import org.barghos.core.tuple3.Tup3bo;

/**
 * This class provides component tests for the class {@link Tup3bo}.
 * 
 * @since 1.0.0.0
 */
class Tup3boTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3bo#Tup3bo()} sets the components to false.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertEquals(false, t.x);
		assertEquals(false, t.y);
		assertEquals(false, t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3bo} generated from an existing instance of {@link TupboR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		
		when(original.getArray()).thenReturn(new boolean[] {false, true, false});
		
		Tup3bo t = new Tup3bo(original);
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
		assertEquals(false, t.getZ());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bo} generated from an existing instance of {@link Tup3boR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup3boR original = mock(Tup3boR.class);
		
		when(original.getX()).thenReturn(false);
		when(original.getY()).thenReturn(true);
		when(original.getZ()).thenReturn(false);
		
		Tup3bo t = new Tup3bo(original);
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
		assertEquals(false, t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bo} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3bo t = new Tup3bo(true);
		
		assertEquals(true, t.getX());
		assertEquals(true, t.getY());
		assertEquals(true, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bo} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3bo t = new Tup3bo(new boolean[] {false, true, false});
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
		assertEquals(false, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bo} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3bo t = new Tup3bo(false, true, false);
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
		assertEquals(false, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#setX(boolean)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.setX(true));
		assertEquals(true, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#setY(int)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.setY(true));
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#setZ(int)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup3bo t = new Tup3bo();
		
		assertSame(t, t.setZ(true));
		assertEquals(true, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3bo#set(org.barghos.core.api.tuple3.Tup3boR) Tup3bo.set(Tup3boR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup3bo t = mock(Tup3bo.class);
		
		Tup3boR t2 = mock(Tup3boR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(true);
		when(t2.getZ()).thenReturn(false);
		
		when(t.set(false, true, false)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(false, true, false);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#set(boolean)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bo t = mock(Tup3bo.class);

		when(t.set(true)).thenCallRealMethod();

		when(t.set(true, true, true)).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);

		verify(t).set(true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#set(boolean, boolean, boolean)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3bo t = mock(Tup3bo.class);

		when(t.set(false, true, false)).thenCallRealMethod();

		when(t.setX(false)).thenReturn(t);
		when(t.setY(true)).thenReturn(t);
		when(t.setZ(false)).thenReturn(t);
		
		assertSame(t, t.set(false, true, false));

		verify(t).set(false, true, false);
		
		verify(t).setX(false);
		verify(t).setY(true);
		verify(t).setZ(false);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup3bo t = new Tup3bo(false, true, false);
		
		assertEquals(false, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup3bo t = new Tup3bo(false, true, false);
		
		assertEquals(true, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup3bo t = new Tup3bo(false, true, false);
		
		assertEquals(false, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3bo t = new Tup3bo(false, true, false);

		assertEquals(29822, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3bo original = new Tup3bo(false, true, false);
		Tup3bo t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3boR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(true);
		when(t2.getZ()).thenReturn(false);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3boR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(true);
		when(t2.getZ()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(false);
		when(t2.getByIndex(1)).thenReturn(true);
		when(t2.getByIndex(2)).thenReturn(false);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		when(t2.getByIndex(1)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3bo t1 = new Tup3bo(false, true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		when(t2.getByIndex(1)).thenReturn(true);
		when(t2.getByIndex(2)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup3bo t = new Tup3bo(false, true, false);
		
		assertEquals("tup3bo(x=false, y=true, z=false)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getNewInstance(boolean, boolean, boolean)}
	 * returns a new instance of {@link Tup3bo} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup3bo original = new Tup3bo(false, true, false);
		Tup3bo newInstance = original.getNewInstance(true, false, true);
		
		assertEquals(false, original.getX());
		assertEquals(true, original.getY());
		assertEquals(false, original.getZ());
		assertEquals(true, newInstance.getX());
		assertEquals(false, newInstance.getY());
		assertEquals(true, newInstance.getZ());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bo#getNewInstance(boolean)} calls
	 * the function {@link Tup3bo#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3bo newInstance = mock(Tup3bo.class);
		Tup3bo t = mock(Tup3bo.class);
		
		when(t.getNewInstance(true)).thenCallRealMethod();

		when(t.getNewInstance(true, true, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(true));
		
		verify(t).getNewInstance(true);
		
		verify(t).getNewInstance(true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bo#getNewInstance(Tup3boR)}
	 * returns a new instance of {@link Tup3bo} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3boR original = mock(Tup3boR.class);
		Tup3bo newInstance = mock(Tup3bo.class);
		Tup3bo t = mock(Tup3bo.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(false);
		when(original.getY()).thenReturn(true);
		when(original.getZ()).thenReturn(false);
		when(t.getNewInstance(false, true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(false, true, false);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bo#getNewInstance(TupboR)} calls
	 * the function {@link Tup3bo#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		Tup3bo newInstance = mock(Tup3bo.class);
		Tup3bo t = mock(Tup3bo.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new boolean[] {false, true, false});
		when(t.getNewInstance(false, true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(false, true, false);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bo#getNewInstanceFromArray(boolean[])} calls
	 * the function {@link Tup3bo#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3bo newInstance = mock(Tup3bo.class);
		Tup3bo t = mock(Tup3bo.class);
		
		when(t.getNewInstanceFromArray(new boolean[] {false, true, false})).thenCallRealMethod();

		when(t.getNewInstance(false, true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new boolean[] {false, true, false}));
		
		verify(t).getNewInstanceFromArray(new boolean[] {false, true, false});
		
		verify(t).getNewInstance(false, true, false);
		
		verifyNoMoreInteractions(t);
	}
}