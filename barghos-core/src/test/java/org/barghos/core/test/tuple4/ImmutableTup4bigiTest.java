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

/*
MIT License

Copyright (c) 2020 picatrix1899 (Florian Zilkenat)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.test.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple4.Tup4bigiR;

import org.barghos.core.tuple4.ImmutableTup4bigi;

/**
 * This class provides component tests for the class {@link ImmutableTup4bigi}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup4bigiTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bigi} generated from an existing instance of {@link TupbigiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});
		
		ImmutableTup4bigi t = new ImmutableTup4bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bigi} generated from an existing instance of {@link Tup4bigiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple4Test()
	{
		Tup4bigiR original = mock(Tup4bigiR.class);
		
		when(original.getX()).thenReturn(BigInteger.valueOf(1));
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(original.getW()).thenReturn(BigInteger.valueOf(4));
		
		ImmutableTup4bigi t = new ImmutableTup4bigi(original);
		
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
	 * This test ensures, that an instance of {@link ImmutableTup4bigi} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
		assertEquals(BigInteger.valueOf(1), t.getZ());
		assertEquals(BigInteger.valueOf(1), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bigi} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup4bigi} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(BigInteger.valueOf(4), t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#getZ()} actually returns the value of the
	 * z component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getZTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(3), t.getZ());
		assertEquals(t.z, t.getZ());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#getW()} actually returns the value of the
	 * w component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getWTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(3), t.getW());
		assertEquals(t.w, t.getW());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		assertEquals(30817, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup4bigi original = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		ImmutableTup4bigi t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup4bigiR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple4Test()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t2.getW()).thenReturn(BigInteger.valueOf(4));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingXTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingYTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingZTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup4bigiR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple4_VaryingWTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t2.getW()).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(4);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(3));
		when(t2.getByIndex(3)).thenReturn(BigInteger.valueOf(4));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the z component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingZTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the w component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingWTest()
	{
		ImmutableTup4bigi t1 = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(3));
		when(t2.getByIndex(3)).thenReturn(BigInteger.valueOf(5));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup4bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup4bigi t = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals("immutableTup4bigi(x=1, y=2, z=3, w=4)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)}
	 * returns a new instance of {@link ImmutableTup3bigi} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup4bigi original = new ImmutableTup4bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		ImmutableTup4bigi newInstance = original.getNewInstance(BigInteger.valueOf(3), BigInteger.valueOf(4), BigInteger.valueOf(5), BigInteger.valueOf(6));
		
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
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4bigi#getNewInstance(BigInteger)} calls
	 * the function {@link ImmutableTup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup4bigi newInstance = mock(ImmutableTup4bigi.class);
		ImmutableTup4bigi t = mock(ImmutableTup4bigi.class);
		
		when(t.getNewInstance(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.valueOf(1)));
		
		verify(t).getNewInstance(BigInteger.valueOf(1));
		
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup4bigi#getNewInstance(Tup4bigiR)}
	 * returns a new instance of {@link ImmutableTup4bigi} with the given values.
	 */
	@Test
	void getNewInstance_Tuple3Test()
	{
		Tup4bigiR original = mock(Tup4bigiR.class);
		ImmutableTup4bigi newInstance = mock(ImmutableTup4bigi.class);
		ImmutableTup4bigi t = mock(ImmutableTup4bigi.class);
		
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
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4bigi#getNewInstance(TupbigiR)} calls
	 * the function {@link ImmutableTup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		ImmutableTup4bigi newInstance = mock(ImmutableTup4bigi.class);
		ImmutableTup4bigi t = mock(ImmutableTup4bigi.class);
		
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
	 * This test ensures, that the default implementation of the function {@link ImmutableTup4bigi#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link ImmutableTup4bigi#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup4bigi newInstance = mock(ImmutableTup4bigi.class);
		ImmutableTup4bigi t = mock(ImmutableTup4bigi.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
}