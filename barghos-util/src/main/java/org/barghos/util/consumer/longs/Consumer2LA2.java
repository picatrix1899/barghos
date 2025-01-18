//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 2-dimensional long array input
// * arguments and returns no result. {@link Consumer2LA2} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2LA2(long[][], long[][])}
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
//public interface Consumer2LA2 extends Consumer2<long[][],long[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2LA2(long[][] a, long[][] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2LA2} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2LA2 then2LA2(Consumer2LA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2LA2(a, b); after.accept2LA2(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2LA2} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2LA2 before2LA2(Consumer2LA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2LA2(a, b); accept2LA2(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2LA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2LA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2LA2 of2LA2(Consumer2LA2... consumers)
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
//		return (a, b) -> { for(Consumer2LA2 consumer : consumers) consumer.accept2LA2(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2LA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2LA2 then(Consumer2<long[][],long[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2LA2(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2LA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2LA2 then(java.util.function.BiConsumer<? super long[][],? super long[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2LA2(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2LA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2LA2 before(Consumer2<long[][],long[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2LA2(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2LA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2LA2 before(java.util.function.BiConsumer<? super long[][],? super long[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2LA2(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2LA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2LA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2LA2 of(Consumer2<long[][],long[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//		
//		if(consumers.length == 1) return (Consumer2LA2) consumers[0]::accept;
//
//		return (a, b) -> { for(Consumer2<long[][],long[][]> consumer : consumers) consumer.accept(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2LA2(long[][], long[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(long[][] a, long[][] b)
//	{
//		accept2LA2(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2LA2 andThen(java.util.function.BiConsumer<? super long[][],? super long[][]> after)
//	{
//		return then(after);
//	}
//}
