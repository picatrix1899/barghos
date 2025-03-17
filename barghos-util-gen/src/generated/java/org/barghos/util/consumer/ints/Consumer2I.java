package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two int input arguments and returns
 * no result. {@link Consumer2I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int, int)}
 * 
 * @see ConsumerI
 * @see ConsumerExI
 * @see Consumer2I
 * @see ConsumerEx2I
 * @see Consumer3I
 * @see ConsumerEx3I
 * @see Consumer4I
 * @see ConsumerEx4I
 */
@FunctionalInterface
public interface Consumer2I extends Consumer2<Integer,Integer>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptI(int a, int b);
	
	@Override
	default void accept(Integer a, Integer b)
	{
		acceptI(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2I} performing this operation and the
	 * operation after.
	 */
	default Consumer2I then(Consumer2I after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptI(a, b); after.acceptI(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2I} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2I then(Consumer2<? super Integer,? super Integer> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptI(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2I} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2I then(java.util.function.BiConsumer<? super Integer,? super Integer> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptI(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2I andThen(java.util.function.BiConsumer<? super Integer,? super Integer> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptI(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2I} performing the operation before and
	 * this operation.
	 */
	default Consumer2I before(Consumer2I before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptI(a, b); acceptI(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2I} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2I before(Consumer2<? super Integer,? super Integer> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptI(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2I} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2I before(java.util.function.BiConsumer<? super Integer,? super Integer> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptI(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2I} performing the operations.
	 */
	@SafeVarargs
	static Consumer2I of(Consumer2I... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2I consumer : consumers) consumer.acceptI(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2I} performing the operations.
	 */
	@SafeVarargs
	static Consumer2I of(Consumer2<? super Integer,? super Integer>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2I) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Integer,? super Integer> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer2I of(java.util.function.BiConsumer<? super Integer,? super Integer>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2I)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Integer,? super Integer> consumer : consumers) consumer.accept(a, b); };
	}
	
}
