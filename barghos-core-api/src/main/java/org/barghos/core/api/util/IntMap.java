package org.barghos.core.api.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author picatrix1899
 *
 */
public class IntMap<T> implements Map<Integer,T>
{

	
	
	/*
	 *
	 */
	public int size()
	{
		return 0;
	}

	/*
	 *
	 */
	public boolean isEmpty()
	{
		return false;
	}

	/*
	 *
	 */
	public boolean containsKey(Object key)
	{
		return false;
	}

	/*
	 *
	 */
	public boolean containsValue(Object value)
	{
		return false;
	}

	/*
	 *
	 */
	public T get(Object key)
	{
		return null;
	}

	/*
	 *
	 */
	public T put(Integer key, T value)
	{
		return null;
	}

	/*
	 *
	 */
	public T remove(Object key)
	{
		return null;
	}

	/*
	 *
	 */
	public void putAll(Map<? extends Integer,? extends T> m)
	{
	}

	/*
	 *
	 */
	public void clear()
	{
	}

	/*
	 *
	 */
	public Set<Integer> keySet()
	{
		return null;
	}

	/*
	 *
	 */
	public Collection<T> values()
	{
		return null;
	}

	/*
	 *
	 */
	public Set<Entry<Integer,T>> entrySet()
	{
		return null;
	}

	class Node implements Map.Entry<Integer,T>
	{
		private final int key;
		private T value;
		
		public Node(int key, T value)
		{
			this.key = key;
			this.value = value;
		}
		
		public int getKeyRaw()
		{
			return this.key;
		}
		
		/*
		 *
		 */
		public Integer getKey()
		{
			return this.key;
		}

		/*
		 *
		 */
		public T getValue()
		{
			return this.value;
		}

		/*
		 *
		 */
		public T setValue(T value)
		{
			T oldValue = this.value;
			this.value = value;
			
			return oldValue;
		}
	}
}
