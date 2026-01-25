package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional String array input
 * arguments and returns no result. {@link Consumer2StrA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String[][], String[][])}
 * 
 * @see ConsumerStrA2
 * @see ConsumerExStrA2
 * @see Consumer2StrA2
 * @see ConsumerEx2StrA2
 * @see Consumer3StrA2
 * @see ConsumerEx3StrA2
 * @see Consumer4StrA2
 * @see ConsumerEx4StrA2
 */
@FunctionalInterface
public interface Consumer2StrA2 extends Consumer2<String[][],String[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptStr(String[][] a, String[][] b);
	
	@Override
	default void accept(String[][] a, String[][] b)
	{
		acceptStr(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2StrA2 then(Consumer2StrA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptStr(a, b); after.acceptStr(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 then(Consumer2<? super String[][],? super String[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptStr(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 then(java.util.function.BiConsumer<? super String[][],? super String[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptStr(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2StrA2 andThen(java.util.function.BiConsumer<? super String[][],? super String[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptStr(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2StrA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2StrA2 before(Consumer2StrA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptStr(a, b); acceptStr(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 before(Consumer2<? super String[][],? super String[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptStr(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2StrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2StrA2 before(java.util.function.BiConsumer<? super String[][],? super String[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptStr(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2StrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2StrA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2StrA2 of(Consumer2StrA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2StrA2 consumer : consumers) consumer.acceptStr(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2StrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2StrA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2StrA2 of(Consumer2<? super String[][],? super String[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};
		
		if(consumers.length == 1) return (Consumer2StrA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super String[][],? super String[][]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2StrA2 of(java.util.function.BiConsumer<? super String[][],? super String[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2StrA2)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super String[][],? super String[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
