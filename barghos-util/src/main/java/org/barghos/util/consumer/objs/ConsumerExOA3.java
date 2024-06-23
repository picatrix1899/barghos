package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional object array input
 * arguments and returns no result. Unlike {@link ConsumerOA3} this may throw
 * exceptions. {@link ConsumerExOA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptOA3(Object[][][])}
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
public interface ConsumerExOA3 extends ConsumerEx<Object[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptOA3(Object[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExOA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExOA3 thenOA3(ConsumerExOA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptOA3(a); after.acceptOA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExOA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExOA3 beforeOA3(ConsumerExOA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptOA3(a); acceptOA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExOA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExOA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExOA3 ofOA3(ConsumerExOA3... consumers)
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
		
		return (a) -> { for(ConsumerExOA3 consumer : consumers) consumer.acceptOA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptOA3(Object[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[][][] a) throws Exception
	{
		acceptOA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExOA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExOA3 then(ConsumerEx<Object[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptOA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExOA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExOA3 before(ConsumerEx<Object[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptOA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExOA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExOA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExOA3 of(ConsumerEx<Object[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExOA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Object[][][]> consumer : consumers) consumer.accept(a); };
	}
}
