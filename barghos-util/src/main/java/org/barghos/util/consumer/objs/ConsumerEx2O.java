package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer2O} this may throw
 * exceptions. {@link ConsumerEx2O} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2O(Object, Object)}
 * 
 * @see ConsumerO
 * @see ConsumerExO
 * @see Consumer2O
 * @see ConsumerEx2O
 * @see Consumer3O
 * @see ConsumerEx3O
 * @see Consumer4O
 * @see ConsumerEx4O
 */
@FunctionalInterface
public interface ConsumerEx2O extends ConsumerEx2<Object,Object>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2O(Object a, Object b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2O} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2O then2O(ConsumerEx2O after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2O(a, b); after.accept2O(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2O} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2O before2O(ConsumerEx2O before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2O(a, b); accept2O(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2O} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2O of2O(ConsumerEx2O... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2O consumer : consumers) consumer.accept2O(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2O(Object, Object)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object a, Object b) throws Exception
	{
		accept2O(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2O} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2O then(ConsumerEx2<Object,Object> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2O(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2O} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2O before(ConsumerEx2<Object,Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2O(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2O} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2O of(ConsumerEx2<Object,Object>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2O) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Object,Object> consumer : consumers) consumer.accept(a, b); };
	}
}
