package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple2.Tup2iR;

import org.barghos.core.tuple2.Tup2i;

/**
 * This class provides component tests for the class {@link Tup2i}.
 * 
 * @since 1.0.0.0
 */
class Tup2iTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2i#Tup2i()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2i t = new Tup2i();
		
		assertEquals(0, t.x);
		assertEquals(0, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2i} generated from an existing instance of {@link TupiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		
		when(original.getArray()).thenReturn(new int[] {1, 2});
		
		Tup2i t = new Tup2i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2i} generated from an existing instance of {@link Tup2iR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2iR original = mock(Tup2iR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		
		Tup2i t = new Tup2i(original);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2i} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2i t = new Tup2i(1);
		
		assertEquals(1, t.getX());
		assertEquals(1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2i} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2i t = new Tup2i(new int[] {1, 2});
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2i} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals(1, t.getX());
		assertEquals(2, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#setX(int)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.setX(1));
		assertEquals(1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#setY(int)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2i t = new Tup2i();
		
		assertSame(t, t.setY(2));
		assertEquals(2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2i#set(org.barghos.core.api.tuple2.Tup2iR) Tup2i.set(Tup2iR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup2i t = mock(Tup2i.class);
		
		Tup2iR t2 = mock(Tup2iR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		
		when(t.set(1, 2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#set(int)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup2i t = mock(Tup2i.class);

		when(t.set(1)).thenCallRealMethod();

		when(t.set(1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#set(int, int)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2i t = mock(Tup2i.class);

		when(t.set(1, 2)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		
		assertSame(t, t.set(1, 2));

		verify(t).set(1, 2);
		
		verify(t).setX(1);
		verify(t).setY(2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals(1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals(2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2i t = new Tup2i(1, 2);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2i original = new Tup2i(1, 2);
		Tup2i t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2iR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2iR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t2.getX()).thenReturn(3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2iR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2i t1 = new Tup2i(1, 2);
		
		TupiR t2 = mock(TupiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1);
		when(t2.getByIndex(1)).thenReturn(3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2i#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2i t = new Tup2i(1, 2);
		
		assertEquals("tup2i(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getNewInstance(int, int)}
	 * returns a new instance of {@link Tup2i} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup2i original = new Tup2i(1, 2);
		Tup2i newInstance = original.getNewInstance(3, 4);
		
		assertEquals(1, original.getX());
		assertEquals(2, original.getY());
		assertEquals(3, newInstance.getX());
		assertEquals(4, newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2i#getNewInstance(int)} calls
	 * the function {@link Tup2i#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2i newInstance = mock(Tup2i.class);
		Tup2i t = mock(Tup2i.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2i#getNewInstance(Tup2iR)}
	 * returns a new instance of {@link Tup2i} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2iR original = mock(Tup2iR.class);
		Tup2i newInstance = mock(Tup2i.class);
		Tup2i t = mock(Tup2i.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(t.getNewInstance(1, 2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1, 2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2i#getNewInstance(TupiR)} calls
	 * the function {@link Tup2i#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		Tup2i newInstance = mock(Tup2i.class);
		Tup2i t = mock(Tup2i.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2});
		when(t.getNewInstance(1, 2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2i#getNewInstanceFromArray(int[])} calls
	 * the function {@link Tup2i#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2i newInstance = mock(Tup2i.class);
		Tup2i t = mock(Tup2i.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2})).thenCallRealMethod();

		when(t.getNewInstance(1, 2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2});
		
		verify(t).getNewInstance(1, 2);
		
		verifyNoMoreInteractions(t);
	}
}