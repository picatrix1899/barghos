package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer3Bo} this may throw
 * exceptions. {@link ConsumerEx3Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3Bo(boolean, boolean, boolean)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerEx3Bo extends ConsumerEx3<Boolean,Boolean,Boolean>
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
	void accept3Bo(boolean a, boolean b, boolean c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3Bo} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3Bo then3Bo(ConsumerEx3Bo after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3Bo(a, b, c); after.accept3Bo(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3Bo} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3Bo before3Bo(ConsumerEx3Bo before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3Bo(a, b, c); accept3Bo(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3Bo} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3Bo of3Bo(ConsumerEx3Bo... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3Bo consumer : consumers) consumer.accept3Bo(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3Bo(boolean, boolean, boolean)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Boolean a, Boolean b, Boolean c) throws Exception
	{
		accept3Bo(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3Bo then(ConsumerEx3<Boolean,Boolean,Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3Bo(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3Bo before(ConsumerEx3<Boolean,Boolean,Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3Bo(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3Bo} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3Bo of(ConsumerEx3<Boolean,Boolean,Boolean>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3Bo) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : consumers) consumer.accept(a, b, c); };
	}
}
