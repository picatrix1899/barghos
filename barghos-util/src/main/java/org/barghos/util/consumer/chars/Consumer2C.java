//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.Consumer2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two char input arguments and returns no
// * result. {@link Consumer2C} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2C(char, char)}
// * 
// * @see ConsumerC
// * @see ConsumerExC
// * @see Consumer2C
// * @see ConsumerEx2C
// * @see Consumer3C
// * @see ConsumerEx3C
// * @see Consumer4C
// * @see ConsumerEx4C
// */
//@FunctionalInterface
//public interface Consumer2C extends Consumer2<Character,Character>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 */
//	void accept2C(char a, char b);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link Consumer2C} performing this operation and the
//	 * operation after.
//	 */
//	default Consumer2C then2C(Consumer2C after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2C(a, b); after.accept2C(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link Consumer2C} performing the operation before and
//	 * this operation.
//	 */
//	default Consumer2C before2C(Consumer2C before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2C(a, b); accept2C(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2C} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2C} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2C of2C(Consumer2C... consumers)
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
//		return (a, b) -> { for(Consumer2C consumer : consumers) consumer.accept2C(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2C} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2C then(Consumer2<Character,Character> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2C(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2C} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default Consumer2C then(java.util.function.BiConsumer<? super Character,? super Character> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2C(a, b); after.accept(a, b); };
//	}
//	
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2C} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2C before(Consumer2<Character,Character> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2C(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link Consumer2C} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default Consumer2C before(java.util.function.BiConsumer<? super Character,? super Character> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept(a, b); accept2C(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link Consumer2C} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link Consumer2C} performing the operations.
//	 */
//	@SafeVarargs
//	static Consumer2C of(Consumer2<Character,Character>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (Consumer2C) consumers[0]::accept;
//		
//		return (a, b) -> { for(Consumer2<Character,Character> consumer : consumers) consumer.accept(a, b); };
//	}
//
//	/**
//	 * @deprecated Use {@link #accept2C(char, char)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Character a, Character b)
//	{
//		accept2C(a, b);
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default Consumer2C andThen(java.util.function.BiConsumer<? super Character,? super Character> after)
//	{
//		return then(after);
//	}
//}
