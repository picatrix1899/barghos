package org.barghos.pool;

import java.lang.reflect.Constructor;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This instance pool utilizes a {@link ArrayDeque} as internal list.
 * 
 * @param <T> The type of the elements stored in the pool.
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
	
	@Override
	public T get()
	{
		if(this.store.size() > 0)
		{
			return this.store.pop();
		}
		
		return getNew();
	}
	
	@Override
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
	
	@Override
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
	
	@Override
	public void ensure(int count)
	{
		if(count < 0) throw new IllegalArgumentException();
		if(count == 0) return;
		
		this.ensuredSize = count;
		
		int size = this.store.size();
		
		if(count <= size) return;
		
		int neededInstances = count - size;
		
		for(int i = 0; i < neededInstances; i++)
		{
			this.store.push(getNew());
		}
	}
	
	@Override
	public void reduce()
	{
		int amountToReduce = this.store.size() - this.ensuredSize;
		
		if(amountToReduce <= 0) return;
		
		for(int i = 0; i < amountToReduce; i++)
			this.store.pop();
	}
	
	@Override
	public void clear()
	{
		this.store.clear();
	}
	
	@Override
	public int size()
	{
		return this.store.size();
	}
	
	@Override
	public String toString()
	{
		return "dequepool(class=" + this.clazz.getCanonicalName() + ", size=" + this.store.size() + ", ensuredSize=" + this.ensuredSize + ")";
	}
}