package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional double array input
 * arguments and returns no result. Unlike {@link ConsumerDA} this may throw
 * exceptions. {@link ConsumerExDA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptDA(double[])}
 * 
 * @see ConsumerDA
 * @see ConsumerExDA
 * @see Consumer2DA
 * @see ConsumerEx2DA
 * @see Consumer3DA
 * @see ConsumerEx3DA
 * @see Consumer4DA
 * @see ConsumerEx4DA
 */
@FunctionalInterface
public interface ConsumerExDA extends ConsumerEx<double[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptDA(double[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExDA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExDA thenDA(ConsumerExDA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptDA(a); after.acceptDA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExDA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExDA beforeDA(ConsumerExDA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptDA(a); acceptDA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExDA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA ofDA(ConsumerExDA... consumers)
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
		
		return (a) -> { for(ConsumerExDA consumer : consumers) consumer.acceptDA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptDA(double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a) throws Exception
	{
		acceptDA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA then(ConsumerEx<double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptDA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA before(ConsumerEx<double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptDA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExDA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA of(ConsumerEx<double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExDA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<double[]> consumer : consumers) consumer.accept(a); };
	}
}
