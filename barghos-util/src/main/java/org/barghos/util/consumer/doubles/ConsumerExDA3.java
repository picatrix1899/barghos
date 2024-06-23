package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional double array input
 * arguments and returns no result. Unlike {@link ConsumerDA3} this may throw
 * exceptions. {@link ConsumerExDA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptDA3(double[][][])}
 * 
 * @see ConsumerDA3
 * @see ConsumerExDA3
 * @see Consumer2DA3
 * @see ConsumerEx2DA3
 * @see Consumer3DA3
 * @see ConsumerEx3DA3
 * @see Consumer4DA3
 * @see ConsumerEx4DA3
 */
@FunctionalInterface
public interface ConsumerExDA3 extends ConsumerEx<double[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptDA3(double[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExDA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExDA3 thenDA3(ConsumerExDA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptDA3(a); after.acceptDA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExDA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExDA3 beforeDA3(ConsumerExDA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptDA3(a); acceptDA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExDA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA3 ofDA3(ConsumerExDA3... consumers)
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
		
		return (a) -> { for(ConsumerExDA3 consumer : consumers) consumer.acceptDA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptDA3(double[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[][][] a) throws Exception
	{
		acceptDA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA3 then(ConsumerEx<double[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptDA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA3 before(ConsumerEx<double[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptDA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExDA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA3 of(ConsumerEx<double[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExDA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<double[][][]> consumer : consumers) consumer.accept(a); };
	}
}
