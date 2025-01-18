//package org.barghos.util.consumer.floats;
//
//import org.barghos.util.consumer.Consumer4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 3-dimensional float array input
// * arguments and returns no result. {@link Consumer4FA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4FA3(float[][][], float[][][], float[][][], float[][][])}
// * 
// * @see ConsumerFA3
// * @see ConsumerExFA3
// * @see Consumer2FA3
// * @see ConsumerEx2FA3
// * @see Consumer3FA3
// * @see ConsumerEx3FA3
// * @see Consumer4FA3
// * @see ConsumerEx4FA3
// */
//@FunctionalInterface
//public interface Consumer4FA3 extends Consumer4<float[][][],float[][][],float[][][],float[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 */
//	void accept4FA3(float[][][] a, float[][][] b, float[][][] c, float[][][] d);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer4FA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer4FA3 then4FA3(Consumer4FA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4FA3(a, b, c, d); after.accept4FA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer4FA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer4FA3 before4FA3(Consumer4FA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4FA3(a, b, c, d); accept4FA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4FA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4FA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4FA3 of4FA3(Consumer4FA3... consumers)
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
//		return (a, b, c, d) -> { for(Consumer4FA3 consumer : consumers) consumer.accept4FA3(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4FA3(float[][][], float[][][], float[][][], float[][][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[][][] a, float[][][] b, float[][][] c, float[][][] d)
//	{
//		accept4FA3(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4FA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4FA3 then(Consumer4<float[][][],float[][][],float[][][],float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4FA3(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4FA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4FA3 before(Consumer4<float[][][],float[][][],float[][][],float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4FA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4FA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4FA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4FA3 of(Consumer4<float[][][],float[][][],float[][][],float[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (Consumer4FA3) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(Consumer4<float[][][],float[][][],float[][][],float[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
