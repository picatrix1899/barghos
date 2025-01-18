//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 2-dimensional int array input
// * arguments and returns no result. Unlike {@link Consumer4IA2} this may throw
// * exceptions. {@link ConsumerEx4IA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4IA2(int[][], int[][], int[][], int[][])}
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
//public interface ConsumerEx4IA2 extends ConsumerEx4<int[][],int[][],int[][],int[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept4IA2(int[][] a, int[][] b, int[][] c, int[][] d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4IA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4IA2 then4IA2(ConsumerEx4IA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4IA2(a, b, c, d); after.accept4IA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4IA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4IA2 before4IA2(ConsumerEx4IA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4IA2(a, b, c, d); accept4IA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4IA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4IA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4IA2 of4IA2(ConsumerEx4IA2... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a, b, c, d) -> { for(ConsumerEx4IA2 consumer : consumers) consumer.accept4IA2(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4IA2(int[][], int[][], int[][], int[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[][] a, int[][] b, int[][] c, int[][] d) throws Exception
//	{
//		accept4IA2(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4IA2 then(ConsumerEx4<int[][],int[][],int[][],int[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4IA2(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4IA2 before(ConsumerEx4<int[][],int[][],int[][],int[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4IA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4IA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4IA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4IA2 of(ConsumerEx4<int[][],int[][],int[][],int[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4IA2) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<int[][],int[][],int[][],int[][]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
