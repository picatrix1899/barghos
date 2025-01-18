package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two float input arguments and returns
 * no result. {@link Consumer2F} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float, float)}
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
public interface Consumer2F extends Consumer2<Float,Float>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptF(float a, float b);
	
	@Override
	default void accept(Float a, Float b)
	{
		acceptF(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2F} performing this operation and the
	 * operation after.
	 */
	default Consumer2F then(Consumer2F after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptF(a, b); after.acceptF(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2F then(Consumer2<? super Float,? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptF(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2F then(java.util.function.BiConsumer<? super Float,? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptF(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2F andThen(java.util.function.BiConsumer<? super Float,? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptF(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2F} performing the operation before and
	 * this operation.
	 */
	default Consumer2F before(Consumer2F before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptF(a, b); acceptF(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2F before(Consumer2<? super Float,? super Float> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptF(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2F before(java.util.function.BiConsumer<? super Float,? super Float> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptF(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2F} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2F of(Consumer2F... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2F consumer : consumers) consumer.acceptF(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2F} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2F of(Consumer2<? super Float,? super Float>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2F) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Float,? super Float> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2F of(java.util.function.BiConsumer<? super Float,? super Float>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2F)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Float,? super Float> consumer : consumers) consumer.accept(a, b); };
	}
	
}
