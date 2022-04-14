package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple.TupstrR;

/**
 * This class provides component tests for the interface {@link TupstrR}.
 * 
 * @author picatrix1899
 */
class TupstrRTest
{
	/**
	 * This test ensures, that the function {@link TupstrR#isValid()} returns true
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		TupstrR t = mock(TupstrR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn("");
		when(t.getByIndex(1)).thenReturn("");
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrR#isValid()} returns false
	 * after checking the first component, if the first component is null.
	 */
	@Test
	void isValid_FailEarlyTest()
	{
		TupstrR t = mock(TupstrR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrR#isValid()} returns false
	 * after checking all components, if only the last component is null.
	 */
	@Test
	void isValid_FailTest()
	{
		TupstrR t = mock(TupstrR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn("");
		when(t.getByIndex(1)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrR#getArray()} calls
	 * the function {@link TupstrR#toArray(String[])} with a new array with the size
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