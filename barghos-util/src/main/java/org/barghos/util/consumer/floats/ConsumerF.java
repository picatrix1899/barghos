package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one float input argument and returns no
 * result. {@link ConsumerF} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3F
 * @see ConsumerEx3F
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerF extends Consumer<Float>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptF(float a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerF} performing this operation and the
	 * operation after.
	 */
	default ConsumerF thenF(ConsumerF after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptF(a); after.acceptF(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerF} performing the operation before and this
	 * operation.
	 */
	default ConsumerF beforeF(ConsumerF before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptF(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerF} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerF} performing the operations.
	 */
	@SafeVarargs
	static ConsumerF ofF(ConsumerF... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerF consumer : consumers) consumer.acceptF(a); };
	}

	/**
	 * @deprecated Use {@link #acceptF(float)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Float a)
	{
		acceptF(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerF then(Consumer<Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerF then(java.util.function.Consumer<? super Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerF before(Consumer<Float> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerF} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerF before(java.util.function.Consumer<? super Float> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerF} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerF} performing the operations.
	 */
	@SafeVarargs
	static ConsumerF of(Consumer<Float>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerF) consumers[0]::accept;

		return (a) -> { for(Consumer<Float> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerF andThen(java.util.function.Consumer<? super Float> after)
	{
		return then(after);
	}
}
