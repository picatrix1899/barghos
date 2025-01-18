package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional short array input
 * argument and returns no result. {@link ConsumerSA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[][][])}
 * 
 * @see ConsumerSA3
 * @see ConsumerExSA3
 * @see Consumer2SA3
 * @see ConsumerEx2SA3
 * @see Consumer3SA3
 * @see ConsumerEx3SA3
 * @see Consumer4SA3
 * @see ConsumerEx4SA3
 */
@FunctionalInterface
public interface ConsumerSA3 extends Consumer<short[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptS(short[][][] a);
	
	@Override
	default void accept(short[][][] a)
	{
		acceptS(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerSA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerSA3 then(ConsumerSA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptS(a); after.acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA3 then(Consumer<? super short[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA3 then(java.util.function.Consumer<? super short[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	@Override
	default ConsumerSA3 andThen(java.util.function.Consumer<? super short[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerSA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerSA3 before(ConsumerSA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptS(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA3 before(Consumer<? super short[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA3 before(java.util.function.Consumer<? super short[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerSA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerSA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerSA3 of(ConsumerSA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerSA3 consumer : consumers) consumer.acceptS(a); };
	}

	/**
	 * Composes a new {@link ConsumerSA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerSA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerSA3 of(Consumer<? super short[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerSA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super short[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerSA3 of(java.util.function.Consumer<? super short[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerSA3)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super short[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
