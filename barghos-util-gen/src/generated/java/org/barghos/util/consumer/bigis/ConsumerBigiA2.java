package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional BigInteger array input
 * argument and returns no result. {@link ConsumerBigiA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][])}
 * 
 * @see ConsumerBigiA2
 * @see ConsumerExBigiA2
 * @see Consumer2BigiA2
 * @see ConsumerEx2BigiA2
 * @see Consumer3BigiA2
 * @see ConsumerEx3BigiA2
 * @see Consumer4BigiA2
 * @see ConsumerEx4BigiA2
 */
@FunctionalInterface
public interface ConsumerBigiA2 extends Consumer<BigInteger[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigi(BigInteger[][] a);
	
	@Override
	default void accept(BigInteger[][] a)
	{
		acceptBigi(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigiA2 then(ConsumerBigiA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 then(Consumer<? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 then(java.util.function.Consumer<? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBigiA2 andThen(java.util.function.Consumer<? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigiA2 before(ConsumerBigiA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigi(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 before(Consumer<? super BigInteger[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 before(java.util.function.Consumer<? super BigInteger[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA2 of(ConsumerBigiA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBigiA2 consumer : consumers) consumer.acceptBigi(a); };
	}

	/**
	 * Composes a new {@link ConsumerBigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA2 of(Consumer<? super BigInteger[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBigiA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigInteger[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBigiA2 of(java.util.function.Consumer<? super BigInteger[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBigiA2)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super BigInteger[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
