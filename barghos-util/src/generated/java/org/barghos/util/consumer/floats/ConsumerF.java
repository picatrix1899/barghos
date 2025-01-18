package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one float input argument and returns no
 * result. {@link ConsumerF} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3F
 * @see ConsumerEx3F
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerF extends Consumer<Float>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptF(float a);
	
	@Override
	default void accept(Float a)
	{
		acceptF(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerF} performing this operation and the
	 * operation after.
	 */
	default ConsumerF then(ConsumerF after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptF(a); after.acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerF then(Consumer<? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerF then(java.util.function.Consumer<? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	@Override
	default ConsumerF andThen(java.util.function.Consumer<? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerF} performing the operation before and this
	 * operation.
	 */
	default ConsumerF before(ConsumerF before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptF(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerF before(Consumer<? super Float> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerF before(java.util.function.Consumer<? super Float> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerF} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerF} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerF of(ConsumerF... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerF consumer : consumers) consumer.acceptF(a); };
	}

	/**
	 * Composes a new {@link ConsumerF} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerF} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerF of(Consumer<? super Float>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerF) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Float> consumer : consumers) consumer.accept(a); };
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
	static ConsumerF of(java.util.function.Consumer<? super Float>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerF)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Float> consumer : consumers) consumer.accept(a); };
	}
	
}
