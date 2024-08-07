package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional byte array input
 * arguments and returns no result. Unlike {@link ConsumerBA3} this may throw
 * exceptions. {@link ConsumerExBA3} is expected to operate via side-effects.
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
public interface ConsumerExBA3 extends ConsumerEx<byte[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBA3(byte[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBA3 thenBA3(ConsumerExBA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBA3(a); after.acceptBA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBA3 beforeBA3(ConsumerExBA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBA3(a); acceptBA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBA3 ofBA3(ConsumerExBA3... consumers)
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
		
		return (a) -> { for(ConsumerExBA3 consumer : consumers) consumer.acceptBA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBA3(byte[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[][][] a) throws Exception
	{
		acceptBA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBA3 then(ConsumerEx<byte[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBA3 before(ConsumerEx<byte[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBA3 of(ConsumerEx<byte[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<byte[][][]> consumer : consumers) consumer.accept(a); };
	}
}
