package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one boolean input argument and returns no
 * result. {@link ConsumerBo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean)}
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
public interface ConsumerBo extends Consumer<Boolean>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBo(boolean a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBo} performing this operation and the
	 * operation after.
	 */
	default ConsumerBo thenBo(ConsumerBo after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.acceptBo(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBo} performing the operation before and this
	 * operation.
	 */
	default ConsumerBo beforeBo(ConsumerBo before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBo(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBo} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBo ofBo(ConsumerBo... consumers)
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
		
		return (a) -> { for(ConsumerBo consumer : consumers) consumer.acceptBo(a); };
	}

	/**
	 * @deprecated Use {@link #acceptF(boolean)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Boolean a)
	{
		acceptBo(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBo then(Consumer<Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBo then(java.util.function.Consumer<? super Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBo before(Consumer<Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBo before(java.util.function.Consumer<? super Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBo} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBo of(Consumer<Boolean>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBo) consumers[0]::accept;

		return (a) -> { for(Consumer<Boolean> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBo andThen(java.util.function.Consumer<? super Boolean> after)
	{
		return then(after);
	}
}
