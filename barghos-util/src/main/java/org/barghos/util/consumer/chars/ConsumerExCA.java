//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional char array input
// * arguments and returns no result. Unlike {@link ConsumerCA} this may throw
// * exceptions. {@link ConsumerExCA} is expected to operate via side-effects.
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
//public interface ConsumerExCA extends ConsumerEx<char[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptCA(char[] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExCA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExCA thenCA(ConsumerExCA after)
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
//	 * @return A new {@link ConsumerExCA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExCA beforeCA(ConsumerExCA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptCA(a); acceptCA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExCA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExCA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExCA ofCA(ConsumerExCA... consumers)
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
//		return (a) -> { for(ConsumerExCA consumer : consumers) consumer.acceptCA(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptCA(char[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[] a) throws Exception
//	{
//		acceptCA(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExCA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExCA then(ConsumerEx<char[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptCA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExCA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExCA before(ConsumerEx<char[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptCA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExCA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExCA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExCA of(ConsumerEx<char[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
// 
//		if(consumers.length == 1) return (ConsumerExCA) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<char[]> consumer : consumers) consumer.accept(a); };
//	}
//}
