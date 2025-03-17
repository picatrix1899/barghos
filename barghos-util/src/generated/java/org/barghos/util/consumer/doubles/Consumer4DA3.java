package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 3-dimensional double array input
 * arguments and returns no result. {@link Consumer4DA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double[][][], double[][][], double[][][], double[][][])}
 * 
 * @see ConsumerDA3
 * @see ConsumerExDA3
 * @see Consumer2DA3
 * @see ConsumerEx2DA3
 * @see Consumer3DA3
 * @see ConsumerEx3DA3
 * @see Consumer4DA3
 * @see ConsumerEx4DA3
 */
@FunctionalInterface
public interface Consumer4DA3 extends Consumer4<double[][][],double[][][],double[][][],double[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptD(double[][][] a, double[][][] b, double[][][] c, double[][][] d);
	
	@Override
	default void accept(double[][][] a, double[][][] b, double[][][] c, double[][][] d)
	{
		acceptD(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4DA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4DA3 then(Consumer4DA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptD(a, b, c, d); after.acceptD(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4DA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4DA3 then(Consumer4<? super double[][][],? super double[][][],? super double[][][],? super double[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptD(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4DA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4DA3 before(Consumer4DA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptD(a, b, c, d); acceptD(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4DA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4DA3 before(Consumer4<? super double[][][],? super double[][][],? super double[][][],? super double[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptD(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4DA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4DA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4DA3 of(Consumer4DA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4DA3 consumer : consumers) consumer.acceptD(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4DA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4DA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4DA3 of(Consumer4<? super double[][][],? super double[][][],? super double[][][],? super double[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (Consumer4DA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super double[][][],? super double[][][],? super double[][][],? super double[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
