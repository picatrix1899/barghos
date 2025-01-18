//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 2-dimensional short array input
// * arguments and returns no result. Unlike {@link ConsumerSA2} this may throw
// * exceptions. {@link ConsumerExSA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptSA2(short[][])}
// * 
// * @see ConsumerSA2
// * @see ConsumerExSA2
// * @see Consumer2SA2
// * @see ConsumerEx2SA2
// * @see Consumer3SA2
// * @see ConsumerEx3SA2
// * @see Consumer4SA2
// * @see ConsumerEx4SA2
// */
//@FunctionalInterface
//public interface ConsumerExSA2 extends ConsumerEx<short[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptSA2(short[][] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExSA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExSA2 thenSA2(ConsumerExSA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptSA2(a); after.acceptSA2(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExSA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExSA2 beforeSA2(ConsumerExSA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptSA2(a); acceptSA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExSA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExSA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExSA2 ofSA2(ConsumerExSA2... consumers)
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
//		return (a) -> { for(ConsumerExSA2 consumer : consumers) consumer.acceptSA2(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptSA2(short[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[][] a) throws Exception
//	{
//		acceptSA2(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExSA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExSA2 then(ConsumerEx<short[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptSA2(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExSA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExSA2 before(ConsumerEx<short[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptSA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExSA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExSA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExSA2 of(ConsumerEx<short[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExSA2) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<short[][]> consumer : consumers) consumer.accept(a); };
//	}
//}
