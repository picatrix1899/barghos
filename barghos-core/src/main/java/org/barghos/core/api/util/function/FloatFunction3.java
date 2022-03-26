package org.barghos.core.api.util.function;


/**
 * This functional interface represents a function with a generic return type and three float parameters.
 * 
 * @param <T> The return type.
 * 
 * @author picatrix1899
 */
@FunctionalInterface
public interface FloatFunction3<T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * @param b The third parameter.
	 * 
	 * @return The result of the function.
	 */
	public T apply(float a, float b, float c);
}
