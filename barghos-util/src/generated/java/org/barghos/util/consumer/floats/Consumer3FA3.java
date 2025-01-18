package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional float array input
 * arguments and returns no result. {@link Consumer3FA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[][][], float[][][], float[][][])}
 * 
 * @see ConsumerFA3
 * @see ConsumerExFA3
 * @see Consumer2FA3
 * @see ConsumerEx2FA3
 * @see Consumer3FA3
 * @see ConsumerEx3FA3
 * @see Consumer4FA3
 * @see ConsumerEx4FA3
 */
@FunctionalInterface
public interface Consumer3FA3 extends Consumer3<float[][][],float[][][],float[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptF(float[][][] a, float[][][] b, float[][][] c);
	
	@Override
	default void accept(float[][][] a, float[][][] b, float[][][] c)
	{
		acceptF(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3FA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3FA3 then(Consumer3FA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptF(a, b, c); after.acceptF(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3FA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3FA3 then(Consumer3<? super float[][][],? super float[][][],? super float[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptF(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3FA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3FA3 before(Consumer3FA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptF(a, b, c); acceptF(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3FA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3FA3 before(Consumer3<? super float[][][],? super float[][][],? super float[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptF(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3FA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3FA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3FA3 of(Consumer3FA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3FA3 consumer : consumers) consumer.acceptF(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3FA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3FA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3FA3 of(Consumer3<? super float[][][],? super float[][][],? super float[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3FA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super float[][][],? super float[][][],? super float[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
