//package org.barghos.util.consumer.objs;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 2-dimensional object array input
// * arguments and returns no result. Unlike {@link ConsumerOA2} this may throw
// * exceptions. {@link ConsumerExOA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptOA2(Object[][])}
// * 
// * @see ConsumerOA2
// * @see ConsumerExOA2
// * @see Consumer2OA2
// * @see ConsumerEx2OA2
// * @see Consumer3OA2
// * @see ConsumerEx3OA2
// * @see Consumer4OA2
// * @see ConsumerEx4OA2
// */
//@FunctionalInterface
//public interface ConsumerExOA2 extends ConsumerEx<Object[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptOA2(Object[][] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExOA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExOA2 thenOA2(ConsumerExOA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptOA2(a); after.acceptOA2(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExOA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExOA2 beforeOA2(ConsumerExOA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptOA2(a); acceptOA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExOA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExOA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExOA2 ofOA2(ConsumerExOA2... consumers)
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
//		return (a) -> { for(ConsumerExOA2 consumer : consumers) consumer.acceptOA2(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptOA2(Object[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Object[][] a) throws Exception
//	{
//		acceptOA2(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExOA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExOA2 then(ConsumerEx<Object[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptOA2(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExOA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExOA2 before(ConsumerEx<Object[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptOA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExOA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExOA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExOA2 of(ConsumerEx<Object[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExOA2) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<Object[][]> consumer : consumers) consumer.accept(a); };
//	}
//}
