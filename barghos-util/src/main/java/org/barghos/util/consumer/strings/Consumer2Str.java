package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two string input arguments and returns
 * no result. {@link Consumer2Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2Str(String, String)}
 * 
 * @see ConsumerStr
 * @see ConsumerExStr
 * @see Consumer2Str
 * @see ConsumerEx2Str
 * @see Consumer3Str
 * @see ConsumerEx3Str
 * @see Consumer4Str
 * @see ConsumerEx4Str
 */
@FunctionalInterface
public interface Consumer2Str extends Consumer2<String,String>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2Str(String a, String b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Str} performing this operation and the
	 * operation after.
	 */
	default Consumer2Str then2Str(Consumer2Str after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2Str(a, b); after.accept2Str(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Str} performing the operation before and
	 * this operation.
	 */
	default Consumer2Str before2Str(Consumer2Str before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2Str(a, b); accept2Str(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Str of2Str(Consumer2Str... consumers)
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
		
		return (a, b) -> { for(Consumer2Str consumer : consumers) consumer.accept2Str(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Str then(Consumer2<String,String> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Str(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Str then(java.util.function.BiConsumer<? super String,? super String> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Str(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Str before(Consumer2<String,String> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2Str(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Str before(java.util.function.BiConsumer<? super String,? super String> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2Str(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Str of(Consumer2<String,String>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2Str) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<String,String> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2Str(String, String)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String a, String b)
	{
		accept2Str(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2Str andThen(java.util.function.BiConsumer<? super String,? super String> after)
	{
		return then(after);
	}
}
