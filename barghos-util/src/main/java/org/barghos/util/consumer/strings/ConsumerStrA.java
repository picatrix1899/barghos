package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional string array input
 * argument and returns no result. {@link ConsumerStrA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStrA(String[])}
 * 
 * @see ConsumerStrA
 * @see ConsumerExStrA
 * @see Consumer2StrA
 * @see ConsumerEx2StrA
 * @see Consumer3StrA
 * @see ConsumerEx3StrA
 * @see Consumer4StrA
 * @see ConsumerEx4StrA
 */
@FunctionalInterface
public interface ConsumerStrA extends Consumer<String[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptStrA(String[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerStrA} performing this operation and the
	 * operation after.
	 */
	default ConsumerStrA thenStrA(ConsumerStrA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptStrA(a); after.acceptStrA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerStrA} performing the operation before and
	 * this operation.
	 */
	default ConsumerStrA beforeStrA(ConsumerStrA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptStrA(a); acceptStrA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA ofStrA(ConsumerStrA... consumers)
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
		
		return (a) -> { for(ConsumerStrA consumer : consumers) consumer.acceptStrA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptStrA(String[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[] a)
	{
		acceptStrA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA then(Consumer<String[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA then(java.util.function.Consumer<? super String[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerStrA before(Consumer<String[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerStrA before(java.util.function.Consumer<? super String[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA of(Consumer<String[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerStrA) consumers[0]::accept;

		return (a) -> { for(Consumer<String[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerStrA andThen(java.util.function.Consumer<? super String[]> after)
	{
		return then(after);
	}
}
