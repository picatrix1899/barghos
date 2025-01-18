//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 1-dimensional long array input
// * arguments and returns no result. Unlike {@link Consumer3L} this may throw
// * exceptions. {@link ConsumerEx3L} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3L(long, long, long)}
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
//public interface ConsumerEx3L extends ConsumerEx3<Long,Long,Long>
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
//	void accept3L(long a, long b, long c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3L} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3L then3L(ConsumerEx3L after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3L(a, b, c); after.accept3L(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3L} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx3L before3L(ConsumerEx3L before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3L(a, b, c); accept3L(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3L} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3L of3L(ConsumerEx3L... consumers)
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
//		return (a, b, c) -> { for(ConsumerEx3L consumer : consumers) consumer.accept3L(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3L(long, long, long)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Long a, Long b, Long c) throws Exception
//	{
//		accept3L(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3L then(ConsumerEx3<Long,Long,Long> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3L(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3L before(ConsumerEx3<Long,Long,Long> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3L(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3L} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3L of(ConsumerEx3<Long,Long,Long>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3L) consumers[0]::accept;
//
//		return (a, b, c) -> { for(ConsumerEx3<Long,Long,Long> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
