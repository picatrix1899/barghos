package org.barghos.core.test.pool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.pool.Pool;

import org.barghos.core.pool.DequePool;
import org.barghos.core.pool.DequePoolFactory;

/**
 * This class provides component tests for the class {@link DequePoolFactory}
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
class DequePoolFactoryTest
{
	/**
	 * This test ensures, that the function {@link DequePoolFactory#get()}
	 * creates a singleton instance of the {@link DequePoolFactory} and returns it.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void getSingletonTest()
	{
		DequePoolFactory f = DequePoolFactory.get();
		
		assertNotNull(f);
		assertSame(f, DequePoolFactory.get());
	}
	
	/**
	 * This test ensures, that the function {@link DequePoolFactory#create(Class)}
	 * creates an instance of {@link DequePool} for the spezified type.
	 * 
	 * @since 1.0.0.0
	 */
	@Test
	void createTest()
	{
		Pool<TestClass> p = DequePoolFactory.get().create(TestClass.class);
		
		assertNotNull(p);
		assertTrue(p instanceof DequePool);
	}
	
	/**
	 * This is a test class.
	 * 
	 * @author picatrix1899
	 */
	class TestClass
	{
		
	}
}