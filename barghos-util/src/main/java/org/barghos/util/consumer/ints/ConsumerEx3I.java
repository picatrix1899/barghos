//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 1-dimensional int array input
// * arguments and returns no result. Unlike {@link Consumer3I} this may throw
// * exceptions. {@link ConsumerEx3I} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3I(int, int, int)}
// * 
// * @see ConsumerI
// * @see ConsumerExI
// * @see Consumer2I
// * @see ConsumerEx2I
// * @see Consumer3I
// * @see ConsumerEx3I
// * @see Consumer4I
// * @see ConsumerEx4I
// */
//@FunctionalInterface
//public interface ConsumerEx3I extends ConsumerEx3<Integer,Integer,Integer>
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
//	void accept3I(int a, int b, int c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3I} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3I then3I(ConsumerEx3I after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3I(a, b, c); after.accept3I(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3I} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx3I before3I(ConsumerEx3I before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3I(a, b, c); accept3I(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3I} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3I} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3I of3I(ConsumerEx3I... consumers)
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
//		return (a, b, c) -> { for(ConsumerEx3I consumer : consumers) consumer.accept3I(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3I(int, int, int)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Integer a, Integer b, Integer c) throws Exception
//	{
//		accept3I(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3I} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3I then(ConsumerEx3<Integer,Integer,Integer> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3I(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3I} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3I before(ConsumerEx3<Integer,Integer,Integer> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3I(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3I} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3I} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3I of(ConsumerEx3<Integer,Integer,Integer>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3I) consumers[0]::accept;
//
//		return (a, b, c) -> { for(ConsumerEx3<Integer,Integer,Integer> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
