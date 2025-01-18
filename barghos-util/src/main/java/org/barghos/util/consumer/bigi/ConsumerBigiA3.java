package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional {@link BigInteger}
 * array input argument and returns no result. {@link ConsumerBigiA3} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][][])}
 * 
 * @see ConsumerBigiA3
 * @see ConsumerExBigiA3
 * @see Consumer2BigiA3
 * @see ConsumerEx2BigiA3
 * @see Consumer3BigiA3
 * @see ConsumerEx3BigiA3
 * @see Consumer4BigiA3
 * @see ConsumerEx4BigiA3
 */
@FunctionalInterface
public interface ConsumerBigiA3 extends Consumer<BigInteger[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigi(BigInteger[][][] a);
	
	@Override
	default void accept(BigInteger[][][] a)
	{
		acceptBigi(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigiA3 then(ConsumerBigiA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 then(Consumer<? super BigInteger[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 then(java.util.function.Consumer<? super BigInteger[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBigiA3 andThen(java.util.function.Consumer<? super BigInteger[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigiA3 before(ConsumerBigiA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigi(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 before(Consumer<? super BigInteger[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 before(java.util.function.Consumer<? super BigInteger[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA3 of(ConsumerBigiA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBigiA3 consumer : consumers) consumer.acceptBigi(a); };
	}

	/**
	 * Composes a new {@link ConsumerBigiA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA3 of(Consumer<? super BigInteger[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigiA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigInteger[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBigiA3 of(java.util.function.Consumer<? super BigInteger[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigiA3)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super BigInteger[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
