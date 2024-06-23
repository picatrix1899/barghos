package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two short input arguments and returns no
 * result. {@link Consumer2S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2S(short, short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface Consumer2S extends Consumer2<Short,Short>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2S(short a, short b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2S} performing this operation and the
	 * operation after.
	 */
	default Consumer2S then2S(Consumer2S after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2S(a, b); after.accept2S(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2S} performing the operation before and
	 * this operation.
	 */
	default Consumer2S before2S(Consumer2S before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2S(a, b); accept2S(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2S} performing the operations.
	 */
	@SafeVarargs
	static Consumer2S of2S(Consumer2S... consumers)
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
		
		return (a, b) -> { for(Consumer2S consumer : consumers) consumer.accept2S(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2S then(Consumer2<Short,Short> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2S(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2S then(java.util.function.BiConsumer<? super Short,? super Short> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2S(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2S before(Consumer2<Short,Short> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2S(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2S before(java.util.function.BiConsumer<? super Short,? super Short> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2S(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2S} performing the operations.
	 */
	@SafeVarargs
	static Consumer2S of(Consumer2<Short,Short>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2S) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<Short,Short> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2S(short, short)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Short a, Short b)
	{
		accept2S(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2S andThen(java.util.function.BiConsumer<? super Short,? super Short> after)
	{
		return then(after);
	}
}
