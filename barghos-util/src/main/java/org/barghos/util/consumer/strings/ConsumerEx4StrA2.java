//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 2-dimensional string array input
// * arguments and returns no result. Unlike {@link Consumer4StrA2} this may throw
// * exceptions. {@link ConsumerEx4StrA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4StrA2(String[][], String[][], String[][], String[][])}
// * 
// * @see ConsumerStrA2
// * @see ConsumerExStrA2
// * @see Consumer2StrA2
// * @see ConsumerEx2StrA2
// * @see Consumer3StrA2
// * @see ConsumerEx3StrA2
// * @see Consumer4StrA2
// * @see ConsumerEx4StrA2
// */
//@FunctionalInterface
//public interface ConsumerEx4StrA2 extends ConsumerEx4<String[][],String[][],String[][],String[][]>
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
//	void accept4StrA2(String[][] a, String[][] b, String[][] c, String[][] d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4StrA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4StrA2 then4StrA2(ConsumerEx4StrA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4StrA2(a, b, c, d); after.accept4StrA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4StrA2} performing the operation before
//	 * and this operation.
//	 */
//	default ConsumerEx4StrA2 before4StrA2(ConsumerEx4StrA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4StrA2(a, b, c, d); accept4StrA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4StrA2} performing the given operations
//	 * in sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4StrA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4StrA2 of4StrA2(ConsumerEx4StrA2... consumers)
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
//		return (a, b, c, d) -> { for(ConsumerEx4StrA2 consumer : consumers) consumer.accept4StrA2(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4StrA2(String[][], String[][], String[][], String[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String[][] a, String[][] b, String[][] c, String[][] d) throws Exception
//	{
//		accept4StrA2(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4StrA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4StrA2 then(ConsumerEx4<String[][],String[][],String[][],String[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4StrA2(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4StrA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4StrA2 before(ConsumerEx4<String[][],String[][],String[][],String[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4StrA2(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4StrA2} performing the given operations
//	 * in sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4StrA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4StrA2 of(ConsumerEx4<String[][],String[][],String[][],String[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4StrA2) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<String[][],String[][],String[][],String[][]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
