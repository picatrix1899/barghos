package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple2.Tup2bigdR;

import org.barghos.core.tuple2.Tup2bigd;

/**
 * This class provides component tests for the class {@link Tup2bigd}.
 * 
 * @since 1.0.0.0
 */
class Tup2bigdTest
{
	/**
	 * This test ensures, that the default constructor {@link Tup2bigd#Tup2bigd()} sets the components to 0.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertEquals(BigDecimal.ZERO, t.x);
		assertEquals(BigDecimal.ZERO, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2bigd} generated from an existing instance of {@link TupbigdR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		
		Tup2bigd t = new Tup2bigd(original);
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigd} generated from an existing instance of {@link Tup2bigdR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2bigdR original = mock(Tup2bigdR.class);
		
		when(original.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(original.getY()).thenReturn(BigDecimal.valueOf(2.0));
		
		Tup2bigd t = new Tup2bigd(original);
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigd} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.0));
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(1.0), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigd} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2bigd t = new Tup2bigd(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigd} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		assertEquals(BigDecimal.valueOf(1.0), t.getX());
		assertEquals(BigDecimal.valueOf(2.0), t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#setX(BigDecimal)} sets the x component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setXTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.setX(BigDecimal.valueOf(1.1)));
		assertEquals(BigDecimal.valueOf(1.1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#setY(BigDecimal)} sets the y component of the tuple
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void setYTest()
	{
		Tup2bigd t = new Tup2bigd();
		
		assertSame(t, t.setY(BigDecimal.valueOf(2.2)));
		assertEquals(BigDecimal.valueOf(2.2), t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2bigd#set(org.barghos.core.api.tuple2.Tup2bigdR) Tup2bigd.set(Tup2bigdR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_CloneTest()
	{
		Tup2bigd t = mock(Tup2bigd.class);
		
		Tup2bigdR t2 = mock(Tup2bigdR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.1));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.2));
		
		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#set(BigDecimal)} sets the components
	 * to the value and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigd t = mock(Tup2bigd.class);

		when(t.set(BigDecimal.valueOf(1.1))).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1)));
		
		verify(t).set(BigDecimal.valueOf(1.1));

		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#set(BigDecimal, BigDecimal)} set the components
	 * to the respective parameters and returns the current tuple.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2bigd t = mock(Tup2bigd.class);

		when(t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.1))).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2.2))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2)));

		verify(t).set(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		verify(t).setX(BigDecimal.valueOf(1.1));
		verify(t).setY(BigDecimal.valueOf(2.2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals(BigDecimal.valueOf(1.1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals(BigDecimal.valueOf(2.2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));

		assertEquals(11223, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2bigd original = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		Tup2bigd t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2bigdR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		Tup2bigdR t2 = mock(Tup2bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		Tup2bigdR t2 = mock(Tup2bigdR.class);
		
		when(t2.getX()).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		Tup2bigdR t2 = mock(Tup2bigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2bigd t1 = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getByIndex(1)).thenReturn(BigDecimal.valueOf(4.0));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigd#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		assertEquals("tup2bigd(x=1.1, y=2.2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#getNewInstance(BigDecimal, BigDecimal)}
	 * returns a new instance of {@link Tup2bigd} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		Tup2bigd original = new Tup2bigd(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		Tup2bigd newInstance = original.getNewInstance(BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));
		
		assertEquals(BigDecimal.valueOf(1.0), original.getX());
		assertEquals(BigDecimal.valueOf(2.0), original.getY());
		assertEquals(BigDecimal.valueOf(3.0), newInstance.getX());
		assertEquals(BigDecimal.valueOf(4.0), newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigd#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup2bigd#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2bigd newInstance = mock(Tup2bigd.class);
		Tup2bigd t = mock(Tup2bigd.class);
		
		when(t.getNewInstance(BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.valueOf(1.0)));
		
		verify(t).getNewInstance(BigDecimal.valueOf(1.0));
		
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigd#getNewInstance(Tup2bigdR)}
	 * returns a new instance of {@link Tup2bigd} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2bigdR original = mock(Tup2bigdR.class);
		Tup2bigd newInstance = mock(Tup2bigd.class);
		Tup2bigd t = mock(Tup2bigd.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(original.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigd#getNewInstance(TupbigdR)} calls
	 * the function {@link Tup2bigd#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		Tup2bigd newInstance = mock(Tup2bigd.class);
		Tup2bigd t = mock(Tup2bigd.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigd#getNewInstanceFromArray(BigDecimal[])} calls
	 * the function {@link Tup2bigd#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2bigd newInstance = mock(Tup2bigd.class);
		Tup2bigd t = mock(Tup2bigd.class);
		
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)})).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)}));
		
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		
		verify(t).getNewInstance(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
		
		verifyNoMoreInteractions(t);
	}
}