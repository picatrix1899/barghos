package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional int array input
 * arguments and returns no result. {@link Consumer2IA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[], int[])}
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
public interface Consumer2IA extends Consumer2<int[],int[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptI(int[] a, int[] b);
	
	@Override
	default void accept(int[] a, int[] b)
	{
		acceptI(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2IA} performing this operation and the
	 * operation after.
	 */
	default Consumer2IA then(Consumer2IA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptI(a, b); after.acceptI(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2IA then(Consumer2<? super int[],? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptI(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2IA then(java.util.function.BiConsumer<? super int[],? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptI(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2IA andThen(java.util.function.BiConsumer<? super int[],? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptI(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2IA} performing the operation before and
	 * this operation.
	 */
	default Consumer2IA before(Consumer2IA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptI(a, b); acceptI(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2IA before(Consumer2<? super int[],? super int[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptI(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2IA before(java.util.function.BiConsumer<? super int[],? super int[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptI(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2IA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2IA of(Consumer2IA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2IA consumer : consumers) consumer.acceptI(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2IA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2IA of(Consumer2<? super int[],? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2IA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super int[],? super int[]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2IA of(java.util.function.BiConsumer<? super int[],? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2IA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super int[],? super int[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
