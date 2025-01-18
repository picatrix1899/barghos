//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional long array input
// * arguments and returns no result. {@link Consumer2LA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2LA3(long[][][], long[][][])}
// * 
// * @see ConsumerLA3
// * @see ConsumerExLA3
// * @see Consumer2LA3
// * @see ConsumerEx2LA3
// * @see Consumer3FA2
// * @see ConsumerEx3LA3
// * @see Consumer4LA3
// * @see ConsumerEx4LA3
// */
//@FunctionalInterface
//public interface Consumer2LA3 extends Consumer2<long[][][],long[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2LA3(long[][][] a, long[][][] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2LA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2LA3 then2LA3(Consumer2LA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2LA3(a, b); after.accept2LA3(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2LA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2LA3 before2LA3(Consumer2LA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2LA3(a, b); accept2LA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2LA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2LA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2LA3 of2LA3(Consumer2LA3... consumers)
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
//		return (a, b) -> { for(Consumer2LA3 consumer : consumers) consumer.accept2LA3(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2LA3 then(Consumer2<long[][][],long[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2LA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2LA3 then(java.util.function.BiConsumer<? super long[][][],? super long[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2LA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2LA3 before(Consumer2<long[][][],long[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2LA3(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2LA3 before(java.util.function.BiConsumer<? super long[][][],? super long[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2LA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2LA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2LA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2LA3 of(Consumer2<long[][][],long[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2LA3) consumers[0]::accept;
//
//		return (a, b) -> { for(Consumer2<long[][][],long[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2LA3(long[][][], long[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(long[][][] a, long[][][] b)
//	{
//		accept2LA3(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2LA3 andThen(java.util.function.BiConsumer<? super long[][][],? super long[][][]> after)
//	{
//		return then(after);
//	}
//}
