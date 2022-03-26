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

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple4.Tup4dR;

import org.barghos.core.tuple4.Tup4d;

/**
 * This class provides component tests for the class {@link Tup4d}.
 */
class Tup4dTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4d#Tup4d()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4d t = new Tup4d();
		
		assertEquals(0.0, t.x);
		assertEquals(0.0, t.y);
		assertEquals(0.0, t.z);
		assertEquals(0.0, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4d} generated from an existing instance of {@link TupdR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		
		when(original.getArray()).thenReturn(new double[] {1.0, 2.0, 3.0, 4.0});
		
		Tup4d t = new Tup4d(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		assertEquals(4.0, t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4d} generated from an existing instance of {@link Tup4dR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4dR original = mock(Tup4dR.class);
		
		when(original.getX()).thenReturn(1.0);
		when(original.getY()).thenReturn(2.0);
		when(original.getZ()).thenReturn(3.0);
		when(original.getW()).thenReturn(4.0);
		
		Tup4d t = new Tup4d(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		assertEquals(4.0, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4d} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4d t = new Tup4d(1.0);
		
		assertEquals(1.0, t.getX());
		assertEquals(1.0, t.getY());
		assertEquals(1.0, t.getZ());
		assertEquals(1.0, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4d} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4d t = new Tup4d(new double[] {1.0, 2.0, 3.0, 4.0});
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		assertEquals(4.0, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4d} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4d t = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		assertEquals(3.0, t.getZ());
		assertEquals(4.0, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setX(double)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setX(1.1));
		assertEquals(1.1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setY(double)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setY(2.2));
		assertEquals(2.2, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setZ(double)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setZ(3.3));
		assertEquals(3.3, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#setW(double)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setWTest()
	{
		Tup4d t = new Tup4d();
		
		assertSame(t, t.setW(4.4));
		assertEquals(4.4, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4d#set(org.barghos.core.api.tuple2.Tup4dR) Tup4d.set(Tup4dR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4d t = mock(Tup4d.class);
		
		Tup4dR t2 = mock(Tup4dR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.1);
		when(t2.getY()).thenReturn(2.2);
		when(t2.getZ()).thenReturn(3.3);
		when(t2.getW()).thenReturn(4.4);
		
		when(t.set(1.1, 2.2, 3.3, 4.4)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1.1, 2.2, 3.3, 4.4);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#set(double)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4d t = mock(Tup4d.class);

		when(t.set(1.1)).thenCallRealMethod();

		when(t.set(1.1, 1.1, 1.1, 1.1)).thenReturn(t);
		
		assertSame(t, t.set(1.1));
		
		verify(t).set(1.1);

		verify(t).set(1.1, 1.1, 1.1, 1.1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#set(double, double, double, double)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4d t = mock(Tup4d.class);

		when(t.set(1.1, 2.2, 3.3, 4.4)).thenCallRealMethod();

		when(t.setX(1.1)).thenReturn(t);
		when(t.setY(2.2)).thenReturn(t);
		when(t.setZ(3.3)).thenReturn(t);
		when(t.setW(4.4)).thenReturn(t);
		
		assertSame(t, t.set(1.1, 2.2, 3.3, 4.4));

		verify(t).set(1.1, 2.2, 3.3, 4.4);
		
		verify(t).setX(1.1);
		verify(t).setY(2.2);
		verify(t).setZ(3.3);
		verify(t).setW(4.4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup4d t = new Tup4d(1.1, 2.2, 3.3, 4.4);
		
		assertEquals(1.1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup4d t = new Tup4d(1.1, 2.2, 3.3, 4.4);
		
		assertEquals(2.2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getY()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup4d t = new Tup4d(1.1, 2.2, 3.3, 4.4);
		
		assertEquals(3.3, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		Tup4d t = new Tup4d(1.1, 2.2, 3.3, 4.4);
		
		assertEquals(4.4, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4d t = new Tup4d(1.0, 2.0, 3.0, 4.0);

		assertEquals(-1155131519, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4d#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4d original = new Tup4d(1.0, 2.0, 3.0, 4.0);
		Tup4d t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4dR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		Tup4dR t2 = mock(Tup4dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(3.0);
		when(t2.getW()).thenReturn(4.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4dR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		Tup4dR t2 = mock(Tup4dR.class);
		
		when(t2.getX()).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4dR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		Tup4dR t2 = mock(Tup4dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4dR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		Tup4dR t2 = mock(Tup4dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4dR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		Tup4dR t2 = mock(Tup4dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(3.0);
		when(t2.getW()).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(2.0);
		when(t2.getByIndex(2)).thenReturn(3.0);
		when(t2.getByIndex(3)).thenReturn(4.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}

	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(2.0);
		when(t2.getByIndex(2)).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4d t1 = new Tup4d(1.0, 2.0, 3.0, 4.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(2.0);
		when(t2.getByIndex(2)).thenReturn(3.0);
		when(t2.getByIndex(3)).thenReturn(5.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4d#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup4d t = new Tup4d(1.1, 2.2, 3.3, 4.4);
		
		assertEquals("tup4d(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
}