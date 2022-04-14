package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple2.Tup2bR;

import org.barghos.core.tuple2.ImmutableTup2b;

/**
 * This class provides component tests for the class {@link ImmutableTup2b}.
 * 
 * @author picatrix1899
 */
class ImmutableTup2bTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2b} generated from an existing instance of {@link TupbR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		
		when(original.toArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		
		ImmutableTup2b t = new ImmutableTup2b(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2b} generated from an existing instance of {@link Tup2bR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2bR original = mock(Tup2bR.class);
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		
		ImmutableTup2b t = new ImmutableTup2b(original);
		
		assertEquals(1.0, t.getX());
		assertEquals(2.0, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2b} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2b t = new ImmutableTup2b((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2b} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2b t = new ImmutableTup2b(new byte[] {(byte)1, (byte)2});
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2b} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2b t = new ImmutableTup2b((byte)1, (byte)2);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2b#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2b t = new ImmutableTup2b((byte)1, (byte)2);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2b#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2b t = new ImmutableTup2b((byte)1, (byte)2);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2b#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2b t = new ImmutableTup2b((byte)1, (byte)2);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2b#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2b original = new ImmutableTup2b((byte)1, (byte)2);
		ImmutableTup2b t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2bR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t2.getX()).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2b t1 = new ImmutableTup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2b#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2b t = new ImmutableTup2b((byte)1, (byte)2);
		
		assertEquals("immutableTup2b(x=1, y=2)", t.toString());
	}
}