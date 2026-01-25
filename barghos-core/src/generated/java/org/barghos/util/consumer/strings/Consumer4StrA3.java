package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 3-dimensional String array input
 * arguments and returns no result. {@link Consumer4StrA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String[][][], String[][][], String[][][], String[][][])}
 * 
 * @see ConsumerStrA3
 * @see ConsumerExStrA3
 * @see Consumer2StrA3
 * @see ConsumerEx2StrA3
 * @see Consumer3StrA3
 * @see ConsumerEx3StrA3
 * @see Consumer4StrA3
 * @see ConsumerEx4StrA3
 */
@FunctionalInterface
public interface Consumer4StrA3 extends Consumer4<String[][][],String[][][],String[][][],String[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptStr(String[][][] a, String[][][] b, String[][][] c, String[][][] d);
	
	@Override
	default void accept(String[][][] a, String[][][] b, String[][][] c, String[][][] d)
	{
		acceptStr(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4StrA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4StrA3 then(Consumer4StrA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptStr(a, b, c, d); after.acceptStr(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4StrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4StrA3 then(Consumer4<? super String[][][],? super String[][][],? super String[][][],? super String[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptStr(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4StrA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4StrA3 before(Consumer4StrA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptStr(a, b, c, d); acceptStr(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4StrA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4StrA3 before(Consumer4<? super String[][][],? super String[][][],? super String[][][],? super String[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptStr(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4StrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4StrA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4StrA3 of(Consumer4StrA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4StrA3 consumer : consumers) consumer.acceptStr(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4StrA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4StrA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4StrA3 of(Consumer4<? super String[][][],? super String[][][],? super String[][][],? super String[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (Consumer4StrA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super String[][][],? super String[][][],? super String[][][],? super String[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
