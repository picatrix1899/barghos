//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 1-dimensional short array input
// * arguments and returns no result. {@link Consumer2SA} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2SA(short[], short[])}
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
//public interface Consumer2SA extends Consumer2<short[],short[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2SA(short[] a, short[] b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2SA} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2SA then2SA(Consumer2SA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2SA(a, b); after.accept2SA(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2SA} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2SA before2SA(Consumer2SA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2SA(a, b); accept2SA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2SA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2SA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2SA of2SA(Consumer2SA... consumers)
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
//		return (a, b) -> { for(Consumer2SA consumer : consumers) consumer.accept2SA(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2SA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2SA then(Consumer2<short[],short[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2SA(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2SA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2SA then(java.util.function.BiConsumer<? super short[],? super short[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2SA(a, b); after.accept(a, b); };
//	}
//	
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2SA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2SA before(Consumer2<short[],short[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2SA(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2SA} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2SA before(java.util.function.BiConsumer<? super short[],? super short[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2SA(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2SA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2SA} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2SA of(Consumer2<short[],short[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2SA) consumers[0]::accept;
//		
//		return (a, b) -> { for(Consumer2<short[],short[]> consumer : consumers) consumer.accept(a, b); };
//	}
//
//	/**
//	 * @deprecated Use {@link #accept2SA(short[], short[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[] a, short[] b)
//	{
//		accept2SA(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2SA andThen(java.util.function.BiConsumer<? super short[],? super short[]> after)
//	{
//		return then(after);
//	}
//}
