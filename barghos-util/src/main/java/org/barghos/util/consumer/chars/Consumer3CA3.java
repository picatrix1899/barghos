//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 3-dimensional float array input
// * arguments and returns no result. {@link Consumer3CA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3CA3(float[][][], float[][][], float[][][])}
// * 
// * @see ConsumerCA3
// * @see ConsumerExCA3
// * @see Consumer2CA3
// * @see ConsumerEx2CA3
// * @see Consumer3CA3
// * @see ConsumerEx3CA3
// * @see Consumer4CA3
// * @see ConsumerEx4CA3
// */
//@FunctionalInterface
//public interface Consumer3CA3 extends Consumer3<float[][][],float[][][],float[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3CA3(float[][][] a, float[][][] b, float[][][] c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3CA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3CA3 then3CA3(Consumer3CA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3CA3(a, b, c); after.accept3CA3(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer3CA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer3CA3 before3CA3(Consumer3CA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3CA3(a, b, c); accept3CA3(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3CA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3CA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3CA3 of3CA3(Consumer3CA3... consumers)
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
//		return (a, b, c) -> { for(Consumer3CA3 consumer : consumers) consumer.accept3CA3(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept3CA3(float[][][], float[][][], float[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[][][] a, float[][][] b, float[][][] c)
//	{
//		accept3CA3(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3CA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3CA3 then(Consumer3<float[][][],float[][][],float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3CA3(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3CA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3CA3 before(Consumer3<float[][][],float[][][],float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3CA3(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3CA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3CA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3CA3 of(Consumer3<float[][][],float[][][],float[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (Consumer3CA3) consumers[0]::accept;
//
//		return (a, b, c) -> { for(Consumer3<float[][][],float[][][],float[][][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
