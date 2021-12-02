package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple2.Tup2strR;

import org.barghos.core.tuple2.Tup2str;

/**
 * This class provides component tests for the class {@link Tup2str}.
 * 
 * @since 1.0.0.0
 */
class Tup2strTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2str#Tup2str()} sets the components to "".
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2str t = new Tup2str();
		
		assertEquals("", t.x);
		assertEquals("", t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2str} generated from an existing instance of {@link TupstrR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		
		when(original.getArray()).thenReturn(new String[] {"a", "b"});
		
		Tup2str t = new Tup2str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2str} generated from an existing instance of {@link Tup2strR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2strR original = mock(Tup2strR.class);
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		
		Tup2str t = new Tup2str(original);
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2str} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2str t = new Tup2str("a");
		
		assertEquals("a", t.getX());
		assertEquals("a", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2str} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2str t = new Tup2str(new String[] {"a", "b"});
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2str} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2str t = new Tup2str("a", "b");
		
		assertEquals("a", t.getX());
		assertEquals("b", t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#setX(String)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.setX("a"));
		assertEquals("a", t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#setY(String)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2str t = new Tup2str();
		
		assertSame(t, t.setY("b"));
		assertEquals("b", t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2str#set(org.barghos.core.api.tuple2.Tup2strR) Tup2str.set(Tup2strR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup2str t = mock(Tup2str.class);
		
		Tup2strR t2 = mock(Tup2strR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		
		when(t.set("a", "b")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set("a", "b");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#set(String)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup2str t = mock(Tup2str.class);

		when(t.set("a")).thenCallRealMethod();

		when(t.set("a", "a")).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");

		verify(t).set("a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#set(String, String)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2str t = mock(Tup2str.class);

		when(t.set("a", "b")).thenCallRealMethod();

		when(t.setX("a")).thenReturn(t);
		when(t.setY("b")).thenReturn(t);
		
		assertSame(t, t.set("a", "b"));

		verify(t).set("a", "b");
		
		verify(t).setX("a");
		verify(t).setY("b");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2str t = new Tup2str("a", "b");
		
		assertEquals("a", t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2str t = new Tup2str("a", "b");
		
		assertEquals("b", t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2str t = new Tup2str("a", "b");

		assertEquals(4066, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2str original = new Tup2str("a", "b");
		Tup2str t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2strR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2strR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t2.getX()).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2strR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("b");
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupstrR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2str t1 = new Tup2str("a", "b");
		
		TupstrR t2 = mock(TupstrR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn("a");
		when(t2.getByIndex(1)).thenReturn("c");
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2str#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2str t = new Tup2str("arg1", "arg2");
		
		assertEquals("tup2str(x=arg1, y=arg2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getNewInstance(String, String)}
	 * returns a new instance of {@link Tup2str} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup2str original = new Tup2str("a", "b");
		Tup2str newInstance = original.getNewInstance("c", "d");
		
		assertEquals("a", original.getX());
		assertEquals("b", original.getY());
		assertEquals("c", newInstance.getX());
		assertEquals("d", newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2str#getNewInstance(String)} calls
	 * the function {@link Tup2str#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2str newInstance = mock(Tup2str.class);
		Tup2str t = mock(Tup2str.class);
		
		when(t.getNewInstance("a")).thenCallRealMethod();

		when(t.getNewInstance("a", "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance("a"));
		
		verify(t).getNewInstance("a");
		
		verify(t).getNewInstance("a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2str#getNewInstance(Tup2strR)}
	 * returns a new instance of {@link Tup2str} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2strR original = mock(Tup2strR.class);
		Tup2str newInstance = mock(Tup2str.class);
		Tup2str t = mock(Tup2str.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		when(t.getNewInstance("a", "b")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance("a", "b");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2str#getNewInstance(TupstrR)} calls
	 * the function {@link Tup2str#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		Tup2str newInstance = mock(Tup2str.class);
		Tup2str t = mock(Tup2str.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new String[] {"a", "b"});
		when(t.getNewInstance("a", "b")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance("a", "b");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2str#getNewInstanceFromArray(String[])} calls
	 * the function {@link Tup2str#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2str newInstance = mock(Tup2str.class);
		Tup2str t = mock(Tup2str.class);
		
		when(t.getNewInstanceFromArray(new String[] {"a", "b"})).thenCallRealMethod();

		when(t.getNewInstance("a", "b")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new String[] {"a", "b"}));
		
		verify(t).getNewInstanceFromArray(new String[] {"a", "b"});
		
		verify(t).getNewInstance("a", "b");
		
		verifyNoMoreInteractions(t);
	}
}