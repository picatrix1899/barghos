package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one object input argument and returns no
 * result. {@link ConsumerO} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object)}
 * 
 * @see ConsumerO
 * @see ConsumerExO
 * @see Consumer2O
 * @see ConsumerEx2O
 * @see Consumer3O
 * @see ConsumerEx3O
 * @see Consumer4O
 * @see ConsumerEx4O
 */
@FunctionalInterface
public interface ConsumerO extends Consumer<Object>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptO(Object a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerO} performing this operation and the
	 * operation after.
	 */
	default ConsumerO thenO(ConsumerO after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptO(a); after.acceptO(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerO} performing the operation before and this
	 * operation.
	 */
	default ConsumerO beforeO(ConsumerO before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptO(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerO ofO(ConsumerO... consumers)
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
		
		return (a) -> { for(ConsumerO consumer : consumers) consumer.acceptO(a); };
	}

	/**
	 * @deprecated Use {@link #acceptF(Object)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object a)
	{
		acceptO(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerO then(Consumer<Object> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerO then(java.util.function.Consumer<? super Object> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerO before(Consumer<Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerO before(java.util.function.Consumer<? super Object> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerO of(Consumer<Object>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerO) consumers[0]::accept;

		return (a) -> { for(Consumer<Object> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerO andThen(java.util.function.Consumer<? super Object> after)
	{
		return then(after);
	}
}
