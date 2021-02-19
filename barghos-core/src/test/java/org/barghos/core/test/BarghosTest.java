package org.barghos.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.barghos.core.Barghos;
import org.barghos.core.pool.DequePoolFactory;
import org.junit.jupiter.api.Test;

/**
 * This class provides component tests for the class {@link Barghos}
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class BarghosTest
{
	
	/**
	 * This test ensures, that the default value for the global variable {@link Barghos#INSTANCE_POOL_FACTORY}
	 * is the instance of {@link DequePoolFactory}.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void INSTANCE_POOL_FACTORYTest()
	{
		assertTrue(Barghos.INSTANCE_POOL_FACTORY instanceof DequePoolFactory);
		assertSame(DequePoolFactory.get(), Barghos.INSTANCE_POOL_FACTORY);
	}
}