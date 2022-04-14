package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple2.Tup2strR;

import org.barghos.core.tuple2.ImmutableTup2str;

/**
 * This class provides component tests for the class {@link ImmutableTup2str}.
 * 
 * @author picatrix1899
 */
class ImmutableTup2strTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2str} generated from an existing instance of {@link TupstrR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		
		when(original.toArray()).thenReturn(new String[] {"a", "b"});
		
		ImmutableTup2str t = new ImmutableTup2str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2str} generated from an existing instance of {@link Tup2strR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2strR original = mock(Tup2strR.class);
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		
		ImmutableTup2str t = new ImmutableTup2str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2str} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2str t = new ImmutableTup2str("a");
		
		assertEquals("a", t.getX());
		assertEquals("a", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2str} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2str t = new ImmutableTup2str(new String[] {"a", "b"});
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2str} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2str t = new ImmutableTup2str("a", "b");
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2str#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2str t = new ImmutableTup2str("a", "b");
		
		assertEquals("a", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2str#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2str t = new ImmutableTup2str("a", "b");
		
		assertEquals("b", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2str#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2str t = new ImmutableTup2str("a", "b");

		assertEquals(4066, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2str#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2str original = new ImmutableTup2str("a", "b");
		ImmutableTup2str t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2strR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2strR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t2.getX()).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2strR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
	
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2str t1 = new ImmutableTup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2str#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2str t = new ImmutableTup2str("a", "b");
		
		assertEquals("immutableTup2str(x=a, y=b)", t.toString());
	}
}