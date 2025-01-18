//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 3-dimensional char array input
// * arguments and returns no result. Unlike {@link Consumer4CA3} this may throw
// * exceptions. {@link ConsumerEx4CA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4CA3(char[][][], char[][][], char[][][], char[][][])}
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
//public interface ConsumerEx4CA3 extends ConsumerEx4<char[][][],char[][][],char[][][],char[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept4CA3(char[][][] a, char[][][] b, char[][][] c, char[][][] d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4CA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4CA3 then4CA3(ConsumerEx4CA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4CA3(a, b, c, d); after.accept4CA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4CA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4CA3 before4CA3(ConsumerEx4CA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4CA3(a, b, c, d); accept4CA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4CA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4CA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4CA3 of4CA3(ConsumerEx4CA3... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a, b, c, d) -> { for(ConsumerEx4CA3 consumer : consumers) consumer.accept4CA3(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4CA3(char[][][], char[][][], char[][][], char[][][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[][][] a, char[][][] b, char[][][] c, char[][][] d) throws Exception
//	{
//		accept4CA3(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4CA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4CA3 then(ConsumerEx4<char[][][],char[][][],char[][][],char[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4CA3(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4CA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4CA3 before(ConsumerEx4<char[][][],char[][][],char[][][],char[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4CA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4CA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4CA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4CA3 of(ConsumerEx4<char[][][],char[][][],char[][][],char[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4CA3) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<char[][][],char[][][],char[][][],char[][][]> consumer : consumers) consumer.accept(a, b, c, d);  };
//	}
//}
