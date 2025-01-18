//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 1-dimensional string array input
// * arguments and returns no result. {@link Consumer2StrA} is expected to operate
// * via side-effects.
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
//public interface Consumer2StrA extends Consumer2<String[],String[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2StrA(String[] a, String[] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2StrA} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2StrA then2StrA(Consumer2StrA after)
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
//	 * @return A new {@link Consumer2StrA} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2StrA before2StrA(Consumer2StrA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2StrA(a, b); accept2StrA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2StrA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2StrA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2StrA of2StrA(Consumer2StrA... consumers)
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
//		return (a, b) -> { for(Consumer2StrA consumer : consumers) consumer.accept2StrA(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2StrA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2StrA then(Consumer2<String[],String[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2StrA(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2StrA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2StrA then(java.util.function.BiConsumer<? super String[],? super String[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2StrA(a, b); after.accept(a, b); };
//	}
//	
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2StrA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2StrA before(Consumer2<String[],String[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2StrA(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2StrA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2StrA before(java.util.function.BiConsumer<? super String[],? super String[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2StrA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2StrA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2StrA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2StrA of(Consumer2<String[],String[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2StrA) consumers[0]::accept;
//		
//		return (a, b) -> { for(Consumer2<String[],String[]> consumer : consumers) consumer.accept(a, b); };
//	}
//
//	/**
//	 * @deprecated Use {@link #accept2StrA(String[], String[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String[] a, String[] b)
//	{
//		accept2StrA(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2StrA andThen(java.util.function.BiConsumer<? super String[],? super String[]> after)
//	{
//		return then(after);
//	}
//}
