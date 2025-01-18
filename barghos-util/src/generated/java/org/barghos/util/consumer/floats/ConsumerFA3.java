package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional float array input
 * argument and returns no result. {@link ConsumerFA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float[][][])}
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
public interface ConsumerFA3 extends Consumer<float[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptF(float[][][] a);
	
	@Override
	default void accept(float[][][] a)
	{
		acceptF(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerFA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerFA3 then(ConsumerFA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptF(a); after.acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerFA3 then(Consumer<? super float[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerFA3 then(java.util.function.Consumer<? super float[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	@Override
	default ConsumerFA3 andThen(java.util.function.Consumer<? super float[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerFA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerFA3 before(ConsumerFA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptF(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerFA3 before(Consumer<? super float[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerFA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerFA3 before(java.util.function.Consumer<? super float[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerFA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerFA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerFA3 of(ConsumerFA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerFA3 consumer : consumers) consumer.acceptF(a); };
	}

	/**
	 * Composes a new {@link ConsumerFA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerFA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerFA3 of(Consumer<? super float[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerFA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super float[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerFA3 of(java.util.function.Consumer<? super float[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerFA3)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super float[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
