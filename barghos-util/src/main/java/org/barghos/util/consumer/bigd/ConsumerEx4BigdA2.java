package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 2-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer4BigdA2}
 * this may throw exceptions. {@link ConsumerEx4BigdA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BigdA2(BigDecimal[][], BigDecimal[][], BigDecimal[][], BigDecimal[][])}
 * 
 * @see ConsumerBigdA2
 * @see ConsumerExBigdA2
 * @see Consumer2BigdA2
 * @see ConsumerEx2BigdA2
 * @see Consumer3BigdA2
 * @see ConsumerEx3BigdA2
 * @see Consumer4BigdA2
 * @see ConsumerEx4BigdA2
 */
@FunctionalInterface
public interface ConsumerEx4BigdA2 extends ConsumerEx4<BigDecimal[][],BigDecimal[][],BigDecimal[][],BigDecimal[][]>
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
	void accept4BigdA2(BigDecimal[][] a, BigDecimal[][] b, BigDecimal[][] c, BigDecimal[][] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4BigdA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4BigdA2 then4BigdA2(ConsumerEx4BigdA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigdA2(a, b, c, d); after.accept4BigdA2(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4BigdA2} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx4BigdA2 before4BigdA2(ConsumerEx4BigdA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BigdA2(a, b, c, d); accept4BigdA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BigdA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BigdA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BigdA2 of4BigdA2(ConsumerEx4BigdA2... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4BigdA2 consumer : consumers) consumer.accept4BigdA2(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4BigdA2(BigDecimal[][], BigDecimal[][], BigDecimal[][], BigDecimal[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][] a, BigDecimal[][] b, BigDecimal[][] c, BigDecimal[][] d) throws Exception
	{
		accept4BigdA2(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BigdA2 then(ConsumerEx4<BigDecimal[][],BigDecimal[][],BigDecimal[][],BigDecimal[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BigdA2(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BigdA2 before(ConsumerEx4<BigDecimal[][],BigDecimal[][],BigDecimal[][],BigDecimal[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BigdA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BigdA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BigdA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BigdA2 of(ConsumerEx4<BigDecimal[][],BigDecimal[][],BigDecimal[][],BigDecimal[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4BigdA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<BigDecimal[][],BigDecimal[][],BigDecimal[][],BigDecimal[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
