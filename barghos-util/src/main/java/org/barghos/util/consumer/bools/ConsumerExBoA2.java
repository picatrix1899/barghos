package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional boolean array input
 * arguments and returns no result. Unlike {@link ConsumerBoA2} this may throw
 * exceptions. {@link ConsumerExBoA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBoA2(boolean[][])}
 * 
 * @see ConsumerBoA2
 * @see ConsumerExBoA2
 * @see Consumer2BoA2
 * @see ConsumerEx2BoA2
 * @see Consumer3BoA2
 * @see ConsumerEx3BoA2
 * @see Consumer4BoA2
 * @see ConsumerEx4BoA2
 */
@FunctionalInterface
public interface ConsumerExBoA2 extends ConsumerEx<boolean[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBoA2(boolean[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBoA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBoA2 thenBoA2(ConsumerExBoA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBoA2(a); after.acceptBoA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBoA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBoA2 beforeBoA2(ConsumerExBoA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBoA2(a); acceptBoA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBoA2 ofBoA2(ConsumerExBoA2... consumers)
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
		
		return (a) -> { for(ConsumerExBoA2 consumer : consumers) consumer.acceptBoA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBoA2(boolean[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[][] a) throws Exception
	{
		acceptBoA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBoA2 then(ConsumerEx<boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBoA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBoA2 before(ConsumerEx<boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBoA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBoA2 of(ConsumerEx<boolean[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBoA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<boolean[][]> consumer : consumers) consumer.accept(a); };
	}
}
