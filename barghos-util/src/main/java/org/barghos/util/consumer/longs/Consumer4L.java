//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.Consumer4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four long input arguments and returns
// * no result. {@link Consumer4L} is expected to operate via side-effects.
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
//public interface Consumer4L extends Consumer4<Long,Long,Long,Long>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 */
//	void accept4L(long a, long b, long c, long d);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer4L} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer4L then4L(Consumer4L after)
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
//	 * @return A new {@link Consumer4L} performing the operation before and this
//	 * operation.
//	 */
//	default Consumer4L before4L(Consumer4L before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4L(a, b, c, d); accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4L} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4L of4L(Consumer4L... consumers)
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
//		return (a, b, c, d) -> { for(Consumer4L consumer : consumers) consumer.accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept4L(long, long, long, long)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Long a, Long b, Long c, Long d)
//	{
//		accept4L(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4L then(Consumer4<Long,Long,Long,Long> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4L(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4L} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default Consumer4L before(Consumer4<Long,Long,Long,Long> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4L(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4L} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4L of(Consumer4<Long,Long,Long,Long>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (Consumer4L) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(Consumer4<Long,Long,Long,Long> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
