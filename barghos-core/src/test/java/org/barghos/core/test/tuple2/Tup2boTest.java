package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple2.Tup2boR;

import org.barghos.core.tuple2.Tup2bo;

/**
 * This class provides component tests for the class {@link Tup2bo}.
 */
class Tup2boTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2bo#Tup2b()} sets the components to false.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertEquals(false, t.x);
		assertEquals(false, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2bo} generated from an existing instance of {@link TupboR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		
		when(original.toArray()).thenReturn(new boolean[] {false, true});
		
		Tup2bo t = new Tup2bo(original);
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bo} generated from an existing instance of {@link Tup2boR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2boR original = mock(Tup2boR.class);
		
		when(original.getX()).thenReturn(false);
		when(original.getY()).thenReturn(true);
		
		Tup2bo t = new Tup2bo(original);
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bo} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2bo t = new Tup2bo(true);
		
		assertEquals(true, t.getX());
		assertEquals(true, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bo} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2bo t = new Tup2bo(new boolean[] {false, true});
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bo} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals(false, t.getX());
		assertEquals(true, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#setX(boolean)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.setX(true));
		assertEquals(true, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#setY(int)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2bo t = new Tup2bo();
		
		assertSame(t, t.setY(true));
		assertEquals(true, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2bo#set(org.barghos.core.api.tuple2.Tup2boR) Tup2bo.set(Tup2boR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2bo t = mock(Tup2bo.class);
		
		Tup2boR t2 = mock(Tup2boR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(true);
		
		when(t.set(false, true)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(false, true);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#set(boolean)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bo t = mock(Tup2bo.class);

		when(t.set(true)).thenCallRealMethod();

		when(t.set(true, true)).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);

		verify(t).set(true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#set(boolean, boolean)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2bo t = mock(Tup2bo.class);

		when(t.set(false, true)).thenCallRealMethod();

		when(t.setX(false)).thenReturn(t);
		when(t.setY(true)).thenReturn(t);
		
		assertSame(t, t.set(false, true));

		verify(t).set(false, true);
		
		verify(t).setX(false);
		verify(t).setY(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals(false, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals(true, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2bo t = new Tup2bo(false, true);

		assertEquals(962, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bo#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2bo original = new Tup2bo(false, true);
		Tup2bo t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2boR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(true);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2boR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t2.getX()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2boR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t2.getX()).thenReturn(false);
		when(t2.getY()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		when(t2.getByIndex(1)).thenReturn(true);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2bo t1 = new Tup2bo(false, true);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		when(t2.getByIndex(1)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2bo t = new Tup2bo(false, true);
		
		assertEquals("tup2bo(x=false, y=true)", t.toString());
	}
}