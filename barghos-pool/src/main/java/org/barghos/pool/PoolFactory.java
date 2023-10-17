package org.barghos.pool;

/**
 * This interface represents a pool factory.
 * A pool factory is typically used to create all necessary instances of instance pools.
 */
public interface PoolFactory
{
	/**
	 * Creates a new instance of a Pool for the given type.
	 * 
	 * @param <T> The type the new Pool should contain.
	 * 
	 * @param clazz The class from the type the new Pool should contain.
	 * 
	 * @return A new instance of a pool.
	 */
	<T> Pool<T> create(Class<? extends T> clazz);
}