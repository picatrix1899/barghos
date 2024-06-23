package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional short array input
 * arguments and returns no result. Unlike {@link ConsumerSA3} this may throw
 * exceptions. {@link ConsumerExSA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptSA3(short[][][])}
 * 
 * @see ConsumerSA3
 * @see ConsumerExSA3
 * @see Consumer2SA3
 * @see ConsumerEx2SA3
 * @see Consumer3SA3
 * @see ConsumerEx3SA3
 * @see Consumer4SA3
 * @see ConsumerEx4SA3
 */
@FunctionalInterface
public interface ConsumerExSA3 extends ConsumerEx<short[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptSA3(short[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExSA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExSA3 thenSA3(ConsumerExSA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptSA3(a); after.acceptSA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExSA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExSA3 beforeSA3(ConsumerExSA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptSA3(a); acceptSA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExSA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExSA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExSA3 ofSA3(ConsumerExSA3... consumers)
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
		
		return (a) -> { for(ConsumerExSA3 consumer : consumers) consumer.acceptSA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptSA3(short[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(short[][][] a) throws Exception
	{
		acceptSA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExSA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExSA3 then(ConsumerEx<short[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptSA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExSA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExSA3 before(ConsumerEx<short[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptSA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExSA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExSA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExSA3 of(ConsumerEx<short[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExSA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<short[][][]> consumer : consumers) consumer.accept(a); };
	}
}
