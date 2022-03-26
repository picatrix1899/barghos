package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple2.Tup2cR;

import org.barghos.core.tuple2.ImmutableTup2c;

/**
 * This class provides component tests for the class {@link ImmutableTup2c}.
 * 
 * @author picatrix1899
 */
class ImmutableTup2cTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2c} generated from an existing instance of {@link TupcR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b'});
		
		ImmutableTup2c t = new ImmutableTup2c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2c} generated from an existing instance of {@link Tup2cR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2cR original = mock(Tup2cR.class);
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		
		ImmutableTup2c t = new ImmutableTup2c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2c} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2c t = new ImmutableTup2c('a');
		
		assertEquals('a', t.getX());
		assertEquals('a', t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2c} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2c t = new ImmutableTup2c(new char[] {'a', 'b'});
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2c} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2c t = new ImmutableTup2c('a', 'b');
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2c#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2c t = new ImmutableTup2c('a', 'b');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2c#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2c t = new ImmutableTup2c('a', 'b');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2c#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2c t = new ImmutableTup2c('a', 'b');

		assertEquals(4066, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2c#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2c original = new ImmutableTup2c('a', 'b');
		ImmutableTup2c t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2cR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2cR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t2.getX()).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2cR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2c t1 = new ImmutableTup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2c#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2c t = new ImmutableTup2c('a', 'b');
		
		assertEquals("immutableTup2c(x=a, y=b)", t.toString());
	}
}