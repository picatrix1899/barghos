//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 1-dimensional short array input
// * arguments and returns no result. Unlike {@link Consumer4SA} this may throw
// * exceptions. {@link ConsumerEx4SA} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4SA(short[], short[], short[], short[])}
// * 
// * @see ConsumerSA
// * @see ConsumerExSA
// * @see Consumer2SA
// * @see ConsumerEx2SA
// * @see Consumer3SA
// * @see ConsumerEx3SA
// * @see Consumer4SA
// * @see ConsumerEx4SA
// */
//@FunctionalInterface
//public interface ConsumerEx4SA extends ConsumerEx4<short[],short[],short[],short[]>
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
//	void accept4SA(short[] a, short[] b, short[] c, short[] d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4SA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4SA then4SA(ConsumerEx4SA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4SA(a, b, c, d); after.accept4SA(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4SA} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4SA before4SA(ConsumerEx4SA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4SA(a, b, c, d); accept4SA(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4SA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4SA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4SA of4SA(ConsumerEx4SA... consumers)
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
//		return (a, b, c, d) -> { for(ConsumerEx4SA consumer : consumers) consumer.accept4SA(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept4SA(short[], short[], short[], short[])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[] a, short[] b, short[] c, short[] d) throws Exception
//	{
//		accept4SA(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4SA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4SA then(ConsumerEx4<short[],short[],short[],short[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4SA(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4SA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4SA before(ConsumerEx4<short[],short[],short[],short[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4SA(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4SA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4SA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4SA of(ConsumerEx4<short[],short[],short[],short[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4SA) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<short[],short[],short[],short[]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
