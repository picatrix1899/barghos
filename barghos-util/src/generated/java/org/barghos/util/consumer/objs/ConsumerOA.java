package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional Object array input
 * argument and returns no result. {@link ConsumerOA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object[])}
 * 
 * @see ConsumerOA
 * @see ConsumerExOA
 * @see Consumer2OA
 * @see ConsumerEx2OA
 * @see Consumer3OA
 * @see ConsumerEx3OA
 * @see Consumer4OA
 * @see ConsumerEx4OA
 */
@FunctionalInterface
public interface ConsumerOA extends Consumer<Object[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptO(Object[] a);
	
	@Override
	default void accept(Object[] a)
	{
		acceptO(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerOA} performing this operation and the
	 * operation after.
	 */
	default ConsumerOA then(ConsumerOA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptO(a); after.acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA then(Consumer<? super Object[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerOA then(java.util.function.Consumer<? super Object[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	@Override
	default ConsumerOA andThen(java.util.function.Consumer<? super Object[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerOA} performing the operation before and
	 * this operation.
	 */
	default ConsumerOA before(ConsumerOA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptO(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerOA before(Consumer<? super Object[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerOA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerOA before(java.util.function.Consumer<? super Object[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerOA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerOA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerOA of(ConsumerOA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerOA consumer : consumers) consumer.acceptO(a); };
	}

	/**
	 * Composes a new {@link ConsumerOA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerOA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerOA of(Consumer<? super Object[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerOA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Object[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerOA of(java.util.function.Consumer<? super Object[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerOA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Object[]> consumer : consumers) consumer.accept(a); };
	}
	
}
