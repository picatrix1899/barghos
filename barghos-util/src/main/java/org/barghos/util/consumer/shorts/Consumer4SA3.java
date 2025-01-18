//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.Consumer4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 3-dimensional short array input
// * arguments and returns no result. {@link Consumer4SA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4SA3(short[][][], short[][][], short[][][], short[][][])}
// * 
// * @see ConsumerSA3
// * @see ConsumerExSA3
// * @see Consumer2SA3
// * @see ConsumerEx2SA3
// * @see Consumer3SA3
// * @see ConsumerEx3SA3
// * @see Consumer4SA3
// * @see ConsumerEx4SA3
// */
//@FunctionalInterface
//public interface Consumer4SA3 extends Consumer4<short[][][],short[][][],short[][][],short[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * @param c The third input argument.
//	 * @param d The fourth input argument.
//	 */
//	void accept4SA3(short[][][] a, short[][][] b, short[][][] c, short[][][] d);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer4SA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer4SA3 then4SA3(Consumer4SA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4SA3(a, b, c, d); after.accept4SA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer4SA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer4SA3 before4SA3(Consumer4SA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4SA3(a, b, c, d); accept4SA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4SA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4SA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4SA3 of4SA3(Consumer4SA3... consumers)
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
//		return (a, b, c, d) -> { for(Consumer4SA3 consumer : consumers) consumer.accept4SA3(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use
//	 * {@link #accept4SA3(short[][][], short[][][], short[][][], short[][][])}
//	 * instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[][][] a, short[][][] b, short[][][] c, short[][][] d)
//	{
//		accept4SA3(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4SA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4SA3 then(Consumer4<short[][][],short[][][],short[][][],short[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4SA3(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer4SA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer4SA3 before(Consumer4<short[][][],short[][][],short[][][],short[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4SA3(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer4SA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer4SA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer4SA3 of(Consumer4<short[][][],short[][][],short[][][],short[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (Consumer4SA3) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(Consumer4<short[][][],short[][][],short[][][],short[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
