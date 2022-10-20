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
//package org.barghos.core.test.tuple4;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.api.tuple4.org;
//import org.barghos.core.tuple4.Tup4bo;
//import org.barghos.tuple.api.t4.Tup4boR;
//import org.barghos.tuple.api.tn.TupboR;
//
///**
// * This class provides component tests for the class {@link Tup4bo}.
// */
//class Tup4boTest
//{
//	/**
//	 * This test ensures, that the default constructor {@link Tup4bo#Tup4bo()} sets the components to false.
//	 */
//	@Test
//	void ctor_DefaultTest()
//	{
//		Tup4bo t = new Tup4bo();
//		
//		assertEquals(false, t.x);
//		assertEquals(false, t.y);
//		assertEquals(false, t.z);
//		assertEquals(false, t.w);
//	}
//
//	/**
//	 * This test ensures, that an instance of {@link Tup4bo} generated from an existing instance of {@link TupboR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupboR original = mock(TupboR.class);
//		
//		when(original.toArray()).thenReturn(new boolean[] {false, true, false, true});
//		
//		Tup4bo t = new Tup4bo(original);
//		
//		assertEquals(false, t.getX());
//		assertEquals(true, t.getY());
//		assertEquals(false, t.getZ());
//		assertEquals(true, t.getW());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup4bo} generated from an existing instance of {@link Tup4boR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple3Test()
//	{
//		Tup4boR original = mock(Tup4boR.class);
//		
//		when(original.getX()).thenReturn(false);
//		when(original.getY()).thenReturn(true);
//		when(original.getZ()).thenReturn(false);
//		when(original.getW()).thenReturn(true);
//		
//		Tup4bo t = new Tup4bo(original);
//		
//		assertEquals(false, t.getX());
//		assertEquals(true, t.getY());
//		assertEquals(false, t.getZ());
//		assertEquals(true, t.getW());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		verify(original).getW();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup4bo} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		Tup4bo t = new Tup4bo(true);
//		
//		assertEquals(true, t.getX());
//		assertEquals(true, t.getY());
//		assertEquals(true, t.getZ());
//		assertEquals(true, t.getW());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup4bo} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		Tup4bo t = new Tup4bo(new boolean[] {false, true, false, true});
//		
//		assertEquals(false, t.getX());
//		assertEquals(true, t.getY());
//		assertEquals(false, t.getZ());
//		assertEquals(true, t.getW());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup4bo} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//		
//		assertEquals(false, t.getX());
//		assertEquals(true, t.getY());
//		assertEquals(false, t.getZ());
//		assertEquals(true, t.getW());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#setX(boolean)} sets the x component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setXTest()
//	{
//		Tup4bo t = new Tup4bo();
//		
//		assertSame(t, t.setX(true));
//		assertEquals(true, t.x);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#setY(boolean)} sets the y component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setYTest()
//	{
//		Tup4bo t = new Tup4bo();
//		
//		assertSame(t, t.setY(true));
//		assertEquals(true, t.y);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#setZ(boolean)} sets the z component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setZTest()
//	{
//		Tup4bo t = new Tup4bo();
//		
//		assertSame(t, t.setZ(true));
//		assertEquals(true, t.z);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#setW(boolean)} sets the z component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setWTest()
//	{
//		Tup4bo t = new Tup4bo();
//		
//		assertSame(t, t.setW(true));
//		assertEquals(true, t.w);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link Tup4bo#set(org.barghos.core.api.tuple3.Tup4boR) Tup4bo.set(Tup4boR)}
//	 * adopts the components from the input tuple and returns the current tuple.
//	 */
//	@Test
//	void set_CloneTest()
//	{
//		Tup4bo t = mock(Tup4bo.class);
//		
//		Tup4boR t2 = mock(Tup4boR.class);
//	
//		when(t.set(t2)).thenCallRealMethod();
//		
//		when(t2.getX()).thenReturn(false);
//		when(t2.getY()).thenReturn(true);
//		when(t2.getZ()).thenReturn(false);
//		when(t2.getW()).thenReturn(true);
//		
//		when(t.set(false, true, false, true)).thenReturn(t);
//		
//		assertSame(t, t.set(t2));
//		
//		verify(t).set(t2);
//		
//		verify(t2).getX();
//		verify(t2).getY();
//		verify(t2).getZ();
//		verify(t2).getW();
//		verify(t).set(false, true, false, true);
//		
//		verifyNoMoreInteractions(t, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#set(boolean)} sets the components
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void set_ValueTest()
//	{
//		Tup4bo t = mock(Tup4bo.class);
//
//		when(t.set(true)).thenCallRealMethod();
//
//		when(t.set(true, true, true, true)).thenReturn(t);
//		
//		assertSame(t, t.set(true));
//		
//		verify(t).set(true);
//
//		verify(t).set(true, true, true, true);
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#set(boolean, boolean, boolean, boolean)} set the components
//	 * to the respective parameters and returns the current tuple.
//	 */
//	@Test
//	void set_ComponentsTest()
//	{
//		Tup4bo t = mock(Tup4bo.class);
//
//		when(t.set(false, true, false, true)).thenCallRealMethod();
//
//		when(t.setX(false)).thenReturn(t);
//		when(t.setY(true)).thenReturn(t);
//		when(t.setZ(false)).thenReturn(t);
//		when(t.setW(true)).thenReturn(t);
//		
//		assertSame(t, t.set(false, true, false, true));
//
//		verify(t).set(false, true, false, true);
//		
//		verify(t).setX(false);
//		verify(t).setY(true);
//		verify(t).setZ(false);
//		verify(t).setW(true);
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//		
//		assertEquals(false, t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//		
//		assertEquals(true, t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//		
//		assertEquals(false, t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#getW()} actually returns the value of the
//	 * w component.
//	 */
//	@Test
//	void getWTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//		
//		assertEquals(true, t.getW());
//		assertEquals(t.w, t.getW());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//
//		assertEquals(924483, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup4bo#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		Tup4bo original = new Tup4bo(false, true, false, true);
//		Tup4bo t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup4boR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple3Test()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		Tup4boR t2 = mock(Tup4boR.class);
//		
//		when(t2.getX()).thenReturn(false);
//		when(t2.getY()).thenReturn(true);
//		when(t2.getZ()).thenReturn(false);
//		when(t2.getW()).thenReturn(true);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		Tup4boR t2 = mock(Tup4boR.class);
//		
//		when(t2.getX()).thenReturn(true);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		Tup4boR t2 = mock(Tup4boR.class);
//		
//		when(t2.getX()).thenReturn(false);
//		when(t2.getY()).thenReturn(false);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingZTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		Tup4boR t2 = mock(Tup4boR.class);
//		
//		when(t2.getX()).thenReturn(false);
//		when(t2.getY()).thenReturn(true);
//		when(t2.getZ()).thenReturn(true);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4boR} and has the same amount of dimensions and
//	 * a different value of the w component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingWTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		Tup4boR t2 = mock(Tup4boR.class);
//		
//		when(t2.getX()).thenReturn(false);
//		when(t2.getY()).thenReturn(true);
//		when(t2.getZ()).thenReturn(false);
//		when(t2.getW()).thenReturn(false);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		TupboR t2 = mock(TupboR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(false);
//		when(t2.getByIndex(1)).thenReturn(true);
//		when(t2.getByIndex(2)).thenReturn(false);
//		when(t2.getByIndex(3)).thenReturn(true);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupboR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		TupboR t2 = mock(TupboR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		TupboR t2 = mock(TupboR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(true);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		TupboR t2 = mock(TupboR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(false);
//		when(t2.getByIndex(1)).thenReturn(false);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		TupboR t2 = mock(TupboR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(false);
//		when(t2.getByIndex(1)).thenReturn(true);
//		when(t2.getByIndex(2)).thenReturn(true);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
//	 * a different value of the w component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingWTest()
//	{
//		Tup4bo t1 = new Tup4bo(false, true, false, true);
//		
//		TupboR t2 = mock(TupboR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(false);
//		when(t2.getByIndex(1)).thenReturn(true);
//		when(t2.getByIndex(2)).thenReturn(false);
//		when(t2.getByIndex(3)).thenReturn(false);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup4bo#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		Tup4bo t = new Tup4bo(false, true, false, true);
//		
//		assertEquals("tup4bo(x=false, y=true, z=false, w=true)", t.toString());
//	}
//}