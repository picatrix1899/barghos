package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupboR;

/**
 * This class provides component tests for the interface {@link TupboR}
 * @author picatrix1899
 */
public class TupboRTest
{
	/**
	 * This test ensures, that the function {@link TupbR#toArray()} calls
	 * the function {@link TupbR#toArray(byte[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupboR t = mock(TupboR.class);
		
		boolean[] array = new boolean[2];
		
		when(t.toArray()).thenCallRealMethod();
		when(t.getDimensions()).thenReturn(2);

		when(t.toArray(new boolean[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		
		verify(t).toArray(new boolean[2]);
		
		verifyNoMoreInteractions(t);
	}
}
