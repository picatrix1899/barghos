package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional long array input
 * arguments and returns no result. Unlike {@link ConsumerLA} this may throw
 * exceptions. {@link ConsumerExLA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptLA(long[])}
 * 
 * @see ConsumerLA
 * @see ConsumerExLA
 * @see Consumer2LA
 * @see ConsumerEx2LA
 * @see Consumer3LA
 * @see ConsumerEx3LA
 * @see Consumer4LA
 * @see ConsumerEx4LA
 */
@FunctionalInterface
public interface ConsumerExLA extends ConsumerEx<long[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptLA(long[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExLA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExLA thenLA(ConsumerExLA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptLA(a); after.acceptLA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExLA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExLA beforeLA(ConsumerExLA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptLA(a); acceptLA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExLA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExLA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExLA ofLA(ConsumerExLA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExLA consumer : consumers) consumer.acceptLA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptLA(long[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[] a) throws Exception
	{
		acceptLA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExLA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExLA then(ConsumerEx<long[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptLA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExLA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExLA before(ConsumerEx<long[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExLA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExLA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExLA of(ConsumerEx<long[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExLA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<long[]> consumer : consumers) consumer.accept(a); };
	}
}
