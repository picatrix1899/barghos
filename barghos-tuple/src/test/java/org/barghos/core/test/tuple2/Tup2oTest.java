package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.tuple2.Tup2o;
import org.barghos.tuple.api.t2.Tup2oR;

/**
 * This class provides component tests for the class {@link Tup2o}.
 */
class Tup2oTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2o#Tup2o()} sets the components to null.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>();
		
		assertEquals(null, t.x);
		assertEquals(null, t.y);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2o} generated from an existing instance of {@link Tup2oR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup2oR<Integer,Double> original = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		
		Tup2o<Integer,Double> t = new Tup2o<>(original);
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2o} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>(1, 1.0);
		
		assertEquals(1, (int)t.getX());
		assertEquals(1.0, (double)t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#setX(Object)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>();
		
		assertSame(t, t.setX(1));
		assertEquals(1, (int)t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#setY(Object)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>();
		
		assertSame(t, t.setY(1.0));
		assertEquals(1.0, (double)t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2o#set(org.barghos.tuple.api.t2.Tup2oR) Tup2o.set(Tup2oR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		@SuppressWarnings("unchecked")
		Tup2o<Integer,Double> t = (Tup2o<Integer,Double>)mock(Tup2o.class);
		
		@SuppressWarnings("unchecked")
		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		
		when(t.set(1, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 1.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#set(Object, Object)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		@SuppressWarnings("unchecked")
		Tup2o<Integer,Double> t = (Tup2o<Integer,Double>)mock(Tup2o.class);

		when(t.set(1, 1.0)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0));

		verify(t).set(1, 1.0);
		
		verify(t).setX(1);
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>(1, 1.0);
		
		assertEquals(1, (int)t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>(1, 1.0);
		
		assertEquals(1.0, (double)t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>(1, 1.0);

		assertEquals(1072694240, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2o#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2o<Integer,Double> original = new Tup2o<>(1, 1.0);
		Tup2o<Integer,Double> t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2o<Integer,Double> t1 = new Tup2o<>(1, 1.0);
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2o<Integer,Double> t1 = new Tup2o<>(1, 1.0);
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2o<Integer,Double> t1 = new Tup2o<>(1, 1.0);
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2oR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2o<Integer,Double> t1 = new Tup2o<>(1, 1.0);
		
		@SuppressWarnings("unchecked")
		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2oR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2o<Integer,Double> t1 = new Tup2o<>(1, 1.0);
		
		@SuppressWarnings("unchecked")
		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
		
		when(t2.getX()).thenReturn(2);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2oR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2o<Integer,Double> t1 = new Tup2o<>(1, 1.0);
		
		@SuppressWarnings("unchecked")
		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2.0);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2o#toString()} function prints the components correctly.
	 */
	@Test
	void toStringTest()
	{
		Tup2o<Integer,Double> t = new Tup2o<>(1, 1.0);
		
		assertEquals("tup2o(x=1, y=1.0)", t.toString());
	}
}