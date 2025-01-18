//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 2-dimensional int array input
// * arguments and returns no result. {@link Consumer2IA2} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2IA2(int[][], int[][])}
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
//public interface Consumer2IA2 extends Consumer2<int[][],int[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2IA2(int[][] a, int[][] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2IA2} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2IA2 then2IA2(Consumer2IA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2IA2(a, b); after.accept2IA2(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2IA2} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2IA2 before2IA2(Consumer2IA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2IA2(a, b); accept2IA2(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2IA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2IA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2IA2 of2IA2(Consumer2IA2... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a, b) -> { for(Consumer2IA2 consumer : consumers) consumer.accept2IA2(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2IA2 then(Consumer2<int[][],int[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2IA2(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2IA2 then(java.util.function.BiConsumer<? super int[][],? super int[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2IA2(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2IA2 before(Consumer2<int[][],int[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2IA2(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2IA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2IA2 before(java.util.function.BiConsumer<? super int[][],? super int[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2IA2(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2IA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2IA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2IA2 of(Consumer2<int[][],int[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//		
//		if(consumers.length == 1) return (Consumer2IA2) consumers[0]::accept;
//
//		return (a, b) -> { for(Consumer2<int[][],int[][]> consumer : consumers) consumer.accept(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2IA2(int[][], int[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[][] a, int[][] b)
//	{
//		accept2IA2(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2IA2 andThen(java.util.function.BiConsumer<? super int[][],? super int[][]> after)
//	{
//		return then(after);
//	}
//}
