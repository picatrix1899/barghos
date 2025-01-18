package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 3-dimensional float array input
 * arguments and returns no result. {@link Consumer4FA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[][][], float[][][], float[][][], float[][][])}
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
public interface Consumer4FA3 extends Consumer4<float[][][],float[][][],float[][][],float[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptF(float[][][] a, float[][][] b, float[][][] c, float[][][] d);
	
	@Override
	default void accept(float[][][] a, float[][][] b, float[][][] c, float[][][] d)
	{
		acceptF(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4FA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4FA3 then(Consumer4FA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptF(a, b, c, d); after.acceptF(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4FA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4FA3 then(Consumer4<? super float[][][],? super float[][][],? super float[][][],? super float[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptF(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4FA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4FA3 before(Consumer4FA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptF(a, b, c, d); acceptF(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4FA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4FA3 before(Consumer4<? super float[][][],? super float[][][],? super float[][][],? super float[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptF(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4FA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4FA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4FA3 of(Consumer4FA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4FA3 consumer : consumers) consumer.acceptF(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4FA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4FA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4FA3 of(Consumer4<? super float[][][],? super float[][][],? super float[][][],? super float[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4FA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super float[][][],? super float[][][],? super float[][][],? super float[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
