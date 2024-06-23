package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional boolean array input
 * argument and returns no result. {@link ConsumerBoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBoA2(boolean[][])}
 * 
 * @see ConsumerBoA2
 * @see ConsumerExBoA2
 * @see Consumer2BoA2
 * @see ConsumerEx2BoA2
 * @see Consumer3BoA2
 * @see ConsumerEx3BoA2
 * @see Consumer4BoA2
 * @see ConsumerEx4BoA2
 */
@FunctionalInterface
public interface ConsumerBoA2 extends Consumer<boolean[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBoA2(boolean[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBoA2 thenBoA2(ConsumerBoA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBoA2(a); after.acceptBoA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBoA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBoA2 beforeBoA2(ConsumerBoA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBoA2(a); acceptBoA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA2 ofBoA2(ConsumerBoA2... consumers)
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
		
		return (a) -> { for(ConsumerBoA2 consumer : consumers) consumer.acceptBoA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBoA2(boolean[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[][] a)
	{
		acceptBoA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 then(Consumer<boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 then(java.util.function.Consumer<? super boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 before(Consumer<boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 before(java.util.function.Consumer<? super boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA2 of(Consumer<boolean[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBoA2) consumers[0]::accept;

		return (a) -> { for(Consumer<boolean[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBoA2 andThen(java.util.function.Consumer<? super boolean[][]> after)
	{
		return then(after);
	}
}
