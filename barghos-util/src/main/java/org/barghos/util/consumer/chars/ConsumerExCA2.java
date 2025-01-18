//package org.barghos.util.consumer.chars;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 2-dimensional char array input
// * arguments and returns no result. Unlike {@link ConsumerCA2} this may throw
// * exceptions. {@link ConsumerExCA2} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptCA2(char[][])}
// * 
// * @see ConsumerCA2
// * @see ConsumerExCA2
// * @see Consumer2CA2
// * @see ConsumerEx2CA2
// * @see Consumer3CA2
// * @see ConsumerEx3CA2
// * @see Consumer4CA2
// * @see ConsumerEx4CA2
// */
//@FunctionalInterface
//public interface ConsumerExCA2 extends ConsumerEx<char[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptCA2(char[][] a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExCA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExCA2 thenCA2(ConsumerExCA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptCA2(a); after.acceptCA2(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExCA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExCA2 beforeCA2(ConsumerExCA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptCA2(a); acceptCA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExCA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExCA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExCA2 ofCA2(ConsumerExCA2... consumers)
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
//		return (a) -> { for(ConsumerExCA2 consumer : consumers) consumer.acceptCA2(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptCA2(char[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(char[][] a) throws Exception
//	{
//		acceptCA2(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExCA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExCA2 then(ConsumerEx<char[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptCA2(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExCA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExCA2 before(ConsumerEx<char[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptCA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExCA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExCA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExCA2 of(ConsumerEx<char[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExCA2) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<char[][]> consumer : consumers) consumer.accept(a); };
//	}
//}
