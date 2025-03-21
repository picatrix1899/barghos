package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional boolean array input
 * argument and returns no result. {@link ConsumerBoA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[])}
 * 
 * @see ConsumerBoA
 * @see ConsumerExBoA
 * @see Consumer2BoA
 * @see ConsumerEx2BoA
 * @see Consumer3BoA
 * @see ConsumerEx3BoA
 * @see Consumer4BoA
 * @see ConsumerEx4BoA
 */
@FunctionalInterface
public interface ConsumerBoA extends Consumer<boolean[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBo(boolean[] a);
	
	@Override
	default void accept(boolean[] a)
	{
		acceptBo(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBoA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBoA then(ConsumerBoA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA then(Consumer<? super boolean[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBoA then(java.util.function.Consumer<? super boolean[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBoA andThen(java.util.function.Consumer<? super boolean[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBoA} performing the operation before and
	 * this operation.
	 */
	default ConsumerBoA before(ConsumerBoA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBo(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBoA before(Consumer<? super boolean[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBoA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBoA before(java.util.function.Consumer<? super boolean[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA of(ConsumerBoA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBoA consumer : consumers) consumer.acceptBo(a); };
	}

	/**
	 * Composes a new {@link ConsumerBoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBoA of(Consumer<? super boolean[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBoA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super boolean[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBoA of(java.util.function.Consumer<? super boolean[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBoA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super boolean[]> consumer : consumers) consumer.accept(a); };
	}
	
}
