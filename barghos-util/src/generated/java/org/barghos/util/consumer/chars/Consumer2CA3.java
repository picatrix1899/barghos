package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 3-dimensional char array input
 * arguments and returns no result. {@link Consumer2CA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][][], char[][][])}
 * 
 * @see ConsumerCA3
 * @see ConsumerExCA3
 * @see Consumer2CA3
 * @see ConsumerEx2CA3
 * @see Consumer3FA2
 * @see ConsumerEx3CA3
 * @see Consumer4CA3
 * @see ConsumerEx4CA3
 */
@FunctionalInterface
public interface Consumer2CA3 extends Consumer2<char[][][],char[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptC(char[][][] a, char[][][] b);
	
	@Override
	default void accept(char[][][] a, char[][][] b)
	{
		acceptC(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2CA3} performing this operation and the
	 * operation after.
	 */
	default Consumer2CA3 then(Consumer2CA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptC(a, b); after.acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2CA3 then(Consumer2<? super char[][][],? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2CA3 then(java.util.function.BiConsumer<? super char[][][],? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2CA3 andThen(java.util.function.BiConsumer<? super char[][][],? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2CA3} performing the operation before and
	 * this operation.
	 */
	default Consumer2CA3 before(Consumer2CA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptC(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F3} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2CA3 before(Consumer2<? super char[][][],? super char[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2F3} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2CA3 before(java.util.function.BiConsumer<? super char[][][],? super char[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2CA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2CA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer2CA3 of(Consumer2CA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2CA3 consumer : consumers) consumer.acceptC(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2CA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2CA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer2CA3 of(Consumer2<? super char[][][],? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2CA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super char[][][],? super char[][][]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2CA3 of(java.util.function.BiConsumer<? super char[][][],? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2CA3)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super char[][][],? super char[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
