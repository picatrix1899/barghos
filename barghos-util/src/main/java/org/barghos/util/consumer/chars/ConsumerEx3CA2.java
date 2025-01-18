//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 2-dimensional char array input
// * arguments and returns no result. Unlike {@link Consumer3CA2} this may throw
// * exceptions. {@link ConsumerEx3CA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3CA2(char[][], char[][], char[][])}
// * 
// * @see ConsumerCA2
// * @see ConsumerExCA2
// * @see Consumer2CA2
// * @see ConsumerEx2CA2
// * @see Consumer3CA2
// * @see ConsumerEx3CA2
// * @see Consumer4CA2
// * @see ConsumerEx4CA2
// */
//@FunctionalInterface
//public interface ConsumerEx3CA2 extends ConsumerEx3<char[][],char[][],char[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept3CA2(char[][] a, char[][] b, char[][] c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3CA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3CA2 then3CA2(ConsumerEx3CA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3CA2(a, b, c); after.accept3CA2(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3CA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx3CA2 before2CA2(ConsumerEx3CA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3CA2(a, b, c); accept3CA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3CA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3CA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3CA2 of3CA2(ConsumerEx3CA2... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a, b, c) -> { for(ConsumerEx3CA2 consumer : consumers) consumer.accept3CA2(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3CA2(char[][], char[][], char[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[][] a, char[][] b, char[][] c) throws Exception
//	{
//		accept3CA2(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3CA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3CA2 then(ConsumerEx3<char[][],char[][],char[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3CA2(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3CA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3CA2 before(ConsumerEx3<char[][],char[][],char[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3CA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3CA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3CA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3CA2 of(ConsumerEx3<char[][],char[][],char[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3CA2) consumers[0]::accept;
//
//		return (a, b, c) -> { for(ConsumerEx3<char[][],char[][],char[][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
