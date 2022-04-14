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

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple3.Tup3bigdR;

import org.barghos.core.tuple3.Tup3bigd;

/**
 * This class provides component tests for the class {@link Tup3bigd}.
 */
class Tup3bigdTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup3bigd#Tup3bigd()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertEquals(BigDecimal.ZERO, t.x);
		assertEquals(BigDecimal.ZERO, t.y);
		assertEquals(BigDecimal.ZERO, t.z);
	}

	/**
	 * This test ensures, that an instance of {@link Tup3bigd} generated from an existing instance of {@link TupbigdR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		
		when(original.toArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
		
		Tup3bigd t = new Tup3bigd(original);
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bigd} generated from an existing instance of {@link Tup3bigdR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup3bigdR original = mock(Tup3bigdR.class);
		
		when(original.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(original.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(original.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		
		Tup3bigd t = new Tup3bigd(original);
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bigd} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.0));
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(1.0), t.getY());
		assertEquals(BigDecimal.valueOf(1.0), t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bigd} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup3bigd t = new Tup3bigd(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup3bigd} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#setX(BigDecimal)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.setX(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#setY(BigDecimal)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.setY(BigDecimal.valueOf(2.2)));
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#setZ(BigDecimal)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setZTest()
	{
		Tup3bigd t = new Tup3bigd();
		
		assertSame(t, t.setZ(BigDecimal.valueOf(3.3)));
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup3bigd#set(org.barghos.core.api.tuple2.Tup3bigdR) Tup3bigd.set(Tup3bigdR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3bigd t = mock(Tup3bigd.class);
		
		Tup3bigdR t2 = mock(Tup3bigdR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.1));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.2));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.3));
		
		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#set(BigDecimal)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigd t = mock(Tup3bigd.class);

		when(t.set(BigDecimal.valueOf(1.1))).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1)));
		
		verify(t).set(BigDecimal.valueOf(1.1));

		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#set(BigDecimal, BigDecimal, BigDecimal)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup3bigd t = mock(Tup3bigd.class);

		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.1))).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2.2))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(3.3))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3)));

		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		verify(t).setX(BigDecimal.valueOf(1.1));
		verify(t).setY(BigDecimal.valueOf(2.2));
		verify(t).setZ(BigDecimal.valueOf(3.3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#getZ()} actually returns the value of the
	 * z component.
	 */
	@Test
	void getZTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));

		assertEquals(348844, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigd#clone()} creates a new instance that satisfies
	 * the requirements for clone-functions.
	 */
	@Test
	void cloneTest()
	{
		Tup3bigd original = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		Tup3bigd t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup3bigdR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		Tup3bigdR t2 = mock(Tup3bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3bigdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		Tup3bigdR t2 = mock(Tup3bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3bigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		Tup3bigdR t2 = mock(Tup3bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup3bigdR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		Tup3bigdR t2 = mock(Tup3bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(3.0));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup3bigd t1 = new Tup3bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup3bigd#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		assertEquals("tup3bigd(x=1.1, y=2.2, z=3.3)", t.toString());
	}
}