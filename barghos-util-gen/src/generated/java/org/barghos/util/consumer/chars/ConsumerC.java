package templates.consumer;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one char input argument and returns no
 * result. {@link ConsumerC} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char)}
 * 
 * @see ConsumerC
 * @see ConsumerExC
 * @see Consumer2C
 * @see ConsumerEx2C
 * @see Consumer3C
 * @see ConsumerEx3C
 * @see Consumer4C
 * @see ConsumerEx4C
 */
@FunctionalInterface
public interface ConsumerC extends Consumer<Character>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptC(char a);
	
	@Override
	default void accept(Character a)
	{
		acceptC(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerC} performing this operation and the
	 * operation after.
	 */
	default ConsumerC then(ConsumerC after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptC(a); after.acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerC then(Consumer<? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerC then(java.util.function.Consumer<? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	@Override
	default ConsumerC andThen(java.util.function.Consumer<? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerC} performing the operation before and this
	 * operation.
	 */
	default ConsumerC before(ConsumerC before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptC(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerC before(Consumer<? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerC} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerC before(java.util.function.Consumer<? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerC} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerC} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerC of(ConsumerC... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerC consumer : consumers) consumer.acceptC(a); };
	}

	/**
	 * Composes a new {@link ConsumerC} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerC} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerC of(Consumer<? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerC) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Character> consumer : consumers) consumer.accept(a); };
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
	static ConsumerC of(java.util.function.Consumer<? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerC)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Character> consumer : consumers) consumer.accept(a); };
	}
	
}
