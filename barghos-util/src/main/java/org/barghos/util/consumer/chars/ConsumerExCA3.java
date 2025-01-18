//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 3-dimensional char array input
// * arguments and returns no result. Unlike {@link ConsumerCA3} this may throw
// * exceptions. {@link ConsumerExCA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptCA3(char[][][])}
// * 
// * @see ConsumerCA3
// * @see ConsumerExCA3
// * @see Consumer2CA3
// * @see ConsumerEx2CA3
// * @see Consumer3CA3
// * @see ConsumerEx3CA3
// * @see Consumer4CA3
// * @see ConsumerEx4CA3
// */
//@FunctionalInterface
//public interface ConsumerExCA3 extends ConsumerEx<char[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptCA3(char[][][] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExCA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExCA3 thenCA3(ConsumerExCA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptCA3(a); after.acceptCA3(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExCA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExCA3 beforeCA3(ConsumerExCA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptCA3(a); acceptCA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExCA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExCA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExCA3 ofCA3(ConsumerExCA3... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//		
//		/*
//		 * If exactly one operation is passed return the operation.
//		 */
//		if(consumers.length == 1) return consumers[0];
//		
//		return (a) -> { for(ConsumerExCA3 consumer : consumers) consumer.acceptCA3(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptCA3(char[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[][][] a) throws Exception
//	{
//		acceptCA3(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExCA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExCA3 then(ConsumerEx<char[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptCA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExCA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExCA3 before(ConsumerEx<char[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptCA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExCA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExCA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExCA3 of(ConsumerEx<char[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExCA3) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<char[][][]> consumer : consumers) consumer.accept(a); };
//	}
//}
