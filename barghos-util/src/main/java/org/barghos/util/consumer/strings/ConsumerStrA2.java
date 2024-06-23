package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional string array input
 * argument and returns no result. {@link ConsumerStrA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStrA2(String[][])}
 * 
 * @see ConsumerStrA2
 * @see ConsumerExStrA2
 * @see Consumer2StrA2
 * @see ConsumerEx2StrA2
 * @see Consumer3StrA2
 * @see ConsumerEx3StrA2
 * @see Consumer4StrA2
 * @see ConsumerEx4StrA2
 */
@FunctionalInterface
public interface ConsumerStrA2 extends Consumer<String[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptStrA2(String[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerStrA2 thenStrA2(ConsumerStrA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptStrA2(a); after.acceptStrA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerStrA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerStrA2 beforeStrA2(ConsumerStrA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptStrA2(a); acceptStrA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA2 ofStrA2(ConsumerStrA2... consumers)
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
		
		return (a) -> { for(ConsumerStrA2 consumer : consumers) consumer.acceptStrA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptStrA2(String[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[][] a)
	{
		acceptStrA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 then(Consumer<String[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 then(java.util.function.Consumer<? super String[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 before(Consumer<String[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 before(java.util.function.Consumer<? super String[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA2 of(Consumer<String[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerStrA2) consumers[0]::accept;

		return (a) -> { for(Consumer<String[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerStrA2 andThen(java.util.function.Consumer<? super String[][]> after)
	{
		return then(after);
	}
}
