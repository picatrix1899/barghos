package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two long input arguments and returns no
 * result. {@link Consumer2L} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2L(long, long)}
 * 
 * @see ConsumerL
 * @see ConsumerExL
 * @see Consumer2L
 * @see ConsumerEx2L
 * @see Consumer3L
 * @see ConsumerEx3L
 * @see Consumer4L
 * @see ConsumerEx4L
 */
@FunctionalInterface
public interface Consumer2L extends Consumer2<Long,Long>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2L(long a, long b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2L} performing this operation and the
	 * operation after.
	 */
	default Consumer2L then2L(Consumer2L after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2L(a, b); after.accept2L(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2L} performing the operation before and
	 * this operation.
	 */
	default Consumer2L before2L(Consumer2L before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2L(a, b); accept2L(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2L} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2L} performing the operations.
	 */
	@SafeVarargs
	static Consumer2L of2L(Consumer2L... consumers)
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
		
		return (a, b) -> { for(Consumer2L consumer : consumers) consumer.accept2L(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2L then(Consumer2<Long,Long> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2L(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2L then(java.util.function.BiConsumer<? super Long,? super Long> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2L(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2L before(Consumer2<Long,Long> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2L(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2L before(java.util.function.BiConsumer<? super Long,? super Long> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2L(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2L} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2L} performing the operations.
	 */
	@SafeVarargs
	static Consumer2L of(Consumer2<Long,Long>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2L) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<Long,Long> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2L(long, long)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Long a, Long b)
	{
		accept2L(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2L andThen(java.util.function.BiConsumer<? super Long,? super Long> after)
	{
		return then(after);
	}
}
