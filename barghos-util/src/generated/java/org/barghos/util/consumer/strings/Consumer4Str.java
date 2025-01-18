package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four String input arguments and returns
 * no result. {@link Consumer4Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String, String, String, String)}
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
public interface Consumer4Str extends Consumer4<String,String,String,String>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptStr(String a, String b, String c, String d);
	
	@Override
	default void accept(String a, String b, String c, String d)
	{
		acceptStr(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Str} performing this operation and the
	 * operation after.
	 */
	default Consumer4Str then(Consumer4Str after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptStr(a, b, c, d); after.acceptStr(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Str then(Consumer4<? super String,? super String,? super String,? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptStr(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Str} performing the operation before and
	 * this operation.
	 */
	default Consumer4Str before(Consumer4Str before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptStr(a, b, c, d); acceptStr(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Str} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Str before(Consumer4<? super String,? super String,? super String,? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptStr(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Str} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4Str of(Consumer4Str... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4Str consumer : consumers) consumer.acceptStr(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Str} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4Str of(Consumer4<? super String,? super String,? super String,? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Str) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super String,? super String,? super String,? super String> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
