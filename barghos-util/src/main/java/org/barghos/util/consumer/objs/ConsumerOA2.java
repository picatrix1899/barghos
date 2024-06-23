package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional object array input
 * argument and returns no result. {@link ConsumerOA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptOA2(Object[][])}
 * 
 * @see ConsumerOA2
 * @see ConsumerExOA2
 * @see Consumer2OA2
 * @see ConsumerEx2OA2
 * @see Consumer3OA2
 * @see ConsumerEx3OA2
 * @see Consumer4OA2
 * @see ConsumerEx4OA2
 */
@FunctionalInterface
public interface ConsumerOA2 extends Consumer<Object[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptOA2(Object[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerOA2 thenOA2(ConsumerOA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptOA2(a); after.acceptOA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerOA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerOA2 beforeOA2(ConsumerOA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptOA2(a); acceptOA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerOA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerOA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerOA2 ofOA2(ConsumerOA2... consumers)
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
		
		return (a) -> { for(ConsumerOA2 consumer : consumers) consumer.acceptOA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptOA2(Object[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[][] a)
	{
		acceptOA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 then(Consumer<Object[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptOA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 then(java.util.function.Consumer<? super Object[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptOA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 before(Consumer<Object[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptOA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 before(java.util.function.Consumer<? super Object[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptOA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerOA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerOA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerOA2 of(Consumer<Object[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerOA2) consumers[0]::accept;

		return (a) -> { for(Consumer<Object[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerOA2 andThen(java.util.function.Consumer<? super Object[][]> after)
	{
		return then(after);
	}
}
