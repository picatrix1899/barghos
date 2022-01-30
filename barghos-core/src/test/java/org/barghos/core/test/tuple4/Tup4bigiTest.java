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

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple4.Tup4bigiR;

import org.barghos.core.tuple4.Tup4bigi;

/**
 * This class provides component tests for the class {@link Tup4bigi}.
 * 
 * @since 1.0.0.0
 */
class Tup4bigiTest
{
	/**
	 * This test ensures, that the constructor {@link Tup4bigi#Tup4bigi()} aktually works and
	 * that the components are set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertEquals(BigInteger.ZERO, t.x);
		assertEquals(BigInteger.ZERO, t.y);
		assertEquals(BigInteger.ZERO, t.z);
		assertEquals(BigInteger.ZERO, t.w);
	}

	/**
	 * This test ensures, that an instance of {@link Tup4bigi} generated from an existing instance of {@link TupbigiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		Tup4bigi t = new Tup4bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigi} generated from an existing instance of {@link TupbigiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup4bigiR original = mock(Tup4bigiR.class);
		
		when(original.getX()).thenReturn(BigInteger.valueOf(1));
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(original.getW()).thenReturn(BigInteger.valueOf(4));
		
		Tup4bigi t = new Tup4bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigi} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
		assertEquals(BigInteger.valueOf(1), t.getZ());
		assertEquals(BigInteger.valueOf(1), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigi} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup4bigi t = new Tup4bigi(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup4bigi} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setX(BigInteger)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setX(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setY(BigInteger)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setY(BigInteger.valueOf(2)));
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setZ(BigInteger)} sets the z component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setZTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setZ(BigInteger.valueOf(3)));
		assertEquals(BigInteger.valueOf(3), t.z);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#setW(BigInteger)} sets the w component on the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setWTest()
	{
		Tup4bigi t = new Tup4bigi();
		
		assertSame(t, t.setW(BigInteger.valueOf(4)));
		assertEquals(BigInteger.valueOf(4), t.w);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup4bigi#set(org.barghos.core.api.tuple2.Tup4bigiR) Tup2bigd.set(Tup4bigiR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup4bigi t = mock(Tup4bigi.class);
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t2.getW()).thenReturn(BigInteger.valueOf(4));
		
		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#set(BigInteger)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigi t = mock(Tup4bigi.class);

		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.valueOf(1)));
		
		verify(t).set(BigInteger.valueOf(1));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#set(BigInteger, BigInteger, BigInteger, BigInteger)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup4bigi t = mock(Tup4bigi.class);

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		when(t.setZ(BigInteger.valueOf(3))).thenReturn(t);
		when(t.setW(BigInteger.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verify(t).setX(BigInteger.valueOf(1));
		verify(t).setY(BigInteger.valueOf(2));
		verify(t).setZ(BigInteger.valueOf(3));
		verify(t).setW(BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(4), t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		assertEquals(955331, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup4bigi original = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		Tup4bigi t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4bigiR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t2.getW()).thenReturn(BigInteger.valueOf(4));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingZTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingWTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(4));
		when(t2.getW()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(3));
		when(t2.getByIndex(3)).thenReturn(BigInteger.valueOf(4));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		Tup4bigi t1 = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(4));
		when(t2.getByIndex(3)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup4bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup4bigi t = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals("tup4bigi(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)}
	 * returns a new instance of {@link Tup4bigi} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup4bigi original = new Tup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		Tup4bigi newInstance = original.getNewInstance(BigInteger.valueOf(3), BigInteger.valueOf(4), BigInteger.valueOf(5), BigInteger.valueOf(6));
		
		assertEquals(BigInteger.valueOf(1), original.getX());
		assertEquals(BigInteger.valueOf(2), original.getY());
		assertEquals(BigInteger.valueOf(3), original.getZ());
		assertEquals(BigInteger.valueOf(4), original.getW());
		assertEquals(BigInteger.valueOf(3), newInstance.getX());
		assertEquals(BigInteger.valueOf(4), newInstance.getY());
		assertEquals(BigInteger.valueOf(5), newInstance.getZ());
		assertEquals(BigInteger.valueOf(6), newInstance.getW());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigi#getNewInstance(BigInteger)} calls
	 * the function {@link Tup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bigi newInstance = mock(Tup4bigi.class);
		Tup4bigi t = mock(Tup4bigi.class);
		
		when(t.getNewInstance(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.valueOf(1)));
		
		verify(t).getNewInstance(BigInteger.valueOf(1));
		
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigi#getNewInstance(Tup4bigiR)}
	 * returns a new instance of {@link Tup4bigi} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bigiR original = mock(Tup4bigiR.class);
		Tup4bigi newInstance = mock(Tup4bigi.class);
		Tup4bigi t = mock(Tup4bigi.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.valueOf(1));
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(original.getW()).thenReturn(BigInteger.valueOf(4));
		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigi#getNewInstance(TupbigiR)} calls
	 * the function {@link Tup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		Tup4bigi newInstance = mock(Tup4bigi.class);
		Tup4bigi t = mock(Tup4bigi.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigi#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link Tup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bigi newInstance = mock(Tup4bigi.class);
		Tup4bigi t = mock(Tup4bigi.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
}