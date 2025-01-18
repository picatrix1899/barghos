//package org.barghos.util.consumer.doubles;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 2-dimensional double array input
// * arguments and returns no result. {@link Consumer2DA2} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2DA2(double[][], double[][])}
// * 
// * @see ConsumerDA2
// * @see ConsumerExDA2
// * @see Consumer2DA2
// * @see ConsumerEx2DA2
// * @see Consumer3DA2
// * @see ConsumerEx3DA2
// * @see Consumer4DA2
// * @see ConsumerEx4DA2
// */
//@FunctionalInterface
//public interface Consumer2DA2 extends Consumer2<double[][],double[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2DA2(double[][] a, double[][] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2DA2} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2DA2 then2DA2(Consumer2DA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2DA2(a, b); after.accept2DA2(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2DA2} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2DA2 before2DA2(Consumer2DA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2DA2(a, b); accept2DA2(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2DA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2DA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2DA2 of2DA2(Consumer2DA2... consumers)
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
//		return (a, b) -> { for(Consumer2DA2 consumer : consumers) consumer.accept2DA2(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2DA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2DA2 then(Consumer2<double[][],double[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2DA2(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2DA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2DA2 then(java.util.function.BiConsumer<? super double[][],? super double[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2DA2(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2DA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2DA2 before(Consumer2<double[][],double[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2DA2(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2DA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2DA2 before(java.util.function.BiConsumer<? super double[][],? super double[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2DA2(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2DA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2DA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2DA2 of(Consumer2<double[][],double[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//		
//		if(consumers.length == 1) return (Consumer2DA2) consumers[0]::accept;
//
//		return (a, b) -> { for(Consumer2<double[][],double[][]> consumer : consumers) consumer.accept(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2DA2(double[][], double[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(double[][] a, double[][] b)
//	{
//		accept2DA2(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2DA2 andThen(java.util.function.BiConsumer<? super double[][],? super double[][]> after)
//	{
//		return then(after);
//	}
//}
