package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two {@link BigInteger} input arguments
 * and returns no result. {@link Consumer2Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger, BigInteger)}
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
public interface Consumer2Bigi extends Consumer2<BigInteger,BigInteger>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBigi(BigInteger a, BigInteger b);
	
	@Override
	default void accept(BigInteger a, BigInteger b)
	{
		acceptBigi(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	default Consumer2Bigi then(Consumer2Bigi after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigi(a, b); after.acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigi then(Consumer2<? super BigInteger,? super BigInteger> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigi then(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2Bigi andThen(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	default Consumer2Bigi before(Consumer2Bigi before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigi(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigi before(Consumer2<? super BigInteger,? super BigInteger> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigi before(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigi of(Consumer2Bigi... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2Bigi consumer : consumers) consumer.acceptBigi(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigi of(Consumer2<? super BigInteger,? super BigInteger>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2Bigi) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super BigInteger,? super BigInteger> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigi of(java.util.function.BiConsumer<? super BigInteger,? super BigInteger>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2Bigi)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> consumer : consumers) consumer.accept(a, b); };
	}
	
}
