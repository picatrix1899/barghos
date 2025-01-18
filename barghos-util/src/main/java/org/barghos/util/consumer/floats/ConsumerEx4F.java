//package org.barghos.util.consumer.floats;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 1-dimensional float array input
// * arguments and returns no result. Unlike {@link Consumer4F} this may throw
// * exceptions. {@link ConsumerEx4F} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4F(float, float, float, float)}
// * 
// * @see ConsumerF
// * @see ConsumerExF
// * @see Consumer2F
// * @see ConsumerEx2F
// * @see Consumer3F
// * @see ConsumerEx3F
// * @see Consumer4F
// * @see ConsumerEx4F
// */
//@FunctionalInterface
//public interface ConsumerEx4F extends ConsumerEx4<Float,Float,Float,Float>
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
//	void accept4F(float a, float b, float c, float d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4F} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4F then4F(ConsumerEx4F after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4F(a, b, c, d); after.accept4F(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4F} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4F before4F(ConsumerEx4F before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4F(a, b, c, d); accept4F(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4F} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4F} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4F of4F(ConsumerEx4F... consumers)
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
//		return (a, b, c, d) -> { for(ConsumerEx4F consumer : consumers) consumer.accept4F(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept4F(float, float, float, float)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Float a, Float b, Float c, Float d) throws Exception
//	{
//		accept4F(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4F} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4F then(ConsumerEx4<Float,Float,Float,Float> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4F(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4F} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4F before(ConsumerEx4<Float,Float,Float,Float> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4F(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4F} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4F} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4F of(ConsumerEx4<Float,Float,Float,Float>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4F) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<Float,Float,Float,Float> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
