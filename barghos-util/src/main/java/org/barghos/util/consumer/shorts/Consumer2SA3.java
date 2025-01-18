//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional short array input
// * arguments and returns no result. {@link Consumer2SA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2SA3(short[][][], short[][][])}
// * 
// * @see ConsumerSA3
// * @see ConsumerExSA3
// * @see Consumer2SA3
// * @see ConsumerEx2SA3
// * @see Consumer3FA2
// * @see ConsumerEx3SA3
// * @see Consumer4SA3
// * @see ConsumerEx4SA3
// */
//@FunctionalInterface
//public interface Consumer2SA3 extends Consumer2<short[][][],short[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2SA3(short[][][] a, short[][][] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2SA3} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2SA3 then2SA3(Consumer2SA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2SA3(a, b); after.accept2SA3(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2SA3} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2SA3 before2SA3(Consumer2SA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2SA3(a, b); accept2SA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2SA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2SA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2SA3 of2SA3(Consumer2SA3... consumers)
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
//		return (a, b) -> { for(Consumer2SA3 consumer : consumers) consumer.accept2SA3(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2SA3 then(Consumer2<short[][][],short[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2SA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2SA3 then(java.util.function.BiConsumer<? super short[][][],? super short[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2SA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2SA3 before(Consumer2<short[][][],short[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2SA3(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2F3} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2SA3 before(java.util.function.BiConsumer<? super short[][][],? super short[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2SA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2SA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2SA3} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2SA3 of(Consumer2<short[][][],short[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2SA3) consumers[0]::accept;
//
//		return (a, b) -> { for(Consumer2<short[][][],short[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2SA3(short[][][], short[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[][][] a, short[][][] b)
//	{
//		accept2SA3(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2SA3 andThen(java.util.function.BiConsumer<? super short[][][],? super short[][][]> after)
//	{
//		return then(after);
//	}
//}
