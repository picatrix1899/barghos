package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional char array input
 * arguments and returns no result. Unlike {@link Consumer3CA} this may throw
 * exceptions. {@link ConsumerEx3CA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3CA(char[], char[], char[])}
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
public interface ConsumerEx3CA extends ConsumerEx3<char[],char[],char[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept3CA(char[] a, char[] b, char[] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3CA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3CA then3CA(ConsumerEx3CA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3CA(a, b, c); after.accept3CA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3CA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3CA before3CA(ConsumerEx3CA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3CA(a, b, c); accept3CA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3CA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3CA of3CA(ConsumerEx3CA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3CA consumer : consumers) consumer.accept3CA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3CA(char[], char[], char[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(char[] a, char[] b, char[] c) throws Exception
	{
		accept3CA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3CA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3CA then(ConsumerEx3<char[],char[],char[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3CA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3CA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3CA before(ConsumerEx3<char[],char[],char[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3CA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3CA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3CA of(ConsumerEx3<char[],char[],char[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3CA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<char[],char[],char[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
