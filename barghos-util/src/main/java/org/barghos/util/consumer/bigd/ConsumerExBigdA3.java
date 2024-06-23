package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link ConsumerBigdA3}
 * this may throw exceptions. {@link ConsumerExBigdA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigdA3(BigDecimal[][][])}
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
public interface ConsumerExBigdA3 extends ConsumerEx<BigDecimal[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigdA3(BigDecimal[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigdA3 thenBigdA3(ConsumerExBigdA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigdA3(a); after.acceptBigdA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerExBigdA3 beforeBigdA3(ConsumerExBigdA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigdA3(a); acceptBigdA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA3 ofBigdA3(ConsumerExBigdA3... consumers)
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
		
		return (a) -> { for(ConsumerExBigdA3 consumer : consumers) consumer.acceptBigdA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigdA3(BigDecimal[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][][] a) throws Exception
	{
		acceptBigdA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA3 then(ConsumerEx<BigDecimal[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigdA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA3 before(ConsumerEx<BigDecimal[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA3 of(ConsumerEx<BigDecimal[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigdA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigDecimal[][][]> consumer : consumers) consumer.accept(a); };
	}
}
