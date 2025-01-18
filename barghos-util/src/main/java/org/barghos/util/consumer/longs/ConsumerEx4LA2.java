//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 2-dimensional long array input
// * arguments and returns no result. Unlike {@link Consumer4LA2} this may throw
// * exceptions. {@link ConsumerEx4LA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4LA2(long[][], long[][], long[][], long[][])}
// * 
// * @see ConsumerLA2
// * @see ConsumerExLA2
// * @see Consumer2LA2
// * @see ConsumerEx2LA2
// * @see Consumer3LA2
// * @see ConsumerEx3LA2
// * @see Consumer4LA2
// * @see ConsumerEx4LA2
// */
//@FunctionalInterface
//public interface ConsumerEx4LA2 extends ConsumerEx4<long[][],long[][],long[][],long[][]>
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
//	void accept4LA2(long[][] a, long[][] b, long[][] c, long[][] d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4LA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4LA2 then4LA2(ConsumerEx4LA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4LA2(a, b, c, d); after.accept4LA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4LA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4LA2 before4LA2(ConsumerEx4LA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4LA2(a, b, c, d); accept4LA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4LA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4LA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4LA2 of4LA2(ConsumerEx4LA2... consumers)
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
//		return (a, b, c, d) -> { for(ConsumerEx4LA2 consumer : consumers) consumer.accept4LA2(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4LA2(long[][], long[][], long[][], long[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(long[][] a, long[][] b, long[][] c, long[][] d) throws Exception
//	{
//		accept4LA2(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4LA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4LA2 then(ConsumerEx4<long[][],long[][],long[][],long[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4LA2(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4LA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4LA2 before(ConsumerEx4<long[][],long[][],long[][],long[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4LA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4LA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4LA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4LA2 of(ConsumerEx4<long[][],long[][],long[][],long[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4LA2) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<long[][],long[][],long[][],long[][]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
