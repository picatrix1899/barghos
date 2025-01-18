//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 1-dimensional long array input
// * arguments and returns no result. Unlike {@link Consumer4L} this may throw
// * exceptions. {@link ConsumerEx4L} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4L(long, long, long, long)}
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
//public interface ConsumerEx4L extends ConsumerEx4<Long,Long,Long,Long>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept4L(long a, long b, long c, long d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4L} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4L then4L(ConsumerEx4L after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4L(a, b, c, d); after.accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4L} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4L before4L(ConsumerEx4L before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4L(a, b, c, d); accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4L} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4L of4L(ConsumerEx4L... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a, b, c, d) -> { for(ConsumerEx4L consumer : consumers) consumer.accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept4L(long, long, long, long)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Long a, Long b, Long c, Long d) throws Exception
//	{
//		accept4L(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4L then(ConsumerEx4<Long,Long,Long,Long> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4L(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4L before(ConsumerEx4<Long,Long,Long,Long> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4L} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4L of(ConsumerEx4<Long,Long,Long,Long>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4L) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<Long,Long,Long,Long> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
