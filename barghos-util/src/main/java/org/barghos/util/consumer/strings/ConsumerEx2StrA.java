//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 1-dimensional string array input
// * arguments and returns no result. Unlike {@link Consumer2StrA} this may throw
// * exceptions. {@link ConsumerEx2StrA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2StrA(String[], String[])}
// * 
// * @see ConsumerStrA
// * @see ConsumerExStrA
// * @see Consumer2StrA
// * @see ConsumerEx2StrA
// * @see Consumer3StrA
// * @see ConsumerEx3StrA
// * @see Consumer4StrA
// * @see ConsumerEx4StrA
// */
//@FunctionalInterface
//public interface ConsumerEx2StrA extends ConsumerEx2<String[],String[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2StrA(String[] a, String[] b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2StrA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2StrA then2StrA(ConsumerEx2StrA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2StrA(a, b); after.accept2StrA(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2StrA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2StrA before2StrA(ConsumerEx2StrA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2StrA(a, b); accept2StrA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2StrA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2StrA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2StrA of2StrA(ConsumerEx2StrA... consumers)
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
//		return (a, b) -> { for(ConsumerEx2StrA consumer : consumers) consumer.accept2StrA(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2StrA(String[], String[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String[] a, String[] b) throws Exception
//	{
//		accept2StrA(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2StrA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2StrA then(ConsumerEx2<String[],String[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2StrA(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2StrA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2StrA before(ConsumerEx2<String[],String[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2StrA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2StrA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2StrA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2StrA of(ConsumerEx2<String[],String[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2StrA) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<String[],String[]> consumer : consumers) consumer.accept(a, b); };
//	}
//}
