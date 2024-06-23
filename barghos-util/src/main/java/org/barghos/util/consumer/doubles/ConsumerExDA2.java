package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional double array input
 * arguments and returns no result. Unlike {@link ConsumerDA2} this may throw
 * exceptions. {@link ConsumerExDA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptDA2(double[][])}
 * 
 * @see ConsumerDA2
 * @see ConsumerExDA2
 * @see Consumer2DA2
 * @see ConsumerEx2DA2
 * @see Consumer3DA2
 * @see ConsumerEx3DA2
 * @see Consumer4DA2
 * @see ConsumerEx4DA2
 */
@FunctionalInterface
public interface ConsumerExDA2 extends ConsumerEx<double[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptDA2(double[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExDA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExDA2 thenDA2(ConsumerExDA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptDA2(a); after.acceptDA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExDA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExDA2 beforeDA2(ConsumerExDA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptDA2(a); acceptDA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExDA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA2 ofDA2(ConsumerExDA2... consumers)
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
		
		return (a) -> { for(ConsumerExDA2 consumer : consumers) consumer.acceptDA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptDA2(double[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[][] a) throws Exception
	{
		acceptDA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA2 then(ConsumerEx<double[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptDA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA2 before(ConsumerEx<double[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptDA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExDA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA2 of(ConsumerEx<double[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExDA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<double[][]> consumer : consumers) consumer.accept(a); };
	}
}
