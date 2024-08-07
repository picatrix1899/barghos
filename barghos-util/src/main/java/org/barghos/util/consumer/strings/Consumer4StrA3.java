package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 3-dimensional string array input
 * arguments and returns no result. {@link Consumer4StrA3} is expected to
 * operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4StrA3(String[][][], String[][][], String[][][], String[][][])}
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
public interface Consumer4StrA3 extends Consumer4<String[][][],String[][][],String[][][],String[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4StrA3(String[][][] a, String[][][] b, String[][][] c, String[][][] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4StrA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4StrA3 then4StrA3(Consumer4StrA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4StrA3(a, b, c, d); after.accept4StrA3(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4StrA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4StrA3 before4StrA3(Consumer4StrA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4StrA3(a, b, c, d); accept4StrA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4StrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4StrA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4StrA3 of4StrA3(Consumer4StrA3... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4StrA3 consumer : consumers) consumer.accept4StrA3(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4StrA3(String[][][], String[][][], String[][][], String[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[][][] a, String[][][] b, String[][][] c, String[][][] d)
	{
		accept4StrA3(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4StrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4StrA3 then(Consumer4<String[][][],String[][][],String[][][],String[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4StrA3(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4StrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4StrA3 before(Consumer4<String[][][],String[][][],String[][][],String[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4StrA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4StrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4StrA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4StrA3 of(Consumer4<String[][][],String[][][],String[][][],String[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4StrA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<String[][][],String[][][],String[][][],String[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
