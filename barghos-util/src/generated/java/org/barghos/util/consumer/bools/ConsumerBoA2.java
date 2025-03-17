package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional boolean array input
 * argument and returns no result. {@link ConsumerBoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][])}
 * 
 * @see ConsumerBoA2
 * @see ConsumerExBoA2
 * @see Consumer2BoA2
 * @see ConsumerEx2BoA2
 * @see Consumer3BoA2
 * @see ConsumerEx3BoA2
 * @see Consumer4BoA2
 * @see ConsumerEx4BoA2
 */
@FunctionalInterface
public interface ConsumerBoA2 extends Consumer<boolean[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBo(boolean[][] a);
	
	@Override
	default void accept(boolean[][] a)
	{
		acceptBo(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBoA2 then(ConsumerBoA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 then(Consumer<? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 then(java.util.function.Consumer<? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBoA2 andThen(java.util.function.Consumer<? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBoA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBoA2 before(ConsumerBoA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBo(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 before(Consumer<? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA2 before(java.util.function.Consumer<? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA2 of(ConsumerBoA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBoA2 consumer : consumers) consumer.acceptBo(a); };
	}

	/**
	 * Composes a new {@link ConsumerBoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA2 of(Consumer<? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBoA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super boolean[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBoA2 of(java.util.function.Consumer<? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBoA2)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super boolean[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
