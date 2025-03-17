package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two Object input arguments and returns
 * no result. {@link Consumer2O} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object, Object)}
 * 
 * @see ConsumerO
 * @see ConsumerExO
 * @see Consumer2O
 * @see ConsumerEx2O
 * @see Consumer3O
 * @see ConsumerEx3O
 * @see Consumer4O
 * @see ConsumerEx4O
 */
@FunctionalInterface
public interface Consumer2O extends Consumer2<Object,Object>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptO(Object a, Object b);
	
	@Override
	default void accept(Object a, Object b)
	{
		acceptO(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2O} performing this operation and the
	 * operation after.
	 */
	default Consumer2O then(Consumer2O after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptO(a, b); after.acceptO(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2O then(Consumer2<? super Object,? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptO(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2O then(java.util.function.BiConsumer<? super Object,? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptO(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2O andThen(java.util.function.BiConsumer<? super Object,? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptO(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2O} performing the operation before and
	 * this operation.
	 */
	default Consumer2O before(Consumer2O before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptO(a, b); acceptO(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2O before(Consumer2<? super Object,? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptO(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2O} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2O before(java.util.function.BiConsumer<? super Object,? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptO(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2O} performing the operations.
	 */
	@SafeVarargs
	static Consumer2O of(Consumer2O... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2O consumer : consumers) consumer.acceptO(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2O} performing the operations.
	 */
	@SafeVarargs
	static Consumer2O of(Consumer2<? super Object,? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2O) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Object,? super Object> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2O of(java.util.function.BiConsumer<? super Object,? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2O)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Object,? super Object> consumer : consumers) consumer.accept(a, b); };
	}
	
}
