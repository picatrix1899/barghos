package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;

import org.barghos.core.tuple2.ImmutableTup2f;

/**
 * This class provides component tests for the class {@link ImmutableTup2f}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup2fTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2f} generated from an existing instance of {@link TupfR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		
		when(original.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		
		ImmutableTup2f t = new ImmutableTup2f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2f} generated from an existing instance of {@link Tup2fR},
	 * returns the correct components.
	 *  
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2fR original = mock(Tup2fR.class);
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		
		ImmutableTup2f t = new ImmutableTup2f(original);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2f} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(1.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(1.0f, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2f} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(new float[] {1.0f, 2.0f});
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2f} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(1.0f, 2.0f);
		
		assertEquals(1.0f, t.getX());
		assertEquals(2.0f, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2f#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(1.1f, 2.2f);
		
		assertEquals(1.1f, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2f#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(1.1f, 2.2f);
		
		assertEquals(2.2f, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2f#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(1.0f, 2.0f);

		assertEquals(-260045887, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2f#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2f original = new ImmutableTup2f(1.0f, 2.0f);
		ImmutableTup2f t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2fR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2fR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t2.getX()).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2fR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(2.0f);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupfR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2f t1 = new ImmutableTup2f(1.0f, 2.0f);
		
		TupfR t2 = mock(TupfR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(1.0f);
		when(t2.getByIndex(1)).thenReturn(4.0f);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2f#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2f t = new ImmutableTup2f(1.1f, 2.2f);
		
		assertEquals("immutableTup2f(x=1.1, y=2.2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2f#getNewInstance(float, float)}
	 * returns a new instance of {@link ImmutableTup2f} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup2f original = new ImmutableTup2f(1.0f, 2.0f);
		ImmutableTup2f newInstance = original.getNewInstance(3.0f, 4.0f);
		
		assertEquals(1.0f, original.getX());
		assertEquals(2.0f, original.getY());
		assertEquals(3.0f, newInstance.getX());
		assertEquals(4.0f, newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2f#getNewInstance(float)} calls
	 * the function {@link ImmutableTup2f#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup2f newInstance = mock(ImmutableTup2f.class);
		ImmutableTup2f t = mock(ImmutableTup2f.class);
		
		when(t.getNewInstance(1.0f)).thenCallRealMethod();

		when(t.getNewInstance(1.0f, 1.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0f));
		
		verify(t).getNewInstance(1.0f);
		
		verify(t).getNewInstance(1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2f#getNewInstance(Tup2fR)}
	 * returns a new instance of {@link ImmutableTup2f} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2fR original = mock(Tup2fR.class);
		ImmutableTup2f newInstance = mock(ImmutableTup2f.class);
		ImmutableTup2f t = mock(ImmutableTup2f.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		when(t.getNewInstance(1.0f, 2.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t, original);
	}

	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2f#getNewInstance(TupfR)} calls
	 * the function {@link ImmutableTup2f#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		ImmutableTup2f newInstance = mock(ImmutableTup2f.class);
		ImmutableTup2f t = mock(ImmutableTup2f.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.getNewInstance(1.0f, 2.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2f#getNewInstanceFromArray(float[])} calls
	 * the function {@link ImmutableTup2f#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup2f newInstance = mock(ImmutableTup2f.class);
		ImmutableTup2f t = mock(ImmutableTup2f.class);
		
		when(t.getNewInstanceFromArray(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(t.getNewInstance(1.0f, 2.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new float[] {1.0f, 2.0f}));
		
		verify(t).getNewInstanceFromArray(new float[] {1.0f, 2.0f});
		
		verify(t).getNewInstance(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t);
	}
}