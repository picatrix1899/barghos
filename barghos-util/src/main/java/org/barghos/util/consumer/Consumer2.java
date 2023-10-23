package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result. {@link Consumer2} is expected to operate via side-effects.
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
public interface Consumer2<A,B> extends java.util.function.BiConsumer<A,B>
{
	/**
     * Performs the operation on the given argument.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void accept(A a, B b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2} performing this operation and the
     * operation after.
     */
    default Consumer2<A,B> then(Consumer2<A,B> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {accept(a, b); after.accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2<A,B> then(Consumer2<A,B>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {accept(a, b); after[0].accept(a, b);};

    	return (a, b) -> {accept(a, b); for(Consumer2<A,B> consumer : after) consumer.accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2} performing this operation and the
     * operations after.
     */
	default Consumer2<A,B> then(java.util.List<Consumer2<A,B>> after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	int size = after.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b) -> {accept(a, b); after.get(0).accept(a, b);};

    	return (a, b) -> {accept(a, b); for(Consumer2<A,B> consumer : after) consumer.accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2} performing this operation and the
     * operations after.
     */
	default Consumer2<A,B> then(Iterable<Consumer2<A,B>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a, b) -> {accept(a, b); for(Consumer2<A,B> consumer : after) consumer.accept(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2} performing the operation before and this
     * operation.
     */
    default Consumer2<A,B> before(Consumer2<A,B> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.accept(a, b); accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2<A,B> before(Consumer2<A,B>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].accept(a, b); accept(a, b);};
    
    	return (a, b) -> {for(Consumer2<A,B> consumer : before) consumer.accept(a, b); accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2} performing the operations before and this
     * operation.
     */
    default Consumer2<A,B> before(java.util.List<Consumer2<A,B>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b) -> {before.get(0).accept(a, b); accept(a, b);};
    
    	return (a, b) -> {for(Consumer2<A,B> consumer : before) consumer.accept(a, b); accept(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2} performing the operations before and this
     * operation.
     */
    default Consumer2<A,B> before(Iterable<Consumer2<A,B>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {for(Consumer2<A,B> consumer : before) consumer.accept(a, b); accept(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B> Consumer2<A,B> sequence(Consumer2<A,B>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2<A,B> consumer : consumers) consumer.accept(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2} performing the operations.
     */
	static <A,B> Consumer2<A,B> sequence(java.util.List<Consumer2<A,B>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	int size = consumers.size();
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a, b) -> {for(Consumer2<A,B> consumer : consumers) consumer.accept(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2} performing the operations.
     */
    static <A,B> Consumer2<A,B> sequence(Iterable<Consumer2<A,B>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a, b) -> {for(Consumer2<A,B> consumer : consumers) consumer.accept(a, b);};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2<A,B> andThen(java.util.function.BiConsumer<? super A,? super B> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {accept(a, b); after.accept(a, b);};
    }
}