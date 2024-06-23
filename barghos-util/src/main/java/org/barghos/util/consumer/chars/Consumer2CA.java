package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional char array input
 * arguments and returns no result. {@link Consumer2CA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2CA(char[], char[])}
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
public interface Consumer2CA extends Consumer2<char[],char[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2CA(char[] a, char[] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2CA} performing this operation and the
	 * operation after.
	 */
	default Consumer2CA then2CA(Consumer2CA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2CA(a, b); after.accept2CA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2CA} performing the operation before and
	 * this operation.
	 */
	default Consumer2CA before2CA(Consumer2CA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2CA(a, b); accept2CA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2CA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2CA of2CA(Consumer2CA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2CA consumer : consumers) consumer.accept2CA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2CA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2CA then(Consumer2<char[],char[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2CA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2CA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2CA then(java.util.function.BiConsumer<? super char[],? super char[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2CA(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2CA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2CA before(Consumer2<char[],char[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2CA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2CA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2CA before(java.util.function.BiConsumer<? super char[],? super char[]> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2CA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2CA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2CA of(Consumer2<char[],char[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2CA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<char[],char[]> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2CA(char[], char[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(char[] a, char[] b)
	{
		accept2CA(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2CA andThen(java.util.function.BiConsumer<? super char[],? super char[]> after)
	{
		return then(after);
	}
}
