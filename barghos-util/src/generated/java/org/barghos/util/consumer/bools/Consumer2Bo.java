package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two boolean input arguments and returns
 * no result. {@link Consumer2Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean, boolean)}
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
public interface Consumer2Bo extends Consumer2<Boolean,Boolean>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBo(boolean a, boolean b);
	
	@Override
	default void accept(Boolean a, Boolean b)
	{
		acceptBo(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Bo} performing this operation and the
	 * operation after.
	 */
	default Consumer2Bo then(Consumer2Bo after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBo(a, b); after.acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bo then(Consumer2<? super Boolean,? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bo then(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2Bo andThen(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Bo} performing the operation before and
	 * this operation.
	 */
	default Consumer2Bo before(Consumer2Bo before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBo(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bo before(Consumer2<? super Boolean,? super Boolean> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bo before(java.util.function.BiConsumer<? super Boolean,? super Boolean> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bo} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bo of(Consumer2Bo... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2Bo consumer : consumers) consumer.acceptBo(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bo} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bo of(Consumer2<? super Boolean,? super Boolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2Bo) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Boolean,? super Boolean> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2Bo of(java.util.function.BiConsumer<? super Boolean,? super Boolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2Bo)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Boolean,? super Boolean> consumer : consumers) consumer.accept(a, b); };
	}
	
}
