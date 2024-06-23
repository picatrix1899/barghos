package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional boolean array input
 * arguments and returns no result. Unlike {@link ConsumerBo} this may throw
 * exceptions. {@link ConsumerExBo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean)}
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface ConsumerExBo extends ConsumerEx<Boolean>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBo(boolean a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBo} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBo thenBo(ConsumerExBo after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.acceptBo(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBo} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBo beforeBo(ConsumerExBo before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBo(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBo} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBo ofBo(ConsumerExBo... consumers)
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
		
		return (a) -> { for(ConsumerExBo consumer : consumers) consumer.acceptBo(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBo(Boolean)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Boolean a) throws Exception
	{
		acceptBo(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBo then(ConsumerEx<Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBo before(ConsumerEx<Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBo} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBo of(ConsumerEx<Boolean>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBo) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Boolean> consumer : consumers) consumer.accept(a); };
	}
}
