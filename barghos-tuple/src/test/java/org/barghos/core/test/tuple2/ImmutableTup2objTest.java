//package org.barghos.core.test.tuple2;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.tuple2.ImmutableTup2obj;
//import org.barghos.tuple.api.t2.Tup2objR;
//import org.barghos.tuple.api.tn.TupobjR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup2obj}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup2objTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2obj} generated from an existing instance of {@link TupobjR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupobjR original = mock(TupobjR.class);
//		
//		when(original.toArray()).thenReturn(new Object[] {1, 1.0});
//		
//		ImmutableTup2obj t = new ImmutableTup2obj(original);
//		
//		assertEquals(1, t.getX());
//		assertEquals(1.0, t.getY());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2obj} generated from an existing instance of {@link Tup2objR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		Tup2objR original = mock(Tup2objR.class);
//		
//		when(original.getX()).thenReturn(1);
//		when(original.getY()).thenReturn(1.0);
//		
//		ImmutableTup2obj t = new ImmutableTup2obj(original);
//		
//		assertEquals(1, t.getX());
//		assertEquals(1.0, t.getY());
//		
//		verify(original).getX();
//		verify(original).getY();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2obj} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(1);
//		
//		assertEquals(1, t.getX());
//		assertEquals(1, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2obj} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(new Object[] {1, 1.0});
//		
//		assertEquals(1, t.getX());
//		assertEquals(1.0, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2obj} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(1, 1.0);
//		
//		assertEquals(1, t.getX());
//		assertEquals(1.0, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2obj#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(1, 1.0);
//		
//		assertEquals(1, t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2obj#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(1, 1.0);
//		
//		assertEquals(1.0, t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2obj#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(1, 1.0);
//
//		assertEquals(1072694240, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup2objR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple2Test()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		Tup2objR t2 = mock(Tup2objR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(1.0);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup2objR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		Tup2objR t2 = mock(Tup2objR.class);
//		
//		when(t2.getX()).thenReturn(2);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup2objR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		Tup2objR t2 = mock(Tup2objR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(2.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		TupobjR t2 = mock(TupobjR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(1);
//		when(t2.getByIndex(1)).thenReturn(1.0);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupobjR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		TupobjR t2 = mock(TupobjR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		TupobjR t2 = mock(TupobjR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(2);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		ImmutableTup2obj t1 = new ImmutableTup2obj(1, 1.0);
//		
//		TupobjR t2 = mock(TupobjR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(1);
//		when(t2.getByIndex(1)).thenReturn(2.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2obj#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup2obj t = new ImmutableTup2obj(1, 1.0);
//		
//		assertEquals("immutableTup2obj(x=1, y=1.0)", t.toString());
//	}
//}