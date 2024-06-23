package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional int array input
 * arguments and returns no result. Unlike {@link ConsumerIA2} this may throw
 * exceptions. {@link ConsumerExIA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptIA2(int[][])}
 * 
 * @see ConsumerIA2
 * @see ConsumerExIA2
 * @see Consumer2IA2
 * @see ConsumerEx2IA2
 * @see Consumer3IA2
 * @see ConsumerEx3IA2
 * @see Consumer4IA2
 * @see ConsumerEx4IA2
 */
@FunctionalInterface
public interface ConsumerExIA2 extends ConsumerEx<int[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptIA2(int[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExIA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExIA2 thenIA2(ConsumerExIA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptIA2(a); after.acceptIA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExIA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExIA2 beforeIA2(ConsumerExIA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptIA2(a); acceptIA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExIA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExIA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExIA2 ofIA2(ConsumerExIA2... consumers)
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
		
		return (a) -> { for(ConsumerExIA2 consumer : consumers) consumer.acceptIA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptIA2(int[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[][] a) throws Exception
	{
		acceptIA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExIA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExIA2 then(ConsumerEx<int[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExIA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExIA2 before(ConsumerEx<int[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExIA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExIA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExIA2 of(ConsumerEx<int[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExIA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<int[][]> consumer : consumers) consumer.accept(a); };
	}
}
