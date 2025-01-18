//package org.barghos.util.consumer.doubles;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional float array input
// * arguments and returns no result. {@link Consumer2FA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2FA3(float[][][], float[][][])}
// * 
// * @see ConsumerFA3
// * @see ConsumerExFA3
// * @see Consumer2FA3
// * @see ConsumerEx2FA3
// * @see Consumer3FA2
// * @see ConsumerEx3FA3
// * @see Consumer4FA3
// * @see ConsumerEx4FA3
// */
//@FunctionalInterface
//public interface Consumer2FA3 extends Consumer2<float[][][],float[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2FA3(float[][][] a, float[][][] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2FA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2FA3 then2FA3(Consumer2FA3 after)
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
//	 * @return A new {@link Consumer2FA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2FA3 before2FA3(Consumer2FA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2FA3(a, b); accept2FA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2FA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2FA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2FA3 of2FA3(Consumer2FA3... consumers)
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
//		return (a, b) -> { for(Consumer2FA3 consumer : consumers) consumer.accept2FA3(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2FA3 then(Consumer2<float[][][],float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2FA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2FA3 then(java.util.function.BiConsumer<? super float[][][],? super float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2FA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default Consumer2FA3 before(Consumer2<float[][][],float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2FA3(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default Consumer2FA3 before(java.util.function.BiConsumer<? super float[][][],? super float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2FA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2FA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2FA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2FA3 of(Consumer2<float[][][],float[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2FA3) consumers[0]::accept;
//
//		return (a, b) -> { for(Consumer2<float[][][],float[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2FA3(float[][][], float[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[][][] a, float[][][] b)
//	{
//		accept2FA3(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2FA3 andThen(java.util.function.BiConsumer<? super float[][][],? super float[][][]> after)
//	{
//		return then(after);
//	}
//}
