//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional string array input
// * arguments and returns no result. Unlike {@link ConsumerStr} this may throw
// * exceptions. {@link ConsumerExStr} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptStr(String)}
// * 
// * @see ConsumerStr
// * @see ConsumerExStr
// * @see Consumer2Str
// * @see ConsumerEx2Str
// * @see Consumer3Str
// * @see ConsumerEx3Str
// * @see Consumer4Str
// * @see ConsumerEx4Str
// */
//@FunctionalInterface
//public interface ConsumerExStr extends ConsumerEx<String>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptStr(String a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExStr} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExStr thenStr(ConsumerExStr after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptStr(a); after.acceptStr(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExStr} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExStr beforeStr(ConsumerExStr before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptStr(a); acceptStr(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExStr} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExStr} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExStr ofStr(ConsumerExStr... consumers)
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
//		return (a) -> { for(ConsumerExStr consumer : consumers) consumer.acceptStr(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptStr(String)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String a) throws Exception
//	{
//		acceptStr(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExStr} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExStr then(ConsumerEx<String> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptStr(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExStr} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExStr before(ConsumerEx<String> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptStr(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExStr} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExStr} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExStr of(ConsumerEx<String>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExStr) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<String> consumer : consumers) consumer.accept(a); };
//	}
//}
