package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional double array input
 * arguments and returns no result. {@link Consumer3DA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double[][], double[][], double[][])}
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
public interface Consumer3DA2 extends Consumer3<double[][],double[][],double[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptD(double[][] a, double[][] b, double[][] c);
	
	@Override
	default void accept(double[][] a, double[][] b, double[][] c)
	{
		acceptD(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3DA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3DA2 then(Consumer3DA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptD(a, b, c); after.acceptD(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3DA2 then(Consumer3<? super double[][],? super double[][],? super double[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptD(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3DA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3DA2 before(Consumer3DA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptD(a, b, c); acceptD(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3DA2 before(Consumer3<? super double[][],? super double[][],? super double[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptD(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3DA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3DA2 of(Consumer3DA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3DA2 consumer : consumers) consumer.acceptD(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3DA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3DA2 of(Consumer3<? super double[][],? super double[][],? super double[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3DA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super double[][],? super double[][],? super double[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
