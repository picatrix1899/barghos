package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple2.Tup2lR;

import org.barghos.core.tuple2.Tup2l;

/**
 * This class provides component tests for the class {@link Tup2l}.
 */
class Tup2lTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2l#Tup2l()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2l t = new Tup2l();
		
		assertEquals(0l, t.x);
		assertEquals(0l, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2l} generated from an existing instance of {@link TuplR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		
		when(original.toArray()).thenReturn(new long[] {1l, 2l});
		
		Tup2l t = new Tup2l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2l} generated from an existing instance of {@link Tup2lR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2lR original = mock(Tup2lR.class);
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		
		Tup2l t = new Tup2l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2l} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2l t = new Tup2l(1l);
		
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2l} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2l t = new Tup2l(new long[] {1l, 2l});
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2l} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#setX(long)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.setX(1l));
		assertEquals(1l, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#setY(long)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2l t = new Tup2l();
		
		assertSame(t, t.setY(2l));
		assertEquals(2l, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2l#set(org.barghos.core.api.tuple2.Tup2lR) Tup2l.set(Tup2lR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2l t = mock(Tup2l.class);
		
		Tup2lR t2 = mock(Tup2lR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		
		when(t.set(1l, 2l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1l, 2l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#set(long)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2l t = mock(Tup2l.class);

		when(t.set(1l)).thenCallRealMethod();

		when(t.set(1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#set(long, long)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2l t = mock(Tup2l.class);

		when(t.set(1l, 2l)).thenCallRealMethod();

		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l));

		verify(t).set(1l, 2l);
		
		verify(t).setX(1l);
		verify(t).setY(2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2l t = new Tup2l(1l, 2l);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2l#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2l original = new Tup2l(1l, 2l);
		Tup2l t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2lR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2lR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t2.getX()).thenReturn(3l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2lR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		Tup2lR t2 = mock(Tup2lR.class);

		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(3l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns true if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(3l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2l t1 = new Tup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(3l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2l#toString()} function prlongs the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup2l t = new Tup2l(1l, 2l);
		
		assertEquals("tup2l(x=1, y=2)", t.toString());
	}
}