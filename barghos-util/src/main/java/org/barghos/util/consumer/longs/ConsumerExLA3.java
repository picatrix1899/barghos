package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional long array input
 * arguments and returns no result. Unlike {@link ConsumerLA3} this may throw
 * exceptions. {@link ConsumerExLA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptLA3(long[][][])}
 * 
 * @see ConsumerLA3
 * @see ConsumerExLA3
 * @see Consumer2LA3
 * @see ConsumerEx2LA3
 * @see Consumer3LA3
 * @see ConsumerEx3LA3
 * @see Consumer4LA3
 * @see ConsumerEx4LA3
 */
@FunctionalInterface
public interface ConsumerExLA3 extends ConsumerEx<long[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptLA3(long[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExLA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExLA3 thenLA3(ConsumerExLA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptLA3(a); after.acceptLA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExLA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExLA3 beforeLA3(ConsumerExLA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptLA3(a); acceptLA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExLA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExLA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExLA3 ofLA3(ConsumerExLA3... consumers)
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
		
		return (a) -> { for(ConsumerExLA3 consumer : consumers) consumer.acceptLA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptLA3(long[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[][][] a) throws Exception
	{
		acceptLA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExLA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExLA3 then(ConsumerEx<long[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptLA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExLA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExLA3 before(ConsumerEx<long[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExLA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExLA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExLA3 of(ConsumerEx<long[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExLA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<long[][][]> consumer : consumers) consumer.accept(a); };
	}
}
