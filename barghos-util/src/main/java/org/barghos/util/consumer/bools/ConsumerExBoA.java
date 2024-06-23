package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional boolean array input
 * arguments and returns no result. Unlike {@link ConsumerBoA} this may throw
 * exceptions. {@link ConsumerExBoA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBoA(boolean[])}
 * 
 * @see ConsumerBoA
 * @see ConsumerExBoA
 * @see Consumer2BoA
 * @see ConsumerEx2BoA
 * @see Consumer3BoA
 * @see ConsumerEx3BoA
 * @see Consumer4BoA
 * @see ConsumerEx4BoA
 */
@FunctionalInterface
public interface ConsumerExBoA extends ConsumerEx<boolean[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBoA(boolean[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBoA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBoA thenBoA(ConsumerExBoA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBoA(a); after.acceptBoA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBoA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBoA beforeBoA(ConsumerExBoA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBoA(a); acceptBoA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBoA ofBoA(ConsumerExBoA... consumers)
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
		
		return (a) -> { for(ConsumerExBoA consumer : consumers) consumer.acceptBoA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBoA(boolean[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[] a) throws Exception
	{
		acceptBoA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBoA then(ConsumerEx<boolean[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBoA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBoA before(ConsumerEx<boolean[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBoA of(ConsumerEx<boolean[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExBoA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<boolean[]> consumer : consumers) consumer.accept(a); };
	}
}
