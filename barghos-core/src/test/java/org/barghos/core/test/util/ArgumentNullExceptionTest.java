package org.barghos.core.test.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.util.ArgumentNullException;

/**
 * This class provides component tests for the class {@link org.barghos.core.util.ArgumentNullException ArgumentNullException}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class ArgumentNullExceptionTest
{
	/**
	 * This test ensures, that the function {@link org.barghos.core.util.ArgumentNullException#getArgument() ArgumentNullException.getArgument()}
	 * returns the parameter name spezified in the constructor of the class.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getArgumentTest()
	{
		ArgumentNullException ex = new ArgumentNullException("testArgument");
		
		assertEquals("testArgument", ex.getArgument());
	}
}
