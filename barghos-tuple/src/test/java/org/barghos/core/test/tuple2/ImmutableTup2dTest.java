package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.tuple2.ImmutableTup2d;
import org.barghos.tuple.api.tn.TupdR;
import org.barghos.tuple.api.tn2.Tup2dR;

/**
 * This class provides component tests for the class {@link ImmutableTup2d}.
 * 
 * @author picatrix1899
 */
class ImmutableTup2dTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2d} generated from an existing instance of {@link TupdR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		
		when(original.toArray()).thenReturn(new double[] {1.0, 2.0});
		
		ImmutableTup2d t = new ImmutableTup2d(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2d} generated from an existing instance of {@link Tup2dR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2dR original = mock(Tup2dR.class);
		
		when(original.getX()).thenReturn(1.0);
		when(original.getY()).thenReturn(2.0);
		
		ImmutableTup2d t = new ImmutableTup2d(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2d} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(1.0);
		
		assertEquals(1.0, t.getX());
		assertEquals(1.0, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2d} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(new double[] {1.0, 2.0});
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2d} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(1.0, 2.0);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2d#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(1.1, 2.2);
		
		assertEquals(1.1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2d#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(1.1, 2.2);
		
		assertEquals(2.2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2d#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(1.0, 2.0);

		assertEquals(-32504895, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2d#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2d original = new ImmutableTup2d(1.0, 2.0);
		ImmutableTup2d t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2dR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		Tup2dR t2 = mock(Tup2dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2dR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		Tup2dR t2 = mock(Tup2dR.class);
		
		when(t2.getX()).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2dR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		Tup2dR t2 = mock(Tup2dR.class);
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(2.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2d t1 = new ImmutableTup2d(1.0, 2.0);
		
		TupdR t2 = mock(TupdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1.0);
		when(t2.getByIndex(1)).thenReturn(4.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2d#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2d t = new ImmutableTup2d(1.1, 2.2);
		
		assertEquals("immutableTup2d(x=1.1, y=2.2)", t.toString());
	}
}