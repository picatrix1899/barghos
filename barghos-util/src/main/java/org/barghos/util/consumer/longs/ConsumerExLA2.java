package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional long array input
 * arguments and returns no result. Unlike {@link ConsumerLA2} this may throw
 * exceptions. {@link ConsumerExLA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptLA2(long[][])}
 * 
 * @see ConsumerLA2
 * @see ConsumerExLA2
 * @see Consumer2LA2
 * @see ConsumerEx2LA2
 * @see Consumer3LA2
 * @see ConsumerEx3LA2
 * @see Consumer4LA2
 * @see ConsumerEx4LA2
 */
@FunctionalInterface
public interface ConsumerExLA2 extends ConsumerEx<long[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptLA2(long[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExLA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExLA2 thenLA2(ConsumerExLA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptLA2(a); after.acceptLA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExLA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExLA2 beforeLA2(ConsumerExLA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptLA2(a); acceptLA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExLA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExLA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExLA2 ofLA2(ConsumerExLA2... consumers)
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
		
		return (a) -> { for(ConsumerExLA2 consumer : consumers) consumer.acceptLA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptLA2(long[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[][] a) throws Exception
	{
		acceptLA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExLA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExLA2 then(ConsumerEx<long[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptLA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExLA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExLA2 before(ConsumerEx<long[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExLA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExLA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExLA2 of(ConsumerEx<long[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExLA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<long[][]> consumer : consumers) consumer.accept(a); };
	}
}
