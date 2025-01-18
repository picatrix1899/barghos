//package org.barghos.util.consumer.shorts;
//
//import org.barghos.util.consumer.ConsumerEx2;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts two 3-dimensional short array input
// * arguments and returns no result. Unlike {@link Consumer2SA3} this may throw
// * exceptions. {@link ConsumerEx2SA3} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #accept2SA3(short[][][], short[][][])}.
// * 
// * @see ConsumerSA3
// * @see ConsumerExSA3
// * @see Consumer2SA3
// * @see ConsumerEx2SA3
// * @see Consumer3SA3
// * @see ConsumerEx3SA3
// * @see Consumer4SA3
// * @see ConsumerEx4SA3
// */
//@FunctionalInterface
//public interface ConsumerEx2SA3 extends ConsumerEx2<short[][][],short[][][]>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 * @param b The second input argument.
//	 * 
//	 * @throws Exception May throw an exception during operation.
//	 */
//	void accept2SA3(short[][][] a, short[][][] b) throws Exception;
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2SA3} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerEx2SA3 then2SA3(ConsumerEx2SA3 after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b) -> { accept2SA3(a, b); after.accept2SA3(a, b); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerEx2SA3} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerEx2SA3 before2SA3(ConsumerEx2SA3 before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a, b) -> { before.accept2SA3(a, b); accept2SA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2SA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2SA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2SA3 of2SA3(ConsumerEx2SA3... consumers)
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
//		return (a, b) -> { for(ConsumerEx2SA3 consumer : consumers) consumer.accept2SA3(a, b); };
//	}
//	
//	/**
//	 * @deprecated Use {@link #accept2SA3(short[][][], short[][][])} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(short[][][] a, short[][][] b) throws Exception
//	{
//		accept2SA3(a, b);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2SA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2SA3 then(ConsumerEx2<short[][][],short[][][]> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a, b) -> { accept2SA3(a, b); after.accept(a, b); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerEx2SA3} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerEx2SA3 before(ConsumerEx2<short[][][],short[][][]> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a, b) -> { before.accept(a, b); accept2SA3(a, b); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerEx2SA3} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerEx2SA3} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerEx2SA3 of(ConsumerEx2<short[][][],short[][][]>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a, b) -> {};
//
//		if(consumers.length == 1) return (ConsumerEx2SA3) consumers[0]::accept;
//
//		return (a, b) -> { for(ConsumerEx2<short[][][],short[][][]> consumer : consumers) consumer.accept(a, b); };
//	}
//}
