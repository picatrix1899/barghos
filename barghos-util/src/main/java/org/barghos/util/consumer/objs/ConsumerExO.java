package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional object array input
 * arguments and returns no result. Unlike {@link ConsumerO} this may throw
 * exceptions. {@link ConsumerExO} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object)}
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
public interface ConsumerExO extends ConsumerEx<Object>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptO(Object a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExO} performing this operation and the
	 * operation after.
	 */
	default ConsumerExO thenO(ConsumerExO after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptO(a); after.acceptO(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExO} performing the operation before and
	 * this operation.
	 */
	default ConsumerExO beforeO(ConsumerExO before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptO(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExO ofO(ConsumerExO... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExO consumer : consumers) consumer.acceptO(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptF(Object)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object a) throws Exception
	{
		acceptO(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExO then(ConsumerEx<Object> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExO before(ConsumerEx<Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExO of(ConsumerEx<Object>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExO) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Object> consumer : consumers) consumer.accept(a); };
	}
}
