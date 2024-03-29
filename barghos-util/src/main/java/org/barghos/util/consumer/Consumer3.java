package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three input arguments and returns no result.
 * {@link Consumer3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #accept}.
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
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
public interface Consumer3<A,B,C>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void accept(A a, B b, C c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3} performing this operation and the operation after.
     */
    default Consumer3<A,B,C> andThen(Consumer3<A,B,C> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {accept(a, b, c); after.accept(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3<A,B,C> andThen(Consumer3<A,B,C>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {accept(a, b, c); after[0].accept(a, b, c);};

    	return (a, b, c) -> {accept(a, b, c); for(Consumer3<A,B,C> consumer : after) consumer.accept(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3} performing this operation and the operations after.
     */
	default Consumer3<A,B,C> andThen(Iterable<Consumer3<A,B,C>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {accept(a, b, c); for(Consumer3<A,B,C> consumer : after) consumer.accept(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3} performing the operation before and this operation.
     */
    default Consumer3<A,B,C> beforeThat(Consumer3<A,B,C> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.accept(a, b, c); accept(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3<A,B,C> beforeThat(Consumer3<A,B,C>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].accept(a, b, c); accept(a, b, c);};
    
    	return (a, b, c) -> {for(Consumer3<A,B,C> consumer : before) consumer.accept(a, b, c); accept(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3} performing the operations before and this operation.
     */
    default Consumer3<A,B,C> beforeThat(Iterable<Consumer3<A,B,C>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3<A,B,C> consumer : before) consumer.accept(a, b, c); accept(a, b, c);};
    }
    
    /**
     * Composes a, b, c new {@link Consumer3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B,C> Consumer3<A,B,C> inSequence(Consumer3<A,B,C>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(Consumer3<A,B,C> consumer : consumers) consumer.accept(a, b, c);};
    }
    
    /**
     * Composes a, b, c new {@link Consumer3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3} performing the operations.
     */
    static <A,B,C> Consumer3<A,B,C> inSequence(Iterable<Consumer3<A,B,C>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3<A,B,C> consumer : consumers) consumer.accept(a, b, c);};
    }
}
