//package org.barghos.core.test.tuple2;
//
//import static org.barghos.testutils.TestObjectFactory.*;
//import static org.barghos.tuple.api.tn.TupleConstants.*;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//import org.barghos.core.tuple2.ImmutableTup2bigd;
//import org.barghos.tuple.api.tn.TupbigdR;
//import org.barghos.tuple.api.tn2.Tup2bigdR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup2bigd}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup2bigdTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2bigd} generated from an existing instance of {@link TupbigdR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupbigdR original = mock(TupbigdR.class);
//		
//		when(original.toArray()).thenReturn(bigdArray(1, 2));
//		
//		ImmutableTup2bigd t = new ImmutableTup2bigd(original);
//		
//		assertEquals(bigd(1), t.getX());
//		assertEquals(bigd(2), t.getY());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2bigd} generated from an existing instance of {@link Tup2bigdR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		Tup2bigdR original = mock(Tup2bigdR.class);
//		
//		when(original.getX()).thenReturn(bigd(1));
//		when(original.getY()).thenReturn(bigd(2));
//		
//		ImmutableTup2bigd t = new ImmutableTup2bigd(original);
//		
//		assertEquals(bigd(1), t.getX());
//		assertEquals(bigd(2), t.getY());
//		
//		verify(original).getX();
//		verify(original).getY();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2bigd} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1));
//		
//		assertEquals(bigd(1), t.getX());
//		assertEquals(bigd(1), t.getY());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2bigd} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigdArray(1, 2));
//		
//		assertEquals(bigd(1), t.getX());
//		assertEquals(bigd(2), t.getY());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2bigd} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertEquals(bigd(1), t.getX());
//		assertEquals(bigd(2), t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1));
//		
//		assertEquals(bigd(1), t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertEquals(bigd(2), t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#getByIndex(int)} returns the value of the x component
//	 * for the index {@code 0}.
//	 */
//	@Test
//	void getByIndex_XTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertEquals(bigd(1), t.getByIndex(COMP_X));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#getByIndex(int)} returns the value of the y component
//	 * for the index {@code 1}.
//	 */
//	@Test
//	void getByIndex_YTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertEquals(bigd(2), t.getByIndex(COMP_Y));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#getByIndex(int)} throws
//	 * an {@link IndexOutOfBoundsException} for an index different higher than 1.
//	 */
//	@Test
//	void getByIndex_ExceptionTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertThrows(IndexOutOfBoundsException.class, () -> t.getByIndex(2));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isExactlyZero()} returns true,
//	 * if all of the components are exactly {@code 0}.
//	 */
//	@Test
//	void isExactlyZero_ZeroTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(0), bigd(0));
//		
//		assertEquals(true, t.isExactlyZero());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isExactlyZero()} returns false,
//	 * if the x component is not {@code 0}.
//	 */
//	@Test
//	void isExactlyZero_Fail_XTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(0));
//		
//		assertEquals(false, t.isExactlyZero());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isExactlyZero()} returns false,
//	 * if the y component is not {@code 0}.
//	 */
//	@Test
//	void isExactlyZero_Fail_YTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(0), bigd(1));
//		
//		assertEquals(false, t.isExactlyZero());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns true,
//	 * if all components are exactly {@code 0}.
//	 */
//	@Test
//	void isZeroTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(0), bigd(0));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns true,
//	 * if all components are at the positive extreme point that is the inclusive
//	 * tolerance parameter.
//	 */
//	@Test
//	void isZero_Extreme_PositiveTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(2), bigd(2));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns true,
//	 * if all components are at the negative extreme point that is the inclusive
//	 * tolerance parameter.
//	 */
//	@Test
//	void isZero_Extreme_NegativeTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(-2), bigd(-2));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns false,
//	 * if the x component exceeds the positive extreme point that is the inclusive
//	 * tolerance parameter.
//	 */
//	@Test
//	void isZero_Fail_X_PositiveTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(3), bigd(0));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns false,
//	 * if the x component exceeds the negative extreme point that is the inclusive
//	 * tolerance parameter.
//	 */
//	@Test
//	void isZero_Fail_X_NegativeTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(-3), bigd(0));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns false,
//	 * if the y component exceeds the positive extreme point that is the inclusive
//	 * tolerance parameter.
//	 */
//	@Test
//	void isZero_Fail_Y_PositiveTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(0), bigd(3));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isZero(BigDecimal)} returns false,
//	 * if the y component exceeds the positive extreme point that is the inclusive
//	 * tolerance parameter.
//	 */
//	@Test
//	void isZero_Fail_Y_NegativeTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(0), bigd(-3));
//		
//		assertEquals(true, t.isZero(bigd(2)));
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#toArray()} returns
//	 * the given array with the components in the right order.
//	 */
//	@Test
//	void toArrayTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//
//		assertArrayEquals(bigdArray(1, 2), t.toArray());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#toArray(BigDecimal[])} returns
//	 * the given array with the components in the right order.
//	 */
//	@Test
//	void toArray_ExtractParamTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//
//		assertArrayEquals(bigdArray(1, 2), t.toArray());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#isValid()} returns true if
//	 * both components are not {@code null}.
//	 */
//	@Test
//	void isValidTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//
//		assertEquals(true, t.isValid());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#hashCode()} returns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//
//		assertEquals(11223, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2bigd#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		ImmutableTup2bigd original = new ImmutableTup2bigd(bigd(1), bigd(2));
//		ImmutableTup2bigd t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns true if
//	 * the object to test is of the type {@link Tup2bigdR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple2Test()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		Tup2bigdR t2 = mock(Tup2bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is of the type {@link Tup2bigdR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		Tup2bigdR t2 = mock(Tup2bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(4.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is of the type {@link Tup2bigdR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		Tup2bigdR t2 = mock(Tup2bigdR.class);
//		
//		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getY()).thenReturn(BigDecimal.valueOf(4.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns true if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is of the type {@link TupbigdR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(4.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#equals(Object)} function returns false if
//	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		ImmutableTup2bigd t1 = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		TupbigdR t2 = mock(TupbigdR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
//		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(4.0));
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2bigd#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup2bigd t = new ImmutableTup2bigd(bigd(1), bigd(2));
//		
//		assertEquals("immutableTup2bigd(x=1.0, y=2.0)", t.toString());
//	}
//}