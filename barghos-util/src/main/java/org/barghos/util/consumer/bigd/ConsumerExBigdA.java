package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link ConsumerBigdA}
 * this may throw exceptions. {@link ConsumerExBigdA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigdA(BigDecimal[])}
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
public interface ConsumerExBigdA extends ConsumerEx<BigDecimal[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigdA(BigDecimal[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigdA thenBigdA(ConsumerExBigdA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigdA(a); after.acceptBigdA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigdA beforeBigdA(ConsumerExBigdA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigdA(a); acceptBigdA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA ofBigdA(ConsumerExBigdA... consumers)
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
		
		return (a) -> { for(ConsumerExBigdA consumer : consumers) consumer.acceptBigdA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigdA(BigDecimal[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[] a) throws Exception
	{
		acceptBigdA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA then(ConsumerEx<BigDecimal[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigdA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA before(ConsumerEx<BigDecimal[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA of(ConsumerEx<BigDecimal[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExBigdA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigDecimal[]> consumer : consumers) consumer.accept(a); };
	}
}
