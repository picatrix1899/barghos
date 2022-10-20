package org.barghos.core.api.util.function;


/**
 * This functional interface represents a function with a generic return type and three double parameters.
 * 
 * @param <T> The return type.
 * 
 * @author picatrix1899
 */
@FunctionalInterface
public interface DoubleFunction3<T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * @param c The third parameter.
	 * 
	 * @return The result of the function.
	 */
	public T apply(double a, double b, double c);
}
