package org.barghos.core.api.util;


/**
 * This functional interface represents a function with a generic return type and two generic parameters.
 * 
 * @param <A> The type of the first parameter.
 * @param <B> The type of the second parameter.
 * @param <T> The return type.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
@FunctionalInterface
public interface GenericFunction2<A,B,T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * 
	 * @return The result of the function.
	 */
	T apply(A a, B b);
}
