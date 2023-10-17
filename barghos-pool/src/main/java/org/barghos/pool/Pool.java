package org.barghos.pool;

/**
 * This interface represents an instance pool.
 * An instance pool can store and provide instances for later re-usage.
 * 
 * @param <T> The type of the elements stored in the pool.
 */
public interface Pool<T>
{
	/**
	 * Returns a stored instance and removes it from the pool.
	 * 
	 * @return A stored instance.
	 */
	T get();
	
	/**
	 * Returns always a new instance.
	 * 
	 * @return A new instance.
	 */
	T getNew();
	
	/**
	 * Ensures that the given amount of instances is present in the pool.
	 * This also sets the amount of instances that should be kept when {@link #reduce()} is called.
	 * 
	 * @param count The amount of instances that should be present in the pool.
	 */
	void ensure(int count);
	
	/**
	 * Stores one or more instances in the pool.
	 * 
	 * @param instances Instances of the type of the pool.
	 * 
	 * @return The number of instances inserted into the pool.
	 */
	int store(@SuppressWarnings("unchecked") T... instances);
	
	/**
	 * Returns the current instance count in the pool.
	 * 
	 * @return the current instance count.
	 */
	int size();
	
	/**
	 * Reduces the amount of instances to the amount defined by {@link #ensure(int)}
	 * by removing the instances from the pool and therefore make them available to the garbage collector.
	 */
	void reduce();
	
	/**
	 * Removes all instances from the pool and therefore make them available to the garbage collector.
	 */
	void clear();
}