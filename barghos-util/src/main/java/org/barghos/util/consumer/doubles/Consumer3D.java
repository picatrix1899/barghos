//package org.barghos.util.consumer.doubles;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three double input arguments and returns
// * no result. {@link Consumer3D} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3D(double, double, double)}
// * 
// * @see ConsumerD
// * @see ConsumerExD
// * @see Consumer2D
// * @see ConsumerEx2D
// * @see Consumer3D
// * @see ConsumerEx3D
// * @see Consumer4D
// * @see ConsumerEx4D
// */
//@FunctionalInterface
//public interface Consumer3D extends Consumer3<Double,Double,Double>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3D(double a, double b, double c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3D} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3D then3D(Consumer3D after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3D(a, b, c); after.accept3D(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer3D} performing the operation before and this
//	 * operation.
//	 */
//	default Consumer3D before3D(Consumer3D before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3D(a, b, c); accept3D(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3D} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3D} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3D of3D(Consumer3D... consumers)
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
//		return (a, b, c) -> { for(Consumer3D consumer : consumers) consumer.accept3D(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3D(double, double, double)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Double a, Double b, Double c)
//	{
//		accept3D(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3D} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3D then(Consumer3<Double,Double,Double> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3D(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3D} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default Consumer3D before(Consumer3<Double,Double,Double> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3D(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3D} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3D} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3D of(Consumer3<Double,Double,Double>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (Consumer3D) consumers[0]::accept;
//		
//		return (a, b, c) -> { for(Consumer3<Double,Double,Double> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
