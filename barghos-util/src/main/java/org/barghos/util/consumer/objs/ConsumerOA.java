//package org.barghos.util.consumer.objs;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 1-dimensional object array input
// * argument and returns no result. {@link ConsumerOA} is expected to operate via
// * side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptOA(Object[])}
// * 
// * @see ConsumerOA
// * @see ConsumerExOA
// * @see Consumer2OA
// * @see ConsumerEx2OA
// * @see Consumer3OA
// * @see ConsumerEx3OA
// * @see Consumer4OA
// * @see ConsumerEx4OA
// */
//@FunctionalInterface
//public interface ConsumerOA extends Consumer<Object[]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptOA(Object[] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerOA} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerOA thenOA(ConsumerOA after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptOA(a); after.acceptOA(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerOA} performing the operation before and this
//	 * operation.
//	 */
//	default ConsumerOA beforeOA(ConsumerOA before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptOA(a); acceptOA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerOA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerOA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerOA ofOA(ConsumerOA... consumers)
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
//		return (a) -> { for(ConsumerOA consumer : consumers) consumer.acceptOA(a); };
//	}
//
//	/**
//	 * @deprecated Use {@link #acceptOA(Object[])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Object[] a)
//	{
//		acceptOA(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerOA then(Consumer<Object[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptOA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerOA then(java.util.function.Consumer<? super Object[]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptOA(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerOA before(Consumer<Object[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptOA(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerOA before(java.util.function.Consumer<? super Object[]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptOA(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerOA} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerOA} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerOA of(Consumer<Object[]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerOA) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<Object[]> consumer : consumers) consumer.accept(a); };
//	}
//
//	/**
//	 * @deprecated
//	 * 
//	 * Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerOA andThen(java.util.function.Consumer<? super Object[]> after)
//	{
//		return then(after);
//	}
//}
