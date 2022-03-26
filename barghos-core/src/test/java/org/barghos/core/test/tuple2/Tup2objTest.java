package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple2.Tup2objR;

import org.barghos.core.tuple2.Tup2obj;

/**
 * This class provides component tests for the class {@link Tup2obj}.
 */
class Tup2objTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2obj#Tup2obj()} sets the components to null.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertEquals(null, t.x);
		assertEquals(null, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2obj} generated from an existing instance of {@link TupobjR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0});
		
		Tup2obj t = new Tup2obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2obj} generated from an existing instance of {@link Tup2objR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2objR original = mock(Tup2objR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		
		Tup2obj t = new Tup2obj(original);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2obj} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2obj t = new Tup2obj(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2obj} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2obj t = new Tup2obj(new Object[] {1, 1.0});
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2obj} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2obj t = new Tup2obj(1, 1.0);
		
		assertEquals(1, t.getX());
		assertEquals(1.0, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#setX(Object)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#setY(Object)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2obj t = new Tup2obj();
		
		assertSame(t, t.setY(1.0));
		assertEquals(1.0, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2obj#set(org.barghos.core.api.tuple2.Tup2objR) Tup2obj.set(Tup2objR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2obj t = mock(Tup2obj.class);
		
		Tup2objR t2 = mock(Tup2objR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		
		when(t.set(1, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 1.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#set(Object)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2obj t = mock(Tup2obj.class);

		when(t.set(1)).thenCallRealMethod();

		when(t.set(1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#set(Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2obj t = mock(Tup2obj.class);

		when(t.set(1, 1.0)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0));

		verify(t).set(1, 1.0);
		
		verify(t).setX(1);
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2obj t = new Tup2obj(1, 1.0);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2obj t = new Tup2obj(1, 1.0);
		
		assertEquals(1.0, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2obj t = new Tup2obj(1, 1.0);

		assertEquals(1072694240, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2obj#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2obj original = new Tup2obj(1, 1.0);
		Tup2obj t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2objR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		Tup2objR t2 = mock(Tup2objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2objR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		Tup2objR t2 = mock(Tup2objR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2objR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		Tup2objR t2 = mock(Tup2objR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(1.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupobjR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2obj t1 = new Tup2obj(1, 1.0);
		
		TupobjR t2 = mock(TupobjR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2obj#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup2obj t = new Tup2obj(1, 1.0);
		
		assertEquals("tup2obj(x=1, y=1.0)", t.toString());
	}
}