package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional float array input
 * arguments and returns no result. {@link Consumer4FA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[], float[], float[], float[])}
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
public interface Consumer4FA extends Consumer4<float[],float[],float[],float[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptF(float[] a, float[] b, float[] c, float[] d);
	
	@Override
	default void accept(float[] a, float[] b, float[] c, float[] d)
	{
		acceptF(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4FA} performing this operation and the
	 * operation after.
	 */
	default Consumer4FA then(Consumer4FA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptF(a, b, c, d); after.acceptF(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4FA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4FA then(Consumer4<? super float[],? super float[],? super float[],? super float[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptF(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4FA} performing the operation before and
	 * this operation.
	 */
	default Consumer4FA before(Consumer4FA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptF(a, b, c, d); acceptF(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4FA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4FA before(Consumer4<? super float[],? super float[],? super float[],? super float[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptF(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4FA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4FA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4FA of(Consumer4FA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4FA consumer : consumers) consumer.acceptF(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4FA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4FA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4FA of(Consumer4<? super float[],? super float[],? super float[],? super float[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (Consumer4FA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super float[],? super float[],? super float[],? super float[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
