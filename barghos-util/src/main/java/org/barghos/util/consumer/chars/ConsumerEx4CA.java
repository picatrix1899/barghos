//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 1-dimensional char array input
// * arguments and returns no result. Unlike {@link Consumer4CA} this may throw
// * exceptions. {@link ConsumerEx4CA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4CA(char[], char[], char[], char[])}
// * 
// * @see ConsumerCA
// * @see ConsumerExCA
// * @see Consumer2CA
// * @see ConsumerEx2CA
// * @see Consumer3CA
// * @see ConsumerEx3CA
// * @see Consumer4CA
// * @see ConsumerEx4CA
// */
//@FunctionalInterface
//public interface ConsumerEx4CA extends ConsumerEx4<char[],char[],char[],char[]>
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
//	void accept4CA(char[] a, char[] b, char[] c, char[] d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4CA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4CA then4CA(ConsumerEx4CA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4CA(a, b, c, d); after.accept4CA(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4CA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4CA before4CA(ConsumerEx4CA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4CA(a, b, c, d); accept4CA(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4CA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4CA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4CA of4CA(ConsumerEx4CA... consumers)
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
//		return (a, b, c, d) -> { for(ConsumerEx4CA consumer : consumers) consumer.accept4CA(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept4CA(char[], char[], char[], char[])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[] a, char[] b, char[] c, char[] d) throws Exception
//	{
//		accept4CA(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4CA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4CA then(ConsumerEx4<char[],char[],char[],char[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4CA(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4CA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4CA before(ConsumerEx4<char[],char[],char[],char[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4CA(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4CA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4CA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4CA of(ConsumerEx4<char[],char[],char[],char[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4CA) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<char[],char[],char[],char[]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
