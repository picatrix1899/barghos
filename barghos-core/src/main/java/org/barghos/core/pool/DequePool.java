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

package org.barghos.core.pool;

import java.lang.reflect.Constructor;

import java.util.ArrayDeque;
import java.util.Deque;

import org.barghos.core.Barghos;
import org.barghos.core.exception.ArgumentNullException;
import org.barghos.core.pool.api.Pool;

/**
 * This instance pool utilizes a {@link ArrayDeque} as internal list.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class DequePool<T> implements Pool<T>
{
	/**
	 * This member contains the internal list of instances.
	 */
	private final Deque<T> store = new ArrayDeque<>();
	
	/**
	 * This member contains the number of instances that should always be present in the pool.
	 */
	private int ensuredSize = 0;
	
	/**
	 * This member contains the class from the type that this pool contains.
	 * It is used to create new instances if a instance is requested and the pool is empty.
	 */
	private Class<? extends T> clazz;
	
	/**
	 * Creates a new Pool of the given type.
	 * The class of the type is required for creating new instances if the pool is empty.
	 * <br><br><b><u>Important:</u></b> The class needs a default constructor for being instanced by the pool.
	 * 
	 * @param clazz The class of the used type.
	 * 
	 * @since 1.0.0.0
	 */
	public DequePool(Class<? extends T> clazz)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(clazz == null) throw new ArgumentNullException("clazz");
		}
		
		this.clazz = clazz;
	}
	
	/**
	 * Creates a new Pool of the given type with the given amount of initial entries.
	 * The class of the type is required for creating new instances if the pool is empty.
	 * <br><br><b><u>Important:</u></b> The class needs a default constructor for being instanced by the pool.
	 * 
	 * @param clazz The class of the used type.
	 * @param size The number of initial entries to pregenerate
	 * 
	 * @since 1.0.0.0
	 */
	public DequePool(Class<? extends T> clazz, int size)
	{
		this(clazz);
	
		ensure(size);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public T get()
	{
		if(this.store.size() > 0)
		{
			return this.store.pop();
		}
		
		return getNew();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public int store(@SuppressWarnings("unchecked") T... t)
	{
		int count = 0;
		
		if(t.length > 0)
		{
			for(int i = 0; i < t.length; i++)
			{
				if(t[i] != null)
				{
					this.store.push(t[i]);
					count++;
				}
			}
		}
		
		return count;
	}

	/**
	 * {@inheritDoc}
	 */
	public T getNew()
	{
		try
		{
			Constructor<? extends T> c = this.clazz.getConstructor();
			
			return c.newInstance();
		}
		catch (Exception e)
		{
			throw new Error(e);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void ensure(int count)
	{
		if(count < 0) throw new IllegalArgumentException();
		if(count == 0) return;
		
		int size = this.store.size();
		
		if(count <= size) return;
		
		int neededInstances = count - size;

		for(int i = 0; i < neededInstances; i++)
		{
			this.store.push(getNew());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void reduce()
	{
		int amountToReduce = this.store.size() - this.ensuredSize;
	
		if(amountToReduce <= 0) return;
		
		for(int i = 0; i < amountToReduce; i++)
			this.store.pop();
	}

	/**
	 * {@inheritDoc}
	 */
	public void clear()
	{
		this.store.clear();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public int size()
	{
		return this.store.size();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String toString()
	{
		return "dequepool(class=" + this.clazz.getCanonicalName() + ", size=" + this.store.size() + ", ensuredSize=" + this.ensuredSize + ")";
	}
}
