package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one double input argument and returns no
 * result. {@link ConsumerD} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double)}
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
public interface ConsumerD extends Consumer<Double>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptD(double a);
	
	@Override
	default void accept(Double a)
	{
		acceptD(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerD} performing this operation and the
	 * operation after.
	 */
	default ConsumerD then(ConsumerD after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptD(a); after.acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerD} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerD then(Consumer<? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerD} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerD then(java.util.function.Consumer<? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	@Override
	default ConsumerD andThen(java.util.function.Consumer<? super Double> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerD} performing the operation before and this
	 * operation.
	 */
	default ConsumerD before(ConsumerD before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptD(a); acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerD} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerD before(Consumer<? super Double> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerD} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerD before(java.util.function.Consumer<? super Double> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptD(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerD} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerD} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerD of(ConsumerD... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerD consumer : consumers) consumer.acceptD(a); };
	}

	/**
	 * Composes a new {@link ConsumerD} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerD} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerD of(Consumer<? super Double>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerD) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Double> consumer : consumers) consumer.accept(a); };
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
	static ConsumerD of(java.util.function.Consumer<? super Double>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerD)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Double> consumer : consumers) consumer.accept(a); };
	}
	
}
