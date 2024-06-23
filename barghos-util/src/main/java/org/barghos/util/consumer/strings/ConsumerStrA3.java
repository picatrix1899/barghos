package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional string array input
 * argument and returns no result. {@link ConsumerStrA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStrA3(String[][][])}
 * 
 * @see ConsumerStrA3
 * @see ConsumerExStrA3
 * @see Consumer2StrA3
 * @see ConsumerEx2StrA3
 * @see Consumer3StrA3
 * @see ConsumerEx3StrA3
 * @see Consumer4StrA3
 * @see ConsumerEx4StrA3
 */
@FunctionalInterface
public interface ConsumerStrA3 extends Consumer<String[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptStrA3(String[][][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerStrA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerStrA3 thenStrA3(ConsumerStrA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptStrA3(a); after.acceptStrA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerStrA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerStrA3 beforeStrA3(ConsumerStrA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptStrA3(a); acceptStrA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA3 ofStrA3(ConsumerStrA3... consumers)
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
		
		return (a) -> { for(ConsumerStrA3 consumer : consumers) consumer.acceptStrA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptStrA3(String[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[][][] a)
	{
		acceptStrA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA3 then(Consumer<String[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA3 then(java.util.function.Consumer<? super String[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA3 before(Consumer<String[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA3(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA3 before(java.util.function.Consumer<? super String[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA3 of(Consumer<String[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerStrA3) consumers[0]::accept;

		return (a) -> { for(Consumer<String[][][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerStrA3 andThen(java.util.function.Consumer<? super String[][][]> after)
	{
		return then(after);
	}
}
