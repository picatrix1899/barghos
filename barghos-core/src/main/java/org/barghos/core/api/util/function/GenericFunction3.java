package org.barghos.core.api.util.function;


/**
 * This functional interface represents a function with a generic return type and three generic parameters.
 * 
 * @param <A> The type of the first parameter.
 * @param <B> The type of the second parameter.
 * @param <B> The type of the third parameter.
 * @param <T> The return type.
 * 
 * @author picatrix1899
 */
@FunctionalInterface
public interface GenericFunction3<A,B,C,T>
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
	T apply(A a, B b, C c);
}
