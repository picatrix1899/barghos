package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two short input arguments and returns
 * no result. {@link Consumer2S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short, short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface Consumer2S extends Consumer2<Short,Short>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptS(short a, short b);
	
	@Override
	default void accept(Short a, Short b)
	{
		acceptS(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2S} performing this operation and the
	 * operation after.
	 */
	default Consumer2S then(Consumer2S after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptS(a, b); after.acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2S then(Consumer2<? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2S then(java.util.function.BiConsumer<? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2S andThen(java.util.function.BiConsumer<? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2S} performing the operation before and
	 * this operation.
	 */
	default Consumer2S before(Consumer2S before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptS(a, b); acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2S before(Consumer2<? super Short,? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2S} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2S before(java.util.function.BiConsumer<? super Short,? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptS(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2S} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2S of(Consumer2S... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2S consumer : consumers) consumer.acceptS(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2S} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2S of(Consumer2<? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2S) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Short,? super Short> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2S of(java.util.function.BiConsumer<? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2S)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Short,? super Short> consumer : consumers) consumer.accept(a, b); };
	}
	
}
