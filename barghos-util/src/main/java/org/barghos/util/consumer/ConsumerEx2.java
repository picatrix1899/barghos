package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two input arguments and returns no result.
 *  Unlike {@link Consumer2} this may throw Exceptions.
 * {@link ConsumerEx2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #accept}.
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * 
 * @see Consumer
 * @see ConsumerEx
 * @see Consumer2
 * @see ConsumerEx2
 * @see Consumer3
 * @see ConsumerEx3
 * @see Consumer4
 * @see ConsumerEx4
 */
@FunctionalInterface
public interface ConsumerEx2<A,B>
{
	/**
     * Performs the operation on the given argument.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void accept(A a, B b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2} performing this operation and the operation after.
     */
    default ConsumerEx2<A,B> andThen(ConsumerEx2<A,B> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {accept(a, b); after.accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2<A,B> andThen(ConsumerEx2<A,B>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {accept(a, b); after[0].accept(a, b);};

    	return (a, b) -> {accept(a, b); for(ConsumerEx2<A,B> consumer : after) consumer.accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2} performing this operation and the operations after.
     */
	default ConsumerEx2<A,B> andThen(Iterable<ConsumerEx2<A,B>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {accept(a, b); for(ConsumerEx2<A,B> consumer : after) consumer.accept(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2} performing the operation before and this operation.
     */
    default ConsumerEx2<A,B> beforeThat(ConsumerEx2<A,B> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.accept(a, b); accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2<A,B> beforeThat(ConsumerEx2<A,B>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].accept(a, b); accept(a, b);};
    
    	return (a, b) -> {for(ConsumerEx2<A,B> consumer : before) consumer.accept(a, b); accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2} performing the operations before and this operation.
     */
    default ConsumerEx2<A,B> beforeThat(Iterable<ConsumerEx2<A,B>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2<A,B> consumer : before) consumer.accept(a, b); accept(a, b);};
    }
    
    /**
     * Composes a, b new {@link ConsumerEx2} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B> ConsumerEx2<A,B> inSequence(ConsumerEx2<A,B>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(ConsumerEx2<A,B> consumer : consumers) consumer.accept(a, b);};
    }
    
    /**
     * Composes a, b new {@link ConsumerEx2} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2} performing the operations.
     */
    static <A,B> ConsumerEx2<A,B> inSequence(Iterable<ConsumerEx2<A,B>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2<A,B> consumer : consumers) consumer.accept(a, b);};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a {@link Consumer2}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer2} performing the operations and exception handling.
     */
    default Consumer2<A,B> handled(ExceptionHandler handler)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(handler);
    	
    	return (a, b) -> {
    		try
    		{
    			accept(a, b);
    		}
    		catch(Exception e)
    		{
    			handler.handle(e);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer. As the passed
     * consumer may throw an exception the returned consumer is again a {@link ConsumerEx2} relaying
     * the exceptions of the passed consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx2} performing the operations.
     */
    default ConsumerEx2<A,B> onException(ConsumerEx2<A,B> consumer)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			accept(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer. As the passed
     * consumer can not throw an exception the returned consumer is a {@link Consumer2}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer2} performing the operations.
     */
    default Consumer2<A,B> onException(Consumer2<A,B> consumer)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			accept(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.accept(a, b);
    		}
    	};
    }
}
