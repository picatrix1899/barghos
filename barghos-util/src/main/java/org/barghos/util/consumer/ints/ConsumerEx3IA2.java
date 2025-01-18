//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 2-dimensional int array input
// * arguments and returns no result. Unlike {@link Consumer3IA2} this may throw
// * exceptions. {@link ConsumerEx3IA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3IA2(int[][], int[][], int[][])}
// * 
// * @see ConsumerIA2
// * @see ConsumerExIA2
// * @see Consumer2IA2
// * @see ConsumerEx2IA2
// * @see Consumer3IA2
// * @see ConsumerEx3IA2
// * @see Consumer4IA2
// * @see ConsumerEx4IA2
// */
//@FunctionalInterface
//public interface ConsumerEx3IA2 extends ConsumerEx3<int[][],int[][],int[][]>
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
//	void accept3IA2(int[][] a, int[][] b, int[][] c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3IA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3IA2 then3IA2(ConsumerEx3IA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3IA2(a, b, c); after.accept3IA2(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3IA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx3IA2 before2IA2(ConsumerEx3IA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3IA2(a, b, c); accept3IA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3IA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3IA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3IA2 of3IA2(ConsumerEx3IA2... consumers)
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
//		return (a, b, c) -> { for(ConsumerEx3IA2 consumer : consumers) consumer.accept3IA2(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3IA2(int[][], int[][], int[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[][] a, int[][] b, int[][] c) throws Exception
//	{
//		accept3IA2(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3IA2 then(ConsumerEx3<int[][],int[][],int[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3IA2(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3IA2 before(ConsumerEx3<int[][],int[][],int[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3IA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3IA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3IA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3IA2 of(ConsumerEx3<int[][],int[][],int[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3IA2) consumers[0]::accept;
//
//		return (a, b, c) -> { for(ConsumerEx3<int[][],int[][],int[][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
