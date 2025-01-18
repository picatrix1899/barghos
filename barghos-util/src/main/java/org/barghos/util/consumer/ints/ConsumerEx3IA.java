//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 1-dimensional int array input
// * arguments and returns no result. Unlike {@link Consumer3IA} this may throw
// * exceptions. {@link ConsumerEx3IA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3IA(int[], int[], int[])}
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
//public interface ConsumerEx3IA extends ConsumerEx3<int[],int[],int[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept3IA(int[] a, int[] b, int[] c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3IA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3IA then3IA(ConsumerEx3IA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3IA(a, b, c); after.accept3IA(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3IA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx3IA before3IA(ConsumerEx3IA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3IA(a, b, c); accept3IA(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3IA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3IA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3IA of3IA(ConsumerEx3IA... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a, b, c) -> { for(ConsumerEx3IA consumer : consumers) consumer.accept3IA(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3IA(int[], int[], int[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[] a, int[] b, int[] c) throws Exception
//	{
//		accept3IA(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3IA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3IA then(ConsumerEx3<int[],int[],int[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3IA(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3IA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3IA before(ConsumerEx3<int[],int[],int[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3IA(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3IA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3IA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3IA of(ConsumerEx3<int[],int[],int[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3IA) consumers[0]::accept;
//
//		return (a, b, c) -> { for(ConsumerEx3<int[],int[],int[]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
