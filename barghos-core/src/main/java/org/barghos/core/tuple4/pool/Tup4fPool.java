/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.core.tuple4.pool;

import org.barghos.core.api.pool.Pool;
import org.barghos.core.api.tuple4.Tup4fR;

import org.barghos.core.Barghos;
import org.barghos.core.tuple4.Tup4f;
import org.barghos.core.util.ArgumentNullException;

/**
 * This specialized instance pool contains instances of the type {@link Tup4f}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public final class Tup4fPool
{
	/**
	 * This variable contains the internal pool that is backing this specialized pool.
	 */
	private static Pool<Tup4f> pool = Barghos.INSTANCE_POOL_FACTORY.create(Tup4f.class);
	
	/**
	 * This class contains only static methods and therefore it should not be possible to create
	 * instances from it.
	 * 
	 * @since 1.0.0.0
	 */
	private Tup4fPool() { }
	
	/**
	 * Returns an instance of {@link Tup4f} from the pool and does not reset it.
	 * This function is useful for reducing unneccessary calls and operations if a value is
	 * applied to to the tuple anyway before it is used.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static Tup4f getPlain()
	{
		return pool.get();
	}
	
	/**
	 * Returns an instance of {@link Tup4f} from the pool and resets it.
	 * 
	 * @return A stored instance with the components set to 0.0f.
	 * 
	 * @since 1.0.0.0
	 */
	public static Tup4f get()
	{
		return pool.get().set(0.0f);
	}
	
	/**
	 * Returns an instance of {@link Tup4f} from the pool and sets its components to the values of t.
	 * 
	 * @param t A tuple that is used as initial values of the returned tuple.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static Tup4f get(Tup4fR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return pool.get().set(t);
	}
	
	/**
	 * Returns an instance of {@link Tup4f} from the pool and sets its components to value.
	 * 
	 * @param value A value that the components are set to.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static Tup4f get(float value)
	{
		return pool.get().set(value);
	}
	
	/**
	 * Returns an instance of {@link Tup4f} from the pool and sets its components to x, y, z and w.
	 * 
	 * @param x The x component.
	 * @param y The y component.
	 * @param z The z component.
	 * @param w The w component.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static Tup4f get(float x, float y, float z, float w)
	{
		return pool.get().set(x, y, z, w);
	}
	
	/**
	 * Ensures a certain amount of instances to be present in the pool at any time.
	 * A call to this method will eventually cause the pool to create instances to fullfill the ensured amount.
	 * 
	 * @param count The amount of instances present in the pool at any time.
	 * 
	 * @since 1.0.0.0
	 */
	public static void ensure(int count)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(count < 0) throw new IllegalArgumentException();
		}
		
		pool.ensure(count);
	}
	
	/**
	 * Stores {@link Tup4f} instances in the pool for later reuse.
	 * 
	 * @param elements The instances to store.
	 * 
	 * @since 1.0.0.0
	 */
	public static void store(Tup4f... instances)
	{
		pool.store(instances);
	}
	
	/** 
	 * Sets the internal used pool. This can be used for replacing the default pool
	 * by a more efficient pool or a debuggable pool.
	 * 
	 * @param pool The new pool instance the specialized {@link Tup4fPool} should use internal.
	 * 
	 * @since 1.0.0.0
	 */
	public static void setInternalPool(Pool<Tup4f> pool)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(pool == null) throw new ArgumentNullException("pool");
		}
		
		Tup4fPool.pool = pool;
	}
	
	/**
	 * Returns the internal used pool instance.
	 * 
	 * @return The internal used pool instance of the specialized pool {@link Tup4fPool}.
	 * 
	 * @since 1.0.0.0
	 */
	public static Pool<Tup4f> getInternalPool()
	{
		return pool;
	}
}