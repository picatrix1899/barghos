package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple2.Tup2bR;

import org.barghos.core.tuple2.Tup2b;

/**
 * This class provides component tests for the class {@link Tup2b}.
 */
class Tup2bTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2b#Tup2b()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2b t = new Tup2b();
		
		assertEquals((byte)0, t.x);
		assertEquals((byte)0, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2b} generated from an existing instance of {@link TupbR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		
		Tup2b t = new Tup2b(original);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2b} generated from an existing instance of {@link Tup2bR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2bR original = mock(Tup2bR.class);
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		
		Tup2b t = new Tup2b(original);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2b} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2b t = new Tup2b((byte)1);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2b} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2b t = new Tup2b(new byte[] {(byte)1, (byte)2});
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2b} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals((byte)1, t.getX());
		assertEquals((byte)2, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#setX(byte)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.setX((byte)1));
		assertEquals((byte)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#setY(byte)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2b t = new Tup2b();
		
		assertSame(t, t.setY((byte)2));
		assertEquals((byte)2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2b#set(org.barghos.core.api.tuple2.Tup2bR) Tup2b.set(Tup2bR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2b t = mock(Tup2b.class);
		
		Tup2bR t2 = mock(Tup2bR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		
		when(t.set((byte)1, (byte)2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set((byte)1, (byte)2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#set(byte)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2b t = mock(Tup2b.class);

		when(t.set((byte)1)).thenCallRealMethod();

		when(t.set((byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#set(byte, byte)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2b t = mock(Tup2b.class);

		when(t.set((byte)1, (byte)2)).thenCallRealMethod();

		when(t.setX((byte)1)).thenReturn(t);
		when(t.setY((byte)2)).thenReturn(t);
		
		assertSame(t, t.set((byte)1, (byte)2));

		verify(t).set((byte)1, (byte)2);
		
		verify(t).setX((byte)1);
		verify(t).setY((byte)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals((byte)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals((byte)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2b#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2b original = new Tup2b((byte)1, (byte)2);
		Tup2b t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2bR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t2.getX()).thenReturn((byte)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2b t1 = new Tup2b((byte)1, (byte)2);
		
		TupbR t2 = mock(TupbR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((byte)1);
		when(t2.getByIndex(1)).thenReturn((byte)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2b#toString()} function prbytes the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup2b t = new Tup2b((byte)1, (byte)2);
		
		assertEquals("tup2b(x=1, y=2)", t.toString());
	}
}