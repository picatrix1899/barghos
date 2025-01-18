//package org.barghos.util.consumer.objs;
//
//import org.barghos.util.consumer.Consumer3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 3-dimensional object array input
// * arguments and returns no result. {@link Consumer3OA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3OA3(Object[][][], Object[][][], Object[][][])}
// * 
// * @see ConsumerOA3
// * @see ConsumerExOA3
// * @see Consumer2OA3
// * @see ConsumerEx2OA3
// * @see Consumer3OA3
// * @see ConsumerEx3OA3
// * @see Consumer4OA3
// * @see ConsumerEx4OA3
// */
//@FunctionalInterface
//public interface Consumer3OA3 extends Consumer3<Object[][][],Object[][][],Object[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 */
//	void accept3OA3(Object[][][] a, Object[][][] b, Object[][][] c);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer3OA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer3OA3 then3OA3(Consumer3OA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3OA3(a, b, c); after.accept3OA3(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer3OA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer3OA3 before3OA3(Consumer3OA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3OA3(a, b, c); accept3OA3(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3OA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3OA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3OA3 of3OA3(Consumer3OA3... consumers)
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
//		return (a, b, c) -> { for(Consumer3OA3 consumer : consumers) consumer.accept3OA3(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept3OA3(Object[][][], Object[][][], Object[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Object[][][] a, Object[][][] b, Object[][][] c)
//	{
//		accept3OA3(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3OA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3OA3 then(Consumer3<Object[][][],Object[][][],Object[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3OA3(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer3OA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer3OA3 before(Consumer3<Object[][][],Object[][][],Object[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3OA3(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer3OA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer3OA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer3OA3 of(Consumer3<Object[][][],Object[][][],Object[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (Consumer3OA3) consumers[0]::accept;
//
//		return (a, b, c) -> { for(Consumer3<Object[][][],Object[][][],Object[][][]> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
