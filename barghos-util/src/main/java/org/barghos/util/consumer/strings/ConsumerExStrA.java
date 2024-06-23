package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional string array input
 * arguments and returns no result. Unlike {@link ConsumerStrA} this may throw
 * exceptions. {@link ConsumerExStrA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStrA(String[])}
 * 
 * @see ConsumerStrA
 * @see ConsumerExStrA
 * @see Consumer2StrA
 * @see ConsumerEx2StrA
 * @see Consumer3StrA
 * @see ConsumerEx3StrA
 * @see Consumer4StrA
 * @see ConsumerEx4StrA
 */
@FunctionalInterface
public interface ConsumerExStrA extends ConsumerEx<String[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptStrA(String[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExStrA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExStrA thenStrA(ConsumerExStrA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptStrA(a); after.acceptStrA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExStrA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExStrA beforeStrA(ConsumerExStrA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptStrA(a); acceptStrA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExStrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExStrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExStrA ofStrA(ConsumerExStrA... consumers)
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
		
		return (a) -> { for(ConsumerExStrA consumer : consumers) consumer.acceptStrA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptStrA(String[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(String[] a) throws Exception
	{
		acceptStrA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExStrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExStrA then(ConsumerEx<String[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptStrA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExStrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExStrA before(ConsumerEx<String[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptStrA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExStrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExStrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExStrA of(ConsumerEx<String[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExStrA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<String[]> consumer : consumers) consumer.accept(a); };
	}
}
