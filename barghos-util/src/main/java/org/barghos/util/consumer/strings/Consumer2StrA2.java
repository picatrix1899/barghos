package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional string array input
 * arguments and returns no result. {@link Consumer2StrA2} is expected to
 * operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2StrA2(String[][], String[][])}
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
public interface Consumer2StrA2 extends Consumer2<String[][],String[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2StrA2(String[][] a, String[][] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2StrA2 then2StrA2(Consumer2StrA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2StrA2(a, b); after.accept2StrA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2StrA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2StrA2 before2StrA2(Consumer2StrA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2StrA2(a, b); accept2StrA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2StrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2StrA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2StrA2 of2StrA2(Consumer2StrA2... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2StrA2 consumer : consumers) consumer.accept2StrA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 then(Consumer2<String[][],String[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2StrA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 then(java.util.function.BiConsumer<? super String[][],? super String[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2StrA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 before(Consumer2<String[][],String[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2StrA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 before(java.util.function.BiConsumer<? super String[][],? super String[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2StrA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2StrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2StrA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2StrA2 of(Consumer2<String[][],String[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2StrA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<String[][],String[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2StrA2(String[][], String[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[][] a, String[][] b)
	{
		accept2StrA2(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2StrA2 andThen(java.util.function.BiConsumer<? super String[][],? super String[][]> after)
	{
		return then(after);
	}
}
