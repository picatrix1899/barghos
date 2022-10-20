package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupstrR;

/**
 * This class provides component tests for the interface {@link TupstrR}.
 * 
 * @author picatrix1899
 */
class TupstrRTest
{

	/**
	 * This test ensures, that the function {@link TupstrR#toArray()} calls the
	 * function {@link TupstrR#toArray(String[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupstrR t = mock(TupstrR.class);
		
		String[] array = new String[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new String[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new String[2]);
		
		verifyNoMoreInteractions(t);
	}
}