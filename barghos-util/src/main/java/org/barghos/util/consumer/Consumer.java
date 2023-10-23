package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one input argument and returns no
 * result. {@link Consumer} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #accept}.
 *
 * @param <A> The type of the first argument to the operation.
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
public interface Consumer<A> extends java.util.function.Consumer<A>
{
	/**
     * Performs the operation on the given argument.
     *
     * @param a The first input argument.
     */
    void accept(A a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer} performing this operation and the
     * operation after.
     */
    default Consumer<A> then(Consumer<A> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {accept(a); after.accept(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer<A> then(Consumer<A>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {accept(a); after[0].accept(a);};

    	return (a) -> {accept(a); for(Consumer<A> consumer : after) consumer.accept(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer} performing this operation and the
     * operations after.
     */
	default Consumer<A> then(java.util.List<Consumer<A>> after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
		
		int size = after.size();
		
		/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {accept(a); after.get(0).accept(a);};
		
    	return (a) -> {accept(a); for(Consumer<A> consumer : after) consumer.accept(a);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer} performing this operation and the
     * operations after.
     */
	default Consumer<A> then(Iterable<Consumer<A>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a) -> {accept(a); for(Consumer<A> consumer : after) consumer.accept(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer} performing the operation before and this
     * operation.
     */
    default Consumer<A> before(Consumer<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.accept(a); accept(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer<A> before(Consumer<A>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].accept(a); accept(a);};
    
    	return (a) -> {for(Consumer<A> consumer : before) consumer.accept(a); accept(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer} performing the operations before and this
     * operation.
     */
    default Consumer<A> before(java.util.List<Consumer<A>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {before.get(0).accept(a); accept(a);};
    
    	return (a) -> {for(Consumer<A> consumer : before) consumer.accept(a); accept(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer} performing the operations before and this
     * operation.
     */
    default Consumer<A> before(Iterable<Consumer<A>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {for(Consumer<A> consumer : before) consumer.accept(a); accept(a);};
    }
    
    /**
     * Composes a new {@link Consumer} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A> Consumer<A> sequence(Consumer<A>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(Consumer<A> consumer : consumers) consumer.accept(a);};
    }
    
    /**
     * Composes a new {@link Consumer} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer} performing the operations.
     */
	static <A> Consumer<A> sequence(java.util.List<Consumer<A>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	int size = consumers.size();
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a) -> {for(Consumer<A> consumer : consumers) consumer.accept(a);};
    }
    
    /**
     * Composes a new {@link Consumer} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer} performing the operations.
     */
    static <A> Consumer<A> sequence(Iterable<Consumer<A>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a) -> {for(Consumer<A> consumer : consumers) consumer.accept(a);};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumer<A> andThen(java.util.function.Consumer<? super A> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {accept(a); after.accept(a);};
    }
}
