package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four object input arguments and returns
 * no result. {@link Consumer4O} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4O(Object, Object, Object, Object)}
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
public interface Consumer4O extends Consumer4<Object,Object,Object,Object>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4O(Object a, Object b, Object c, Object d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4O} performing this operation and the
	 * operation after.
	 */
	default Consumer4O then4O(Consumer4O after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4O(a, b, c, d); after.accept4O(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4O} performing the operation before and this
	 * operation.
	 */
	default Consumer4O before4O(Consumer4O before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4O(a, b, c, d); accept4O(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4O} performing the operations.
	 */
	@SafeVarargs
	static Consumer4O of4O(Consumer4O... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4O consumer : consumers) consumer.accept4O(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4O(Object, Object, Object, Object)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object a, Object b, Object c, Object d)
	{
		accept4O(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4O} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4O then(Consumer4<Object,Object,Object,Object> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4O(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4O} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer4O before(Consumer4<Object,Object,Object,Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4O(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4O} performing the operations.
	 */
	@SafeVarargs
	static Consumer4O of(Consumer4<Object,Object,Object,Object>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4O) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<Object,Object,Object,Object> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
