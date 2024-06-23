package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional int array input
 * arguments and returns no result. Unlike {@link ConsumerI} this may throw
 * exceptions. {@link ConsumerExI} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int)}
 * 
 * @see ConsumerI
 * @see ConsumerExI
 * @see Consumer2I
 * @see ConsumerEx2I
 * @see Consumer3I
 * @see ConsumerEx3I
 * @see Consumer4I
 * @see ConsumerEx4I
 */
@FunctionalInterface
public interface ConsumerExI extends ConsumerEx<Integer>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptI(int a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExI} performing this operation and the
	 * operation after.
	 */
	default ConsumerExI thenI(ConsumerExI after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptI(a); after.acceptI(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExI} performing the operation before and
	 * this operation.
	 */
	default ConsumerExI beforeI(ConsumerExI before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptI(a); acceptI(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExI} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExI} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExI ofI(ConsumerExI... consumers)
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
		
		return (a) -> { for(ConsumerExI consumer : consumers) consumer.acceptI(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptF(Integer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Integer a) throws Exception
	{
		acceptI(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExI} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExI then(ConsumerEx<Integer> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptI(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExI} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExI before(ConsumerEx<Integer> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptI(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExI} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExI} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExI of(ConsumerEx<Integer>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExI) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Integer> consumer : consumers) consumer.accept(a); };
	}
}
