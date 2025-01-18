//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one 2-dimensional short array input
// * argument and returns no result. {@link ConsumerSA2} is expected to operate
// * via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptSA2(short[][])}
// * 
// * @see ConsumerSA2
// * @see ConsumerExSA2
// * @see Consumer2SA2
// * @see ConsumerEx2SA2
// * @see Consumer3SA2
// * @see ConsumerEx3SA2
// * @see Consumer4SA2
// * @see ConsumerEx4SA2
// */
//@FunctionalInterface
//public interface ConsumerSA2 extends Consumer<short[][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptSA2(short[][] a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerSA2} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerSA2 thenSA2(ConsumerSA2 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptSA2(a); after.acceptSA2(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerSA2} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerSA2 beforeSA2(ConsumerSA2 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptSA2(a); acceptSA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerSA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerSA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerSA2 ofSA2(ConsumerSA2... consumers)
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
//		return (a) -> { for(ConsumerSA2 consumer : consumers) consumer.acceptSA2(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #acceptSA2(short[][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[][] a)
//	{
//		acceptSA2(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerSA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerSA2 then(Consumer<short[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptSA2(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerSA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerSA2 then(java.util.function.Consumer<? super short[][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptSA2(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerSA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerSA2 before(Consumer<short[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptSA2(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerSA2} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerSA2 before(java.util.function.Consumer<? super short[][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptSA2(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerSA2} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerSA2} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerSA2 of(Consumer<short[][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerSA2) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<short[][]> consumer : consumers) consumer.accept(a); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerSA2 andThen(java.util.function.Consumer<? super short[][]> after)
//	{
//		return then(after);
//	}
//}
