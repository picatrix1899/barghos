package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional float array input
 * arguments and returns no result. {@link Consumer2FA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[], float[])}
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
public interface Consumer2FA extends Consumer2<float[],float[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptF(float[] a, float[] b);
	
	@Override
	default void accept(float[] a, float[] b)
	{
		acceptF(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2FA} performing this operation and the
	 * operation after.
	 */
	default Consumer2FA then(Consumer2FA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptF(a, b); after.acceptF(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2FA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2FA then(Consumer2<? super float[],? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptF(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2FA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2FA then(java.util.function.BiConsumer<? super float[],? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptF(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2FA andThen(java.util.function.BiConsumer<? super float[],? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptF(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2FA} performing the operation before and
	 * this operation.
	 */
	default Consumer2FA before(Consumer2FA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptF(a, b); acceptF(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2FA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2FA before(Consumer2<? super float[],? super float[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptF(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2FA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2FA before(java.util.function.BiConsumer<? super float[],? super float[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptF(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2FA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2FA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2FA of(Consumer2FA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2FA consumer : consumers) consumer.acceptF(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2FA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2FA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2FA of(Consumer2<? super float[],? super float[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2FA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super float[],? super float[]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2FA of(java.util.function.BiConsumer<? super float[],? super float[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2FA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super float[],? super float[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
