//package org.barghos.core.test.tuple2;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import org.junit.jupiter.api.Test;
//import org.barghos.core.tuple2.Tup2d;
//import org.barghos.tuple.api.tn.TupdR;
//import org.barghos.tuple.api.tn2.Tup2dR;
//
///**
// * This class provides component tests for the class {@link Tup2d}.
// */
//class Tup2dTest
//{
//	/**
//	 * This test ensures, that the default constructor {@link Tup2d#Tup2d()} sets the components to 0.
//	 */
//	@Test
//	void ctor_DefaultTest()
//	{
//		Tup2d t = new Tup2d();
//		
//		assertEquals(0.0, t.x);
//		assertEquals(0.0, t.y);
//	}
//
//	/**
//	 * This test ensures, that an instance of {@link Tup2d} generated from an existing instance of {@link TupdR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_TupleTest()
//	{
//		TupdR original = mock(TupdR.class);
//		
//		when(original.toArray()).thenReturn(new double[] {1.0, 2.0});
//		
//		Tup2d t = new Tup2d(original);
//		
//		assertEquals(1.0, t.getX());
//		assertEquals(2.0, t.getY());
//		
//		verify(original).toArray();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup2d} generated from an existing instance of {@link Tup2dR},
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_Tuple2Test()
//	{
//		Tup2dR original = mock(Tup2dR.class);
//		
//		when(original.getX()).thenReturn(1.0);
//		when(original.getY()).thenReturn(2.0);
//		
//		Tup2d t = new Tup2d(original);
//		
//		assertEquals(1.0, t.getX());
//		assertEquals(2.0, t.getY());
//		
//		verify(original).getX();
//		verify(original).getY();
//		
//		verifyNoMoreInteractions(original);
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup2d} generated from a scalar,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ValueTest()
//	{
//		Tup2d t = new Tup2d(1.0);
//		
//		assertEquals(1.0, t.getX());
//		assertEquals(1.0, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup2d} generated from an array,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ArrayTest()
//	{
//		Tup2d t = new Tup2d(new double[] {1.0, 2.0});
//		
//		assertEquals(1.0, t.getX());
//		assertEquals(2.0, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that an instance of {@link Tup2d} generated from two components,
//	 * returns the correct components.
//	 */
//	@Test
//	void ctor_ComponentsTest()
//	{
//		Tup2d t = new Tup2d(1.0, 2.0);
//		
//		assertEquals(1.0, t.getX());
//		assertEquals(2.0, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#setX(double)} sets the x component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setXTest()
//	{
//		Tup2d t = new Tup2d();
//		
//		assertSame(t, t.setX(1.1));
//		assertEquals(1.1, t.x);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#setY(double)} sets the y component of the tuple
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void setYTest()
//	{
//		Tup2d t = new Tup2d();
//		
//		assertSame(t, t.setY(2.2));
//		assertEquals(2.2, t.y);
//	}
//	
//	/**
//	 * This test ensures, that the function
//	 * {@link Tup2d#set(org.barghos.core.api.tuple2.Tup2dR) Tup2d.set(Tup2dR)}
//	 * adopts the components from the input tuple and returns the current tuple.
//	 */
//	@Test
//	void set_CloneTest()
//	{
//		Tup2d t = mock(Tup2d.class);
//		
//		Tup2dR t2 = mock(Tup2dR.class);
//	
//		when(t.set(t2)).thenCallRealMethod();
//		
//		when(t2.getX()).thenReturn(1.1);
//		when(t2.getY()).thenReturn(2.2);
//		
//		when(t.set(1.1, 2.2)).thenReturn(t);
//		
//		assertSame(t, t.set(t2));
//		
//		verify(t).set(t2);
//		
//		verify(t2).getX();
//		verify(t2).getY();
//		verify(t).set(1.1, 2.2);
//		
//		verifyNoMoreInteractions(t, t2);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#set(double)} sets the components
//	 * to the value and returns the current tuple.
//	 */
//	@Test
//	void set_ValueTest()
//	{
//		Tup2d t = mock(Tup2d.class);
//
//		when(t.set(1.1)).thenCallRealMethod();
//
//		when(t.set(1.1, 1.1)).thenReturn(t);
//		
//		assertSame(t, t.set(1.1));
//		
//		verify(t).set(1.1);
//
//		verify(t).set(1.1, 1.1);
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#set(double, double)} set the components
//	 * to the respective parameters and returns the current tuple.
//	 */
//	@Test
//	void set_ComponentsTest()
//	{
//		Tup2d t = mock(Tup2d.class);
//
//		when(t.set(1.1, 2.2)).thenCallRealMethod();
//
//		when(t.setX(1.1)).thenReturn(t);
//		when(t.setY(2.2)).thenReturn(t);
//		
//		assertSame(t, t.set(1.1, 2.2));
//
//		verify(t).set(1.1, 2.2);
//		
//		verify(t).setX(1.1);
//		verify(t).setY(2.2);
//		
//		verifyNoMoreInteractions(t);
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#getX()} actually returns the value of the
//	 * x component.
//	 */
//	@Test
//	void getXTest()
//	{
//		Tup2d t = new Tup2d(1.1, 2.2);
//		
//		assertEquals(1.1, t.getX());
//		assertEquals(t.x, t.getX());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#getY()} actually returns the value of the
//	 * y component.
//	 */
//	@Test
//	void getYTest()
//	{
//		Tup2d t = new Tup2d(1.1, 2.2);
//		
//		assertEquals(2.2, t.getY());
//		assertEquals(t.y, t.getY());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#hashCode()} eturns the correct hash.
//	 */
//	@Test
//	void hashCodeTest()
//	{
//		Tup2d t = new Tup2d(1.0, 2.0);
//
//		assertEquals(-32504895, t.hashCode());
//	}
//	
//	/**
//	 * This test ensures, that the function {@link Tup2d#clone()} creates a new instance that satisfies
//	 * the requirements for clone-funktions.
//	 */
//	@Test
//	void cloneTest()
//	{
//		Tup2d original = new Tup2d(1.0, 2.0);
//		Tup2d t = original.clone();
//		
//		assertFalse(original == t);
//		assertTrue(original.equals(t));
//		assertTrue(t.equals(original));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns true if
//	 * the object to test is the same as the testing object.
//	 */
//	@Test
//	void equals_SameTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		assertTrue(t1.equals(t1));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is null.
//	 */
//	@Test
//	void equals_NullTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		assertFalse(t1.equals(null));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is of an unsupported type.
//	 */
//	@Test
//	void equals_IncompatibleTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		assertFalse(t1.equals(new Object()));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns true if
//	 * the object to test is of the type {@link Tup2dR} and has the same values as the testing object.
//	 */
//	@Test
//	void equals_Tuple2Test()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		when(t2.getX()).thenReturn(1.0);
//		when(t2.getY()).thenReturn(2.0);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup2dR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingXTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		when(t2.getX()).thenReturn(3.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is of the type {@link Tup2dR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple2_VaryingYTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		Tup2dR t2 = mock(Tup2dR.class);
//		
//		when(t2.getX()).thenReturn(1.0);
//		when(t2.getY()).thenReturn(3.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns true if
//	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
//	 * the same values as the testing object.
//	 */
//	@Test
//	void equals_TupleTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		TupdR t2 = mock(TupdR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(1.0);
//		when(t2.getByIndex(1)).thenReturn(2.0);
//		
//		assertTrue(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupdR} and has a different amount of dimensions
//	 * as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingDimensionsTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		TupdR t2 = mock(TupdR.class);
//		
//		when(t2.getDimensions()).thenReturn(1);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
//	 * a different value of the x component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingXTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		TupdR t2 = mock(TupdR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(3.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#equals(Object)} method returns false if
//	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
//	 * a different value of the y component as the testing object.
//	 */
//	@Test
//	void equals_Tuple_VaryingYTest()
//	{
//		Tup2d t1 = new Tup2d(1.0, 2.0);
//		
//		TupdR t2 = mock(TupdR.class);
//		
//		when(t2.getDimensions()).thenReturn(2);
//		when(t2.getByIndex(0)).thenReturn(1.0);
//		when(t2.getByIndex(1)).thenReturn(3.0);
//		
//		assertFalse(t1.equals(t2));
//	}
//	
//	/**
//	 * This test ensures, that the {@link Tup2d#toString()} function prints the components correctly.
//	 */
//	@Test
//	void toStringTest()
//	{
//		Tup2d t = new Tup2d(1.1, 2.2);
//		
//		assertEquals("tup2d(x=1.1, y=2.2)", t.toString());
//	}
//}