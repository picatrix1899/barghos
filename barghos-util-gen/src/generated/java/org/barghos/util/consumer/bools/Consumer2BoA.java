package templates.consumer;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional boolean array input
 * arguments and returns no result. {@link Consumer2BoA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[], boolean[])}
 * 
 * @see ConsumerBoA
 * @see ConsumerExBoA
 * @see Consumer2BoA
 * @see ConsumerEx2BoA
 * @see Consumer3BoA
 * @see ConsumerEx3BoA
 * @see Consumer4BoA
 * @see ConsumerEx4BoA
 */
@FunctionalInterface
public interface Consumer2BoA extends Consumer2<boolean[],boolean[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBo(boolean[] a, boolean[] b);
	
	@Override
	default void accept(boolean[] a, boolean[] b)
	{
		acceptBo(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BoA} performing this operation and the
	 * operation after.
	 */
	default Consumer2BoA then(Consumer2BoA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBo(a, b); after.acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA then(Consumer2<? super boolean[],? super boolean[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA then(java.util.function.BiConsumer<? super boolean[],? super boolean[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2BoA andThen(java.util.function.BiConsumer<? super boolean[],? super boolean[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BoA} performing the operation before and
	 * this operation.
	 */
	default Consumer2BoA before(Consumer2BoA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBo(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BoA before(Consumer2<? super boolean[],? super boolean[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BoA before(java.util.function.BiConsumer<? super boolean[],? super boolean[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BoA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BoA of(Consumer2BoA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BoA consumer : consumers) consumer.acceptBo(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2BoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BoA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BoA of(Consumer2<? super boolean[],? super boolean[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BoA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super boolean[],? super boolean[]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2BoA of(java.util.function.BiConsumer<? super boolean[],? super boolean[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BoA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super boolean[],? super boolean[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
