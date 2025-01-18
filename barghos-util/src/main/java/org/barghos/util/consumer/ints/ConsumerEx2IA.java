//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 1-dimensional int array input
// * arguments and returns no result. Unlike {@link Consumer2IA} this may throw
// * exceptions. {@link ConsumerEx2IA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2IA(int[], int[])}
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
//public interface ConsumerEx2IA extends ConsumerEx2<int[],int[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2IA(int[] a, int[] b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2IA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2IA then2IA(ConsumerEx2IA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2IA(a, b); after.accept2IA(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2IA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2IA before2IA(ConsumerEx2IA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2IA(a, b); accept2IA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2IA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2IA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2IA of2IA(ConsumerEx2IA... consumers)
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
//		return (a, b) -> { for(ConsumerEx2IA consumer : consumers) consumer.accept2IA(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2IA(int[], int[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[] a, int[] b) throws Exception
//	{
//		accept2IA(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2IA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2IA then(ConsumerEx2<int[],int[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2IA(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2IA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2IA before(ConsumerEx2<int[],int[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2IA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2IA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2IA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2IA of(ConsumerEx2<int[],int[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2IA) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<int[],int[]> consumer : consumers) consumer.accept(a, b); };
//	}
//}
