package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple2.Tup2sR;
import org.barghos.core.tuple2.Tup2s;

/**
 * This class provides component tests for the class {@link Tup2s}.
 * 
 * @since 1.0.0.0
 */
class Tup2sTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2s#Tup2s()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2s t = new Tup2s();
		
		assertEquals((short)0, t.x);
		assertEquals((short)0, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2s} generated from an existing instance of {@link TupsR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2});
		
		Tup2s t = new Tup2s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2s} generated from an existing instance of {@link Tup2sR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2sR original = mock(Tup2sR.class);
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		
		Tup2s t = new Tup2s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2s} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2s t = new Tup2s((short)1);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2s} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2s t = new Tup2s(new short[] {(short)1, (short)2});
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2s} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#setX(short)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.setX((short)1));
		assertEquals((short)1, t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#setY(short)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2s t = new Tup2s();
		
		assertSame(t, t.setY((short)2));
		assertEquals((short)2, t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2s#set(org.barghos.core.api.tuple2.Tup2sR) Tup2s.set(Tup2sR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup2s t = mock(Tup2s.class);
		
		Tup2sR t2 = mock(Tup2sR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		
		when(t.set((short)1, (short)2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set((short)1, (short)2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#set(short)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup2s t = mock(Tup2s.class);

		when(t.set((short)1)).thenCallRealMethod();

		when(t.set((short)1, (short)1)).thenReturn(t);
		
		assertSame(t, t.set((short)1));
		
		verify(t).set((short)1);

		verify(t).set((short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#set(short, short)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2s t = mock(Tup2s.class);

		when(t.set((short)1, (short)2)).thenCallRealMethod();

		when(t.setX((short)1)).thenReturn(t);
		when(t.setY((short)2)).thenReturn(t);
		
		assertSame(t, t.set((short)1, (short)2));

		verify(t).set((short)1, (short)2);
		
		verify(t).setX((short)1);
		verify(t).setY((short)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals((short)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2s original = new Tup2s((short)1, (short)2);
		Tup2s t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2sR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2sR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t2.getX()).thenReturn((short)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2sR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((short)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2s t1 = new Tup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)3);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2s#toString()} function prshorts the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2s t = new Tup2s((short)1, (short)2);
		
		assertEquals("tup2s(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2s#getNewInstance(short, short)}
	 * returns a new instance of {@link Tup2s} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup2s original = new Tup2s((short)1, (short)2);
		Tup2s newInstance = original.getNewInstance((short)3, (short)4);
		
		assertEquals((short)1, original.getX());
		assertEquals((short)2, original.getY());
		assertEquals((short)3, newInstance.getX());
		assertEquals((short)4, newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2s#getNewInstance(short)} calls
	 * the function {@link Tup2s#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2s newInstance = mock(Tup2s.class);
		Tup2s t = mock(Tup2s.class);
		
		when(t.getNewInstance((short)1)).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((short)1));
		
		verify(t).getNewInstance((short)1);
		
		verify(t).getNewInstance((short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bd#getNewInstance(Tup2sR)}
	 * returns a new instance of {@link Tup2s} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2sR original = mock(Tup2sR.class);
		Tup2s newInstance = mock(Tup2s.class);
		Tup2s t = mock(Tup2s.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2s#getNewInstance(TupsR)} calls
	 * the function {@link Tup2s#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		Tup2s newInstance = mock(Tup2s.class);
		Tup2s t = mock(Tup2s.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2s#getNewInstanceFromArray(short[])} calls
	 * the function {@link Tup2s#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2s newInstance = mock(Tup2s.class);
		Tup2s t = mock(Tup2s.class);
		
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)2})).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new short[] {(short)1, (short)2}));
		
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)2});
		
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t);
	}
}