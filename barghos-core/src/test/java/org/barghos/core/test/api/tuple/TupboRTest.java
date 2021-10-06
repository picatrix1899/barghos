package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupboR;

/**
 * This claa provides component tests for the interface {@link TupboR}.
 * 
 * @author picatrix1899
 */
class TupboRTest
{
	/**
	 * This test ensures, that the function {@link TupboR#isValid()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isValidTest()
	{
		TupboR t = mock(TupboR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupboR#getNewInstance(TupboR)} calls
	 * the function {@link TupboR#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		TupboR newInstance = mock(TupboR.class);
		TupboR t = mock(TupboR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new boolean[] {true, false});
		when(t.getNewInstanceFromArray(new boolean[] {true, false})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new boolean[] {true, false});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupboR#getNewInstance(boolean)} calls
	 * the function {@link TupboR#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupboR newInstance = mock(TupboR.class);
		TupboR t = mock(TupboR.class);
		
		when(t.getNewInstance(true)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new boolean[] {true, true})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(true));
		
		verify(t).getNewInstance(true);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new boolean[] {true, true});
		
		verifyNoMoreInteractions(t);
	}
}