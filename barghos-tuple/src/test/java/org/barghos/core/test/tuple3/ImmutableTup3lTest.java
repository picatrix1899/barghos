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
//import org.barghos.core.tuple3.ImmutableTup3l;
//import org.barghos.tuple.api.tn.TuplR;
//import org.barghos.tuple.api.tn3.Tup3lR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup3l}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup3lTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3l} generated from an existing instance of {@link TuplR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TuplR original = mock(TuplR.class);
//		
//		when(original.toArray()).thenReturn(new long[] {1l, 2l, 3l});
//		
//		ImmutableTup3l t = new ImmutableTup3l(original);
//		
//		assertEquals(1l, t.getX());
//		assertEquals(2l, t.getY());
//		assertEquals(3l, t.getZ());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3l} generated from an existing instance of {@link Tup3lR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple3Test()
//	{
//		Tup3lR original = mock(Tup3lR.class);
//		
//		when(original.getX()).thenReturn(1l);
//		when(original.getY()).thenReturn(2l);
//		when(original.getZ()).thenReturn(3l);
//		
//		ImmutableTup3l t = new ImmutableTup3l(original);
//		
//		assertEquals(1l, t.getX());
//		assertEquals(2l, t.getY());
//		assertEquals(3l, t.getZ());
//		
//		verify(original).getX();
//		verify(original).getY();
//		verify(original).getZ();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3l} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l);
//		
//		assertEquals(1l, t.getX());
//		assertEquals(1l, t.getY());
//		assertEquals(1l, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3l} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(new long[] {1l, 2l, 3l});
//		
//		assertEquals(1l, t.getX());
//		assertEquals(2l, t.getY());
//		assertEquals(3l, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup3l} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertEquals(1l, t.getX());
//		assertEquals(2l, t.getY());
//		assertEquals(3l, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3l#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertEquals(1l, t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3l#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertEquals(2l, t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3l#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertEquals(3l, t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3l#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l, 2l, 3l);
//
//		assertEquals(30817, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3l#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		ImmutableTup3l original = new ImmutableTup3l(1l, 2l, 3l);
//		ImmutableTup3l t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup3lR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple3Test()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		when(t2.getX()).thenReturn(1l);
//		when(t2.getY()).thenReturn(2l);
//		when(t2.getZ()).thenReturn(3l);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3lR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingXTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		when(t2.getX()).thenReturn(4l);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3lR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingYTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		when(t2.getX()).thenReturn(1l);
//		when(t2.getY()).thenReturn(4l);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup3lR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple3_VaryingZTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		Tup3lR t2 = mock(Tup3lR.class);
//		
//		when(t2.getX()).thenReturn(1l);
//		when(t2.getY()).thenReturn(2l);
//		when(t2.getZ()).thenReturn(4l);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		TuplR t2 = mock(TuplR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(1l);
//		when(t2.getByIndex(1)).thenReturn(2l);
//		when(t2.getByIndex(2)).thenReturn(3l);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TuplR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		TuplR t2 = mock(TuplR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		TuplR t2 = mock(TuplR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(4l);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		TuplR t2 = mock(TuplR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(1l);
//		when(t2.getByIndex(1)).thenReturn(4l);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		ImmutableTup3l t1 = new ImmutableTup3l(1l, 2l, 3l);
//		
//		TuplR t2 = mock(TuplR.class);
//		
//		when(t2.getDimensions()).thenReturn(3);
//		when(t2.getByIndex(0)).thenReturn(1l);
//		when(t2.getByIndex(1)).thenReturn(2l);
//		when(t2.getByIndex(2)).thenReturn(4l);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3l#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup3l t = new ImmutableTup3l(1l, 2l, 3l);
//		
//		assertEquals("immutableTup3l(x=1, y=2, z=3)", t.toString());
//	}
//}