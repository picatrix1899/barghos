package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one short input argument and returns no
 * result. {@link ConsumerS} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short)}
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
public interface ConsumerS extends Consumer<Short>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptS(short a);
	
	@Override
	default void accept(Short a)
	{
		acceptS(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerS} performing this operation and the
	 * operation after.
	 */
	default ConsumerS then(ConsumerS after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptS(a); after.acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerS} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerS then(Consumer<? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerS} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerS then(java.util.function.Consumer<? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	@Override
	default ConsumerS andThen(java.util.function.Consumer<? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerS} performing the operation before and this
	 * operation.
	 */
	default ConsumerS before(ConsumerS before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptS(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerS} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerS before(Consumer<? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerS} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerS before(java.util.function.Consumer<? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerS} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerS} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerS of(ConsumerS... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerS consumer : consumers) consumer.acceptS(a); };
	}

	/**
	 * Composes a new {@link ConsumerS} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerS} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerS of(Consumer<? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerS) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Short> consumer : consumers) consumer.accept(a); };
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
	static ConsumerS of(java.util.function.Consumer<? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerS)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Short> consumer : consumers) consumer.accept(a); };
	}
	
}
