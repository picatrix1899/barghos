//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional short array input
// * arguments and returns no result. Unlike {@link ConsumerSA} this may throw
// * exceptions. {@link ConsumerExSA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptSA(short[])}
// * 
// * @see ConsumerSA
// * @see ConsumerExSA
// * @see Consumer2SA
// * @see ConsumerEx2SA
// * @see Consumer3SA
// * @see ConsumerEx3SA
// * @see Consumer4SA
// * @see ConsumerEx4SA
// */
//@FunctionalInterface
//public interface ConsumerExSA extends ConsumerEx<short[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptSA(short[] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExSA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExSA thenSA(ConsumerExSA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptSA(a); after.acceptSA(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExSA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExSA beforeSA(ConsumerExSA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptSA(a); acceptSA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExSA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExSA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExSA ofSA(ConsumerExSA... consumers)
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
//		return (a) -> { for(ConsumerExSA consumer : consumers) consumer.acceptSA(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptSA(short[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[] a) throws Exception
//	{
//		acceptSA(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExSA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExSA then(ConsumerEx<short[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptSA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExSA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExSA before(ConsumerEx<short[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptSA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExSA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExSA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExSA of(ConsumerEx<short[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
// 
//		if(consumers.length == 1) return (ConsumerExSA) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<short[]> consumer : consumers) consumer.accept(a); };
//	}
//}
