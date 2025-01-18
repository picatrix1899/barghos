//package org.barghos.util.consumer.floats;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional float array input
// * arguments and returns no result. Unlike {@link Consumer2FA3} this may throw
// * exceptions. {@link ConsumerEx2FA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2FA3(float[][][], float[][][])}.
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
//public interface ConsumerEx2FA3 extends ConsumerEx2<float[][][],float[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2FA3(float[][][] a, float[][][] b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2FA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2FA3 then2FA3(ConsumerEx2FA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2FA3(a, b); after.accept2FA3(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2FA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2FA3 before2FA3(ConsumerEx2FA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2FA3(a, b); accept2FA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2FA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2FA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2FA3 of2FA3(ConsumerEx2FA3... consumers)
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
//		return (a, b) -> { for(ConsumerEx2FA3 consumer : consumers) consumer.accept2FA3(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2FA3(float[][][], float[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[][][] a, float[][][] b) throws Exception
//	{
//		accept2FA3(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2FA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2FA3 then(ConsumerEx2<float[][][],float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2FA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2FA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2FA3 before(ConsumerEx2<float[][][],float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2FA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2FA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2FA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2FA3 of(ConsumerEx2<float[][][],float[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2FA3) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<float[][][],float[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//}
