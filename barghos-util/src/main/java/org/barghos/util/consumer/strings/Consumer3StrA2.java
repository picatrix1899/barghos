//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 2-dimensional string array input
// * arguments and returns no result. {@link Consumer3StrA2} is expected to
// * operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3StrA2(String[][], String[][], String[][])}
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
//public interface Consumer3StrA2 extends Consumer3<String[][],String[][],String[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3StrA2(String[][] a, String[][] b, String[][] c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3StrA2} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3StrA2 then3StrA2(Consumer3StrA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3StrA2(a, b, c); after.accept3StrA2(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer3StrA2} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer3StrA2 before3StrA2(Consumer3StrA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3StrA2(a, b, c); accept3StrA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3StrA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3StrA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3StrA2 of3StrA2(Consumer3StrA2... consumers)
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
//		return (a, b, c) -> { for(Consumer3StrA2 consumer : consumers) consumer.accept3StrA2(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3StrA2(String[][], String[][], String[][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String[][] a, String[][] b, String[][] c)
//	{
//		accept3StrA2(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3StrA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3StrA2 then(Consumer3<String[][],String[][],String[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3StrA2(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3StrA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3StrA2 before(Consumer3<String[][],String[][],String[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3StrA2(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3StrA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3StrA2} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3StrA2 of(Consumer3<String[][],String[][],String[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//		
//		if(consumers.length == 1) return (Consumer3StrA2) consumers[0]::accept;
//		
//		return (a, b, c) -> { for(Consumer3<String[][],String[][],String[][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
