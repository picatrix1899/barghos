//package org.barghos.util.consumer.doubles;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 2-dimensional double array input
// * arguments and returns no result. {@link Consumer3DA2} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3DA2(double[][], double[][], double[][])}
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
//public interface Consumer3DA2 extends Consumer3<double[][],double[][],double[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3DA2(double[][] a, double[][] b, double[][] c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3DA2} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3DA2 then3DA2(Consumer3DA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3DA2(a, b, c); after.accept3DA2(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer3DA2} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer3DA2 before3DA2(Consumer3DA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3DA2(a, b, c); accept3DA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3DA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3DA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3DA2 of3DA2(Consumer3DA2... consumers)
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
//		return (a, b, c) -> { for(Consumer3DA2 consumer : consumers) consumer.accept3DA2(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3DA2(double[][], double[][], double[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(double[][] a, double[][] b, double[][] c)
//	{
//		accept3DA2(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3DA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3DA2 then(Consumer3<double[][],double[][],double[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3DA2(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3DA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3DA2 before(Consumer3<double[][],double[][],double[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3DA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3DA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3DA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3DA2 of(Consumer3<double[][],double[][],double[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//		
//		if(consumers.length == 1) return (Consumer3DA2) consumers[0]::accept;
//		
//		return (a, b, c) -> { for(Consumer3<double[][],double[][],double[][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
