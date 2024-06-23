package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional char array input
 * arguments and returns no result. Unlike {@link Consumer2C} this may throw
 * exceptions. {@link ConsumerEx2C} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2C(char, char)}
 * 
 * @see ConsumerC
 * @see ConsumerExC
 * @see Consumer2C
 * @see ConsumerEx2C
 * @see Consumer3C
 * @see ConsumerEx3C
 * @see Consumer4C
 * @see ConsumerEx4C
 */
@FunctionalInterface
public interface ConsumerEx2C extends ConsumerEx2<Character,Character>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2C(char a, char b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2C} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2C then2C(ConsumerEx2C after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2C(a, b); after.accept2C(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2C} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2C before2C(ConsumerEx2C before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2C(a, b); accept2C(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2C} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2C of2C(ConsumerEx2C... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2C consumer : consumers) consumer.accept2C(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2C(char, char)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Character a, Character b) throws Exception
	{
		accept2C(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2C} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2C then(ConsumerEx2<Character,Character> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2C(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2C} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2C before(ConsumerEx2<Character,Character> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2C(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2C} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2C of(ConsumerEx2<Character,Character>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2C) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Character,Character> consumer : consumers) consumer.accept(a, b); };
	}
}
