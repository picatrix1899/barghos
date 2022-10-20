///*******************************************************************************
// * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
// * 
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// * 
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// * 
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// ******************************************************************************/
//
//package org.barghos.core.test.tuple3;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.tuple3.Tup3i;
//import org.barghos.tuple.api.tn.TupiR;
//import org.barghos.tuple.api.tn3.Tup3iR;
//
///**
// * This class provides component tests for the class {@link Tup3i}.
// */
//class Tup3iTest
//{
//	/**
//	 * This test ensures, that the default constructor {@link Tup3i#Tup3i()} sets the components to 0.
//	 */
//	@Test
//	void ctor_DefaultTest()
//	{
//		Tup3i t = new Tup3i();
//		
//		assertEquals(0, t.x);
//		assertEquals(0, t.y);
//		assertEquals(0, t.z);
//	}
//
//	/**
//	 * This test ensures, that an instance of {@link Tup3i} generated from an existing instance of {@link TupiR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupiR original = mock(TupiR.class);
//		
//		when(original.toArray()).thenReturn(new int[] {1, 2, 3});
//		
//		Tup3i t = new Tup3i(original);
//		
//		assertEquals(1, t.getX());
//		assertEquals(2, t.getY());
//		assertEquals(3, t.getZ());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3i} generated from an existing instance of {@link Tup3iR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		Tup3iR original = mock(Tup3iR.class);
//		
//		when(original.getX()).thenReturn(1);
//		when(original.getY()).thenReturn(2);
//		when(original.getZ()).thenReturn(3);
//		
//		Tup3i t = new Tup3i(original);
//		
//		assertEquals(1, t.getX());
//		assertEquals(2, t.getY());
//		assertEquals(3, t.getZ());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3i} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		Tup3i t = new Tup3i(1);
//		
//		assertEquals(1, t.getX());
//		assertEquals(1, t.getY());
//		assertEquals(1, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3i} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		Tup3i t = new Tup3i(new int[] {1, 2, 3});
//		
//		assertEquals(1, t.getX());
//		assertEquals(2, t.getY());
//		assertEquals(3, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3i} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		Tup3i t = new Tup3i(1, 2, 3);
//		
//		assertEquals(1, t.getX());
//		assertEquals(2, t.getY());
//		assertEquals(3, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#setX(int)} sets the x component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setXTest()
//	{
//		Tup3i t = new Tup3i();
//		
//		assertSame(t, t.setX(1));
//		assertEquals(1, t.x);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#setY(int)} sets the y component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setYTest()
//	{
//		Tup3i t = new Tup3i();
//		
//		assertSame(t, t.setY(2));
//		assertEquals(2, t.y);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#setZ(int)} sets the z component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setZTest()
//	{
//		Tup3i t = new Tup3i();
//		
//		assertSame(t, t.setZ(3));
//		assertEquals(3, t.z);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link Tup3i#set(org.barghos.core.api.tuple2.Tup3iR) Tup3i.set(Tup3iR)}
//	 * adopts the components from the input tuple and returns the current tuple.
//	 */
//	@Test
//	void set_Tuple3Test()
//	{
//		Tup3i t = mock(Tup3i.class);
//		
//		Tup3iR t2 = mock(Tup3iR.class);
//	
//		when(t.set(t2)).thenCallRealMethod();
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(2);
//		when(t2.getZ()).thenReturn(3);
//		
//		when(t.set(1, 2, 3)).thenReturn(t);
//		
//		assertSame(t, t.set(t2));
//		
//		verify(t).set(t2);
//		
//		verify(t2).getX();
//		verify(t2).getY();
//		verify(t2).getZ();
//		verify(t).set(1, 2, 3);
//		
//		verifyNoMoreInteractions(t, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#set(int)} sets the components
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void set_ValueTest()
//	{
//		Tup3i t = mock(Tup3i.class);
//
//		when(t.set(1)).thenCallRealMethod();
//
//		when(t.set(1, 1, 1)).thenReturn(t);
//		
//		assertSame(t, t.set(1));
//		
//		verify(t).set(1);
//
//		verify(t).set(1, 1, 1);
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#set(int, int, int)} set the components
//	 * to the respective parameters and returns the current tuple.
//	 */
//	@Test
//	void set_ComponentsTest()
//	{
//		Tup3i t = mock(Tup3i.class);
//
//		when(t.set(1, 2, 3)).thenCallRealMethod();
//
//		when(t.setX(1)).thenReturn(t);
//		when(t.setY(2)).thenReturn(t);
//		when(t.setZ(3)).thenReturn(t);
//		
//		assertSame(t, t.set(1, 2, 3));
//
//		verify(t).set(1, 2, 3);
//		
//		verify(t).setX(1);
//		verify(t).setY(2);
//		verify(t).setZ(3);
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		Tup3i t = new Tup3i(1, 2, 3);
//		
//		assertEquals(1, t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		Tup3i t = new Tup3i(1, 2, 3);
//		
//		assertEquals(2, t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		Tup3i t = new Tup3i(1, 2, 3);
//		
//		assertEquals(3, t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		Tup3i t = new Tup3i(1, 2, 3);
//
//		assertEquals(30817, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3i#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		Tup3i original = new Tup3i(1, 2, 3);
//		Tup3i t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3iR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple3Test()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(2);
//		when(t2.getZ()).thenReturn(3);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3iR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingXTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		when(t2.getX()).thenReturn(4);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3iR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingYTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(4);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3iR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingZTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		Tup3iR t2 = mock(Tup3iR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(2);
//		when(t2.getZ()).thenReturn(4);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		TupiR t2 = mock(TupiR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(1);
//		when(t2.getByIndex(1)).thenReturn(2);
//		when(t2.getByIndex(2)).thenReturn(3);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupiR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		TupiR t2 = mock(TupiR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		TupiR t2 = mock(TupiR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(4);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		TupiR t2 = mock(TupiR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(1);
//		when(t2.getByIndex(1)).thenReturn(4);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		Tup3i t1 = new Tup3i(1, 2, 3);
//		
//		TupiR t2 = mock(TupiR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(1);
//		when(t2.getByIndex(1)).thenReturn(2);
//		when(t2.getByIndex(2)).thenReturn(4);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3i#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		Tup3i t = new Tup3i(1, 2, 3);
//		
//		assertEquals("tup3i(x=1, y=2, z=3)", t.toString());
//	}
//}