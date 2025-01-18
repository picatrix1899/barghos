//package org.barghos.util.consumer.strings;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents an operation that accepts one string input argument and returns no
// * result. {@link ConsumerStr} is expected to operate via side-effects.
// *
// * <p>
// * This is a functional interface.
// * 
// * <p>
// * Functional Method:
// * {@link #acceptStr(String)}
// * 
// * @see ConsumerStr
// * @see ConsumerExF
// * @see Consumer2F
// * @see ConsumerEx2F
// * @see Consumer3F
// * @see ConsumerEx3F
// * @see Consumer4F
// * @see ConsumerEx4F
// */
//@FunctionalInterface
//public interface ConsumerStr extends Consumer<String>
//{
//	/**
//	 * Performs the operation on the given arguments.
//	 *
//	 * @param a The first input argument.
//	 */
//	void acceptStr(String a);
//	
//	/**
//	 * Performs the given operation after this operation.
//	 * 
//	 * @param after The operation to perform after this operation.
//	 * 
//	 * @return A new {@link ConsumerStr} performing this operation and the
//	 * operation after.
//	 */
//	default ConsumerStr thenStr(ConsumerStr after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a) -> { acceptStr(a); after.acceptStr(a); };
//	}
//	
//	/**
//	 * Performs the given operation before this operation.
//	 * 
//	 * @param before The operation to perform before this operation.
//	 * 
//	 * @return A new {@link ConsumerStr} performing the operation before and
//	 * this operation.
//	 */
//	default ConsumerStr beforeStr(ConsumerStr before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//		
//		return (a) -> { before.acceptStr(a); acceptStr(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerStr} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerStr} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerStr ofStr(ConsumerStr... consumers)
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
//		return (a) -> { for(ConsumerStr consumer : consumers) consumer.acceptStr(a); };
//	}
//
//	/**
//	 * @deprecated Use {@link #acceptStr(String)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default void accept(String a)
//	{
//		acceptStr(a);
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerStr} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerStr then(Consumer<String> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptStr(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerStr} performing this operation and the
//	 * operation after.
//	 */
//	@Override
//	default ConsumerStr then(java.util.function.Consumer<? super String> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//
//		return (a) -> { acceptStr(a); after.accept(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerStr} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default ConsumerStr before(Consumer<String> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptStr(a); };
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @return A new {@link ConsumerStr} performing the operation before and
//	 * this operation.
//	 */
//	@Override
//	default ConsumerStr before(java.util.function.Consumer<? super String> before)
//	{
//		ParameterValidation.pvNotNull("before", before);
//
//		return (a) -> { before.accept(a); acceptStr(a); };
//	}
//	
//	/**
//	 * Composes a new {@link ConsumerStr} performing the given operations in
//	 * sequence.
//	 * 
//	 * @param consumers The operations to perform.
//	 * 
//	 * @return A new {@link ConsumerStr} performing the operations.
//	 */
//	@SafeVarargs
//	static ConsumerStr of(Consumer<String>... consumers)
//	{
//		ParameterValidation.pvNotNull("consumers", consumers);
//		ParameterValidation.pvEntriesNotNull("consumers", consumers);
//		
//		/*
//		 * If no operations are passed return empty operation.
//		 */
//		if(consumers.length == 0) return (a) -> {};
//
//		if(consumers.length == 1) return (ConsumerStr) consumers[0]::accept;
//
//		return (a) -> { for(Consumer<String> consumer : consumers) consumer.accept(a); };
//	}
//
//	/**
//	 * @deprecated
//	 * 
//	 * Use {@link #then(java.util.function.Consumer)} instead.
//	 */
//	@Override
//	@Deprecated(since = "1.0", forRemoval = false)
//	default ConsumerStr andThen(java.util.function.Consumer<? super String> after)
//	{
//		return then(after);
//	}
//}
