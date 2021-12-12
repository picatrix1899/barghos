package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple2.Tup2boR;

import org.barghos.core.tuple2.ImmutableTup2bo;

/**
 * This class provides component tests for the class {@link ImmutableTup2bo}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup2boTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bo} generated from an existing instance of {@link TupboR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		
		when(original.getArray()).thenReturn(new boolean[] {true, false});
		
		ImmutableTup2bo t = new ImmutableTup2bo(original);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bo} generated from an existing instance of {@link Tup2boR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2boR original = mock(Tup2boR.class);
		
		when(original.getX()).thenReturn(true);
		when(original.getY()).thenReturn(false);
		
		ImmutableTup2bo t = new ImmutableTup2bo(original);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bo} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(true);
		
		assertEquals(true, t.getX());
		assertEquals(true, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bo} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(new boolean[] {true, false});
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bo} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(true, false);
		
		assertEquals(true, t.getX());
		assertEquals(false, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(true, false);
		
		assertEquals(true, t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(true, false);
		
		assertEquals(false, t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(true, false);

		assertEquals(992, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2bo original = new ImmutableTup2bo(true, false);
		ImmutableTup2bo t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2boR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2boR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t2.getX()).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2boR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(false);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(false);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupboR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2bo t1 = new ImmutableTup2bo(true, false);
		
		TupboR t2 = mock(TupboR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(true);
		when(t2.getByIndex(1)).thenReturn(true);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bo#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2bo t = new ImmutableTup2bo(true, false);
		
		assertEquals("immutableTup2bo(x=true, y=false)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#getNewInstance(boolean, boolean)}
	 * returns a new instance of {@link ImmutableTup2bo} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup2bo original = new ImmutableTup2bo(true, false);
		ImmutableTup2bo newInstance = original.getNewInstance(false, true);
		
		assertEquals(true, original.getX());
		assertEquals(false, original.getY());
		assertEquals(false, newInstance.getX());
		assertEquals(true, newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2bo#getNewInstance(boolean)} calls
	 * the function {@link ImmutableTup2bo#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup2bo newInstance = mock(ImmutableTup2bo.class);
		ImmutableTup2bo t = mock(ImmutableTup2bo.class);
		
		when(t.getNewInstance(true)).thenCallRealMethod();

		when(t.getNewInstance(true, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(true));
		
		verify(t).getNewInstance(true);
		
		verify(t).getNewInstance(true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bo#getNewInstance(Tup2boR)}
	 * returns a new instance of {@link ImmutableTup2bo} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2boR original = mock(Tup2boR.class);
		ImmutableTup2bo newInstance = mock(ImmutableTup2bo.class);
		ImmutableTup2bo t = mock(ImmutableTup2bo.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(true);
		when(original.getY()).thenReturn(false);
		when(t.getNewInstance(true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(true, false);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2bo#getNewInstance(TupboR)} calls
	 * the function {@link ImmutableTup2bo#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		ImmutableTup2bo newInstance = mock(ImmutableTup2bo.class);
		ImmutableTup2bo t = mock(ImmutableTup2bo.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new boolean[] {true, false});
		when(t.getNewInstance(true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(true, false);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2bo#getNewInstanceFromArray(boolean[])} calls
	 * the function {@link ImmutableTup2bo#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup2bo newInstance = mock(ImmutableTup2bo.class);
		ImmutableTup2bo t = mock(ImmutableTup2bo.class);
		
		when(t.getNewInstanceFromArray(new boolean[] {true, false})).thenCallRealMethod();

		when(t.getNewInstance(true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new boolean[] {true,false}));
		
		verify(t).getNewInstanceFromArray(new boolean[] {true, false});
		
		verify(t).getNewInstance(true, false);
		
		verifyNoMoreInteractions(t);
	}
}