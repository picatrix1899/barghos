package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple.TupbigiRW;
import org.barghos.core.api.tuple.TupbigiW;

/**
 * This class provides component tests for the interface {@link TupbigiRW}.
 * 
 * @author picatrix1899
 */
class TupbigiRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupbigiRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(TupbigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiW}.
	 */
	@Test
	void inheritance_TupbigiWTest()
	{
		assertTrue(TupbigiW.class.isAssignableFrom(TupbigiRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigiRW#getNewInstance(TupbigiR)} calls
	 * the function {@link TupbigiRW#getNewInstance(BigInteger[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		TupbigiRW newInstance = mock(TupbigiRW.class);
		TupbigiRW t = mock(TupbigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigiRW#getNewInstance(BigInteger)} calls
	 * the function {@link TupbigiRW#getNewInstanceFromArray(BigInteger[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupbigiRW newInstance = mock(TupbigiRW.class);
		TupbigiRW t = mock(TupbigiRW.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.ONE})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.ONE});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiRW#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigiRW t = mock(TupbigiRW.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiRW#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigiRW t = mock(TupbigiRW.class);
		
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
	 * This test ensures, that the function {@link TupbigiRW#setArray(BigInteger[])} relays
	 * all array entries to the corresponding component by calling {@link TupbigiRW#setByIndex(int, BigInteger)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigiRW t = mock(TupbigiRW.class);
		
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