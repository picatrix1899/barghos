package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional char array input
 * arguments and returns no result. {@link Consumer4CA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4CA(char[], char[], char[], char[])}
 * 
 * @see ConsumerCA
 * @see ConsumerExCA
 * @see Consumer2CA
 * @see ConsumerEx2CA
 * @see Consumer3CA
 * @see ConsumerEx3CA
 * @see Consumer4CA
 * @see ConsumerEx4CA
 */
@FunctionalInterface
public interface Consumer4CA extends Consumer4<char[],char[],char[],char[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4CA(char[] a, char[] b, char[] c, char[] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4CA} performing this operation and the
	 * operation after.
	 */
	default Consumer4CA then4CA(Consumer4CA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4CA(a, b, c, d); after.accept4CA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4CA} performing the operation before and
	 * this operation.
	 */
	default Consumer4CA before4CA(Consumer4CA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4CA(a, b, c, d); accept4CA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4CA} performing the operations.
	 */
	@SafeVarargs
	static Consumer4CA of4CA(Consumer4CA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4CA consumer : consumers) consumer.accept4CA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4CA(char[], char[], char[], char[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(char[] a, char[] b, char[] c, char[] d)
	{
		accept4CA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4CA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4CA then(Consumer4<char[],char[],char[],char[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4CA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4CA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4CA before(Consumer4<char[],char[],char[],char[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4CA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4CA} performing the operations.
	 */
	@SafeVarargs
	static Consumer4CA of(Consumer4<char[],char[],char[],char[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4CA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<char[],char[],char[],char[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
