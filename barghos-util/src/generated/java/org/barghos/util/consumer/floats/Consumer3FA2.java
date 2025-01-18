package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional float array input
 * arguments and returns no result. {@link Consumer3FA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[][], float[][], float[][])}
 * 
 * @see ConsumerFA2
 * @see ConsumerExFA2
 * @see Consumer2FA2
 * @see ConsumerEx2FA2
 * @see Consumer3FA2
 * @see ConsumerEx3FA2
 * @see Consumer4FA2
 * @see ConsumerEx4FA2
 */
@FunctionalInterface
public interface Consumer3FA2 extends Consumer3<float[][],float[][],float[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptF(float[][] a, float[][] b, float[][] c);
	
	@Override
	default void accept(float[][] a, float[][] b, float[][] c)
	{
		acceptF(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3FA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3FA2 then(Consumer3FA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptF(a, b, c); after.acceptF(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3FA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3FA2 then(Consumer3<? super float[][],? super float[][],? super float[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptF(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3FA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3FA2 before(Consumer3FA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptF(a, b, c); acceptF(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3FA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3FA2 before(Consumer3<? super float[][],? super float[][],? super float[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptF(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3FA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3FA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3FA2 of(Consumer3FA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3FA2 consumer : consumers) consumer.acceptF(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3FA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3FA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3FA2 of(Consumer3<? super float[][],? super float[][],? super float[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return (Consumer3FA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super float[][],? super float[][],? super float[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
