package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional boolean array input
 * argument and returns no result. {@link ConsumerBoA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBoA3(boolean[][][])}
 * 
 * @see ConsumerBoA3
 * @see ConsumerExBoA3
 * @see Consumer2BoA3
 * @see ConsumerEx2BoA3
 * @see Consumer3BoA3
 * @see ConsumerEx3BoA3
 * @see Consumer4BoA3
 * @see ConsumerEx4BoA3
 */
@FunctionalInterface
public interface ConsumerBoA3 extends Consumer<boolean[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBoA3(boolean[][][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerBoA3 thenBoA3(ConsumerBoA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBoA3(a); after.acceptBoA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBoA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerBoA3 beforeBoA3(ConsumerBoA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBoA3(a); acceptBoA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA3 ofBoA3(ConsumerBoA3... consumers)
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
		
		return (a) -> { for(ConsumerBoA3 consumer : consumers) consumer.acceptBoA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBoA3(boolean[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[][][] a)
	{
		acceptBoA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 then(Consumer<boolean[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 then(java.util.function.Consumer<? super boolean[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 before(Consumer<boolean[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA3(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 before(java.util.function.Consumer<? super boolean[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA3 of(Consumer<boolean[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBoA3) consumers[0]::accept;

		return (a) -> { for(Consumer<boolean[][][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBoA3 andThen(java.util.function.Consumer<? super boolean[][][]> after)
	{
		return then(after);
	}
}
