package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four {@link BigInteger} input arguments
 * and returns no result. {@link Consumer4Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger, BigInteger, BigInteger, BigInteger)}
 * 
 * @see ConsumerBigi
 * @see ConsumerExBigi
 * @see Consumer2Bigi
 * @see ConsumerEx2Bigi
 * @see Consumer3Bigi
 * @see ConsumerEx3Bigi
 * @see Consumer4Bigi
 * @see ConsumerEx4Bigi
 */
@FunctionalInterface
public interface Consumer4Bigi extends Consumer4<BigInteger,BigInteger,BigInteger,BigInteger>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptBigi(BigInteger a, BigInteger b, BigInteger c, BigInteger d);
	
	@Override
	default void accept(BigInteger a, BigInteger b, BigInteger c, BigInteger d)
	{
		acceptBigi(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Bigi} performing this operation and the
	 * operation after.
	 */
	default Consumer4Bigi then(Consumer4Bigi after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigi(a, b, c, d); after.acceptBigi(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Bigi then(Consumer4<? super BigInteger,? super BigInteger,? super BigInteger,? super BigInteger> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigi(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Bigi} performing the operation before and
	 * this operation.
	 */
	default Consumer4Bigi before(Consumer4Bigi before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBigi(a, b, c, d); acceptBigi(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Bigi before(Consumer4<? super BigInteger,? super BigInteger,? super BigInteger,? super BigInteger> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBigi(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Bigi of(Consumer4Bigi... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4Bigi consumer : consumers) consumer.acceptBigi(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Bigi of(Consumer4<? super BigInteger,? super BigInteger,? super BigInteger,? super BigInteger>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Bigi) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super BigInteger,? super BigInteger,? super BigInteger,? super BigInteger> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
