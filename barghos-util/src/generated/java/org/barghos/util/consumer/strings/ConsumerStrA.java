package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional String array input
 * argument and returns no result. {@link ConsumerStrA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String[])}
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
public interface ConsumerStrA extends Consumer<String[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptStr(String[] a);
	
	@Override
	default void accept(String[] a)
	{
		acceptStr(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerStrA} performing this operation and the
	 * operation after.
	 */
	default ConsumerStrA then(ConsumerStrA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptStr(a); after.acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA then(Consumer<? super String[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA then(java.util.function.Consumer<? super String[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	@Override
	default ConsumerStrA andThen(java.util.function.Consumer<? super String[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerStrA} performing the operation before and
	 * this operation.
	 */
	default ConsumerStrA before(ConsumerStrA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptStr(a); acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerStrA before(Consumer<? super String[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerStrA before(java.util.function.Consumer<? super String[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptStr(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerStrA of(ConsumerStrA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerStrA consumer : consumers) consumer.acceptStr(a); };
	}

	/**
	 * Composes a new {@link ConsumerStrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerStrA of(Consumer<? super String[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerStrA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super String[]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerStrA of(java.util.function.Consumer<? super String[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerStrA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super String[]> consumer : consumers) consumer.accept(a); };
	}
	
}
