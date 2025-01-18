package templates.consumer;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 2-dimensional char array input
 * arguments and returns no result. {@link Consumer4CA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][], char[][], char[][], char[][])}
 * 
 * @see ConsumerCA2
 * @see ConsumerExCA2
 * @see Consumer2CA2
 * @see ConsumerEx2CA2
 * @see Consumer3CA2
 * @see ConsumerEx3CA2
 * @see Consumer4CA2
 * @see ConsumerEx4CA2
 */
@FunctionalInterface
public interface Consumer4CA2 extends Consumer4<char[][],char[][],char[][],char[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptC(char[][] a, char[][] b, char[][] c, char[][] d);
	
	@Override
	default void accept(char[][] a, char[][] b, char[][] c, char[][] d)
	{
		acceptC(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4CA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4CA2 then(Consumer4CA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptC(a, b, c, d); after.acceptC(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4CA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4CA2 then(Consumer4<? super char[][],? super char[][],? super char[][],? super char[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptC(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4CA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4CA2 before(Consumer4CA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptC(a, b, c, d); acceptC(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4CA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4CA2 before(Consumer4<? super char[][],? super char[][],? super char[][],? super char[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptC(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4CA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4CA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4CA2 of(Consumer4CA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4CA2 consumer : consumers) consumer.acceptC(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4CA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4CA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4CA2 of(Consumer4<? super char[][],? super char[][],? super char[][],? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4CA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super char[][],? super char[][],? super char[][],? super char[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
