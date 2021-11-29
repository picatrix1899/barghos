package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple2.Tup2lR;

import org.barghos.core.tuple2.ImmutableTup2l;

/**
 * This class provides component tests for the class {@link ImmutableTup2l}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup2lTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2l} generated from an existing instance of {@link TuplR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l});
		
		ImmutableTup2l t = new ImmutableTup2l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2l} generated from an existing instance of {@link Tup2lR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2lR original = mock(Tup2lR.class);
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		
		ImmutableTup2l t = new ImmutableTup2l(original);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2l} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(1l);
		
		assertEquals(1l, t.getX());
		assertEquals(1l, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2l} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(new long[] {1l, 2l});
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2l} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(1l, 2l);
		
		assertEquals(1l, t.getX());
		assertEquals(2l, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2l#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(1l, 2l);
		
		assertEquals(1l, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2l#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(1l, 2l);
		
		assertEquals(2l, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2l#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(1l, 2l);

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2l#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2l original = new ImmutableTup2l(1l, 2l);
		ImmutableTup2l t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2lR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2lR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t2.getX()).thenReturn(4l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2lR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(4l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns true if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(2l);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(4l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#equals(Object)} method returns false if
	 * the object to test is of the type {@link TuplR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2l t1 = new ImmutableTup2l(1l, 2l);
		
		TuplR t2 = mock(TuplR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1l);
		when(t2.getByIndex(1)).thenReturn(4l);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2l#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2l t = new ImmutableTup2l(1l, 2l);
		
		assertEquals("immutableTup2l(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2l#getNewInstance(long, long)}
	 * returns a new instance of {@link ImmutableTup2l} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup2l original = new ImmutableTup2l(1l, 2l);
		ImmutableTup2l newInstance = original.getNewInstance(3l, 4l);
		
		assertEquals(1l, original.getX());
		assertEquals(2l, original.getY());
		assertEquals(3l, newInstance.getX());
		assertEquals(4l, newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2l#getNewInstance(long)} calls
	 * the function {@link ImmutableTup2l#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup2l newInstance = mock(ImmutableTup2l.class);
		ImmutableTup2l t = mock(ImmutableTup2l.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();

		when(t.getNewInstance(1l, 1l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);
		
		verify(t).getNewInstance(1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2l#getNewInstance(Tup2lR)}
	 * returns a new instance of {@link ImmutableTup2l} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2lR original = mock(Tup2lR.class);
		ImmutableTup2l newInstance = mock(ImmutableTup2l.class);
		ImmutableTup2l t = mock(ImmutableTup2l.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t, original);
	}

	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2l#getNewInstance(TuplR)} calls
	 * the function {@link ImmutableTup2l#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		ImmutableTup2l newInstance = mock(ImmutableTup2l.class);
		ImmutableTup2l t = mock(ImmutableTup2l.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2l#getNewInstanceFromArray(long[])} calls
	 * the function {@link ImmutableTup2l#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup2l newInstance = mock(ImmutableTup2l.class);
		ImmutableTup2l t = mock(ImmutableTup2l.class);
		
		when(t.getNewInstanceFromArray(new long[] {1l, 2l})).thenCallRealMethod();

		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new long[] {1l, 2l}));
		
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l});
		
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t);
	}
}