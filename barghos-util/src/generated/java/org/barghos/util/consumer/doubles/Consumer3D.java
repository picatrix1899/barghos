package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three double input arguments and
 * returns no result. {@link Consumer3D} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double, double, double)}
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
public interface Consumer3D extends Consumer3<Double,Double,Double>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptD(double a, double b, double c);
	
	@Override
	default void accept(Double a, Double b, Double c)
	{
		acceptD(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3D} performing this operation and the
	 * operation after.
	 */
	default Consumer3D then(Consumer3D after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptD(a, b, c); after.acceptD(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3D} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3D then(Consumer3<? super Double,? super Double,? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptD(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3D} performing the operation before and
	 * this operation.
	 */
	default Consumer3D before(Consumer3D before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptD(a, b, c); acceptD(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3D} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3D before(Consumer3<? super Double,? super Double,? super Double> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptD(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3D} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3D of(Consumer3D... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3D consumer : consumers) consumer.acceptD(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3D} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3D of(Consumer3<? super Double,? super Double,? super Double>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3D) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Double,? super Double,? super Double> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
