package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three boolean input arguments and
 * returns no result. {@link Consumer3Bo} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean, boolean, boolean)}
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
public interface Consumer3Bo extends Consumer3<Boolean,Boolean,Boolean>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBo(boolean a, boolean b, boolean c);
	
	@Override
	default void accept(Boolean a, Boolean b, Boolean c)
	{
		acceptBo(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3Bo} performing this operation and the
	 * operation after.
	 */
	default Consumer3Bo then(Consumer3Bo after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBo(a, b, c); after.acceptBo(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3Bo then(Consumer3<? super Boolean,? super Boolean,? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBo(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3Bo} performing the operation before and
	 * this operation.
	 */
	default Consumer3Bo before(Consumer3Bo before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBo(a, b, c); acceptBo(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3Bo before(Consumer3<? super Boolean,? super Boolean,? super Boolean> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBo(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3Bo of(Consumer3Bo... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3Bo consumer : consumers) consumer.acceptBo(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3Bo of(Consumer3<? super Boolean,? super Boolean,? super Boolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3Bo) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Boolean,? super Boolean,? super Boolean> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
