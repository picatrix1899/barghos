//package org.barghos.util.consumer.floats;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 3-dimensional float array input
// * arguments and returns no result. Unlike {@link ConsumerFA3} this may throw
// * exceptions. {@link ConsumerExFA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptFA3(float[][][])}
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
//public interface ConsumerExFA3 extends ConsumerEx<float[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptFA3(float[][][] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExFA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExFA3 thenFA3(ConsumerExFA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptFA3(a); after.acceptFA3(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExFA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExFA3 beforeFA3(ConsumerExFA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptFA3(a); acceptFA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExFA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExFA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExFA3 ofFA3(ConsumerExFA3... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a) -> { for(ConsumerExFA3 consumer : consumers) consumer.acceptFA3(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptFA3(float[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[][][] a) throws Exception
//	{
//		acceptFA3(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExFA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExFA3 then(ConsumerEx<float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptFA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExFA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExFA3 before(ConsumerEx<float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptFA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExFA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExFA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExFA3 of(ConsumerEx<float[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExFA3) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<float[][][]> consumer : consumers) consumer.accept(a); };
//	}
//}
