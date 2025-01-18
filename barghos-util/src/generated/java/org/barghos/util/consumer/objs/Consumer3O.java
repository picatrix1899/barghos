package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three Object input arguments and
 * returns no result. {@link Consumer3O} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object, Object, Object)}
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
public interface Consumer3O extends Consumer3<Object,Object,Object>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptO(Object a, Object b, Object c);
	
	@Override
	default void accept(Object a, Object b, Object c)
	{
		acceptO(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3O} performing this operation and the
	 * operation after.
	 */
	default Consumer3O then(Consumer3O after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptO(a, b, c); after.acceptO(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3O} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3O then(Consumer3<? super Object,? super Object,? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptO(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3O} performing the operation before and
	 * this operation.
	 */
	default Consumer3O before(Consumer3O before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptO(a, b, c); acceptO(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3O} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3O before(Consumer3<? super Object,? super Object,? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptO(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3O} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3O of(Consumer3O... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3O consumer : consumers) consumer.acceptO(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3O} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3O} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3O of(Consumer3<? super Object,? super Object,? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3O) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Object,? super Object,? super Object> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
