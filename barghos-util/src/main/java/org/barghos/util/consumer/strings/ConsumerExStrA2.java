//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 2-dimensional string array input
// * arguments and returns no result. Unlike {@link ConsumerStrA2} this may throw
// * exceptions. {@link ConsumerExStrA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptStrA2(String[][])}
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
//public interface ConsumerExStrA2 extends ConsumerEx<String[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptStrA2(String[][] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExStrA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExStrA2 thenStrA2(ConsumerExStrA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptStrA2(a); after.acceptStrA2(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExStrA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExStrA2 beforeStrA2(ConsumerExStrA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptStrA2(a); acceptStrA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExStrA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExStrA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExStrA2 ofStrA2(ConsumerExStrA2... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a) -> { for(ConsumerExStrA2 consumer : consumers) consumer.acceptStrA2(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptStrA2(String[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String[][] a) throws Exception
//	{
//		acceptStrA2(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExStrA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExStrA2 then(ConsumerEx<String[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptStrA2(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExStrA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExStrA2 before(ConsumerEx<String[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptStrA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExStrA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExStrA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExStrA2 of(ConsumerEx<String[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExStrA2) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<String[][]> consumer : consumers) consumer.accept(a); };
//	}
//}
