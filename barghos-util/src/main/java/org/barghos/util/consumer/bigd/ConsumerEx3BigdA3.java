package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer3BigdA3}
 * this may throw exceptions. {@link ConsumerEx3BigdA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BigdA3(BigDecimal[][][], BigDecimal[][][], BigDecimal[][][])}
 * 
 * @see ConsumerBigdA3
 * @see ConsumerExBigdA3
 * @see Consumer2BigdA3
 * @see ConsumerEx2BigdA3
 * @see Consumer3BigdA3
 * @see ConsumerEx3BigdA3
 * @see Consumer4BigdA3
 * @see ConsumerEx4BigdA3
 */
@FunctionalInterface
public interface ConsumerEx3BigdA3 extends ConsumerEx3<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]>
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
	void accept3BigdA3(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BigdA3 then3BigdA3(ConsumerEx3BigdA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BigdA3(a, b, c); after.accept3BigdA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx3BigdA3 before3BigdA3(ConsumerEx3BigdA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BigdA3(a, b, c); accept3BigdA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BigdA3 of3BigdA3(ConsumerEx3BigdA3... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3BigdA3 consumer : consumers) consumer.accept3BigdA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3BigdA3(BigDecimal[][][], BigDecimal[][][], BigDecimal[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c) throws Exception
	{
		accept3BigdA3(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BigdA3 then(ConsumerEx3<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BigdA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BigdA3 before(ConsumerEx3<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BigdA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BigdA3 of(ConsumerEx3<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BigdA3) consumers[0]::accept;
		
		return (a, b, c) -> { for(ConsumerEx3<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
