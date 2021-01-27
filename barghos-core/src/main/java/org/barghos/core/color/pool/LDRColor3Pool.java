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

package org.barghos.core.color.pool;

import org.barghos.core.api.pool.Pool;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3iR;

import org.barghos.core.Barghos;
import org.barghos.core.color.LDRColor3;
import org.barghos.core.util.ArgumentNullException;

/**
 * This specialized instance pool contains instances of the type {@link LDRColor3}.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class LDRColor3Pool
{
	/**
	 * This variable contains the internal pool that is backing this specialized pool.
	 */
	private static Pool<LDRColor3> pool = Barghos.INSTANCE_POOL_FACTORY.create(LDRColor3.class);
	
	/**
	 * This class contains only static methods and therefore it should not be possible to create
	 * instances from it.
	 * 
	 * @since 1.0.0.0
	 */
	private LDRColor3Pool() { }
	
	/**
	 * Returns an instance of {@link LDRColor3} from the pool and does not reset it.
	 * This function is useful for reducing unneccessary calls and operations if a value is
	 * applied to to the tuple anyway before it is used.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 getPlain()
	{
		return pool.get();
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and resets it.
	 * 
	 * @return A stored instance with the components set to 0.0f.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get()
	{
		return pool.get().set(0.0f);
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and adopts the components from t.
	 * the values of t are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param t A tuple that contains the rgb values in unitspace.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get(Tup3fR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return pool.get().set(t);
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and adopts the components from t.
	 * the values of t are interpreted as in colorspace (0 - 255) and are clamped to these limit.
	 * 
	 * @param t A tuple that contains the rgb values in colorspace.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get(Tup3iR t)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(t == null) throw new ArgumentNullException("t");
		}
		
		return pool.get().set(t);
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and sets its components to scalar.
	 * scalar is interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * It is not actually "scaling" the rgb values!
	 * It is just a value that the rgb values are set to.
	 * 
	 * @param scalar A scalar in unitspace.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get(float scalar)
	{
		return pool.get().set(scalar);
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and sets its components to scalar.
	 * scalar is interpreted as in colorrange (0 - 255) and are clamped to these limit.
	 * It is not actually "scaling" the rgb values!
	 * It is just a value that the rgb values are set to.
	 * 
	 * @param scalar A scalar in colorrange.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get(int scalar)
	{
		return pool.get().set(scalar);
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and sets its components to r, g and b.
	 * r, g and b are interpreted as in unitspace (0.0 - 1.0) and are clamped to these limit.
	 * 
	 * @param r The red component.
	 * @param g The green component.
	 * @param b The blue component.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get(float r, float g, float b)
	{
		return pool.get().set(r, g, b); 
	}
	
	/**
	 * Returns an instance of LDRColor3 from the pool and sets its components to r, g and b.
	 * r, g and b are interpreted as in colorrange (0 - 255) and are clamped to these limit.
	 * 
	 * @param r The red component.
	 * @param g The green component.
	 * @param b The blue component.
	 * 
	 * @return A stored instance.
	 * 
	 * @since 1.0.0.0
	 */
	public static LDRColor3 get(int r, int g, int b)
	{
		return pool.get().set(r, g, b);
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
	 * Stores LDRColor3 instances in the pool for late reuse.
	 * 
	 * @param elements The instances to store.
	 * 
	 * @since 1.0.0.0
	 */
	public static void store(LDRColor3... instances)
	{
		pool.store(instances);
	}
	
	/** 
	 * Sets the internal used pool. This can be used for replacing the default pool
	 * by a more efficient pool or a debuggable pool.
	 * 
	 * @param pool The new pool instance the specialized {@link LDRColor3Pool} should use internal.
	 * 
	 * @since 1.0.0.0
	 */
	public static void setInternalPool(Pool<LDRColor3> pool)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(pool == null) throw new ArgumentNullException("pool");
		}
		
		LDRColor3Pool.pool = pool;
	}
	
	/**
	 * Returns the internal used pool instance.
	 * 
	 * @return The internal used pool instance of the specialized pool {@link LDRColor3Pool}.
	 * 
	 * @since 1.0.0.0
	 */
	public static Pool<LDRColor3> getInternalPool()
	{
		return pool;
	}
}