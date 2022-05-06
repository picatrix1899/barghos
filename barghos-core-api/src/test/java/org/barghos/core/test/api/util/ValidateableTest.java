package org.barghos.core.test.api.util;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.util.Validateable;

/**
 * This class provides component tests for the interface {@link Validateable}.
 * 
 * @author picatrix1899
 */
public class ValidateableTest
{
	/**
	 * This test ensures, that the function {@link Validateable#isValid()} returns
	 * always {@code true} and doesn't do any calls.
	 */
	@Test
	void isCloneableTest()
	{
		Validateable ec = mock(Validateable.class);
		
		when(ec.isValid()).thenCallRealMethod();
		
		assertEquals(true, ec.isValid());
		
		verify(ec).isValid();

		verifyNoMoreInteractions(ec);
	}
}
