package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional char array input
 * argument and returns no result. {@link ConsumerCA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptCA2(char[][])}
 * 
 * @see ConsumerCA2
 * @see ConsumerExCA2
 * @see Consumer2CA2
 * @see ConsumerEx2CA2
 * @see Consumer3CA2
 * @see ConsumerEx3CA2
 * @see Consumer4CA2
 * @see ConsumerEx4CA2
 */
@FunctionalInterface
public interface ConsumerCA2 extends Consumer<char[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptCA2(char[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerCA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerCA2 thenCA2(ConsumerCA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptCA2(a); after.acceptCA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerCA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerCA2 beforeCA2(ConsumerCA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptCA2(a); acceptCA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerCA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerCA2 ofCA2(ConsumerCA2... consumers)
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
		
		return (a) -> { for(ConsumerCA2 consumer : consumers) consumer.acceptCA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptCA2(char[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(char[][] a)
	{
		acceptCA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA2 then(Consumer<char[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptCA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA2 then(java.util.function.Consumer<? super char[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptCA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA2 before(Consumer<char[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptCA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA2 before(java.util.function.Consumer<? super char[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptCA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerCA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerCA2 of(Consumer<char[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerCA2) consumers[0]::accept;

		return (a) -> { for(Consumer<char[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerCA2 andThen(java.util.function.Consumer<? super char[][]> after)
	{
		return then(after);
	}
}
