package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two double input arguments and returns
 * no result. {@link Consumer2D} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double, double)}
 * 
 * @see ConsumerD
 * @see ConsumerExD
 * @see Consumer2D
 * @see ConsumerEx2D
 * @see Consumer3D
 * @see ConsumerEx3D
 * @see Consumer4D
 * @see ConsumerEx4D
 */
@FunctionalInterface
public interface Consumer2D extends Consumer2<Double,Double>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptD(double a, double b);
	
	@Override
	default void accept(Double a, Double b)
	{
		acceptD(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2D} performing this operation and the
	 * operation after.
	 */
	default Consumer2D then(Consumer2D after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptD(a, b); after.acceptD(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2D} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2D then(Consumer2<? super Double,? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptD(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2D} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2D then(java.util.function.BiConsumer<? super Double,? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptD(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2D andThen(java.util.function.BiConsumer<? super Double,? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptD(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2D} performing the operation before and
	 * this operation.
	 */
	default Consumer2D before(Consumer2D before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptD(a, b); acceptD(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2D} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2D before(Consumer2<? super Double,? super Double> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptD(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2D} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2D before(java.util.function.BiConsumer<? super Double,? super Double> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptD(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2D} performing the operations.
	 */
	@SafeVarargs
	static Consumer2D of(Consumer2D... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2D consumer : consumers) consumer.acceptD(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2D} performing the operations.
	 */
	@SafeVarargs
	static Consumer2D of(Consumer2<? super Double,? super Double>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2D) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Double,? super Double> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2D of(java.util.function.BiConsumer<? super Double,? super Double>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2D)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Double,? super Double> consumer : consumers) consumer.accept(a, b); };
	}
	
}
