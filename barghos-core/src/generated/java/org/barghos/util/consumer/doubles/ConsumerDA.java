package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional double array input
 * argument and returns no result. {@link ConsumerDA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double[])}
 * 
 * @see ConsumerDA
 * @see ConsumerExDA
 * @see Consumer2DA
 * @see ConsumerEx2DA
 * @see Consumer3DA
 * @see ConsumerEx3DA
 * @see Consumer4DA
 * @see ConsumerEx4DA
 */
@FunctionalInterface
public interface ConsumerDA extends Consumer<double[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptD(double[] a);
	
	@Override
	default void accept(double[] a)
	{
		acceptD(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerDA} performing this operation and the
	 * operation after.
	 */
	default ConsumerDA then(ConsumerDA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptD(a); after.acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerDA then(Consumer<? super double[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerDA then(java.util.function.Consumer<? super double[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	@Override
	default ConsumerDA andThen(java.util.function.Consumer<? super double[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerDA} performing the operation before and
	 * this operation.
	 */
	default ConsumerDA before(ConsumerDA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptD(a); acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerDA before(Consumer<? super double[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerDA before(java.util.function.Consumer<? super double[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptD(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerDA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerDA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerDA of(ConsumerDA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerDA consumer : consumers) consumer.acceptD(a); };
	}

	/**
	 * Composes a new {@link ConsumerDA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerDA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerDA of(Consumer<? super double[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerDA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super double[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerDA of(java.util.function.Consumer<? super double[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerDA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super double[]> consumer : consumers) consumer.accept(a); };
	}
	
}
