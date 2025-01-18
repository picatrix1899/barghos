package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one boolean input argument and returns no
 * result. {@link ConsumerBo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean)}
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface ConsumerBo extends Consumer<Boolean>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBo(boolean a);
	
	@Override
	default void accept(Boolean a)
	{
		acceptBo(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBo} performing this operation and the
	 * operation after.
	 */
	default ConsumerBo then(ConsumerBo after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBo then(Consumer<? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBo then(java.util.function.Consumer<? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBo andThen(java.util.function.Consumer<? super Boolean> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBo(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBo} performing the operation before and this
	 * operation.
	 */
	default ConsumerBo before(ConsumerBo before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBo(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBo before(Consumer<? super Boolean> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBo} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBo before(java.util.function.Consumer<? super Boolean> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBo(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerBo of(ConsumerBo... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBo consumer : consumers) consumer.acceptBo(a); };
	}

	/**
	 * Composes a new {@link ConsumerBo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerBo of(Consumer<? super Boolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBo) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Boolean> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBo of(java.util.function.Consumer<? super Boolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBo)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Boolean> consumer : consumers) consumer.accept(a); };
	}
	
}
