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

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple4.Tup4bigdR;

import org.barghos.core.tuple4.Tup4bigd;

/**
 * This class provides component tests for the class {@link Tup4bigd}.
 * 
 * @since 1.0.0.0
 */
class Tup4bigdTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup4bigd#Tup4bigd()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertEquals(BigDecimal.ZERO, t.x);
		assertEquals(BigDecimal.ZERO, t.y);
		assertEquals(BigDecimal.ZERO, t.z);
		assertEquals(BigDecimal.ZERO, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4bigd} generated from an existing instance of {@link TupbigdR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
		
		Tup4bigd t = new Tup4bigd(original);
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
		assertEquals(BigDecimal.valueOf(4.0), t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigd} generated from an existing instance of {@link Tup4bigdR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple3Test()
	{
		Tup4bigdR original = mock(Tup4bigdR.class);
		
		when(original.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(original.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(original.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(original.getW()).thenReturn(BigDecimal.valueOf(4.0));
		
		Tup4bigd t = new Tup4bigd(original);
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
		assertEquals(BigDecimal.valueOf(4.0), t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigd} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.0));
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(1.0), t.getY());
		assertEquals(BigDecimal.valueOf(1.0), t.getZ());
		assertEquals(BigDecimal.valueOf(1.0), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigd} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4bigd t = new Tup4bigd(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
		assertEquals(BigDecimal.valueOf(4.0), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigd} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
		assertEquals(BigDecimal.valueOf(4.0), t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setX(BigDecimal)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setX(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setY(BigDecimal)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setY(BigDecimal.valueOf(2.2)));
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setZ(BigDecimal)} sets the z component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setZ(BigDecimal.valueOf(3.3)));
		assertEquals(BigDecimal.valueOf(3.3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#setW(BigDecimal)} sets the w component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4bigd t = new Tup4bigd();
		
		assertSame(t, t.setW(BigDecimal.valueOf(4.4)));
		assertEquals(BigDecimal.valueOf(4.4), t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4bigd#set(org.barghos.core.api.tuple2.Tup4bigdR) Tup4bigd.set(Tup4bigdR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4bigd t = mock(Tup4bigd.class);
		
		Tup4bigdR t2 = mock(Tup4bigdR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.1));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.2));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.3));
		when(t2.getW()).thenReturn(BigDecimal.valueOf(4.4));
		
		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#set(BigDecimal)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigd t = mock(Tup4bigd.class);

		when(t.set(BigDecimal.valueOf(1.1))).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1)));
		
		verify(t).set(BigDecimal.valueOf(1.1));

		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#set(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4bigd t = mock(Tup4bigd.class);

		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.1))).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2.2))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(3.3))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(4.4))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4)));

		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		verify(t).setX(BigDecimal.valueOf(1.1));
		verify(t).setY(BigDecimal.valueOf(2.2));
		verify(t).setZ(BigDecimal.valueOf(3.3));
		verify(t).setZ(BigDecimal.valueOf(4.4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals(BigDecimal.valueOf(4.4), t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));

		assertEquals(348844, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#clone()} creates a new instance that satisfies
	 * the requirements for clone-functions.
	 */
	@Test
	void cloneTest()
	{
		Tup4bigd original = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		Tup4bigd t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4bigdR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple3Test()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(t2.getW()).thenReturn(BigDecimal.valueOf(4.0));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(t2.getW()).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(3);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(3.0));
		when(t2.getByIndex(3)).thenReturn(BigDecimal.valueOf(4.0));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4bigd t1 = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(3.0));
		when(t2.getByIndex(3)).thenReturn(BigDecimal.valueOf(5.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigd#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4bigd t = new Tup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		assertEquals("tup4bigd(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}
	 * returns a new instance of {@link Tup4bigd} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4bigd original = new Tup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		Tup4bigd newInstance = original.getNewInstance(BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0));
		
		assertEquals(BigDecimal.valueOf(1.0), original.getX());
		assertEquals(BigDecimal.valueOf(2.0), original.getY());
		assertEquals(BigDecimal.valueOf(3.0), original.getZ());
		assertEquals(BigDecimal.valueOf(4.0), original.getW());
		assertEquals(BigDecimal.valueOf(3.0), newInstance.getX());
		assertEquals(BigDecimal.valueOf(4.0), newInstance.getY());
		assertEquals(BigDecimal.valueOf(5.0), newInstance.getZ());
		assertEquals(BigDecimal.valueOf(6.0), newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigd#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup4bigd#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bigd newInstance = mock(Tup4bigd.class);
		Tup4bigd t = mock(Tup4bigd.class);
		
		when(t.getNewInstance(BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.valueOf(1.0)));
		
		verify(t).getNewInstance(BigDecimal.valueOf(1.0));
		
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigd#getNewInstance(Tup4bigdR)}
	 * returns a new instance of {@link Tup4bigd} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bigdR original = mock(Tup4bigdR.class);
		Tup4bigd newInstance = mock(Tup4bigd.class);
		Tup4bigd t = mock(Tup4bigd.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(original.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(original.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(original.getW()).thenReturn(BigDecimal.valueOf(4.0));
		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigd#getNewInstance(TupbigdR)} calls
	 * the function {@link Tup4bigd#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		Tup4bigd newInstance = mock(Tup4bigd.class);
		Tup4bigd t = mock(Tup4bigd.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigd#getNewInstanceFromArray(BigDecimal[])} calls
	 * the function {@link Tup4bigd#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bigd newInstance = mock(Tup4bigd.class);
		Tup4bigd t = mock(Tup4bigd.class);
		
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)})).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)}));
		
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
		
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		verifyNoMoreInteractions(t);
	}
}