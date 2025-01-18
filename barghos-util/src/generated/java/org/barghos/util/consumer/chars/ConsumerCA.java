package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional char array input
 * argument and returns no result. {@link ConsumerCA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[])}
 * 
 * @see ConsumerCA
 * @see ConsumerExCA
 * @see Consumer2CA
 * @see ConsumerEx2CA
 * @see Consumer3CA
 * @see ConsumerEx3CA
 * @see Consumer4CA
 * @see ConsumerEx4CA
 */
@FunctionalInterface
public interface ConsumerCA extends Consumer<char[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptC(char[] a);
	
	@Override
	default void accept(char[] a)
	{
		acceptC(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerCA} performing this operation and the
	 * operation after.
	 */
	default ConsumerCA then(ConsumerCA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptC(a); after.acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA then(Consumer<? super char[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA then(java.util.function.Consumer<? super char[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	@Override
	default ConsumerCA andThen(java.util.function.Consumer<? super char[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerCA} performing the operation before and
	 * this operation.
	 */
	default ConsumerCA before(ConsumerCA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptC(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerCA before(Consumer<? super char[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerCA before(java.util.function.Consumer<? super char[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerCA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerCA of(ConsumerCA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerCA consumer : consumers) consumer.acceptC(a); };
	}

	/**
	 * Composes a new {@link ConsumerCA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerCA of(Consumer<? super char[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerCA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super char[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerCA of(java.util.function.Consumer<? super char[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerCA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super char[]> consumer : consumers) consumer.accept(a); };
	}
	
}
