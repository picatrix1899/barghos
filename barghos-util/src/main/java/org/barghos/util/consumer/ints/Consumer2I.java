//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two int input arguments and returns no
// * result. {@link Consumer2I} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2I(int, int)}
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
//public interface Consumer2I extends Consumer2<Integer,Integer>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2I(int a, int b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2I} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2I then2I(Consumer2I after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2I(a, b); after.accept2I(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2I} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2I before2I(Consumer2I before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2I(a, b); accept2I(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2I} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2I} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2I of2I(Consumer2I... consumers)
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
//		return (a, b) -> { for(Consumer2I consumer : consumers) consumer.accept2I(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2I} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2I then(Consumer2<Integer,Integer> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2I(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2I} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2I then(java.util.function.BiConsumer<? super Integer,? super Integer> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2I(a, b); after.accept(a, b); };
//	}
//	
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2I} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2I before(Consumer2<Integer,Integer> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2I(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2I} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2I before(java.util.function.BiConsumer<? super Integer,? super Integer> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2I(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2I} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2I} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2I of(Consumer2<Integer,Integer>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2I) consumers[0]::accept;
//		
//		return (a, b) -> { for(Consumer2<Integer,Integer> consumer : consumers) consumer.accept(a, b); };
//	}
//
//	/**
//	 * @deprecated Use {@link #accept2I(int, int)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Integer a, Integer b)
//	{
//		accept2I(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2I andThen(java.util.function.BiConsumer<? super Integer,? super Integer> after)
//	{
//		return then(after);
//	}
//}
