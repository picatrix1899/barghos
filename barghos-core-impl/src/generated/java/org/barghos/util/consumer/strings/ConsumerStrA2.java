package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional String array input
 * argument and returns no result. {@link ConsumerStrA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String[][])}
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
public interface ConsumerStrA2 extends Consumer<String[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptStr(String[][] a);
	
	@Override
	default void accept(String[][] a)
	{
		acceptStr(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerStrA2 then(ConsumerStrA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptStr(a); after.acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 then(Consumer<? super String[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 then(java.util.function.Consumer<? super String[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	@Override
	default ConsumerStrA2 andThen(java.util.function.Consumer<? super String[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptStr(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerStrA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerStrA2 before(ConsumerStrA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptStr(a); acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 before(Consumer<? super String[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptStr(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerStrA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerStrA2 before(java.util.function.Consumer<? super String[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptStr(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerStrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA2 of(ConsumerStrA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerStrA2 consumer : consumers) consumer.acceptStr(a); };
	}

	/**
	 * Composes a new {@link ConsumerStrA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerStrA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerStrA2 of(Consumer<? super String[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerStrA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super String[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerStrA2 of(java.util.function.Consumer<? super String[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerStrA2)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super String[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
