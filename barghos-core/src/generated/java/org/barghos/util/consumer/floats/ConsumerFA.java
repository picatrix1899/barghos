package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional float array input
 * argument and returns no result. {@link ConsumerFA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[])}
 * 
 * @see ConsumerFA
 * @see ConsumerExFA
 * @see Consumer2FA
 * @see ConsumerEx2FA
 * @see Consumer3FA
 * @see ConsumerEx3FA
 * @see Consumer4FA
 * @see ConsumerEx4FA
 */
@FunctionalInterface
public interface ConsumerFA extends Consumer<float[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptF(float[] a);
	
	@Override
	default void accept(float[] a)
	{
		acceptF(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerFA} performing this operation and the
	 * operation after.
	 */
	default ConsumerFA then(ConsumerFA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptF(a); after.acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerFA then(Consumer<? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerFA then(java.util.function.Consumer<? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	@Override
	default ConsumerFA andThen(java.util.function.Consumer<? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerFA} performing the operation before and
	 * this operation.
	 */
	default ConsumerFA before(ConsumerFA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptF(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerFA before(Consumer<? super float[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerFA before(java.util.function.Consumer<? super float[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerFA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerFA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerFA of(ConsumerFA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerFA consumer : consumers) consumer.acceptF(a); };
	}

	/**
	 * Composes a new {@link ConsumerFA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerFA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerFA of(Consumer<? super float[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerFA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super float[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerFA of(java.util.function.Consumer<? super float[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerFA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super float[]> consumer : consumers) consumer.accept(a); };
	}
	
}
