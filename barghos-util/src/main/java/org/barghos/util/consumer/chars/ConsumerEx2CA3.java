//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional char array input
// * arguments and returns no result. Unlike {@link Consumer2CA3} this may throw
// * exceptions. {@link ConsumerEx2CA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2CA3(char[][][], char[][][])}.
// * 
// * @see ConsumerCA3
// * @see ConsumerExCA3
// * @see Consumer2CA3
// * @see ConsumerEx2CA3
// * @see Consumer3CA3
// * @see ConsumerEx3CA3
// * @see Consumer4CA3
// * @see ConsumerEx4CA3
// */
//@FunctionalInterface
//public interface ConsumerEx2CA3 extends ConsumerEx2<char[][][],char[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2CA3(char[][][] a, char[][][] b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2CA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2CA3 then2CA3(ConsumerEx2CA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2CA3(a, b); after.accept2CA3(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2CA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2CA3 before2CA3(ConsumerEx2CA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2CA3(a, b); accept2CA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2CA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2CA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2CA3 of2CA3(ConsumerEx2CA3... consumers)
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
//		return (a, b) -> { for(ConsumerEx2CA3 consumer : consumers) consumer.accept2CA3(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2CA3(char[][][], char[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[][][] a, char[][][] b) throws Exception
//	{
//		accept2CA3(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2CA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2CA3 then(ConsumerEx2<char[][][],char[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2CA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2CA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2CA3 before(ConsumerEx2<char[][][],char[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2CA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2CA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2CA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2CA3 of(ConsumerEx2<char[][][],char[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2CA3) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<char[][][],char[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//}
