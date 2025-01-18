//package org.barghos.util.consumer.objs;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 1-dimensional object array input
// * arguments and returns no result. {@link Consumer3OA} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3OA(Object[], Object[], Object[])}
// * 
// * @see ConsumerOA
// * @see ConsumerExOA
// * @see Consumer2OA
// * @see ConsumerEx2OA
// * @see Consumer3OA
// * @see ConsumerEx3OA
// * @see Consumer4OA
// * @see ConsumerEx4OA
// */
//@FunctionalInterface
//public interface Consumer3OA extends Consumer3<Object[],Object[],Object[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3OA(Object[] a, Object[] b, Object[] c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3OA} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3OA then3OA(Consumer3OA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3OA(a, b, c); after.accept3OA(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer3OA} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer3OA before3OA(Consumer3OA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3OA(a, b, c); accept3OA(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3OA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3OA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3OA of3OA(Consumer3OA... consumers)
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
//		return (a, b, c) -> { for(Consumer3OA consumer : consumers) consumer.accept3OA(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3OA(Object[], Object[], Object[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Object[] a, Object[] b, Object[] c)
//	{
//		accept3OA(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3OA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3OA then(Consumer3<Object[],Object[],Object[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3OA(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3OA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer3OA before(Consumer3<Object[],Object[],Object[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3OA(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3OA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3OA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3OA of(Consumer3<Object[],Object[],Object[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (Consumer3OA) consumers[0]::accept;
//		
//		return (a, b, c) -> { for(Consumer3<Object[],Object[],Object[]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
