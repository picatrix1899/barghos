package org.barghos.core.api.util;

import java.util.Collection;
import java.util.function.Function;

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
	public static <T> boolean contains(Collection<T> collection, Function<T,Boolean> func)
	{
		for(T value : collection)
		{
			if(func.apply(value))
			{
				return true;
			}
		}
		return false;
	}
}
