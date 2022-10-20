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
//package org.barghos.core.test.tuple4;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//import org.barghos.core.tuple4.ImmutableTup4bigd;
//import org.barghos.tuple.api.tn.TupbigdR;
//import org.barghos.tuple.api.tn4.Tup4bigdR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup3bigd}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup4bigdTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup4bigd} generated from an existing instance of {@link TupbigdR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupbigdR original = mock(TupbigdR.class);
//		
//		when(original.toArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
//		
//		ImmutableTup4bigd t = new ImmutableTup4bigd(original);
//		
//		assertEquals(BigDecimal.valueOf(1.0), t.getX());
//		assertEquals(BigDecimal.valueOf(2.0), t.getY());
//		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
//		assertEquals(BigDecimal.valueOf(4.0), t.getW());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup4bigd} generated from an existing instance of {@link Tup4bigdR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple4Test()
//	{
//		Tup4bigdR original = mock(Tup4bigdR.class);
//		
//		when(original.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(original.getY()).thenReturn(BigDecimal.valueOf(2.0));
//		when(original.getZ()).thenReturn(BigDecimal.valueOf(3.0));
//		when(original.getW()).thenReturn(BigDecimal.valueOf(4.0));
//		
//		ImmutableTup4bigd t = new ImmutableTup4bigd(original);
//		
//		assertEquals(BigDecimal.valueOf(1.0), t.getX());
//		assertEquals(BigDecimal.valueOf(2.0), t.getY());
//		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
//		assertEquals(BigDecimal.valueOf(4.0), t.getW());
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
//	 * This test ensures, that an instance of {@link ImmutableTup4bigd} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.0));
//		
//		assertEquals(BigDecimal.valueOf(1.0), t.getX());
//		assertEquals(BigDecimal.valueOf(1.0), t.getY());
//		assertEquals(BigDecimal.valueOf(1.0), t.getZ());
//		assertEquals(BigDecimal.valueOf(1.0), t.getW());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup4bigd} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
//		
//		assertEquals(BigDecimal.valueOf(1.0), t.getX());
//		assertEquals(BigDecimal.valueOf(2.0), t.getY());
//		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
//		assertEquals(BigDecimal.valueOf(4.0), t.getW());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup4bigd} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		assertEquals(BigDecimal.valueOf(1.0), t.getX());
//		assertEquals(BigDecimal.valueOf(2.0), t.getY());
//		assertEquals(BigDecimal.valueOf(3.0), t.getZ());
//		assertEquals(BigDecimal.valueOf(4.0), t.getW());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup4bigd#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
//		
//		assertEquals(BigDecimal.valueOf(1.1), t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup4bigd#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
//		
//		assertEquals(BigDecimal.valueOf(2.2), t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup4bigd#getZ()} actually returns the value of the
//	 * z component.
//	 */
//	@Test
//	void getZTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
//		
//		assertEquals(BigDecimal.valueOf(3.3), t.getZ());
//		assertEquals(t.z, t.getZ());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup4bigd#getW()} actually returns the value of the
//	 * w component.
//	 */
//	@Test
//	void getWTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
//		
//		assertEquals(BigDecimal.valueOf(4.4), t.getW());
//		assertEquals(t.w, t.getW());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup4bigd#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//
//		assertEquals(10815405, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup3bigd#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		ImmutableTup4bigd original = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		ImmutableTup4bigd t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup4bigdR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple4Test()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		Tup4bigdR t2 = mock(Tup4bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
//		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
//		when(t2.getW()).thenReturn(BigDecimal.valueOf(4.0));
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple4_VaryingXTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		Tup4bigdR t2 = mock(Tup4bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple4_VaryingYTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		Tup4bigdR t2 = mock(Tup4bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getY()).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple4_VaryingZTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		Tup4bigdR t2 = mock(Tup4bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
//		when(t2.getZ()).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup4bigdR} and has the same amount of dimensions and
//	 * a different value of the w component as the testing object.
//	 */
//	@Test
//	void equals_Tuple4_VaryingWTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		Tup4bigdR t2 = mock(Tup4bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
//		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
//		when(t2.getW()).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
//		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(3.0));
//		when(t2.getByIndex(3)).thenReturn(BigDecimal.valueOf(4.0));
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigdR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup3bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * a different value of the z component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingZTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
//		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * a different value of the w component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingWTest()
//	{
//		ImmutableTup4bigd t1 = new ImmutableTup4bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(4);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
//		when(t2.getByIndex(2)).thenReturn(BigDecimal.valueOf(3.0));
//		when(t2.getByIndex(3)).thenReturn(BigDecimal.valueOf(5.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup4bigd#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup4bigd t = new ImmutableTup4bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
//		
//		assertEquals("immutableTup4bigd(x=1.1, y=2.2, z=3.3, w=4.4)", t.toString());
//	}
//}