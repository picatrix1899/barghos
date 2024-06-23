package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional int array input
 * argument and returns no result. {@link ConsumerIA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptIA3(int[][][])}
 * 
 * @see ConsumerIA3
 * @see ConsumerExIA3
 * @see Consumer2IA3
 * @see ConsumerEx2IA3
 * @see Consumer3IA3
 * @see ConsumerEx3IA3
 * @see Consumer4IA3
 * @see ConsumerEx4IA3
 */
@FunctionalInterface
public interface ConsumerIA3 extends Consumer<int[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptIA3(int[][][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerIA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerIA3 thenIA3(ConsumerIA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptIA3(a); after.acceptIA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerIA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerIA3 beforeIA3(ConsumerIA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptIA3(a); acceptIA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerIA3 ofIA3(ConsumerIA3... consumers)
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
		
		return (a) -> { for(ConsumerIA3 consumer : consumers) consumer.acceptIA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptIA3(int[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[][][] a)
	{
		acceptIA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA3 then(Consumer<int[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA3 then(java.util.function.Consumer<? super int[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA3 before(Consumer<int[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA3(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA3 before(java.util.function.Consumer<? super int[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerIA3 of(Consumer<int[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerIA3) consumers[0]::accept;

		return (a) -> { for(Consumer<int[][][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerIA3 andThen(java.util.function.Consumer<? super int[][][]> after)
	{
		return then(after);
	}
}
