//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 1-dimensional long array input
// * arguments and returns no result. Unlike {@link Consumer2L} this may throw
// * exceptions. {@link ConsumerEx2L} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2L(long, long)}
// * 
// * @see ConsumerL
// * @see ConsumerExL
// * @see Consumer2L
// * @see ConsumerEx2L
// * @see Consumer3L
// * @see ConsumerEx3L
// * @see Consumer4L
// * @see ConsumerEx4L
// */
//@FunctionalInterface
//public interface ConsumerEx2L extends ConsumerEx2<Long,Long>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2L(long a, long b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2L} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2L then2L(ConsumerEx2L after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2L(a, b); after.accept2L(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2L} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2L before2L(ConsumerEx2L before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2L(a, b); accept2L(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2L} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2L of2L(ConsumerEx2L... consumers)
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
//		return (a, b) -> { for(ConsumerEx2L consumer : consumers) consumer.accept2L(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2L(long, long)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Long a, Long b) throws Exception
//	{
//		accept2L(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2L then(ConsumerEx2<Long,Long> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2L(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2L before(ConsumerEx2<Long,Long> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2L(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2L} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2L of(ConsumerEx2<Long,Long>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2L) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<Long,Long> consumer : consumers) consumer.accept(a, b); };
//	}
//}
