package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three BigInteger input arguments and
 * returns no result. {@link Consumer3Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger, BigInteger, BigInteger)}
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
public interface Consumer3Bigi extends Consumer3<BigInteger,BigInteger,BigInteger>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBigi(BigInteger a, BigInteger b, BigInteger c);
	
	@Override
	default void accept(BigInteger a, BigInteger b, BigInteger c)
	{
		acceptBigi(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3Bigi} performing this operation and the
	 * operation after.
	 */
	default Consumer3Bigi then(Consumer3Bigi after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigi(a, b, c); after.acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3Bigi then(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigi(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operation before and
	 * this operation.
	 */
	default Consumer3Bigi before(Consumer3Bigi before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigi(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3Bigi before(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3Bigi of(Consumer3Bigi... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3Bigi consumer : consumers) consumer.acceptBigi(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3Bigi of(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3Bigi) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
