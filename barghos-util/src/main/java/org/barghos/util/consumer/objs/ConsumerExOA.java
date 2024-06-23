package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional object array input
 * arguments and returns no result. Unlike {@link ConsumerOA} this may throw
 * exceptions. {@link ConsumerExOA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptOA(Object[])}
 * 
 * @see ConsumerOA
 * @see ConsumerExOA
 * @see Consumer2OA
 * @see ConsumerEx2OA
 * @see Consumer3OA
 * @see ConsumerEx3OA
 * @see Consumer4OA
 * @see ConsumerEx4OA
 */
@FunctionalInterface
public interface ConsumerExOA extends ConsumerEx<Object[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptOA(Object[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExOA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExOA thenOA(ConsumerExOA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptOA(a); after.acceptOA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExOA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExOA beforeOA(ConsumerExOA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptOA(a); acceptOA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExOA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExOA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExOA ofOA(ConsumerExOA... consumers)
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
		
		return (a) -> { for(ConsumerExOA consumer : consumers) consumer.acceptOA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptOA(Object[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[] a) throws Exception
	{
		acceptOA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExOA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExOA then(ConsumerEx<Object[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptOA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExOA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExOA before(ConsumerEx<Object[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptOA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExOA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExOA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExOA of(ConsumerEx<Object[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExOA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Object[]> consumer : consumers) consumer.accept(a); };
	}
}
