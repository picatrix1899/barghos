package org.barghos.util.predicate;

import java.util.Objects;

import org.barghos.validation.ParameterValidation;

/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDouble()}.
 *
 * @param <A> the type of the first input parameter of the predicate.
 */
@FunctionalInterface
public interface Predicate<A> extends java.util.function.Predicate<A>
{
	/**
	 * Evaluates this predicate on the given argument.
	 *
	 * @param a The first input parameter.
	 * 
	 * @return {@code true} if the input parameter matches the predicate,
	 * otherwise {@code false}.
	 */
	@Override
	boolean test(A a);

	/**
	 * Returns a composed predicate that represents a short-circuiting logical
	 * AND of this predicate and another.  When evaluating the composed
	 * predicate, if this predicate is {@code false}, then the {@code other}
	 * predicate is not evaluated.
	 *
	 * <p>Any exceptions thrown during evaluation of either predicate are relayed
	 * to the caller; if evaluation of this predicate throws an exception, the
	 * {@code other} predicate will not be evaluated.
	 *
	 * @param other
	 * a predicate that will be logically-ANDed with this predicate.
	 *			  
	 * @return a composed predicate that represents the short-circuiting logical
	 * AND of this predicate and the {@code other} predicate
	 * 
	 * @throws NullPointerException if other is null
	 */
	default Predicate<A> and(Predicate<A> other)
	{
		ParameterValidation.pvNotNull("other", other);
		
		return (a) -> test(a) && other.test(a);
	}

	/**
	 * Returns a predicate that represents the logical negation of this
	 * predicate.
	 *
	 * @return a predicate that represents the logical negation of this
	 * predicate
	 */
	default Predicate<A> negate()
	{
		return (a) -> !test(a);
	}

	/**
	 * Returns a composed predicate that represents a short-circuiting logical
	 * OR of this predicate and another.  When evaluating the composed
	 * predicate, if this predicate is {@code true}, then the {@code other}
	 * predicate is not evaluated.
	 *
	 * <p>Any exceptions thrown during evaluation of either predicate are relayed
	 * to the caller; if evaluation of this predicate throws an exception, the
	 * {@code other} predicate will not be evaluated.
	 *
	 * @param other a predicate that will be logically-ORed with this
	 *			  predicate
	 *			  
	 * @return a composed predicate that represents the short-circuiting logical
	 * OR of this predicate and the {@code other} predicate
	 * 
	 * @throws NullPointerException if other is null
	 */
	default Predicate<A> or(Predicate<A> other)
	{
		ParameterValidation.pvNotNull("other", other);
		
		return (a) -> test(a) || other.test(a);
	}

	/**
	 * Returns a predicate that tests if two arguments are equal according
	 * to {@link Objects#equals(Object, Object)}.
	 *
	 * @param <T> the type of arguments to the predicate
	 * 
	 * @param targetRef the object reference with which to compare for equality,
	 *			   which may be {@code null}
	 *			   
	 * @return a predicate that tests if two arguments are equal according
	 * to {@link Objects#equals(Object, Object)}
	 */
	static <A> Predicate<A> isEqual(Object targetRef)
	{
		return (null == targetRef) ? Objects::isNull : (object) -> targetRef.equals(object);
	}

	/**
	 * Returns a predicate that is the negation of the supplied predicate.
	 * This is accomplished by returning result of the calling
	 * {@code target.negate()}.
	 *
	 * @param <T>	 the type of arguments to the specified predicate
	 * 
	 * @param target  predicate to negate
	 *
	 * @return a predicate that negates the results of the supplied
	 *		 predicate
	 *
	 * @throws NullPointerException if target is null
	 */
	static <A> Predicate<A> not(Predicate<A> target)
	{
		ParameterValidation.pvNotNull("target", target);
		
		return target.negate();
	}
}
