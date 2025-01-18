package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional int array input
 * argument and returns no result. {@link ConsumerIA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[])}
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
public interface ConsumerIA extends Consumer<int[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptI(int[] a);
	
	@Override
	default void accept(int[] a)
	{
		acceptI(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerIA} performing this operation and the
	 * operation after.
	 */
	default ConsumerIA then(ConsumerIA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptI(a); after.acceptI(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA then(Consumer<? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptI(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA then(java.util.function.Consumer<? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptI(a); after.accept(a); };
	}
	
	@Override
	default ConsumerIA andThen(java.util.function.Consumer<? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptI(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerIA} performing the operation before and
	 * this operation.
	 */
	default ConsumerIA before(ConsumerIA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptI(a); acceptI(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerIA before(Consumer<? super int[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptI(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerIA before(java.util.function.Consumer<? super int[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptI(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerIA of(ConsumerIA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerIA consumer : consumers) consumer.acceptI(a); };
	}

	/**
	 * Composes a new {@link ConsumerIA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerIA of(Consumer<? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerIA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super int[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerIA of(java.util.function.Consumer<? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerIA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super int[]> consumer : consumers) consumer.accept(a); };
	}
	
}
