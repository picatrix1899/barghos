package org.barghos.util.collection;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * This class provides utilities for collections.
 * 
 * @author picatrix1899
 */
public class CollectionUtils
{
	/**
	 * This class contains only static functions and must therefore not be instanciated.
	 */
	private CollectionUtils() {}
	
	/**
	 * Returns true if the given collection contains any element for which the given
	 * condition provided as a function is true. Otherwise it returns false.
	 * 
	 * @param <T> The type of the entries in the collection.
	 * @param collection The collection to search.
	 * @param func The condition provided as a function.
	 * 
	 * @return Returns if the collection contains any element that matches the condition.
	 */
	public static <T> boolean contains(Collection<T> collection, Predicate<T> func)
	{
		for(T value : collection)
		{
			if(func.test(value))
			{
				return true;
			}
		}
		return false;
	}
}
