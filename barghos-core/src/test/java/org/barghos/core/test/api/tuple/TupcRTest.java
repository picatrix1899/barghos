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
}