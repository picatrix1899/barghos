package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional boolean array input
 * argument and returns no result. {@link ConsumerBoA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBoA(boolean[])}
 * 
 * @see ConsumerBoA
 * @see ConsumerExBoA
 * @see Consumer2BoA
 * @see ConsumerEx2BoA
 * @see Consumer3BoA
 * @see ConsumerEx3BoA
 * @see Consumer4BoA
 * @see ConsumerEx4BoA
 */
@FunctionalInterface
public interface ConsumerBoA extends Consumer<boolean[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBoA(boolean[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBoA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBoA thenBoA(ConsumerBoA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBoA(a); after.acceptBoA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBoA} performing the operation before and
	 * this operation.
	 */
	default ConsumerBoA beforeBoA(ConsumerBoA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBoA(a); acceptBoA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA ofBoA(ConsumerBoA... consumers)
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
		
		return (a) -> { for(ConsumerBoA consumer : consumers) consumer.acceptBoA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptBoA(boolean[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[] a)
	{
		acceptBoA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA then(Consumer<boolean[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA then(java.util.function.Consumer<? super boolean[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBoA before(Consumer<boolean[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBoA before(java.util.function.Consumer<? super boolean[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA of(Consumer<boolean[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBoA) consumers[0]::accept;

		return (a) -> { for(Consumer<boolean[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBoA andThen(java.util.function.Consumer<? super boolean[]> after)
	{
		return then(after);
	}
}
