//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 3-dimensional string array input
// * arguments and returns no result. Unlike {@link Consumer3StrA3} this may throw
// * exceptions. {@link ConsumerEx3StrA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3StrA3(String[][][], String[][][], String[][][])}
// * 
// * @see ConsumerStrA3
// * @see ConsumerExStrA3
// * @see Consumer2StrA3
// * @see ConsumerEx2StrA3
// * @see Consumer3StrA3
// * @see ConsumerEx3StrA3
// * @see Consumer4StrA3
// * @see ConsumerEx4StrA3
// */
//@FunctionalInterface
//public interface ConsumerEx3StrA3 extends ConsumerEx3<String[][][],String[][][],String[][][]>
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
//	void accept3StrA3(String[][][] a, String[][][] b, String[][][] c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3StrA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3StrA3 then3StrA3(ConsumerEx3StrA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3StrA3(a, b, c); after.accept3StrA3(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3StrA3} performing the operation before
//	 * and this operation.
//	 */
//	default ConsumerEx3StrA3 before3StrA3(ConsumerEx3StrA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3StrA3(a, b, c); accept3StrA3(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3StrA3} performing the given operations
//	 * in sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3StrA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3StrA3 of3StrA3(ConsumerEx3StrA3... consumers)
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
//		return (a, b, c) -> { for(ConsumerEx3StrA3 consumer : consumers) consumer.accept3StrA3(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept3StrA3(String[][][], String[][][], String[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String[][][] a, String[][][] b, String[][][] c) throws Exception
//	{
//		accept3StrA3(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3StrA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3StrA3 then(ConsumerEx3<String[][][],String[][][],String[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3StrA3(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3StrA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3StrA3 before(ConsumerEx3<String[][][],String[][][],String[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3StrA3(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3StrA3} performing the given operations
//	 * in sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3StrA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3StrA3 of(ConsumerEx3<String[][][],String[][][],String[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3StrA3) consumers[0]::accept;
//		
//		return (a, b, c) -> { for(ConsumerEx3<String[][][],String[][][],String[][][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
