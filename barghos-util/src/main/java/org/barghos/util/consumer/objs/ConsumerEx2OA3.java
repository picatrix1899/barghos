package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 3-dimensional Object array input
 * arguments and returns no result. Unlike {@link Consumer2OA3} this may throw
 * exceptions. {@link ConsumerEx2OA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2OA3(Object[][][], Object[][][])}.
 * 
 * @see ConsumerOA3
 * @see ConsumerExOA3
 * @see Consumer2OA3
 * @see ConsumerEx2OA3
 * @see Consumer3OA3
 * @see ConsumerEx3OA3
 * @see Consumer4OA3
 * @see ConsumerEx4OA3
 */
@FunctionalInterface
public interface ConsumerEx2OA3 extends ConsumerEx2<Object[][][],Object[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2OA3(Object[][][] a, Object[][][] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2OA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2OA3 then2OA3(ConsumerEx2OA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2OA3(a, b); after.accept2OA3(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2OA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2OA3 before2OA3(ConsumerEx2OA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2OA3(a, b); accept2OA3(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2OA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2OA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2OA3 of2OA3(ConsumerEx2OA3... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2OA3 consumer : consumers) consumer.accept2OA3(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2OA3(Object[][][], Object[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[][][] a, Object[][][] b) throws Exception
	{
		accept2OA3(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2OA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2OA3 then(ConsumerEx2<Object[][][],Object[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2OA3(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2OA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2OA3 before(ConsumerEx2<Object[][][],Object[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2OA3(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2OA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2OA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2OA3 of(ConsumerEx2<Object[][][],Object[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2OA3) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Object[][][],Object[][][]> consumer : consumers) consumer.accept(a, b); };
	}
}
