//package org.barghos.util.consumer.objs;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 3-dimensional object array input
// * argument and returns no result. {@link ConsumerOA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptOA3(Object[][][])}
// * 
// * @see ConsumerOA3
// * @see ConsumerExOA3
// * @see Consumer2OA3
// * @see ConsumerEx2OA3
// * @see Consumer3OA3
// * @see ConsumerEx3OA3
// * @see Consumer4OA3
// * @see ConsumerEx4OA3
// */
//@FunctionalInterface
//public interface ConsumerOA3 extends Consumer<Object[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptOA3(Object[][][] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerOA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerOA3 thenOA3(ConsumerOA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptOA3(a); after.acceptOA3(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerOA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerOA3 beforeOA3(ConsumerOA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptOA3(a); acceptOA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerOA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerOA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerOA3 ofOA3(ConsumerOA3... consumers)
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
//		return (a) -> { for(ConsumerOA3 consumer : consumers) consumer.acceptOA3(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptOA3(Object[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Object[][][] a)
//	{
//		acceptOA3(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerOA3 then(Consumer<Object[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptOA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerOA3 then(java.util.function.Consumer<? super Object[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptOA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerOA3 before(Consumer<Object[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptOA3(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerOA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerOA3 before(java.util.function.Consumer<? super Object[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptOA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerOA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerOA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerOA3 of(Consumer<Object[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerOA3) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<Object[][][]> consumer : consumers) consumer.accept(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerOA3 andThen(java.util.function.Consumer<? super Object[][][]> after)
//	{
//		return then(after);
//	}
//}
