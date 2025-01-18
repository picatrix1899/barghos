//package org.barghos.util.consumer.doubles;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two double input arguments and returns
// * no result. {@link Consumer2D} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2D(double, double)}
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
//public interface Consumer2D extends Consumer2<Double,Double>
//{
//
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2D(double a, double b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2D} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2D then2D(Consumer2D after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2D(a, b); after.accept2D(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2D} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2D before2D(Consumer2D before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2D(a, b); accept2D(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2D} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2D} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2D of2D(Consumer2D... consumers)
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
//		return (a, b) -> { for(Consumer2D consumer : consumers) consumer.accept2D(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2D} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2D then(Consumer2<Double,Double> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2D(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2D} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2D then(java.util.function.BiConsumer<? super Double,? super Double> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2D(a, b); after.accept(a, b); };
//	}
//	
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2D} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2D before(Consumer2<Double,Double> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2D(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2D} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2D before(java.util.function.BiConsumer<? super Double,? super Double> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2D(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2D} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2D} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2D of(Consumer2<Double,Double>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2D) consumers[0]::accept;
//		
//		return (a, b) -> { for(Consumer2<Double,Double> consumer : consumers) consumer.accept(a, b); };
//	}
//
//	/**
//	 * @deprecated Use {@link #accept2D(double, double)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Double a, Double b)
//	{
//		accept2D(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2D andThen(java.util.function.BiConsumer<? super Double,? super Double> after)
//	{
//		return then(after);
//	}
//}
