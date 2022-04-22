package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiC;
import org.barghos.core.api.tuple.TupbigiR;

/**
 * This class provides component tests for the interface {@link TupbigiC}.
 * 
 * @author picatrix1899
 */
class TupbigiCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupbigiRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(TupbigiC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigiC t = mock(TupbigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigiC t = mock(TupbigiC.class);
		
		when(t.set(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.ONE})).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE));
		
		verify(t).set(BigInteger.ONE);
		
		verify(t).getDimensions();
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.ONE});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiC#setArray(BigInteger[])} relays
	 * all array entries to the corresponding component by calling {@link TupbigiC#setByIndex(int, BigInteger)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigiC t = mock(TupbigiC.class);
		
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)}));
		
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, BigInteger.ONE);
		verify(t).setByIndex(1, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
}