package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one String input argument and returns no
 * result. {@link ConsumerStr} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String)}
 * 
 * @see ConsumerStr
 * @see ConsumerExStr
 * @see Consumer2Str
 * @see ConsumerEx2Str
 * @see Consumer3Str
 * @see ConsumerEx3Str
 * @see Consumer4Str
 * @see ConsumerEx4Str
 */
@FunctionalInterface
public interface ConsumerStr extends Consumer<String>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptStr(String a);
	
	@Override
	default void accept(String a)
	{
		acceptStr(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerStr} performing this operation and the
	 * operation after.
	 */
	default ConsumerStr then(ConsumerStr after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptStr(a); after.acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStr} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStr then(Consumer<? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStr} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStr then(java.util.function.Consumer<? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	@Override
	default ConsumerStr andThen(java.util.function.Consumer<? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerStr} performing the operation before and this
	 * operation.
	 */
	default ConsumerStr before(ConsumerStr before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptStr(a); acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStr} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerStr before(Consumer<? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStr} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerStr before(java.util.function.Consumer<? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptStr(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStr} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStr} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStr of(ConsumerStr... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerStr consumer : consumers) consumer.acceptStr(a); };
	}

	/**
	 * Composes a new {@link ConsumerStr} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStr} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStr of(Consumer<? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerStr) consumers[0]::accept;

		return (a) -> { for(Consumer<? super String> consumer : consumers) consumer.accept(a); };
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
	static ConsumerStr of(java.util.function.Consumer<? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerStr)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super String> consumer : consumers) consumer.accept(a); };
	}
	
}
