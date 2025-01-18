package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three String input arguments and
 * returns no result. {@link Consumer3Str} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String, String, String)}
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
public interface Consumer3Str extends Consumer3<String,String,String>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptStr(String a, String b, String c);
	
	@Override
	default void accept(String a, String b, String c)
	{
		acceptStr(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3Str} performing this operation and the
	 * operation after.
	 */
	default Consumer3Str then(Consumer3Str after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptStr(a, b, c); after.acceptStr(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3Str then(Consumer3<? super String,? super String,? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptStr(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3Str} performing the operation before and
	 * this operation.
	 */
	default Consumer3Str before(Consumer3Str before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptStr(a, b, c); acceptStr(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3Str before(Consumer3<? super String,? super String,? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptStr(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Str} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3Str of(Consumer3Str... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3Str consumer : consumers) consumer.acceptStr(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Str} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3Str of(Consumer3<? super String,? super String,? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3Str) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super String,? super String,? super String> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
