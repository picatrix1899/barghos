package org.barghos.core.api.util.function;


/**
 * This functional interface represents a function with a generic return type and one float parameter.
 * 
 * @param <T> The return type.
 * 
 * @author picatrix1899
 */
@FunctionalInterface
public interface FloatFunction<T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	public T apply(float a);
}
