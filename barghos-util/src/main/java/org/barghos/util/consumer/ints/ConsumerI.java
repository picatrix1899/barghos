//package org.barghos.util.consumer.ints;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one int input argument and returns no
// * result. {@link ConsumerI} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptI(int)}
// * 
// * @see ConsumerI
// * @see ConsumerExI
// * @see Consumer2I
// * @see ConsumerEx2I
// * @see Consumer3I
// * @see ConsumerEx3I
// * @see Consumer4I
// * @see ConsumerEx4I
// */
//@FunctionalInterface
//public interface ConsumerI extends Consumer<Integer>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptI(int a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerI} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerI thenI(ConsumerI after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptI(a); after.acceptI(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerI} performing the operation before and this
//	 * operation.
//	 */
//	default ConsumerI beforeI(ConsumerI before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptI(a); acceptI(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerI} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerI} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerI ofI(ConsumerI... consumers)
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
//		return (a) -> { for(ConsumerI consumer : consumers) consumer.acceptI(a); };
//	}
//
//	/**
//	 * @deprecated Use {@link #acceptF(int)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(Integer a)
//	{
//		acceptI(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerI} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerI then(Consumer<Integer> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptI(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerI} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerI then(java.util.function.Consumer<? super Integer> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptI(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerI} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerI before(Consumer<Integer> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptI(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerI} performing the operation before and this
//	 * operation.
//	 */
//	@Override
//	default ConsumerI before(java.util.function.Consumer<? super Integer> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptI(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerI} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerI} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerI of(Consumer<Integer>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerI) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<Integer> consumer : consumers) consumer.accept(a); };
//	}
//
//	/**
//	 * @deprecated
//	 * 
//	 * Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerI andThen(java.util.function.Consumer<? super Integer> after)
//	{
//		return then(after);
//	}
//}
