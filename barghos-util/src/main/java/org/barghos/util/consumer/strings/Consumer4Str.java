package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four string input arguments and returns
 * no result. {@link Consumer4Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4Str(String, String, String, String)}
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
public interface Consumer4Str extends Consumer4<String,String,String,String>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4Str(String a, String b, String c, String d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Str} performing this operation and the
	 * operation after.
	 */
	default Consumer4Str then4Str(Consumer4Str after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Str(a, b, c, d); after.accept4Str(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Str} performing the operation before and
	 * this operation.
	 */
	default Consumer4Str before4Str(Consumer4Str before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4Str(a, b, c, d); accept4Str(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Str of4Str(Consumer4Str... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4Str consumer : consumers) consumer.accept4Str(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4Str(String, String, String, String)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String a, String b, String c, String d)
	{
		accept4Str(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Str then(Consumer4<String,String,String,String> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Str(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Str before(Consumer4<String,String,String,String> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4Str(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Str of(Consumer4<String,String,String,String>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Str) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<String,String,String,String> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
