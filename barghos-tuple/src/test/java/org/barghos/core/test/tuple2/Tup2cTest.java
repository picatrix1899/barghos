package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.tuple2.Tup2c;
import org.barghos.tuple.api.t2.Tup2cR;
import org.barghos.tuple.api.tn.TupcR;

/**
 * This class provides component tests for the class {@link Tup2c}.
 */
class Tup2cTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2c#Tup2c()} sets the components to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2c t = new Tup2c();
		
		assertEquals((char)0, t.x);
		assertEquals((char)0, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2c} generated from an existing instance of {@link TupcR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		
		when(original.toArray()).thenReturn(new char[] {'a', 'b'});
		
		Tup2c t = new Tup2c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2c} generated from an existing instance of {@link Tup2cR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2cR original = mock(Tup2cR.class);
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		
		Tup2c t = new Tup2c(original);
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2c} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2c t = new Tup2c('a');
		
		assertEquals('a', t.getX());
		assertEquals('a', t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2c} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2c t = new Tup2c(new char[] {'a', 'b'});
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2c} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals('a', t.getX());
		assertEquals('b', t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#setX(char)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.setX('a'));
		assertEquals('a', t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#setY(char)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2c t = new Tup2c();
		
		assertSame(t, t.setY('b'));
		assertEquals('b', t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2c#set(org.barghos.tuple.api.t2.Tup2cR) Tup2c.set(Tup2cR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2c t = mock(Tup2c.class);
		
		Tup2cR t2 = mock(Tup2cR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		
		when(t.set('a', 'b')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set('a', 'b');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#set(char)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2c t = mock(Tup2c.class);

		when(t.set('a')).thenCallRealMethod();

		when(t.set('a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#set(char, char)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2c t = mock(Tup2c.class);

		when(t.set('a', 'b')).thenCallRealMethod();

		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);
		
		assertSame(t, t.set('a', 'b'));

		verify(t).set('a', 'b');
		
		verify(t).setX('a');
		verify(t).setY('b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals('a', t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals('b', t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2c t = new Tup2c('a','b');

		assertEquals(4066, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2c#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2c original = new Tup2c('a', 'b');
		Tup2c t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2cR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2cR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t2.getX()).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2cR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('b');
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupcR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2c t1 = new Tup2c('a', 'b');
		
		TupcR t2 = mock(TupcR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn('a');
		when(t2.getByIndex(1)).thenReturn('c');
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2c#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		assertEquals("tup2c(x=a, y=b)", t.toString());
	}
}