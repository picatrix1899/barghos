//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts four 1-dimensional char array input
// * arguments and returns no result. Unlike {@link Consumer4C} this may throw
// * exceptions. {@link ConsumerEx4C} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept4C(char, char, char, char)}
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
//public interface ConsumerEx4C extends ConsumerEx4<Character,Character,Character,Character>
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
//	void accept4C(char a, char b, char c, char d) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4C} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx4C then4C(ConsumerEx4C after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> { accept4C(a, b, c, d); after.accept4C(a, b, c, d); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx4C} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx4C before4C(ConsumerEx4C before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b, c, d) -> { before.accept4C(a, b, c, d); accept4C(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4C} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4C} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4C of4C(ConsumerEx4C... consumers)
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
//		return (a, b, c, d) -> { for(ConsumerEx4C consumer : consumers) consumer.accept4C(a, b, c, d); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept4C(char, char, char, char)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Character a, Character b, Character c, Character d) throws Exception
//	{
//		accept4C(a, b, c, d);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4C} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4C then(ConsumerEx4<Character,Character,Character,Character> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b, c, d) -> { accept4C(a, b, c, d); after.accept(a, b, c, d); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx4C} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx4C before(ConsumerEx4<Character,Character,Character,Character> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4C(a, b, c, d); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx4C} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx4C} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx4C of(ConsumerEx4<Character,Character,Character,Character>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b, c, d) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx4C) consumers[0]::accept;
//
//		return (a, b, c, d) -> { for(ConsumerEx4<Character,Character,Character,Character> consumer : consumers) consumer.accept(a, b, c, d); };
//	}
//}
