package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four float input arguments and returns
 * no result. {@link Consumer4F} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float, float, float, float)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3F
 * @see ConsumerEx3F
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface Consumer4F extends Consumer4<Float,Float,Float,Float>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptF(float a, float b, float c, float d);
	
	@Override
	default void accept(Float a, Float b, Float c, Float d)
	{
		acceptF(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4F} performing this operation and the
	 * operation after.
	 */
	default Consumer4F then(Consumer4F after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptF(a, b, c, d); after.acceptF(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4F} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4F then(Consumer4<? super Float,? super Float,? super Float,? super Float> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptF(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4F} performing the operation before and
	 * this operation.
	 */
	default Consumer4F before(Consumer4F before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptF(a, b, c, d); acceptF(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4F} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4F before(Consumer4<? super Float,? super Float,? super Float,? super Float> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptF(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4F} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4F of(Consumer4F... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4F consumer : consumers) consumer.acceptF(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4F} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4F of(Consumer4<? super Float,? super Float,? super Float,? super Float>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4F) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Float,? super Float,? super Float,? super Float> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
