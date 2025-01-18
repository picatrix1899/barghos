//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.ConsumerEx;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional long array input
// * arguments and returns no result. Unlike {@link ConsumerL} this may throw
// * exceptions. {@link ConsumerExL} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptL(long)}
// * 
// * @see ConsumerL
// * @see ConsumerExL
// * @see Consumer2L
// * @see ConsumerEx2L
// * @see Consumer3L
// * @see ConsumerEx3L
// * @see Consumer4L
// * @see ConsumerEx4L
// */
//@FunctionalInterface
//public interface ConsumerExL extends ConsumerEx<Long>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void acceptL(long a) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerExL} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerExL thenL(ConsumerExL after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptL(a); after.acceptL(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerExL} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerExL beforeL(ConsumerExL before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptL(a); acceptL(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExL} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExL} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExL ofL(ConsumerExL... consumers)
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
//		return (a) -> { for(ConsumerExL consumer : consumers) consumer.acceptL(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptF(Long)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Long a) throws Exception
//	{
//		acceptL(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExL} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExL then(ConsumerEx<Long> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptL(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerExL} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerExL before(ConsumerEx<Long> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptL(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerExL} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerExL} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerExL of(ConsumerEx<Long>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerExL) consumers[0]::accept;
//
//		return (a) -> { for(ConsumerEx<Long> consumer : consumers) consumer.accept(a); };
//	}
//}
