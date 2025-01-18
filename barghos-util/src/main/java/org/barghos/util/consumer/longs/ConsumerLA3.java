//package org.barghos.util.consumer.longs;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 3-dimensional long array input
// * argument and returns no result. {@link ConsumerLA3} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptLA3(long[][][])}
// * 
// * @see ConsumerLA3
// * @see ConsumerExLA3
// * @see Consumer2LA3
// * @see ConsumerEx2LA3
// * @see Consumer3LA3
// * @see ConsumerEx3LA3
// * @see Consumer4LA3
// * @see ConsumerEx4LA3
// */
//@FunctionalInterface
//public interface ConsumerLA3 extends Consumer<long[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptLA3(long[][][] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerLA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerLA3 thenLA3(ConsumerLA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptLA3(a); after.acceptLA3(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerLA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerLA3 beforeLA3(ConsumerLA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptLA3(a); acceptLA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerLA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerLA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerLA3 ofLA3(ConsumerLA3... consumers)
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
//		return (a) -> { for(ConsumerLA3 consumer : consumers) consumer.acceptLA3(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptLA3(long[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(long[][][] a)
//	{
//		acceptLA3(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerLA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerLA3 then(Consumer<long[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptLA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerLA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerLA3 then(java.util.function.Consumer<? super long[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptLA3(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerLA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerLA3 before(Consumer<long[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptLA3(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerLA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerLA3 before(java.util.function.Consumer<? super long[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptLA3(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerLA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerLA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerLA3 of(Consumer<long[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerLA3) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<long[][][]> consumer : consumers) consumer.accept(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerLA3 andThen(java.util.function.Consumer<? super long[][][]> after)
//	{
//		return then(after);
//	}
//}
