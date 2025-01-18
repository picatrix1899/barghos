//package org.barghos.util.consumer.doubles;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional double array input
// * arguments and returns no result. Unlike {@link ConsumerD} this may throw
// * exceptions. {@link ConsumerExD} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptD(double)}
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
//public interface ConsumerExD extends ConsumerEx<Double>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptD(double a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExD} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExD thenD(ConsumerExD after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptD(a); after.acceptD(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExD} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExD beforeD(ConsumerExD before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptD(a); acceptD(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExD} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExD} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExD ofD(ConsumerExD... consumers)
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
//		return (a) -> { for(ConsumerExD consumer : consumers) consumer.acceptD(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptD(Double)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Double a) throws Exception
//	{
//		acceptD(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExD} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExD then(ConsumerEx<Double> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptD(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExD} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExD before(ConsumerEx<Double> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptD(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExD} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExD} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExD of(ConsumerEx<Double>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExD) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<Double> consumer : consumers) consumer.accept(a); };
//	}
//}
