package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four input arguments and returns no
 * result. {@link Consumer4} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #accept}.
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
 * @param <D> The type of the fourth argument to the operation.
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
public interface Consumer4<A,B,C,D>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void accept(A a, B b, C c, D d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4} performing this operation and the
     * operation after.
     */
    default Consumer4<A,B,C,D> then(Consumer4<A,B,C,D> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {accept(a, b, c, d); after.accept(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4<A,B,C,D> then(Consumer4<A,B,C,D>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {accept(a, b, c, d); after[0].accept(a, b, c, d);};

    	return (a, b, c, d) -> {accept(a, b, c, d); for(Consumer4<A,B,C,D> consumer : after) consumer.accept(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4} performing this operation and the
     * operations after.
     */
	default Consumer4<A,B,C,D> then(java.util.List<Consumer4<A,B,C,D>> after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	int size = after.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b, c, d) -> {accept(a, b, c, d); after.get(0).accept(a, b, c, d);};

    	return (a, b, c, d) -> {accept(a, b, c, d); for(Consumer4<A,B,C,D> consumer : after) consumer.accept(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4} performing this operation and the
     * operations after.
     */
	default Consumer4<A,B,C,D> then(Iterable<Consumer4<A,B,C,D>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a, b, c, d) -> {accept(a, b, c, d); for(Consumer4<A,B,C,D> consumer : after) consumer.accept(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4} performing the operation before and this
     * operation.
     */
    default Consumer4<A,B,C,D> before(Consumer4<A,B,C,D> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.accept(a, b, c, d); accept(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4<A,B,C,D> before(Consumer4<A,B,C,D>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].accept(a, b, c, d); accept(a, b, c, d);};
    
    	return (a, b, c, d) -> {for(Consumer4<A,B,C,D> consumer : before) consumer.accept(a, b, c, d); accept(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4} performing the operations before and this
     * operation.
     */
    default Consumer4<A,B,C,D> before(java.util.List<Consumer4<A,B,C,D>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b, c, d) -> {before.get(0).accept(a, b, c, d); accept(a, b, c, d);};
    
    	return (a, b, c, d) -> {for(Consumer4<A,B,C,D> consumer : before) consumer.accept(a, b, c, d); accept(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4} performing the operations before and this
     * operation.
     */
    default Consumer4<A,B,C,D> before(Iterable<Consumer4<A,B,C,D>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {for(Consumer4<A,B,C,D> consumer : before) consumer.accept(a, b, c, d); accept(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4} performing the given operations
     * in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B,C,D> Consumer4<A,B,C,D> sequence(Consumer4<A,B,C,D>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4<A,B,C,D> consumer : consumers) consumer.accept(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4} performing the given operations
     * in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4} performing the operations.
     */
	static <A,B,C,D> Consumer4<A,B,C,D> sequence(java.util.List<Consumer4<A,B,C,D>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	int size = consumers.size();
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a, b, c, d) -> {for(Consumer4<A,B,C,D> consumer : consumers) consumer.accept(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4} performing the given operations
     * in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4} performing the operations.
     */
    static <A,B,C,D> Consumer4<A,B,C,D> sequence(Iterable<Consumer4<A,B,C,D>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a, b, c, d) -> {for(Consumer4<A,B,C,D> consumer : consumers) consumer.accept(a, b, c, d);};
    }
}
