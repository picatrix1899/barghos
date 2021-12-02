package org.barghos.core.test.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple2.Tup2bigdR;
import org.barghos.core.api.tuple2.Tup2bigiR;

import org.barghos.core.tuple2.ImmutableTup2bigi;

/**
 * This class provides component tests for the class {@link PTup2bigi}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ImmutableTup2bigiTest
{
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bigi} generated from an existing instance of {@link TupbigiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		ImmutableTup2bigi t = new ImmutableTup2bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		
		verify(original).getArray();
		
		verifyNoMoreInteractions(original);
	}
	
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bigi} generated from an existing instance of {@link Tup2bigiR},
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_Tuple2Test()
	{
		Tup2bigiR original = mock(Tup2bigiR.class);
		
		when(original.getX()).thenReturn(BigInteger.valueOf(1));
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		
		ImmutableTup2bigi t = new ImmutableTup2bigi(original);
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
		
		verify(original).getX();
		verify(original).getY();
		
		verifyNoMoreInteractions(original);
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bigi} generated from a scalar,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ValueTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(BigInteger.valueOf(1));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(1), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bigi} generated from an array,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ArrayTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
	}
	
	/**
	 * This test ensures, that an instance of {@link ImmutableTup2bigi} generated from two components,
	 * returns the correct components.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void ctor_ComponentsTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(BigInteger.valueOf(2), t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bigi#getX()} actually returns the value of the
	 * x component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getXTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(1), t.getX());
		assertEquals(t.x, t.getX());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bigi#getY()} actually returns the value of the
	 * y component.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getYTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals(BigInteger.valueOf(2), t.getY());
		assertEquals(t.y, t.getY());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bigi#hashCode()} eturns the correct hash.
	 */
	@Test
	void hashCodeTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));

		assertEquals(994, t.hashCode());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bigi#clone()} creates a new instance that satisfies
	 * the requirements for clone-funktions.
	 */
	@Test
	void cloneTest()
	{
		ImmutableTup2bigi original = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		ImmutableTup2bigi t = original.clone();
		
		assertFalse(original == t);
		assertTrue(original.equals(t));
		assertTrue(t.equals(original));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns true if
	 * the object to test is the same as the testing object.
	 */
	@Test
	void equals_SameTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertTrue(t1.equals(t1));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is null.
	 */
	@Test
	void equals_NullTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertFalse(t1.equals(null));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is of an unsupported type.
	 */
	@Test
	void equals_IncompatibleTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertFalse(t1.equals(new Object()));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link Tup2bigiR} and has the same values as the testing object.
	 */
	@Test
	void equals_Tuple2Test()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingXTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link Tup2bigdR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple2_VaryingYTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns true if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * the same values as the testing object.
	 */
	@Test
	void equals_TupleTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		
		assertTrue(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has a different amount of dimensions
	 * as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingDimensionsTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(1);
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the x component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingXTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#equals(Object)} method returns false if
	 * the object to test is of the type {@link TupbigiR} and has the same amount of dimensions and
	 * a different value of the y component as the testing object.
	 */
	@Test
	void equals_Tuple_VaryingYTest()
	{
		ImmutableTup2bigi t1 = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t2.getDimensions()).thenReturn(2);
		when(t2.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		when(t2.getByIndex(1)).thenReturn(BigInteger.valueOf(4));
		
		assertFalse(t1.equals(t2));
	}
	
	/**
	 * This test ensures, that the {@link ImmutableTup2bigi#toString()} function prints the components correctly.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void toStringTest()
	{
		ImmutableTup2bigi t = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		assertEquals("immutableTup2bigi(x=1, y=2)", t.toString());
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bigi#getNewInstance(BigInteger, BigInteger)}
	 * returns a new instance of {@link ImmutableTup2bigi} with the given values.
	 */
	@Test
	void getNewInstance_ComponentsTest()
	{
		ImmutableTup2bigi original = new ImmutableTup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		ImmutableTup2bigi newInstance = original.getNewInstance(BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		assertEquals(BigInteger.valueOf(1), original.getX());
		assertEquals(BigInteger.valueOf(2), original.getY());
		assertEquals(BigInteger.valueOf(3), newInstance.getX());
		assertEquals(BigInteger.valueOf(4), newInstance.getY());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2bigi#getNewInstance(BigInteger)} calls
	 * the function {@link ImmutableTup2bigi#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		ImmutableTup2bigi newInstance = mock(ImmutableTup2bigi.class);
		ImmutableTup2bigi t = mock(ImmutableTup2bigi.class);
		
		when(t.getNewInstance(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.valueOf(1)));
		
		verify(t).getNewInstance(BigInteger.valueOf(1));
		
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link ImmutableTup2bigi#getNewInstance(Tup2bigiR)}
	 * returns a new instance of {@link ImmutableTup2bigi} with the given values.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2bigiR original = mock(Tup2bigiR.class);
		ImmutableTup2bigi newInstance = mock(ImmutableTup2bigi.class);
		ImmutableTup2bigi t = mock(ImmutableTup2bigi.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.valueOf(1));
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2bigi#getNewInstance(TupbigiR)} calls
	 * the function {@link ImmutableTup2bigi#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		ImmutableTup2bigi newInstance = mock(ImmutableTup2bigi.class);
		ImmutableTup2bigi t = mock(ImmutableTup2bigi.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link ImmutableTup2bigi#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link ImmutableTup2bigi#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		ImmutableTup2bigi newInstance = mock(ImmutableTup2bigi.class);
		ImmutableTup2bigi t = mock(ImmutableTup2bigi.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		verify(t).getNewInstance(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
}