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
//import org.barghos.core.tuple3.ImmutableTup3str;
//import org.barghos.tuple.api.t3.Tup3strR;
//import org.barghos.tuple.api.tn.TupstrR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup3str}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup3strTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3str} generated from an existing instance of {@link TupstrR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupstrR original = mock(TupstrR.class);
//		
//		when(original.toArray()).thenReturn(new String[] {"a", "b", "c"});
//		
//		ImmutableTup3str t = new ImmutableTup3str(original);
//		
//		assertEquals("a", t.getX());
//		assertEquals("b", t.getY());
//		assertEquals("c", t.getZ());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3str} generated from an existing instance of {@link Tup3strR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple3Test()
//	{
//		Tup3strR original = mock(Tup3strR.class);
//		
//		when(original.getX()).thenReturn("a");
//		when(original.getY()).thenReturn("b");
//		when(original.getZ()).thenReturn("c");
//		
//		ImmutableTup3str t = new ImmutableTup3str(original);
//		
//		assertEquals("a", t.getX());
//		assertEquals("b", t.getY());
//		assertEquals("c", t.getZ());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3str} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a");
//		
//		assertEquals("a", t.getX());
//		assertEquals("a", t.getY());
//		assertEquals("a", t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3str} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str(new String[] {"a", "b", "c"});
//		
//		assertEquals("a", t.getX());
//		assertEquals("b", t.getY());
//		assertEquals("c", t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3str} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a", "b", "c");
//		
//		assertEquals("a", t.getX());
//		assertEquals("b", t.getY());
//		assertEquals("c", t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3str#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a", "b", "c");
//		
//		assertEquals("a", t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3str#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a", "b", "c");
//		
//		assertEquals("b", t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3str#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a", "b", "c");
//		
//		assertEquals("c", t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3str#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a", "b", "c");
//
//		assertEquals(126145, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3str#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		ImmutableTup3str original = new ImmutableTup3str("a", "b", "c");
//		ImmutableTup3str t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3strR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple3Test()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		Tup3strR t2 = mock(Tup3strR.class);
//		
//		when(t2.getX()).thenReturn("a");
//		when(t2.getY()).thenReturn("b");
//		when(t2.getZ()).thenReturn("c");
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3strR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingXTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		Tup3strR t2 = mock(Tup3strR.class);
//		
//		when(t2.getX()).thenReturn("d");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3strR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingYTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		Tup3strR t2 = mock(Tup3strR.class);
//		
//		when(t2.getX()).thenReturn("a");
//		when(t2.getY()).thenReturn("d");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3strR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingZTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		Tup3strR t2 = mock(Tup3strR.class);
//		
//		when(t2.getX()).thenReturn("a");
//		when(t2.getY()).thenReturn("b");
//		when(t2.getZ()).thenReturn("d");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//	
//		TupstrR t2 = mock(TupstrR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn("a");
//		when(t2.getByIndex(1)).thenReturn("b");
//		when(t2.getByIndex(2)).thenReturn("c");
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupstrR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		TupstrR t2 = mock(TupstrR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		TupstrR t2 = mock(TupstrR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn("d");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		TupstrR t2 = mock(TupstrR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn("a");
//		when(t2.getByIndex(1)).thenReturn("d");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		ImmutableTup3str t1 = new ImmutableTup3str("a", "b", "c");
//		
//		TupstrR t2 = mock(TupstrR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn("a");
//		when(t2.getByIndex(1)).thenReturn("b");
//		when(t2.getByIndex(2)).thenReturn("d");
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3str#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup3str t = new ImmutableTup3str("a", "b", "c");
//		
//		assertEquals("immutableTup3str(x=a, y=b, z=c)", t.toString());
//	}
//}