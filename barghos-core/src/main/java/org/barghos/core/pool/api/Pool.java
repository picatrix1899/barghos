/*
MIT License

Copyright (c) 2019 picatrix1899

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.pool.api;

/**
 * This interface represents an instance pool.
 * An instance pool can store and provide instances for later reusage.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Pool<T>
{
	/**
	 * Returns a stored instance and removes it from the pool.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	T get();
	
	/**
	 * Returns always a new instance.
	 * 
	 * @return A new instance.
	 * 
	 * @since 1.0.0.0
	 */
	T getNew();
	
	/**
	 * Ensures that the given amount of instances is present in the pool.
	 * 
	 * @param count The amount of instances that should be always present in the pool.
	 * 
	 * @since 1.0.0.0
	 */
	void ensure(int count);
	
	/**
	 * Stores one or more instances in the pool.
	 * 
	 * @param t instances of the type of the pool.
	 * 
	 * @since 1.0.0.0
	 */
	int store(@SuppressWarnings("unchecked") T... instance);
	
	/**
	 * Returns the current instance count in the pool.
	 * 
	 * @return the current instance count.
	 * 
	 * @since 1.0.0.0
	 */
	int size();
	
	/**
	 * Reduces the amount of instances to the amount defined by {@link Pool#ensure(int)}
	 * by removing the instances from the pool and therefore make them available to the garbage collector.
	 * 
	 * @since 1.0.0.0
	 */
	void reduce();
	
	/**
	 * Removes all instances from the pool and therefore make them available to the garbage collector.
	 * 
	 * @sice 1.0.0.0
	 */
	void clear();
}
