//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional int array input
// * arguments and returns no result. Unlike {@link ConsumerIA} this may throw
// * exceptions. {@link ConsumerExIA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptIA(int[])}
// * 
// * @see ConsumerIA
// * @see ConsumerExIA
// * @see Consumer2IA
// * @see ConsumerEx2IA
// * @see Consumer3IA
// * @see ConsumerEx3IA
// * @see Consumer4IA
// * @see ConsumerEx4IA
// */
//@FunctionalInterface
//public interface ConsumerExIA extends ConsumerEx<int[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptIA(int[] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExIA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExIA thenIA(ConsumerExIA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptIA(a); after.acceptIA(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExIA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExIA beforeIA(ConsumerExIA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptIA(a); acceptIA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExIA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExIA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExIA ofIA(ConsumerExIA... consumers)
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
//		return (a) -> { for(ConsumerExIA consumer : consumers) consumer.acceptIA(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptIA(int[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[] a) throws Exception
//	{
//		acceptIA(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExIA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExIA then(ConsumerEx<int[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptIA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExIA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExIA before(ConsumerEx<int[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptIA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExIA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExIA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExIA of(ConsumerEx<int[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
// 
//		if(consumers.length == 1) return (ConsumerExIA) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<int[]> consumer : consumers) consumer.accept(a); };
//	}
//}
