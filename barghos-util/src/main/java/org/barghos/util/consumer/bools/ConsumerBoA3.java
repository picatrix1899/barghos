package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional boolean array input
 * argument and returns no result. {@link ConsumerBoA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][][])}
 * 
 * @see ConsumerBoA3
 * @see ConsumerExBoA3
 * @see Consumer2BoA3
 * @see ConsumerEx2BoA3
 * @see Consumer3BoA3
 * @see ConsumerEx3BoA3
 * @see Consumer4BoA3
 * @see ConsumerEx4BoA3
 */
@FunctionalInterface
public interface ConsumerBoA3 extends Consumer<boolean[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBo(boolean[][][] a);
	
	@Override
	default void accept(boolean[][][] a)
	{
		acceptBo(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerBoA3 then(ConsumerBoA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 then(Consumer<? super boolean[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 then(java.util.function.Consumer<? super boolean[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBoA3 andThen(java.util.function.Consumer<? super boolean[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBoA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerBoA3 before(ConsumerBoA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBo(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 before(Consumer<? super boolean[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA3 before(java.util.function.Consumer<? super boolean[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerBoA3 of(ConsumerBoA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBoA3 consumer : consumers) consumer.acceptBo(a); };
	}

	/**
	 * Composes a new {@link ConsumerBoA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerBoA3 of(Consumer<? super boolean[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBoA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super boolean[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBoA3 of(java.util.function.Consumer<? super boolean[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBoA3)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super boolean[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
