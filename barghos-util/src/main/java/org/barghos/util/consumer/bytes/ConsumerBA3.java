package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional byte array input
 * argument and returns no result. {@link ConsumerBA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBA3(byte[][][])}
 * 
 * @see ConsumerBA3
 * @see ConsumerExBA3
 * @see Consumer2BA3
 * @see ConsumerEx2BA3
 * @see Consumer3BA3
 * @see ConsumerEx3BA3
 * @see Consumer4BA3
 * @see ConsumerEx4BA3
 */
@FunctionalInterface
public interface ConsumerBA3 extends Consumer<byte[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBA3(byte[][][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerBA3 thenBA3(ConsumerBA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBA3(a); after.acceptBA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerBA3 beforeBA3(ConsumerBA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBA3(a); acceptBA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA3 ofBA3(ConsumerBA3... consumers)
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
		
		return (a) -> { for(ConsumerBA3 consumer : consumers) consumer.acceptBA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBA3(byte[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[][][] a)
	{
		acceptBA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA3 then(Consumer<byte[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA3 then(java.util.function.Consumer<? super byte[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA3 before(Consumer<byte[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA3(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA3 before(java.util.function.Consumer<? super byte[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA3 of(Consumer<byte[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBA3) consumers[0]::accept;

		return (a) -> { for(Consumer<byte[][][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBA3 andThen(java.util.function.Consumer<? super byte[][][]> after)
	{
		return then(after);
	}
}
