package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple2.Tup2sR;

import org.barghos.core.tuple2.ImmutableTup2s;

/**
 * This class provides component tests for the class {@link ImmutableTup2s}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup2sTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2s} generated from an existing instance of {@link TupsR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2});
		
		ImmutableTup2s t = new ImmutableTup2s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2s} generated from an existing instance of {@link Tup2sR},
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
		
		ImmutableTup2s t = new ImmutableTup2s(original);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2s} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2s t = new ImmutableTup2s((short)1);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)1, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2s} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2s t = new ImmutableTup2s(new short[] {(short)1, (short)2});
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2s} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2s t = new ImmutableTup2s((short)1, (short)2);
		
		assertEquals((short)1, t.getX());
		assertEquals((short)2, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2s#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2s t = new ImmutableTup2s((short)1, (short)2);
		
		assertEquals((short)1, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2s#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2s t = new ImmutableTup2s((short)1, (short)2);
		
		assertEquals((short)2, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2s#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2s t = new ImmutableTup2s((short)1, (short)2);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2s#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2s original = new ImmutableTup2s((short)1, (short)2);
		ImmutableTup2s t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2sR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2sR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t2.getX()).thenReturn((short)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2sR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)2);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((short)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupsR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2s t1 = new ImmutableTup2s((short)1, (short)2);
		
		TupsR t2 = mock(TupsR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn((short)1);
		when(t2.getByIndex(1)).thenReturn((short)4);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2s#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2s t = new ImmutableTup2s((short)1, (short)2);
		
		assertEquals("immutableTup2s(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2s#getNewInstance(short, short)}
	 * returns a new instance of {@link ImmutableTup2s} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup2s original = new ImmutableTup2s((short)1, (short)2);
		ImmutableTup2s newInstance = original.getNewInstance((short)3, (short)4);
		
		assertEquals(1, original.getX());
		assertEquals(2, original.getY());
		assertEquals(3, newInstance.getX());
		assertEquals(4, newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2s#getNewInstance(short)} calls
	 * the function {@link ImmutableTup2s#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup2s newInstance = mock(ImmutableTup2s.class);
		ImmutableTup2s t = mock(ImmutableTup2s.class);
		
		when(t.getNewInstance((short)1)).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((short)1));
		
		verify(t).getNewInstance((short)1);
		
		verify(t).getNewInstance((short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2s#getNewInstance(Tup2sR)}
	 * returns a new instance of {@link ImmutableTup2s} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2sR original = mock(Tup2sR.class);
		ImmutableTup2s newInstance = mock(ImmutableTup2s.class);
		ImmutableTup2s t = mock(ImmutableTup2s.class);
		
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
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2s#getNewInstance(TupsR)} calls
	 * the function {@link ImmutableTup2s#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		ImmutableTup2s newInstance = mock(ImmutableTup2s.class);
		ImmutableTup2s t = mock(ImmutableTup2s.class);
		
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
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2s#getNewInstanceFromArray(short[])} calls
	 * the function {@link ImmutableTup2s#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup2s newInstance = mock(ImmutableTup2s.class);
		ImmutableTup2s t = mock(ImmutableTup2s.class);
		
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)2})).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new short[] {(short)1, (short)2}));
		
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)2});
		
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t);
	}
}