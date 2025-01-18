//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.Consumer4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 3-dimensional long array input
// * arguments and returns no result. {@link Consumer4LA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4LA3(long[][][], long[][][], long[][][], long[][][])}
// * 
// * @see ConsumerLA3
// * @see ConsumerExLA3
// * @see Consumer2LA3
// * @see ConsumerEx2LA3
// * @see Consumer3LA3
// * @see ConsumerEx3LA3
// * @see Consumer4LA3
// * @see ConsumerEx4LA3
// */
//@FunctionalInterface
//public interface Consumer4LA3 extends Consumer4<long[][][],long[][][],long[][][],long[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 */
//	void accept4LA3(long[][][] a, long[][][] b, long[][][] c, long[][][] d);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer4LA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer4LA3 then4LA3(Consumer4LA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4LA3(a, b, c, d); after.accept4LA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer4LA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer4LA3 before4LA3(Consumer4LA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4LA3(a, b, c, d); accept4LA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4LA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4LA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4LA3 of4LA3(Consumer4LA3... consumers)
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
//		return (a, b, c, d) -> { for(Consumer4LA3 consumer : consumers) consumer.accept4LA3(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4LA3(long[][][], long[][][], long[][][], long[][][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(long[][][] a, long[][][] b, long[][][] c, long[][][] d)
//	{
//		accept4LA3(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4LA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4LA3 then(Consumer4<long[][][],long[][][],long[][][],long[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4LA3(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4LA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4LA3 before(Consumer4<long[][][],long[][][],long[][][],long[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4LA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4LA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4LA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4LA3 of(Consumer4<long[][][],long[][][],long[][][],long[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (Consumer4LA3) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(Consumer4<long[][][],long[][][],long[][][],long[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
