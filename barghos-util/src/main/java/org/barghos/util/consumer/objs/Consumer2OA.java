//package org.barghos.util.consumer.objs;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 1-dimensional object array input
// * arguments and returns no result. {@link Consumer2OA} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2OA(Object[], Object[])}
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
//public interface Consumer2OA extends Consumer2<Object[],Object[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2OA(Object[] a, Object[] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2OA} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2OA then2OA(Consumer2OA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2OA(a, b); after.accept2OA(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2OA} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2OA before2OA(Consumer2OA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2OA(a, b); accept2OA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2OA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2OA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2OA of2OA(Consumer2OA... consumers)
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
//		return (a, b) -> { for(Consumer2OA consumer : consumers) consumer.accept2OA(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2OA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2OA then(Consumer2<Object[],Object[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2OA(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2OA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2OA then(java.util.function.BiConsumer<? super Object[],? super Object[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2OA(a, b); after.accept(a, b); };
//	}
//	
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2OA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2OA before(Consumer2<Object[],Object[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2OA(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2OA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2OA before(java.util.function.BiConsumer<? super Object[],? super Object[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2OA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2OA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2OA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2OA of(Consumer2<Object[],Object[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2OA) consumers[0]::accept;
//		
//		return (a, b) -> { for(Consumer2<Object[],Object[]> consumer : consumers) consumer.accept(a, b); };
//	}
//
//	/**
//	 * @deprecated Use {@link #accept2OA(Object[], Object[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Object[] a, Object[] b)
//	{
//		accept2OA(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2OA andThen(java.util.function.BiConsumer<? super Object[],? super Object[]> after)
//	{
//		return then(after);
//	}
//}
