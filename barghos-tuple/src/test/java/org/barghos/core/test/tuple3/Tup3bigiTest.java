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
//
//import java.math.BigInteger;
//
//import org.barghos.core.tuple3.Tup3bigi;
//import org.barghos.tuple.api.tn.TupbigiR;
//import org.barghos.tuple.api.tn3.Tup3bigiR;
//
///**
// * This class provides component tests for the class {@link Tup3bigi}.
// */
//class Tup3bigiTest
//{
//	/**
//	 * This test ensures, that the constructor {@link Tup3bigi#Tup3bigi()} aktually works and
//	 * that the components are set to 0.
//	 */
//	@Test
//	void ctor_DefaultTest()
//	{
//		Tup3bigi t = new Tup3bigi();
//		
//		assertEquals(BigInteger.ZERO, t.x);
//		assertEquals(BigInteger.ZERO, t.y);
//		assertEquals(BigInteger.ZERO, t.z);
//	}
//
//	/**
//	 * This test ensures, that an instance of {@link Tup3bigi} generated from an existing instance of {@link TupbigiR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupbigiR original = mock(TupbigiR.class);
//		
//		when(original.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});
//		
//		Tup3bigi t = new Tup3bigi(original);
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3bigi} generated from an existing instance of {@link TupbigiR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		Tup3bigiR original = mock(Tup3bigiR.class);
//		
//		when(original.getX()).thenReturn(BigInteger.valueOf(1));
//		when(original.getY()).thenReturn(BigInteger.valueOf(2));
//		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
//		
//		Tup3bigi t = new Tup3bigi(original);
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3bigi} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1));
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(1), t.getY());
//		assertEquals(BigInteger.valueOf(1), t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3bigi} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		Tup3bigi t = new Tup3bigi(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup3bigi} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#setX(BigInteger)} sets the x component on the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setXTest()
//	{
//		Tup3bigi t = new Tup3bigi();
//		
//		assertSame(t, t.setX(BigInteger.valueOf(1)));
//		assertEquals(BigInteger.valueOf(1), t.x);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#setY(BigInteger)} sets the y component on the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setYTest()
//	{
//		Tup3bigi t = new Tup3bigi();
//		
//		assertSame(t, t.setY(BigInteger.valueOf(2)));
//		assertEquals(BigInteger.valueOf(2), t.y);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#setZ(BigInteger)} sets the z component on the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setZTest()
//	{
//		Tup3bigi t = new Tup3bigi();
//		
//		assertSame(t, t.setZ(BigInteger.valueOf(3)));
//		assertEquals(BigInteger.valueOf(3), t.z);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link Tup3bigi#set(org.barghos.core.api.tuple2.Tup3bigiR) Tup2bigd.set(Tup3bigiR)}
//	 * adopts the components from the input tuple and returns the current tuple.
//	 */
//	@Test
//	void set_Tuple3Test()
//	{
//		Tup3bigi t = mock(Tup3bigi.class);
//		
//		Tup3bigiR t2 = mock(Tup3bigiR.class);
//	
//		when(t.set(t2)).thenCallRealMethod();
//		
//		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
//		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
//		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
//		
//		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(t);
//		
//		assertSame(t, t.set(t2));
//		
//		verify(t).set(t2);
//		
//		verify(t2).getX();
//		verify(t2).getY();
//		verify(t2).getZ();
//		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		verifyNoMoreInteractions(t, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#set(BigInteger)} sets the components
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void set_ValueTest()
//	{
//		Tup3bigi t = mock(Tup3bigi.class);
//
//		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();
//
//		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(t);
//		
//		assertSame(t, t.set(BigInteger.valueOf(1)));
//		
//		verify(t).set(BigInteger.valueOf(1));
//
//		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#set(BigInteger, BigInteger, BigInteger)} set the components
//	 * to the respective parameters and returns the current tuple.
//	 */
//	@Test
//	void set_ComponentsTest()
//	{
//		Tup3bigi t = mock(Tup3bigi.class);
//
//		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))).thenCallRealMethod();
//
//		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);
//		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
//		when(t.setZ(BigInteger.valueOf(3))).thenReturn(t);
//		
//		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)));
//
//		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		verify(t).setX(BigInteger.valueOf(1));
//		verify(t).setY(BigInteger.valueOf(2));
//		verify(t).setZ(BigInteger.valueOf(3));
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//
//		assertEquals(30817, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup3bigi#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		Tup3bigi original = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		Tup3bigi t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple2Test()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		Tup3bigiR t2 = mock(Tup3bigiR.class);
//		
//		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
//		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
//		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		Tup3bigiR t2 = mock(Tup3bigiR.class);
//		
//		when(t2.getX()).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		Tup3bigiR t2 = mock(Tup3bigiR.class);
//		
//		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
//		when(t2.getY()).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingZTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		Tup3bigiR t2 = mock(Tup3bigiR.class);
//		
//		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
//		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
//		when(t2.getZ()).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
//		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
//		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(3));
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigiR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
//		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		Tup3bigi t1 = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
//		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
//		when(t2.getByIndex(2)).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup3bigi#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		Tup3bigi t = new Tup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals("tup3bigi(x=1, y=2, z=3)", t.toString());
//	}
//}