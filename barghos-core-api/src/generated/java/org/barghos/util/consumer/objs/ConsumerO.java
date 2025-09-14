package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one Object input argument and returns no
 * result. {@link ConsumerO} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object)}
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
public interface ConsumerO extends Consumer<Object>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptO(Object a);
	
	@Override
	default void accept(Object a)
	{
		acceptO(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerO} performing this operation and the
	 * operation after.
	 */
	default ConsumerO then(ConsumerO after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptO(a); after.acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerO then(Consumer<? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerO then(java.util.function.Consumer<? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	@Override
	default ConsumerO andThen(java.util.function.Consumer<? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerO} performing the operation before and this
	 * operation.
	 */
	default ConsumerO before(ConsumerO before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptO(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerO before(Consumer<? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerO} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerO before(java.util.function.Consumer<? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerO of(ConsumerO... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerO consumer : consumers) consumer.acceptO(a); };
	}

	/**
	 * Composes a new {@link ConsumerO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerO of(Consumer<? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerO) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Object> consumer : consumers) consumer.accept(a); };
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
	static ConsumerO of(java.util.function.Consumer<? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerO)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Object> consumer : consumers) consumer.accept(a); };
	}
	
}
