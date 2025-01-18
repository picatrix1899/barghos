package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four int input arguments and returns
 * no result. {@link Consumer4I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int, int, int, int)}
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
public interface Consumer4I extends Consumer4<Integer,Integer,Integer,Integer>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptI(int a, int b, int c, int d);
	
	@Override
	default void accept(Integer a, Integer b, Integer c, Integer d)
	{
		acceptI(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4I} performing this operation and the
	 * operation after.
	 */
	default Consumer4I then(Consumer4I after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptI(a, b, c, d); after.acceptI(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4I} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4I then(Consumer4<? super Integer,? super Integer,? super Integer,? super Integer> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptI(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4I} performing the operation before and
	 * this operation.
	 */
	default Consumer4I before(Consumer4I before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptI(a, b, c, d); acceptI(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4I} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4I before(Consumer4<? super Integer,? super Integer,? super Integer,? super Integer> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptI(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4I} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4I of(Consumer4I... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4I consumer : consumers) consumer.acceptI(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4I} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4I of(Consumer4<? super Integer,? super Integer,? super Integer,? super Integer>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4I) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Integer,? super Integer,? super Integer,? super Integer> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
