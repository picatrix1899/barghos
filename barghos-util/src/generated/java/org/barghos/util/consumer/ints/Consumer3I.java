package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three int input arguments and
 * returns no result. {@link Consumer3I} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int, int, int)}
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
public interface Consumer3I extends Consumer3<Integer,Integer,Integer>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptI(int a, int b, int c);
	
	@Override
	default void accept(Integer a, Integer b, Integer c)
	{
		acceptI(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3I} performing this operation and the
	 * operation after.
	 */
	default Consumer3I then(Consumer3I after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptI(a, b, c); after.acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3I} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3I then(Consumer3<? super Integer,? super Integer,? super Integer> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptI(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3I} performing the operation before and
	 * this operation.
	 */
	default Consumer3I before(Consumer3I before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptI(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3I} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3I before(Consumer3<? super Integer,? super Integer,? super Integer> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3I} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3I of(Consumer3I... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3I consumer : consumers) consumer.acceptI(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3I} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3I of(Consumer3<? super Integer,? super Integer,? super Integer>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3I) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Integer,? super Integer,? super Integer> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
