//package org.barghos.util.consumer.floats;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 3-dimensional float array input
// * argument and returns no result. {@link ConsumerFA3} is expected to operate
// * via side-effects.
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
//public interface ConsumerFA3 extends Consumer<float[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptFA3(float[][][] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerFA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerFA3 thenFA3(ConsumerFA3 after)
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
//	 * @return A new {@link ConsumerFA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerFA3 beforeFA3(ConsumerFA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptFA3(a); acceptFA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerFA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerFA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerFA3 ofFA3(ConsumerFA3... consumers)
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
//		return (a) -> { for(ConsumerFA3 consumer : consumers) consumer.acceptFA3(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptFA3(float[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[][][] a)
//	{
//		acceptFA3(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerFA3 then(Consumer<float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptFA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerFA3 then(java.util.function.Consumer<? super float[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptFA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerFA3 before(Consumer<float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptFA3(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerFA3 before(java.util.function.Consumer<? super float[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptFA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerFA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerFA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerFA3 of(Consumer<float[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerFA3) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<float[][][]> consumer : consumers) consumer.accept(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerFA3 andThen(java.util.function.Consumer<? super float[][][]> after)
//	{
//		return then(after);
//	}
//}
