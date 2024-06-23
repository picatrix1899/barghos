package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional int array input
 * argument and returns no result. {@link ConsumerIA2} is expected to operate
 * via side-effects.
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
public interface ConsumerIA2 extends Consumer<int[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptIA2(int[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerIA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerIA2 thenIA2(ConsumerIA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptIA2(a); after.acceptIA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerIA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerIA2 beforeIA2(ConsumerIA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptIA2(a); acceptIA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerIA2 ofIA2(ConsumerIA2... consumers)
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
		
		return (a) -> { for(ConsumerIA2 consumer : consumers) consumer.acceptIA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptIA2(int[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[][] a)
	{
		acceptIA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA2 then(Consumer<int[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA2 then(java.util.function.Consumer<? super int[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA2 before(Consumer<int[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA2 before(java.util.function.Consumer<? super int[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerIA2 of(Consumer<int[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerIA2) consumers[0]::accept;

		return (a) -> { for(Consumer<int[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerIA2 andThen(java.util.function.Consumer<? super int[][]> after)
	{
		return then(after);
	}
}
