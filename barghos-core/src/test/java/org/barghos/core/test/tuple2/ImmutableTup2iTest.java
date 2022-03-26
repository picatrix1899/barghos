package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple2.Tup2iR;

import org.barghos.core.tuple2.ImmutableTup2i;

/**
 * This class provides component tests for the class {@link ImmutableTup2i}.
 * 
 * @author picatrix1899
 */
class ImmutableTup2biTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2i} generated from an existing instance of {@link TupiR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		
		when(original.getArray()).thenReturn(new int[] {1, 2});
		
		ImmutableTup2i t = new ImmutableTup2i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2i} generated from an existing instance of {@link Tup2iR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2iR original = mock(Tup2iR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		
		ImmutableTup2i t = new ImmutableTup2i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2i} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2i} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(new int[] {1, 2});
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2i} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(1, 2);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2i#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(1, 2);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2i#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(1, 2);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2i#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(1, 2);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2i#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2i original = new ImmutableTup2i(1, 2);
		ImmutableTup2i t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2iR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2iR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t2.getX()).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2iR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2i t1 = new ImmutableTup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2i#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2i t = new ImmutableTup2i(1, 2);
		
		assertEquals("immutableTup2i(x=1, y=2)", t.toString());
	}
}