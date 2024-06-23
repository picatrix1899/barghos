package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link ConsumerBigdA2}
 * this may throw exceptions. {@link ConsumerExBigdA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigdA2(BigDecimal[][])}
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
public interface ConsumerExBigdA2 extends ConsumerEx<BigDecimal[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigdA2(BigDecimal[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigdA2 thenBigdA2(ConsumerExBigdA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigdA2(a); after.acceptBigdA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA2} performing the operation before
	 * and this operation.
	 */
	default ConsumerExBigdA2 beforeBigdA2(ConsumerExBigdA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigdA2(a); acceptBigdA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigdA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA2 ofBigdA2(ConsumerExBigdA2... consumers)
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
		
		return (a) -> { for(ConsumerExBigdA2 consumer : consumers) consumer.acceptBigdA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigdA2(BigDecimal[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][] a) throws Exception
	{
		acceptBigdA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA2 then(ConsumerEx<BigDecimal[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigdA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA2 before(ConsumerEx<BigDecimal[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigdA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA2 of(ConsumerEx<BigDecimal[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigdA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigDecimal[][]> consumer : consumers) consumer.accept(a); };
	}
}
