//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional int array input
// * arguments and returns no result. Unlike {@link Consumer2IA3} this may throw
// * exceptions. {@link ConsumerEx2IA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2IA3(int[][][], int[][][])}.
// * 
// * @see ConsumerIA3
// * @see ConsumerExIA3
// * @see Consumer2IA3
// * @see ConsumerEx2IA3
// * @see Consumer3IA3
// * @see ConsumerEx3IA3
// * @see Consumer4IA3
// * @see ConsumerEx4IA3
// */
//@FunctionalInterface
//public interface ConsumerEx2IA3 extends ConsumerEx2<int[][][],int[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2IA3(int[][][] a, int[][][] b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2IA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2IA3 then2IA3(ConsumerEx2IA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2IA3(a, b); after.accept2IA3(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2IA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2IA3 before2IA3(ConsumerEx2IA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2IA3(a, b); accept2IA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2IA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2IA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2IA3 of2IA3(ConsumerEx2IA3... consumers)
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
//		return (a, b) -> { for(ConsumerEx2IA3 consumer : consumers) consumer.accept2IA3(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2IA3(int[][][], int[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(int[][][] a, int[][][] b) throws Exception
//	{
//		accept2IA3(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2IA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2IA3 then(ConsumerEx2<int[][][],int[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2IA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2IA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2IA3 before(ConsumerEx2<int[][][],int[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2IA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2IA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2IA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2IA3 of(ConsumerEx2<int[][][],int[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2IA3) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<int[][][],int[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//}
