package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional string array input
 * arguments and returns no result. Unlike {@link ConsumerStrA3} this may throw
 * exceptions. {@link ConsumerExStrA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStrA3(String[][][])}
 * 
 * @see ConsumerStrA3
 * @see ConsumerExStrA3
 * @see Consumer2StrA3
 * @see ConsumerEx2StrA3
 * @see Consumer3StrA3
 * @see ConsumerEx3StrA3
 * @see Consumer4StrA3
 * @see ConsumerEx4StrA3
 */
@FunctionalInterface
public interface ConsumerExStrA3 extends ConsumerEx<String[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptStrA3(String[][][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExStrA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExStrA3 thenStrA3(ConsumerExStrA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptStrA3(a); after.acceptStrA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExStrA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExStrA3 beforeStrA3(ConsumerExStrA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptStrA3(a); acceptStrA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExStrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExStrA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExStrA3 ofStrA3(ConsumerExStrA3... consumers)
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
		
		return (a) -> { for(ConsumerExStrA3 consumer : consumers) consumer.acceptStrA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptStrA3(String[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[][][] a) throws Exception
	{
		acceptStrA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExStrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExStrA3 then(ConsumerEx<String[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptStrA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExStrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExStrA3 before(ConsumerEx<String[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExStrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExStrA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExStrA3 of(ConsumerEx<String[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExStrA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<String[][][]> consumer : consumers) consumer.accept(a); };
	}
}
