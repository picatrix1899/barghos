package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional Object array input
 * argument and returns no result. {@link ConsumerOA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object[][])}
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
public interface ConsumerOA2 extends Consumer<Object[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptO(Object[][] a);
	
	@Override
	default void accept(Object[][] a)
	{
		acceptO(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerOA2 then(ConsumerOA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptO(a); after.acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 then(Consumer<? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 then(java.util.function.Consumer<? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	@Override
	default ConsumerOA2 andThen(java.util.function.Consumer<? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerOA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerOA2 before(ConsumerOA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptO(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 before(Consumer<? super Object[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA2 before(java.util.function.Consumer<? super Object[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerOA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerOA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerOA2 of(ConsumerOA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerOA2 consumer : consumers) consumer.acceptO(a); };
	}

	/**
	 * Composes a new {@link ConsumerOA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerOA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerOA2 of(Consumer<? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerOA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Object[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerOA2 of(java.util.function.Consumer<? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerOA2)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Object[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
