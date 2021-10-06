package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupcR;

/**
 * This class provides component tests for the interface {@link TupcR}.
 * 
 * @author picatrix1899
 */
class TupcRTest
{
	/**
	 * This test ensures, that the function {@link TupcR#isFinite()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TupcR t = mock(TupcR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcR#isValid()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isValidTest()
	{
		TupcR t = mock(TupcR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupcR#getNewInstance(TupcR)} calls
	 * the function {@link TupcR#getNewInstance(char[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		TupcR newInstance = mock(TupcR.class);
		TupcR t = mock(TupcR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b'});
		when(t.getNewInstanceFromArray(new char[] {'a', 'b'})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b'});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupcR#getNewInstance(char)} calls
	 * the function {@link TupcR#getNewInstanceFromArray(char[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupcR newInstance = mock(TupcR.class);
		TupcR t = mock(TupcR.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new char[] {'a', 'a'})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new char[] {'a', 'a'});
		
		verifyNoMoreInteractions(t);
	}
}