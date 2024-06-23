package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer3O} this may throw
 * exceptions. {@link ConsumerEx3O} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3O(Object, Object, Object)}
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
public interface ConsumerEx3O extends ConsumerEx3<Object,Object,Object>
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
	void accept3O(Object a, Object b, Object c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3O} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3O then3O(ConsumerEx3O after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3O(a, b, c); after.accept3O(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3O} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3O before3O(ConsumerEx3O before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3O(a, b, c); accept3O(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3O} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3O of3O(ConsumerEx3O... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3O consumer : consumers) consumer.accept3O(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3O(Object, Object, Object)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object a, Object b, Object c) throws Exception
	{
		accept3O(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3O} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3O then(ConsumerEx3<Object,Object,Object> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3O(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3O} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3O before(ConsumerEx3<Object,Object,Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3O(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3O} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3O of(ConsumerEx3<Object,Object,Object>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3O) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<Object,Object,Object> consumer : consumers) consumer.accept(a, b, c); };
	}
}
