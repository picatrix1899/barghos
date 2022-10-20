package org.barghos.core.api.util.function;


/**
 * This functional interface represents a function with a generic return type and two double parameters.
 * 
 * @param <T> The return type.
 * 
 * @author picatrix1899
 */
@FunctionalInterface
public interface DoubleFunction2<T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * 
	 * @return The result of the function.
	 */
	public T apply(double a, double b);
}
