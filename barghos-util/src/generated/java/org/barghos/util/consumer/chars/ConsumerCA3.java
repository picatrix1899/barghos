package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional char array input
 * argument and returns no result. {@link ConsumerCA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][][])}
 * 
 * @see ConsumerCA3
 * @see ConsumerExCA3
 * @see Consumer2CA3
 * @see ConsumerEx2CA3
 * @see Consumer3CA3
 * @see ConsumerEx3CA3
 * @see Consumer4CA3
 * @see ConsumerEx4CA3
 */
@FunctionalInterface
public interface ConsumerCA3 extends Consumer<char[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptC(char[][][] a);
	
	@Override
	default void accept(char[][][] a)
	{
		acceptC(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerCA3 then(ConsumerCA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptC(a); after.acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 then(Consumer<? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 then(java.util.function.Consumer<? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	@Override
	default ConsumerCA3 andThen(java.util.function.Consumer<? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerCA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerCA3 before(ConsumerCA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptC(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 before(Consumer<? super char[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerCA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerCA3 before(java.util.function.Consumer<? super char[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerCA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerCA3 of(ConsumerCA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerCA3 consumer : consumers) consumer.acceptC(a); };
	}

	/**
	 * Composes a new {@link ConsumerCA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerCA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerCA3 of(Consumer<? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerCA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super char[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerCA3 of(java.util.function.Consumer<? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerCA3)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super char[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
