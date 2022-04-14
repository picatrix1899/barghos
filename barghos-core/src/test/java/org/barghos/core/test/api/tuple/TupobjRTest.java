package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupobjR;

/**
 * This class provides component tests for the interface {@link TupobjR}.
 * 
 * @author picatrix1899
 */
class TupobjRTest
{
	/**
	 * This test ensures, that the function {@link TupobjR#isValid()} returns true
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		TupobjR t = mock(TupobjR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(new Object());
		when(t.getByIndex(1)).thenReturn(new Object());
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupobjR#isValid()} returns false
	 * after checking the first component, if the first component is null.
	 */
	@Test
	void isValid_FailEarlyTest()
	{
		TupobjR t = mock(TupobjR.class);
		
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
	 * This test ensures, that the function {@link TupobjR#isValid()} returns false
	 * after checking all components, if only the last component is null.
	 */
	@Test
	void isValid_FailTest()
	{
		TupobjR t = mock(TupobjR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(new Object());
		when(t.getByIndex(1)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupobjR#getArray()} calls
	 * the function {@link TupobjR#toArray(Object[])} with a new array with the size
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