package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupcR;

/**
 * This class provides component tests for the interface {@link TupcR}.
 * 
 * @author picatrix1899
 */
class TupcRTest
{

	/**
	 * This test ensures, that the function {@link TupcR#toArray()} calls the
	 * function {@link TupcR#toArray(char[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupcR t = mock(TupcR.class);
		
		char[] array = new char[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new char[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new char[2]);
		
		verifyNoMoreInteractions(t);
	}
}