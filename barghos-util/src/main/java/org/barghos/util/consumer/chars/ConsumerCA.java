//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional char array input
// * argument and returns no result. {@link ConsumerCA} is expected to operate via
// * side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptCA(char[])}
// * 
// * @see ConsumerCA
// * @see ConsumerExCA
// * @see Consumer2CA
// * @see ConsumerEx2CA
// * @see Consumer3CA
// * @see ConsumerEx3CA
// * @see Consumer4CA
// * @see ConsumerEx4CA
// */
//@FunctionalInterface
//public interface ConsumerCA extends Consumer<char[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptCA(char[] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerCA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerCA thenCA(ConsumerCA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptCA(a); after.acceptCA(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerCA} performing the operation before and this
//	 * operation.
//	 */
//	default ConsumerCA beforeCA(ConsumerCA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptCA(a); acceptCA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerCA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerCA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerCA ofCA(ConsumerCA... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a) -> { for(ConsumerCA consumer : consumers) consumer.acceptCA(a); };
//	}
//
//	/**
//	 * @deprecated Use {@link #acceptCA(char[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[] a)
//	{
//		acceptCA(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerCA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerCA then(Consumer<char[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptCA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerCA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerCA then(java.util.function.Consumer<? super char[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptCA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerCA} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerCA before(Consumer<char[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptCA(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerCA} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerCA before(java.util.function.Consumer<? super char[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptCA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerCA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerCA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerCA of(Consumer<char[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerCA) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<char[]> consumer : consumers) consumer.accept(a); };
//	}
//
//	/**
//	 * @deprecated
//	 * 
//	 * Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerCA andThen(java.util.function.Consumer<? super char[]> after)
//	{
//		return then(after);
//	}
//}
