package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional string array input
 * arguments and returns no result. Unlike {@link Consumer4StrA} this may throw
 * exceptions. {@link ConsumerEx4StrA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4StrA(String[], String[], String[], String[])}
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
public interface ConsumerEx4StrA extends ConsumerEx4<String[],String[],String[],String[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4StrA(String[] a, String[] b, String[] c, String[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4StrA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4StrA then4StrA(ConsumerEx4StrA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4StrA(a, b, c, d); after.accept4StrA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4StrA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4StrA before4StrA(ConsumerEx4StrA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4StrA(a, b, c, d); accept4StrA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4StrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4StrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4StrA of4StrA(ConsumerEx4StrA... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4StrA consumer : consumers) consumer.accept4StrA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4StrA(String[], String[], String[], String[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[] a, String[] b, String[] c, String[] d) throws Exception
	{
		accept4StrA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4StrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4StrA then(ConsumerEx4<String[],String[],String[],String[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4StrA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4StrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4StrA before(ConsumerEx4<String[],String[],String[],String[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4StrA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4StrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4StrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4StrA of(ConsumerEx4<String[],String[],String[],String[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4StrA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<String[],String[],String[],String[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
