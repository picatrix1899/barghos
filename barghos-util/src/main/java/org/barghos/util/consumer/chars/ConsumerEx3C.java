//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx3;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts three 1-dimensional char array input
// * arguments and returns no result. Unlike {@link Consumer3C} this may throw
// * exceptions. {@link ConsumerEx3C} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept3C(char, char, char)}
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
//public interface ConsumerEx3C extends ConsumerEx3<Character,Character,Character>
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
//	void accept3C(char a, char b, char c) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3C} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx3C then3C(ConsumerEx3C after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> { accept3C(a, b, c); after.accept3C(a, b, c); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx3C} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx3C before3C(ConsumerEx3C before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c) -> { before.accept3C(a, b, c); accept3C(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3C} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3C} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3C of3C(ConsumerEx3C... consumers)
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
//		return (a, b, c) -> { for(ConsumerEx3C consumer : consumers) consumer.accept3C(a, b, c); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept3C(char, char, char)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Character a, Character b, Character c) throws Exception
//	{
//		accept3C(a, b, c);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3C} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3C then(ConsumerEx3<Character,Character,Character> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c) -> { accept3C(a, b, c); after.accept(a, b, c); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx3C} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx3C before(ConsumerEx3<Character,Character,Character> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c) -> { before.accept(a, b, c); accept3C(a, b, c); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx3C} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx3C} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx3C of(ConsumerEx3<Character,Character,Character>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx3C) consumers[0]::accept;
//
//		return (a, b, c) -> { for(ConsumerEx3<Character,Character,Character> consumer : consumers) consumer.accept(a, b, c); };
//	}
//}
