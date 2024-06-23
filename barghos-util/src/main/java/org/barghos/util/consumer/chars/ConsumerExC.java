package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional char array input
 * arguments and returns no result. Unlike {@link ConsumerC} this may throw
 * exceptions. {@link ConsumerExC} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char)}
 * 
 * @see ConsumerC
 * @see ConsumerExC
 * @see Consumer2C
 * @see ConsumerEx2C
 * @see Consumer3C
 * @see ConsumerEx3C
 * @see Consumer4C
 * @see ConsumerEx4C
 */
@FunctionalInterface
public interface ConsumerExC extends ConsumerEx<Character>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptC(char a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExC} performing this operation and the
	 * operation after.
	 */
	default ConsumerExC thenC(ConsumerExC after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptC(a); after.acceptC(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExC} performing the operation before and
	 * this operation.
	 */
	default ConsumerExC beforeC(ConsumerExC before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptC(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExC} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExC} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExC ofC(ConsumerExC... consumers)
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
		
		return (a) -> { for(ConsumerExC consumer : consumers) consumer.acceptC(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptF(Character)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Character a) throws Exception
	{
		acceptC(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExC} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExC then(ConsumerEx<Character> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExC} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExC before(ConsumerEx<Character> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExC} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExC} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExC of(ConsumerEx<Character>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExC) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Character> consumer : consumers) consumer.accept(a); };
	}
}
