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

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple4.Tup4fR;

import org.barghos.core.tuple4.Tup4f;

/**
 * This class provides component tests for the class {@link Tup4f}.
 */
class Tup4fTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4f#Tup4f()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4f t = new Tup4f();
		
		assertEquals(0.0f, t.x);
		assertEquals(0.0f, t.y);
		assertEquals(0.0f, t.z);
		assertEquals(0.0f, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4f} generated from an existing instance of {@link TupfR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		
		when(original.toArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		Tup4f t = new Tup4f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4f} generated from an existing instance of {@link Tup4fR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4fR original = mock(Tup4fR.class);
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		when(original.getZ()).thenReturn(3.0f);
		when(original.getW()).thenReturn(4.0f);
		
		Tup4f t = new Tup4f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4f} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4f t = new Tup4f(1.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(1.0f, t.getY());
		assertEquals(1.0f, t.getZ());
		assertEquals(1.0f, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4f} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4f t = new Tup4f(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4f} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4f t = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		assertEquals(3.0f, t.getZ());
		assertEquals(4.0f, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setX(float)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setX(1.1f));
		assertEquals(1.1f, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setY(float)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setY(2.2f));
		assertEquals(2.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setZ(float)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setZ(3.3f));
		assertEquals(3.3f, t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#setW(float)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setWTest()
	{
		Tup4f t = new Tup4f();
		
		assertSame(t, t.setW(4.4f));
		assertEquals(4.4f, t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4f#set(org.barghos.core.api.tuple2.Tup4fR) Tup4f.set(Tup4fR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4f t = mock(Tup4f.class);
		
		Tup4fR t2 = mock(Tup4fR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.1f);
		when(t2.getY()).thenReturn(2.2f);
		when(t2.getZ()).thenReturn(3.3f);
		when(t2.getW()).thenReturn(4.4f);
		
		when(t.set(1.1f, 2.2f, 3.3f, 4.4f)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1.1f, 2.2f, 3.3f, 4.4f);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#set(float)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4f t = mock(Tup4f.class);

		when(t.set(1.1f)).thenCallRealMethod();

		when(t.set(1.1f, 1.1f, 1.1f, 1.1f)).thenReturn(t);
		
		assertSame(t, t.set(1.1f));
		
		verify(t).set(1.1f);

		verify(t).set(1.1f, 1.1f, 1.1f, 1.1f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#set(float, float, float, float)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4f t = mock(Tup4f.class);

		when(t.set(1.1f, 2.2f, 3.3f, 4.4f)).thenCallRealMethod();

		when(t.setX(1.1f)).thenReturn(t);
		when(t.setY(2.2f)).thenReturn(t);
		when(t.setZ(3.3f)).thenReturn(t);
		when(t.setW(4.4f)).thenReturn(t);
		
		assertSame(t, t.set(1.1f, 2.2f, 3.3f, 4.4f));

		verify(t).set(1.1f, 2.2f, 3.3f, 4.4f);
		
		verify(t).setX(1.1f);
		verify(t).setY(2.2f);
		verify(t).setZ(3.3f);
		verify(t).setW(4.4f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup4f t = new Tup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup4f t = new Tup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(2.2f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getY()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup4f t = new Tup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(3.3f, t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#getW()} actually returns the value of the
	 * w component.
	 */
	@Test
	void getWTest()
	{
		Tup4f t = new Tup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals(4.4f, t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4f t = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);

		assertEquals(-657582207, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4f#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4f original = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		Tup4f t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4fR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t2.getW()).thenReturn(4.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4fR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t2.getW()).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(3.0f);
		when(t2.getByIndex(3)).thenReturn(4.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}

	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4f t1 = new Tup4f(1.0f, 2.0f, 3.0f, 4.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		when(t2.getByIndex(2)).thenReturn(3.0f);
		when(t2.getByIndex(3)).thenReturn(5.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4f#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup4f t = new Tup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		assertEquals("tup4f(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
}