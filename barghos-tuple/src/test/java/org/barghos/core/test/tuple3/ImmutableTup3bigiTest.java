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
///*
//MIT License
//
//Copyright (c) 2020 picatrix1899 (Florian Zilkenat)
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all
//copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//SOFTWARE.
//*/
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
//import org.barghos.core.tuple3.ImmutableTup3bigi;
//import org.barghos.tuple.api.tn.TupbigiR;
//import org.barghos.tuple.api.tn3.Tup3bigiR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup3bigi}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup3bigiTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3bigi} generated from an existing instance of {@link TupbigiR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupbigiR original = mock(TupbigiR.class);
//		
//		when(original.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});
//		
//		ImmutableTup3bigi t = new ImmutableTup3bigi(original);
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
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3bigi} generated from an existing instance of {@link Tup3bigiR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple3Test()
//	{
//		Tup3bigiR original = mock(Tup3bigiR.class);
//		
//		when(original.getX()).thenReturn(BigInteger.valueOf(1));
//		when(original.getY()).thenReturn(BigInteger.valueOf(2));
//		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
//		
//		ImmutableTup3bigi t = new ImmutableTup3bigi(original);
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
//	 * This test ensures, that an instance of {@link ImmutableTup3bigi} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1));
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(1), t.getY());
//		assertEquals(BigInteger.valueOf(1), t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3bigi} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3bigi} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3bigi#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(1), t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3bigi#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(2), t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3bigi#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals(BigInteger.valueOf(3), t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3bigi#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//
//		assertEquals(30817, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3bigi#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		ImmutableTup3bigi original = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		ImmutableTup3bigi t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple3Test()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
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
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigiR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingXTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		Tup3bigiR t2 = mock(Tup3bigiR.class);
//		
//		when(t2.getX()).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigdR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingYTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
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
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3bigdR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingZTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
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
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
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
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigiR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		TupbigiR t2 = mock(TupbigiR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(4));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
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
//	 * This test ensures, that the {@link ImmutableTup3bigi#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		ImmutableTup3bigi t1 = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
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
//	 * This test ensures, that the {@link ImmutableTup3bigi#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup3bigi t = new ImmutableTup3bigi(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
//		
//		assertEquals("immutableTup3bigi(x=1, y=2, z=3)", t.toString());
//	}
//}