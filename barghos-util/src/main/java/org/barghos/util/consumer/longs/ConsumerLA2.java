package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional long array input
 * argument and returns no result. {@link ConsumerLA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptLA2(long[][])}
 * 
 * @see ConsumerLA2
 * @see ConsumerExLA2
 * @see Consumer2LA2
 * @see ConsumerEx2LA2
 * @see Consumer3LA2
 * @see ConsumerEx3LA2
 * @see Consumer4LA2
 * @see ConsumerEx4LA2
 */
@FunctionalInterface
public interface ConsumerLA2 extends Consumer<long[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptLA2(long[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerLA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerLA2 thenLA2(ConsumerLA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptLA2(a); after.acceptLA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerLA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerLA2 beforeLA2(ConsumerLA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptLA2(a); acceptLA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerLA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA2 ofLA2(ConsumerLA2... consumers)
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
		
		return (a) -> { for(ConsumerLA2 consumer : consumers) consumer.acceptLA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptLA2(long[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[][] a)
	{
		acceptLA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA2 then(Consumer<long[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptLA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA2 then(java.util.function.Consumer<? super long[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptLA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA2 before(Consumer<long[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA2 before(java.util.function.Consumer<? super long[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerLA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA2 of(Consumer<long[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerLA2) consumers[0]::accept;

		return (a) -> { for(Consumer<long[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerLA2 andThen(java.util.function.Consumer<? super long[][]> after)
	{
		return then(after);
	}
}
