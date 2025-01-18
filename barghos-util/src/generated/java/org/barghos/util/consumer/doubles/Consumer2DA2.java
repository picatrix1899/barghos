package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional double array input
 * arguments and returns no result. {@link Consumer2DA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double[][], double[][])}
 * 
 * @see ConsumerDA2
 * @see ConsumerExDA2
 * @see Consumer2DA2
 * @see ConsumerEx2DA2
 * @see Consumer3DA2
 * @see ConsumerEx3DA2
 * @see Consumer4DA2
 * @see ConsumerEx4DA2
 */
@FunctionalInterface
public interface Consumer2DA2 extends Consumer2<double[][],double[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptD(double[][] a, double[][] b);
	
	@Override
	default void accept(double[][] a, double[][] b)
	{
		acceptD(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2DA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2DA2 then(Consumer2DA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptD(a, b); after.acceptD(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2DA2 then(Consumer2<? super double[][],? super double[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptD(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2DA2 then(java.util.function.BiConsumer<? super double[][],? super double[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptD(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2DA2 andThen(java.util.function.BiConsumer<? super double[][],? super double[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptD(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2DA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2DA2 before(Consumer2DA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptD(a, b); acceptD(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2DA2 before(Consumer2<? super double[][],? super double[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptD(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2DA2 before(java.util.function.BiConsumer<? super double[][],? super double[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptD(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2DA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2DA2 of(Consumer2DA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2DA2 consumer : consumers) consumer.acceptD(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2DA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2DA2 of(Consumer2<? super double[][],? super double[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2DA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super double[][],? super double[][]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2DA2 of(java.util.function.BiConsumer<? super double[][],? super double[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2DA2)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super double[][],? super double[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
