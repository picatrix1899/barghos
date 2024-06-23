package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one char input argument and returns no
 * result. {@link ConsumerC} is expected to operate via side-effects.
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
public interface ConsumerC extends Consumer<Character>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptC(char a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerC} performing this operation and the
	 * operation after.
	 */
	default ConsumerC thenC(ConsumerC after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptC(a); after.acceptC(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerC} performing the operation before and this
	 * operation.
	 */
	default ConsumerC beforeC(ConsumerC before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptC(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerC} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerC} performing the operations.
	 */
	@SafeVarargs
	static ConsumerC ofC(ConsumerC... consumers)
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
		
		return (a) -> { for(ConsumerC consumer : consumers) consumer.acceptC(a); };
	}

	/**
	 * @deprecated Use {@link #acceptF(char)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Character a)
	{
		acceptC(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerC then(Consumer<Character> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerC then(java.util.function.Consumer<? super Character> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerC before(Consumer<Character> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerC before(java.util.function.Consumer<? super Character> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerC} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerC} performing the operations.
	 */
	@SafeVarargs
	static ConsumerC of(Consumer<Character>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerC) consumers[0]::accept;

		return (a) -> { for(Consumer<Character> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerC andThen(java.util.function.Consumer<? super Character> after)
	{
		return then(after);
	}
}
