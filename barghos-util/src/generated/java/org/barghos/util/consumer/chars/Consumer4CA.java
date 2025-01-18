package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional char array input
 * arguments and returns no result. {@link Consumer4CA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[], char[], char[], char[])}
 * 
 * @see ConsumerCA
 * @see ConsumerExCA
 * @see Consumer2CA
 * @see ConsumerEx2CA
 * @see Consumer3CA
 * @see ConsumerEx3CA
 * @see Consumer4CA
 * @see ConsumerEx4CA
 */
@FunctionalInterface
public interface Consumer4CA extends Consumer4<char[],char[],char[],char[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptC(char[] a, char[] b, char[] c, char[] d);
	
	@Override
	default void accept(char[] a, char[] b, char[] c, char[] d)
	{
		acceptC(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4CA} performing this operation and the
	 * operation after.
	 */
	default Consumer4CA then(Consumer4CA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptC(a, b, c, d); after.acceptC(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4CA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4CA then(Consumer4<? super char[],? super char[],? super char[],? super char[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptC(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4CA} performing the operation before and
	 * this operation.
	 */
	default Consumer4CA before(Consumer4CA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptC(a, b, c, d); acceptC(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4CA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4CA before(Consumer4<? super char[],? super char[],? super char[],? super char[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptC(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4CA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4CA of(Consumer4CA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4CA consumer : consumers) consumer.acceptC(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4CA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4CA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4CA of(Consumer4<? super char[],? super char[],? super char[],? super char[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4CA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super char[],? super char[],? super char[],? super char[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
