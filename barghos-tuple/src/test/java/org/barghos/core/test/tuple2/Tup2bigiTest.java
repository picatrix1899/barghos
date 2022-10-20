package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.tuple2.Tup2bigi;
import org.barghos.tuple.api.tn.TupbigiR;
import org.barghos.tuple.api.tn2.Tup2bigiR;

/**
 * This class provides component tests for the class {@link Tup2bigi}.
 */
class Tup2bigiTest
{
	/**
	 * This test ensures, that the constructor {@link Tup2bigi#Tup2bigi()} aktually works and
	 * that the components are set to 0.
	 */
	@Test
	void ctor_DefaultTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertEquals(BigInteger.ZERO, t.x);
		assertEquals(BigInteger.ZERO, t.y);
	}

	/**
	 * This test ensures, that an instance of {@link Tup2bigi} generated from an existing instance of {@link TupbigiR},
	 * returns the correct components.
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		
		when(original.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		Tup2bigi t = new Tup2bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		
		verify(original).toArray();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigi} generated from an existing instance of {@link TupbigiR},
	 * returns the correct components.
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2bigiR original = mock(Tup2bigiR.class);
		
		when(original.getX()).thenReturn(BigInteger.valueOf(1));
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		
		Tup2bigi t = new Tup2bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigi} generated from a scalar,
	 * returns the correct components.
	 */
	@Test
	void ctor_ValueTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigi} generated from an array,
	 * returns the correct components.
	 */
	@Test
	void ctor_ArrayTest()
	{
		Tup2bigi t = new Tup2bigi(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link Tup2bigi} generated from two components,
	 * returns the correct components.
	 */
	@Test
	void ctor_ComponentsTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#setX(BigInteger)} sets the x component on the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setXTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.setX(BigInteger.valueOf(1)));
		assertEquals(BigInteger.valueOf(1), t.x);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#setY(BigInteger)} sets the y component on the tuple
	 * to the value and returns the current tuple.
	 */
	@Test
	void setYTest()
	{
		Tup2bigi t = new Tup2bigi();
		
		assertSame(t, t.setY(BigInteger.valueOf(2)));
		assertEquals(BigInteger.valueOf(2), t.y);
	}
	
	/**
	 * This test ensures, that the function
	 * {@link Tup2bigi#set(org.barghos.core.api.tuple2.Tup2bigiR) Tup2bigd.set(Tup2bigiR)}
	 * adopts the components from the input tuple and returns the current tuple.
	 */
	@Test
	void set_CloneTest()
	{
		Tup2bigi t = mock(Tup2bigi.class);
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
	
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		
		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#set(BigInteger)} sets the components
	 * to the value and returns the current tuple.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigi t = mock(Tup2bigi.class);

		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.valueOf(1)));
		
		verify(t).set(BigInteger.valueOf(1));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#set(BigInteger, BigInteger)} set the components
	 * to the respective parameters and returns the current tuple.
	 */
	@Test
	void set_ComponentsTest()
	{
		Tup2bigi t = mock(Tup2bigi.class);

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2)));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		verify(t).setX(BigInteger.valueOf(1));
		verify(t).setY(BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#getX()} actually returns the value of the
	 * x component.
	 */
	@Test
	void getXTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#getY()} actually returns the value of the
	 * y component.
	 */
	@Test
	void getYTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigi#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		Tup2bigi original = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		Tup2bigi t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2bigiR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		Tup2bigi t1 = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link Tup2bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals("tup2bigi(x=1, y=2)", t.toString());
	}
}