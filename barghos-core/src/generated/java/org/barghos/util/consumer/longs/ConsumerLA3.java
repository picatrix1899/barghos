package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional long array input
 * argument and returns no result. {@link ConsumerLA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long[][][])}
 * 
 * @see ConsumerLA3
 * @see ConsumerExLA3
 * @see Consumer2LA3
 * @see ConsumerEx2LA3
 * @see Consumer3LA3
 * @see ConsumerEx3LA3
 * @see Consumer4LA3
 * @see ConsumerEx4LA3
 */
@FunctionalInterface
public interface ConsumerLA3 extends Consumer<long[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptL(long[][][] a);
	
	@Override
	default void accept(long[][][] a)
	{
		acceptL(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerLA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerLA3 then(ConsumerLA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptL(a); after.acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA3 then(Consumer<? super long[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA3 then(java.util.function.Consumer<? super long[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	@Override
	default ConsumerLA3 andThen(java.util.function.Consumer<? super long[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerLA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerLA3 before(ConsumerLA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptL(a); acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA3 before(Consumer<? super long[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA3 before(java.util.function.Consumer<? super long[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptL(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerLA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA3 of(ConsumerLA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerLA3 consumer : consumers) consumer.acceptL(a); };
	}

	/**
	 * Composes a new {@link ConsumerLA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA3 of(Consumer<? super long[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerLA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super long[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerLA3 of(java.util.function.Consumer<? super long[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerLA3)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super long[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
