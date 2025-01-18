//package org.barghos.util.consumer.floats;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional float array input
// * argument and returns no result. {@link ConsumerFA} is expected to operate via
// * side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptFA(float[])}
// * 
// * @see ConsumerFA
// * @see ConsumerExFA
// * @see Consumer2FA
// * @see ConsumerEx2FA
// * @see Consumer3FA
// * @see ConsumerEx3FA
// * @see Consumer4FA
// * @see ConsumerEx4FA
// */
//@FunctionalInterface
//public interface ConsumerFA extends Consumer<float[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptFA(float[] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerFA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerFA thenFA(ConsumerFA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptFA(a); after.acceptFA(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerFA} performing the operation before and this
//	 * operation.
//	 */
//	default ConsumerFA beforeFA(ConsumerFA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptFA(a); acceptFA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerFA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerFA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerFA ofFA(ConsumerFA... consumers)
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
//		return (a) -> { for(ConsumerFA consumer : consumers) consumer.acceptFA(a); };
//	}
//
//	/**
//	 * @deprecated Use {@link #acceptFA(float[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(float[] a)
//	{
//		acceptFA(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerFA then(Consumer<float[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptFA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerFA then(java.util.function.Consumer<? super float[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptFA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerFA before(Consumer<float[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptFA(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerFA} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerFA before(java.util.function.Consumer<? super float[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptFA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerFA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerFA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerFA of(Consumer<float[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerFA) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<float[]> consumer : consumers) consumer.accept(a); };
//	}
//
//	/**
//	 * @deprecated
//	 * 
//	 * Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerFA andThen(java.util.function.Consumer<? super float[]> after)
//	{
//		return then(after);
//	}
//}
