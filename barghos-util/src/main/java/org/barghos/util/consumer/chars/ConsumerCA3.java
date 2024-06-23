package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional char array input
 * argument and returns no result. {@link ConsumerCA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptCA3(char[][][])}
 * 
 * @see ConsumerCA3
 * @see ConsumerExCA3
 * @see Consumer2CA3
 * @see ConsumerEx2CA3
 * @see Consumer3CA3
 * @see ConsumerEx3CA3
 * @see Consumer4CA3
 * @see ConsumerEx4CA3
 */
@FunctionalInterface
public interface ConsumerCA3 extends Consumer<char[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptCA3(char[][][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerCA3 thenCA3(ConsumerCA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptCA3(a); after.acceptCA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerCA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerCA3 beforeCA3(ConsumerCA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptCA3(a); acceptCA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerCA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerCA3 ofCA3(ConsumerCA3... consumers)
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
		
		return (a) -> { for(ConsumerCA3 consumer : consumers) consumer.acceptCA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptCA3(char[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(char[][][] a)
	{
		acceptCA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 then(Consumer<char[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptCA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 then(java.util.function.Consumer<? super char[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptCA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 before(Consumer<char[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptCA3(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 before(java.util.function.Consumer<? super char[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptCA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerCA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerCA3 of(Consumer<char[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerCA3) consumers[0]::accept;

		return (a) -> { for(Consumer<char[][][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerCA3 andThen(java.util.function.Consumer<? super char[][][]> after)
	{
		return then(after);
	}
}
