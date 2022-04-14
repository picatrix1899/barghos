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

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple3.Tup3dR;

import org.barghos.core.tuple3.Tup3d;

/**
 * This class provides component tests for the class {@link Tup3d}.
 */
class Tup3dTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3d#Tup3d()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3d t = new Tup3d();
		
		assertEquals(0.0, t.x);
		assertEquals(0.0, t.y);
		assertEquals(0.0, t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3d} generated from an existing instance of {@link TupdR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		
		when(original.toArray()).thenReturn(new double[] {1.0, 2.0, 3.0});
		
		Tup3d t = new Tup3d(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3d} generated from an existing instance of {@link Tup3dR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup3dR original = mock(Tup3dR.class);
		
		when(original.getX()).thenReturn(1.0);
		when(original.getY()).thenReturn(2.0);
		when(original.getZ()).thenReturn(3.0);
		
		Tup3d t = new Tup3d(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3d} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3d t = new Tup3d(1.0);
		
		assertEquals(1.0, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals(1.0, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3d} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3d t = new Tup3d(new double[] {1.0, 2.0, 3.0});
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3d} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3d t = new Tup3d(1.0, 2.0, 3.0);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#setX(double)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.setX(1.1));
		assertEquals(1.1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#setY(double)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.setY(2.2));
		assertEquals(2.2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#setZ(double)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup3d t = new Tup3d();
		
		assertSame(t, t.setZ(3.3));
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3d#set(org.barghos.core.api.tuple2.Tup3dR) Tup3d.set(Tup3dR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3d t = mock(Tup3d.class);
		
		Tup3dR t2 = mock(Tup3dR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.1);
		when(t2.getY()).thenReturn(2.2);
		when(t2.getZ()).thenReturn(3.3);
		
		when(t.set(1.1, 2.2, 3.3)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1.1, 2.2, 3.3);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#set(double)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3d t = mock(Tup3d.class);

		when(t.set(1.1)).thenCallRealMethod();

		when(t.set(1.1, 1.1, 1.1)).thenReturn(t);
		
		assertSame(t, t.set(1.1));
		
		verify(t).set(1.1);

		verify(t).set(1.1, 1.1, 1.1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#set(double, double, double)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3d t = mock(Tup3d.class);

		when(t.set(1.1, 2.2, 3.3)).thenCallRealMethod();

		when(t.setX(1.1)).thenReturn(t);
		when(t.setY(2.2)).thenReturn(t);
		when(t.setZ(3.3)).thenReturn(t);
		
		assertSame(t, t.set(1.1, 2.2, 3.3));

		verify(t).set(1.1, 2.2, 3.3);
		
		verify(t).setX(1.1);
		verify(t).setY(2.2);
		verify(t).setZ(3.3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup3d t = new Tup3d(1.1, 2.2, 3.3);
		
		assertEquals(1.1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup3d t = new Tup3d(1.1, 2.2, 3.3);
		
		assertEquals(2.2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#getY()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup3d t = new Tup3d(1.1, 2.2, 3.3);
		
		assertEquals(3.3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3d t = new Tup3d(1.0, 2.0, 3.0);

		assertEquals(66614367, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3d#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3d original = new Tup3d(1.0, 2.0, 3.0);
		Tup3d t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3dR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		Tup3dR t2 = mock(Tup3dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(3.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3dR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		Tup3dR t2 = mock(Tup3dR.class);
		
		when(t2.getX()).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3dR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		Tup3dR t2 = mock(Tup3dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3dR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		Tup3dR t2 = mock(Tup3dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(2.0);
		when(t2.getByIndex(2)).thenReturn(3.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}

	/**
	 * This test ensures, that the {@link Tup3d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3d t1 = new Tup3d(1.0, 2.0, 3.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(2.0);
		when(t2.getByIndex(2)).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3d#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup3d t = new Tup3d(1.1, 2.2, 3.3);
		
		assertEquals("tup3d(x=1.1, y=2.2, z=3.3)", t.toString());
	}
}