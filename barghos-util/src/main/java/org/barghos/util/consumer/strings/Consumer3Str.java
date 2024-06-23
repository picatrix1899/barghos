package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three string input arguments and returns
 * no result. {@link Consumer3Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3Str(String, String, String)}
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
public interface Consumer3Str extends Consumer3<String,String,String>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3Str(String a, String b, String c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3Str} performing this operation and the
	 * operation after.
	 */
	default Consumer3Str then3Str(Consumer3Str after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3Str(a, b, c); after.accept3Str(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3Str} performing the operation before and
	 * this operation.
	 */
	default Consumer3Str before3Str(Consumer3Str before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3Str(a, b, c); accept3Str(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer3Str of3Str(Consumer3Str... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */ 
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3Str consumer : consumers) consumer.accept3Str(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3Str(String, String, String)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String a, String b, String c)
	{
		accept3Str(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3Str then(Consumer3<String,String,String> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3Str(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3Str before(Consumer3<String,String,String> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3Str(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer3Str of(Consumer3<String,String,String>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3Str) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<String,String,String> consumer : consumers) consumer.accept(a, b, c); };
	}
}
