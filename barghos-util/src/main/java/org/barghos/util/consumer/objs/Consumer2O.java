package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two object input arguments and returns
 * no result. {@link Consumer2O} is expected to operate via side-effects.
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
public interface Consumer2O extends Consumer2<Object,Object>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2O(Object a, Object b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2O} performing this operation and the
	 * operation after.
	 */
	default Consumer2O then2O(Consumer2O after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2O(a, b); after.accept2O(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2O} performing the operation before and
	 * this operation.
	 */
	default Consumer2O before2O(Consumer2O before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2O(a, b); accept2O(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2O} performing the operations.
	 */
	@SafeVarargs
	static Consumer2O of2O(Consumer2O... consumers)
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
		
		return (a, b) -> { for(Consumer2O consumer : consumers) consumer.accept2O(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2O then(Consumer2<Object,Object> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2O(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2O then(java.util.function.BiConsumer<? super Object,? super Object> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2O(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2O before(Consumer2<Object,Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2O(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2O before(java.util.function.BiConsumer<? super Object,? super Object> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2O(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2O} performing the operations.
	 */
	@SafeVarargs
	static Consumer2O of(Consumer2<Object,Object>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2O) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<Object,Object> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2O(Object, Object)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object a, Object b)
	{
		accept2O(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2O andThen(java.util.function.BiConsumer<? super Object,? super Object> after)
	{
		return then(after);
	}
}
