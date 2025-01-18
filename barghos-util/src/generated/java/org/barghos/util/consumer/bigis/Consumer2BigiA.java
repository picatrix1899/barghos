package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional BigInteger array input
 * arguments and returns no result. {@link Consumer2BigiA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[], BigInteger[])}
 * 
 * @see ConsumerBigiA
 * @see ConsumerExBigiA
 * @see Consumer2BigiA
 * @see ConsumerEx2BigiA
 * @see Consumer3BigiA
 * @see ConsumerEx3BigiA
 * @see Consumer4BigiA
 * @see ConsumerEx4BigiA
 */
@FunctionalInterface
public interface Consumer2BigiA extends Consumer2<BigInteger[],BigInteger[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBigi(BigInteger[] a, BigInteger[] b);
	
	@Override
	default void accept(BigInteger[] a, BigInteger[] b)
	{
		acceptBigi(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigiA} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigiA then(Consumer2BigiA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigi(a, b); after.acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA then(Consumer2<? super BigInteger[],? super BigInteger[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA then(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2BigiA andThen(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigiA before(Consumer2BigiA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigi(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigiA before(Consumer2<? super BigInteger[],? super BigInteger[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigiA before(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BigiA of(Consumer2BigiA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BigiA consumer : consumers) consumer.acceptBigi(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BigiA of(Consumer2<? super BigInteger[],? super BigInteger[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigiA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super BigInteger[],? super BigInteger[]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BigiA of(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigiA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
