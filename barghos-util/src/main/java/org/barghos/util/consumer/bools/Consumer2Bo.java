package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two boolean input arguments and returns
 * no result. {@link Consumer2Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2Bo(boolean, boolean)}
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface Consumer2Bo extends Consumer2<Boolean,Boolean>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2Bo(boolean a, boolean b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Bo} performing this operation and the
	 * operation after.
	 */
	default Consumer2Bo then2Bo(Consumer2Bo after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2Bo(a, b); after.accept2Bo(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Bo} performing the operation before and
	 * this operation.
	 */
	default Consumer2Bo before2Bo(Consumer2Bo before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2Bo(a, b); accept2Bo(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bo} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bo of2Bo(Consumer2Bo... consumers)
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
		
		return (a, b) -> { for(Consumer2Bo consumer : consumers) consumer.accept2Bo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bo then(Consumer2<Boolean,Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bo(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bo then(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bo(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bo before(Consumer2<Boolean,Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2Bo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bo before(java.util.function.BiConsumer<? super Boolean,? super Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2Bo(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bo} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bo of(Consumer2<Boolean,Boolean>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2Bo) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<Boolean,Boolean> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2Bo(boolean, boolean)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Boolean a, Boolean b)
	{
		accept2Bo(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2Bo andThen(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
	{
		return then(after);
	}
}
