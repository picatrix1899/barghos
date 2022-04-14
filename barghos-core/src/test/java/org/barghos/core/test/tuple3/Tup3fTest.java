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

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fR;

import org.barghos.core.tuple3.Tup3f;

/**
 * This class provides component tests for the class {@link Tup3f}.
 */
class Tup3fTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3f#Tup3f()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3f t = new Tup3f();
		
		assertEquals(0.0f, t.x);
		assertEquals(0.0f, t.y);
		assertEquals(0.0f, t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3f} generated from an existing instance of {@link TupfR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		
		when(original.toArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f});
		
		Tup3f t = new Tup3f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3f} generated from an existing instance of {@link Tup3fR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup3fR original = mock(Tup3fR.class);
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		when(original.getZ()).thenReturn(3.0f);
		
		Tup3f t = new Tup3f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3f} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3f t = new Tup3f(1.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(1.0f, t.getY());
		assertEquals(1.0f, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3f} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3f t = new Tup3f(new float[] {1.0f, 2.0f, 3.0f});
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3f} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3f t = new Tup3f(1.0f, 2.0f, 3.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#setX(float)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.setX(1.1f));
		assertEquals(1.1f, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#setY(float)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.setY(2.2f));
		assertEquals(2.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#setZ(float)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup3f t = new Tup3f();
		
		assertSame(t, t.setZ(3.3f));
		assertEquals(3.3f, t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3f#set(org.barghos.core.api.tuple2.Tup3fR) Tup3f.set(Tup3fR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3f t = mock(Tup3f.class);
		
		Tup3fR t2 = mock(Tup3fR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.1f);
		when(t2.getY()).thenReturn(2.2f);
		when(t2.getZ()).thenReturn(3.3f);
		
		when(t.set(1.1f, 2.2f, 3.3f)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1.1f, 2.2f, 3.3f);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#set(float)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3f t = mock(Tup3f.class);

		when(t.set(1.1f)).thenCallRealMethod();

		when(t.set(1.1f, 1.1f, 1.1f)).thenReturn(t);
		
		assertSame(t, t.set(1.1f));
		
		verify(t).set(1.1f);

		verify(t).set(1.1f, 1.1f, 1.1f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#set(float, float, float)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3f t = mock(Tup3f.class);

		when(t.set(1.1f, 2.2f, 3.3f)).thenCallRealMethod();

		when(t.setX(1.1f)).thenReturn(t);
		when(t.setY(2.2f)).thenReturn(t);
		when(t.setZ(3.3f)).thenReturn(t);
		
		assertSame(t, t.set(1.1f, 2.2f, 3.3f));

		verify(t).set(1.1f, 2.2f, 3.3f);
		
		verify(t).setX(1.1f);
		verify(t).setY(2.2f);
		verify(t).setZ(3.3f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup3f t = new Tup3f(1.1f, 2.2f, 3.3f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup3f t = new Tup3f(1.1f, 2.2f, 3.3f);
		
		assertEquals(2.2f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup3f t = new Tup3f(1.1f, 2.2f, 3.3f);
		
		assertEquals(3.3f, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3f t = new Tup3f(1.0f, 2.0f, 3.0f);

		assertEquals(1606448223, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3f#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup3f original = new Tup3f(1.0f, 2.0f, 3.0f);
		Tup3f t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3fR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		Tup3fR t2 = mock(Tup3fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3fR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingXTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		Tup3fR t2 = mock(Tup3fR.class);
		
		when(t2.getX()).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3fR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingYTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		Tup3fR t2 = mock(Tup3fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3fR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple3_VaryingZTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		Tup3fR t2 = mock(Tup3fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(3.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3f t1 = new Tup3f(1.0f, 2.0f, 3.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3f#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup3f t = new Tup3f(1.1f, 2.2f, 3.3f);
		
		assertEquals("tup3f(x=1.1, y=2.2, z=3.3)", t.toString());
	}
}