//package org.barghos.core.test.tuple2;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.tuple2.ImmutableTup2o;
//import org.barghos.tuple.api.t2.Tup2oR;
//
///**
// * This class provides component tests for the class {@link ImmutableTup2o}.
// * 
// * @author picatrix1899
// */
//class ImmutableTup2oTest
//{
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2o} generated from an existing instance of {@link Tup2oR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		@SuppressWarnings("unchecked")
//		Tup2oR<Integer,Double> original = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
//		
//		when(original.getX()).thenReturn(1);
//		when(original.getY()).thenReturn(1.0);
//		
//		ImmutableTup2o<Integer,Double> t = new ImmutableTup2o<>(original);
//		
//		assertEquals(1, (int)t.getX());
//		assertEquals(1.0, (double)t.getY());
//		
//		verify(original).getX();
//		verify(original).getY();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link ImmutableTup2o} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		ImmutableTup2o<Integer,Double> t = new ImmutableTup2o<>(1, 1.0);
//		
//		assertEquals(1, (int)t.getX());
//		assertEquals(1.0, (double)t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2o#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		ImmutableTup2o<Integer,Double> t = new ImmutableTup2o<>(1, 1.0);
//		
//		assertEquals(1, (int)t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2o#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		ImmutableTup2o<Integer,Double> t = new ImmutableTup2o<>(1, 1.0);
//		
//		assertEquals(1.0, (double)t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link ImmutableTup2o#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		ImmutableTup2o<Integer,Double> t = new ImmutableTup2o<>(1, 1.0);
//
//		assertEquals(1072694240, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		ImmutableTup2o<Integer,Double> t1 = new ImmutableTup2o<>(1, 1.0);
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		ImmutableTup2o<Integer,Double> t1 = new ImmutableTup2o<>(1, 1.0);
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		ImmutableTup2o<Integer,Double> t1 = new ImmutableTup2o<>(1, 1.0);
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup2oR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple2Test()
//	{
//		ImmutableTup2o<Integer, Double> t1 = new ImmutableTup2o<>(1, 1.0);
//		
//		@SuppressWarnings("unchecked")
//		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
//		
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(1.0);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup2oR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		ImmutableTup2o<Integer, Double> t1 = new ImmutableTup2o<>(1, 1.0);
//		
//		@SuppressWarnings("unchecked")
//		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
//		
//		when(t2.getX()).thenReturn(2);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup2oR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		ImmutableTup2o<Integer, Double> t1 = new ImmutableTup2o<>(1, 1.0);
//		
//		@SuppressWarnings("unchecked")
//		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
//
//		when(t2.getX()).thenReturn(1);
//		when(t2.getY()).thenReturn(2.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link ImmutableTup2o#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		ImmutableTup2o<Integer,Double> t = new ImmutableTup2o<>(1, 1.0);
//		
//		assertEquals("immutableTup2o(x=1, y=1.0)", t.toString());
//	}
//}