package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two String input arguments and returns
 * no result. {@link Consumer2Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String, String)}
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
public interface Consumer2Str extends Consumer2<String,String>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptStr(String a, String b);
	
	@Override
	default void accept(String a, String b)
	{
		acceptStr(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Str} performing this operation and the
	 * operation after.
	 */
	default Consumer2Str then(Consumer2Str after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptStr(a, b); after.acceptStr(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Str then(Consumer2<? super String,? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptStr(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Str then(java.util.function.BiConsumer<? super String,? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptStr(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2Str andThen(java.util.function.BiConsumer<? super String,? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptStr(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Str} performing the operation before and
	 * this operation.
	 */
	default Consumer2Str before(Consumer2Str before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptStr(a, b); acceptStr(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Str before(Consumer2<? super String,? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptStr(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Str before(java.util.function.BiConsumer<? super String,? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptStr(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Str of(Consumer2Str... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2Str consumer : consumers) consumer.acceptStr(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Str} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Str of(Consumer2<? super String,? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2Str) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super String,? super String> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2Str of(java.util.function.BiConsumer<? super String,? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2Str)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super String,? super String> consumer : consumers) consumer.accept(a, b); };
	}
	
}
