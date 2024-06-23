package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two float input arguments and returns no
 * result. {@link Consumer2F} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2F(float, float)}
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
public interface Consumer2F extends Consumer2<Float,Float>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2F(float a, float b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2F} performing this operation and the
	 * operation after.
	 */
	default Consumer2F then2F(Consumer2F after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2F(a, b); after.accept2F(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2F} performing the operation before and
	 * this operation.
	 */
	default Consumer2F before2F(Consumer2F before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2F(a, b); accept2F(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2F} performing the operations.
	 */
	@SafeVarargs
	static Consumer2F of2F(Consumer2F... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2F consumer : consumers) consumer.accept2F(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2F then(Consumer2<Float,Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2F(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2F then(java.util.function.BiConsumer<? super Float,? super Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2F(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2F before(Consumer2<Float,Float> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2F(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2F before(java.util.function.BiConsumer<? super Float,? super Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2F(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2F} performing the operations.
	 */
	@SafeVarargs
	static Consumer2F of(Consumer2<Float,Float>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2F) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<Float,Float> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2F(float, float)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Float a, Float b)
	{
		accept2F(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2F andThen(java.util.function.BiConsumer<? super Float,? super Float> after)
	{
		return then(after);
	}
}
