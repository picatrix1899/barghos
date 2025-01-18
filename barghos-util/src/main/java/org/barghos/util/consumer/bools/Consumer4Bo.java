package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four boolean input arguments and returns
 * no result. {@link Consumer4Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean, boolean, boolean, boolean)}
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface Consumer4Bo extends Consumer4<Boolean,Boolean,Boolean,Boolean>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptBo(boolean a, boolean b, boolean c, boolean d);
	
	@Override
	default void accept(Boolean a, Boolean b, Boolean c, Boolean d)
	{
		acceptBo(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Bo} performing this operation and the
	 * operation after.
	 */
	default Consumer4Bo then(Consumer4Bo after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBo(a, b, c, d); after.acceptBo(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Bo then(Consumer4<? super Boolean,? super Boolean,? super Boolean,? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBo(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Bo} performing the operation before and
	 * this operation.
	 */
	default Consumer4Bo before(Consumer4Bo before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBo(a, b, c, d); acceptBo(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Bo before(Consumer4<? super Boolean,? super Boolean,? super Boolean,? super Boolean> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBo(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4Bo of(Consumer4Bo... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4Bo consumer : consumers) consumer.acceptBo(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4Bo of(Consumer4<? super Boolean,? super Boolean,? super Boolean,? super Boolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Bo) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Boolean,? super Boolean,? super Boolean,? super Boolean> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
