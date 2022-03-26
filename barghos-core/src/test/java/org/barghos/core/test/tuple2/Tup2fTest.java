package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;

import org.barghos.core.tuple2.Tup2f;

/**
 * This class provides component tests for the class {@link Tup2f}.
 */
class Tup2fTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2f#Tup2f()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2f t = new Tup2f();
		
		assertEquals(0.0f, t.x);
		assertEquals(0.0f, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2f} generated from an existing instance of {@link TupfR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		
		when(original.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		
		Tup2f t = new Tup2f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2f} generated from an existing instance of {@link Tup2fR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2fR original = mock(Tup2fR.class);
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		
		Tup2f t = new Tup2f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2f} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2f t = new Tup2f(1.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(1.0f, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2f} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2f t = new Tup2f(new float[] {1.0f, 2.0f});
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2f} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2f t = new Tup2f(1.0f, 2.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#setX(float)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.setX(1.1f));
		assertEquals(1.1f, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#setY(float)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2f t = new Tup2f();
		
		assertSame(t, t.setY(2.2f));
		assertEquals(2.2f, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2f#set(org.barghos.core.api.tuple2.Tup2fR) Tup2f.set(Tup2fR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2f t = mock(Tup2f.class);
		
		Tup2fR t2 = mock(Tup2fR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.1f);
		when(t2.getY()).thenReturn(2.2f);
		
		when(t.set(1.1f, 2.2f)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1.1f, 2.2f);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#set(float)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2f t = mock(Tup2f.class);

		when(t.set(1.1f)).thenCallRealMethod();

		when(t.set(1.1f, 1.1f)).thenReturn(t);
		
		assertSame(t, t.set(1.1f));
		
		verify(t).set(1.1f);

		verify(t).set(1.1f, 1.1f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#set(float, float)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2f t = mock(Tup2f.class);

		when(t.set(1.1f, 2.2f)).thenCallRealMethod();

		when(t.setX(1.1f)).thenReturn(t);
		when(t.setY(2.2f)).thenReturn(t);
		
		assertSame(t, t.set(1.1f, 2.2f));

		verify(t).set(1.1f, 2.2f);
		
		verify(t).setX(1.1f);
		verify(t).setY(2.2f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2f t = new Tup2f(1.1f, 2.2f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2f t = new Tup2f(1.1f, 2.2f);
		
		assertEquals(2.2f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2f t = new Tup2f(1.0f, 2.0f);

		assertEquals(-260045887, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2f#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2f original = new Tup2f(1.0f, 2.0f);
		Tup2f t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2fR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2fR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t2.getX()).thenReturn(3.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2fR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(3.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(3.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2f t1 = new Tup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(3.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2f#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup2f t = new Tup2f(1.1f, 2.2f);
		
		assertEquals("tup2f(x=1.1, y=2.2)", t.toString());
	}
}