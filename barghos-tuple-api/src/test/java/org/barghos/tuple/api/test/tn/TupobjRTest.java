package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides component tests for the interface {@link TupobjR}.
 * 
 * @author picatrix1899
 */
class TupobjRTest
{

	/**
	 * This test ensures, that the function {@link TupobjR#toArray()} calls the
	 * function {@link TupobjR#toArray(Object[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupobjR t = mock(TupobjR.class);
		
		Object[] array = new Object[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new Object[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new Object[2]);
		
		verifyNoMoreInteractions(t);
	}
}