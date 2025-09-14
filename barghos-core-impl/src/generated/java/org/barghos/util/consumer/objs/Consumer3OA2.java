package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional Object array input
 * arguments and returns no result. {@link Consumer3OA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object[][], Object[][], Object[][])}
 * 
 * @see ConsumerOA2
 * @see ConsumerExOA2
 * @see Consumer2OA2
 * @see ConsumerEx2OA2
 * @see Consumer3OA2
 * @see ConsumerEx3OA2
 * @see Consumer4OA2
 * @see ConsumerEx4OA2
 */
@FunctionalInterface
public interface Consumer3OA2 extends Consumer3<Object[][],Object[][],Object[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptO(Object[][] a, Object[][] b, Object[][] c);
	
	@Override
	default void accept(Object[][] a, Object[][] b, Object[][] c)
	{
		acceptO(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3OA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3OA2 then(Consumer3OA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptO(a, b, c); after.acceptO(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3OA2 then(Consumer3<? super Object[][],? super Object[][],? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptO(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3OA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3OA2 before(Consumer3OA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptO(a, b, c); acceptO(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3OA2 before(Consumer3<? super Object[][],? super Object[][],? super Object[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptO(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3OA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3OA2 of(Consumer3OA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3OA2 consumer : consumers) consumer.acceptO(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3OA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3OA2 of(Consumer3<? super Object[][],? super Object[][],? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3OA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Object[][],? super Object[][],? super Object[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
