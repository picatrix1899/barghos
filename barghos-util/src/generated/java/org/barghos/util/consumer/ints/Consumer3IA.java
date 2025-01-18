package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional int array input
 * arguments and returns no result. {@link Consumer3IA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[], int[], int[])}
 * 
 * @see ConsumerIA
 * @see ConsumerExIA
 * @see Consumer2IA
 * @see ConsumerEx2IA
 * @see Consumer3IA
 * @see ConsumerEx3IA
 * @see Consumer4IA
 * @see ConsumerEx4IA
 */
@FunctionalInterface
public interface Consumer3IA extends Consumer3<int[],int[],int[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptI(int[] a, int[] b, int[] c);
	
	@Override
	default void accept(int[] a, int[] b, int[] c)
	{
		acceptI(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3IA} performing this operation and the
	 * operation after.
	 */
	default Consumer3IA then(Consumer3IA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptI(a, b, c); after.acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA then(Consumer3<? super int[],? super int[],? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptI(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3IA} performing the operation before and
	 * this operation.
	 */
	default Consumer3IA before(Consumer3IA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptI(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3IA before(Consumer3<? super int[],? super int[],? super int[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3IA of(Consumer3IA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3IA consumer : consumers) consumer.acceptI(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3IA of(Consumer3<? super int[],? super int[],? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3IA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super int[],? super int[],? super int[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
