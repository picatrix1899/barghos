package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer4BigdA}
 * this may throw exceptions. {@link ConsumerEx4BigdA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BigdA(BigDecimal[], BigDecimal[], BigDecimal[], BigDecimal[])}
 * 
 * @see ConsumerBigdA
 * @see ConsumerExBigdA
 * @see Consumer2BigdA
 * @see ConsumerEx2BigdA
 * @see Consumer3BigdA
 * @see ConsumerEx3BigdA
 * @see Consumer4BigdA
 * @see ConsumerEx4BigdA
 */
@FunctionalInterface
public interface ConsumerEx4BigdA extends ConsumerEx4<BigDecimal[],BigDecimal[],BigDecimal[],BigDecimal[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4BigdA(BigDecimal[] a, BigDecimal[] b, BigDecimal[] c, BigDecimal[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4BigdA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4BigdA then4BigdA(ConsumerEx4BigdA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigdA(a, b, c, d); after.accept4BigdA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4BigdA} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx4BigdA before4BigdA(ConsumerEx4BigdA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BigdA(a, b, c, d); accept4BigdA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BigdA} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BigdA of4BigdA(ConsumerEx4BigdA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4BigdA consumer : consumers) consumer.accept4BigdA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4BigdA(BigDecimal[], BigDecimal[], BigDecimal[], BigDecimal[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[] a, BigDecimal[] b, BigDecimal[] c, BigDecimal[] d) throws Exception
	{
		accept4BigdA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BigdA then(ConsumerEx4<BigDecimal[],BigDecimal[],BigDecimal[],BigDecimal[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BigdA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BigdA before(ConsumerEx4<BigDecimal[],BigDecimal[],BigDecimal[],BigDecimal[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BigdA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BigdA} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BigdA of(ConsumerEx4<BigDecimal[],BigDecimal[],BigDecimal[],BigDecimal[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4BigdA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<BigDecimal[],BigDecimal[],BigDecimal[],BigDecimal[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
