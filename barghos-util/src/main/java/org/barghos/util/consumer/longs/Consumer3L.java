//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three long input arguments and returns
// * no result. {@link Consumer3L} is expected to operate via side-effects.
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
//public interface Consumer3L extends Consumer3<Long,Long,Long>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3L(long a, long b, long c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3L} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3L then3L(Consumer3L after)
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
//	 * @return A new {@link Consumer3L} performing the operation before and this
//	 * operation.
//	 */
//	default Consumer3L before3L(Consumer3L before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3L(a, b, c); accept3L(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3L} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3L of3L(Consumer3L... consumers)
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
//		return (a, b, c) -> { for(Consumer3L consumer : consumers) consumer.accept3L(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3L(long, long, long)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Long a, Long b, Long c)
//	{
//		accept3L(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3L} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3L then(Consumer3<Long,Long,Long> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3L(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3L} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default Consumer3L before(Consumer3<Long,Long,Long> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3L(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3L} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3L} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3L of(Consumer3<Long,Long,Long>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (Consumer3L) consumers[0]::accept;
//		
//		return (a, b, c) -> { for(Consumer3<Long,Long,Long> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
