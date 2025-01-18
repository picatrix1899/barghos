package templates.consumer;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional char array input
 * arguments and returns no result. {@link Consumer3CA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][][], char[][][], char[][][])}
 * 
 * @see ConsumerCA3
 * @see ConsumerExCA3
 * @see Consumer2CA3
 * @see ConsumerEx2CA3
 * @see Consumer3CA3
 * @see ConsumerEx3CA3
 * @see Consumer4CA3
 * @see ConsumerEx4CA3
 */
@FunctionalInterface
public interface Consumer3CA3 extends Consumer3<char[][][],char[][][],char[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptC(char[][][] a, char[][][] b, char[][][] c);
	
	@Override
	default void accept(char[][][] a, char[][][] b, char[][][] c)
	{
		acceptC(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3CA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3CA3 then(Consumer3CA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptC(a, b, c); after.acceptC(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3CA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3CA3 then(Consumer3<? super char[][][],? super char[][][],? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptC(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3CA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3CA3 before(Consumer3CA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptC(a, b, c); acceptC(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3CA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3CA3 before(Consumer3<? super char[][][],? super char[][][],? super char[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptC(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3CA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3CA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3CA3 of(Consumer3CA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3CA3 consumer : consumers) consumer.acceptC(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3CA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3CA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3CA3 of(Consumer3<? super char[][][],? super char[][][],? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3CA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super char[][][],? super char[][][],? super char[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
