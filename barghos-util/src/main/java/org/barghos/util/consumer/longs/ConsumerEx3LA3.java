package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer3LA3} this may throw
 * exceptions. {@link ConsumerEx3LA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3LA3(long[][][], long[][][], long[][][])}
 * 
 * @see ConsumerLA3
 * @see ConsumerExLA3
 * @see Consumer2LA3
 * @see ConsumerEx2LA3
 * @see Consumer3LA3
 * @see ConsumerEx3LA3
 * @see Consumer4LA3
 * @see ConsumerEx4LA3
 */
@FunctionalInterface
public interface ConsumerEx3LA3 extends ConsumerEx3<long[][][],long[][][],long[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept3LA3(long[][][] a, long[][][] b, long[][][] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3LA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3LA3 then3LA3(ConsumerEx3LA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3LA3(a, b, c); after.accept3LA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3LA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3LA3 before3LA3(ConsumerEx3LA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3LA3(a, b, c); accept3LA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3LA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3LA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3LA3 of3LA3(ConsumerEx3LA3... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3LA3 consumer : consumers) consumer.accept3LA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3LA3(long[][][], long[][][], long[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[][][] a, long[][][] b, long[][][] c) throws Exception
	{
		accept3LA3(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3LA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3LA3 then(ConsumerEx3<long[][][],long[][][],long[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3LA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3LA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3LA3 before(ConsumerEx3<long[][][],long[][][],long[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3LA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3LA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3LA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3LA3 of(ConsumerEx3<long[][][],long[][][],long[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3LA3) consumers[0]::accept;
		
		return (a, b, c) -> { for(ConsumerEx3<long[][][],long[][][],long[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
