package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 1-dimensional array input
 * arguments and returns no result. {@link Consumer3A} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
 * 
 * @see ConsumerA
 * @see ConsumerExA
 * @see Consumer2A
 * @see ConsumerEx2A
 * @see Consumer3A
 * @see ConsumerEx3A
 * @see Consumer4A
 * @see ConsumerEx4A
 */
@FunctionalInterface
public interface Consumer3A<A,B,C> extends Consumer3<A[],B[],C[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptArray(A[] a, B[] b, C[] c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3A} performing this operation and the
     * operation after.
     */
    default Consumer3A<A,B,C> andThenArray(Consumer3A<A,B,C> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptArray(a, b, c); after.acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A} performing this operation and the
     * operations after.
     */
	@SuppressWarnings("unchecked")
	default Consumer3A<A,B,C> andThenArray(Consumer3A<A,B,C>... after)
    {
		Validation.validateNotNull("after", after);
		
		/*
    	 * The argument array can be empty but must not be null. Also no entry
    	 * must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptArray(a, b, c); after[0].acceptArray(a, b, c);};

    	return (a, b, c) -> {acceptArray(a, b, c); for(Consumer3A<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A} performing this operation and the
     * operations after.
     */
	default Consumer3A<A,B,C> andThenArray(Iterable<Consumer3A<A,B,C>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull("after", after);
		
    	return (a, b, c) -> {acceptArray(a, b, c); for(Consumer3A<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3A} performing the operation before and this
     * operation.
     */
    default Consumer3A<A,B,C> beforeThatArray(Consumer3A<A,B,C> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
	default Consumer3A<A,B,C> beforeThatArray(Consumer3A<A,B,C>... before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * The argument array can be empty but must not be null. Also no entry
    	 * must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptArray(a, b, c); acceptArray(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3A<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A} performing the operations before and
     * this operation.
     */
    default Consumer3A<A,B,C> beforeThatArray(Iterable<Consumer3A<A,B,C>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {for(Consumer3A<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B,C> Consumer3A<A,B,C> inSequenceArray(Consumer3A<A,B,C>... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		
		/*
    	 * The argument array can be empty but must not be null. Also no entry
    	 * must be null.
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
    	
    	return (a, b, c) -> {for(Consumer3A<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A} performing the operations.
     */
    static <A,B,C> Consumer3A<A,B,C> inSequenceArray(Iterable<Consumer3A<A,B,C>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a, b, c) -> {for(Consumer3A<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[] a, B[] b, C[] c)
    {
    	acceptArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3A} performing this operation and the
     * operation after.
     */
    default Consumer3A<A,B,C> andThen(Consumer3<A[],B[],C[]> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof Consumer3A<A,B,C>)
    	{
    		final Consumer3A<A,B,C> originalAfter = (Consumer3A<A,B,C>)after;
    		
    		return (a, b, c) -> {acceptArray(a, b, c); originalAfter.acceptArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3A<A,B,C> andThen(Consumer3<A[],B[],C[]>... after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
    	 * The argument array can be empty but must not be null. Also no entry
    	 * must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(after.length == 1)
    	{
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type
    		 * to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer3A<A,B,C>)
        	{
        		final Consumer3A<A,B,C> originalAfter = (Consumer3A<A,B,C>)after[0];
        		
        		return (a, b, c) -> {acceptArray(a, b, c); originalAfter.acceptArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptArray(a, b, c);
			
    		for(Consumer3<A[],B[],C[]> consumer : after)
    		{
    			if(consumer instanceof Consumer3A<A,B,C>)
    				((Consumer3A<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A} performing this operation and the
     * operations after.
     */
	default Consumer3A<A,B,C> andThen(Iterable<Consumer3<A[],B[],C[]>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull("after", after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
		return (a, b, c) -> {
			acceptArray(a, b, c);
			
    		for(Consumer3<A[],B[],C[]> consumer : after)
    		{
    			if(consumer instanceof Consumer3A<A,B,C>)
    				((Consumer3A<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3A} performing the operation before and this
     * operation.
     */
    default Consumer3A<A,B,C> beforeThat(Consumer3<A[],B[],C[]> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to
		 * avoid boxing.
		 */
    	if(before instanceof Consumer3A<A,B,C>)
    	{
    		final Consumer3A<A,B,C> originalBefore = (Consumer3A<A,B,C>)before;
    		
    		return (a, b, c) -> {originalBefore.acceptArray(a, b, c); acceptArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3A<A,B,C> beforeThat(Consumer3<A[],B[],C[]>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry
    	 * must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(before.length == 1)
    	{
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type
    		 * to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer3A<A,B,C>)
        	{
        		final Consumer3A<A,B,C> originalBefore = (Consumer3A<A,B,C>)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptArray(a, b, c); acceptArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<A[],B[],C[]> consumer : before)
    		{
    			if(consumer instanceof Consumer3A<A,B,C>)
    				((Consumer3A<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptArray(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A} performing the operations before and
     * this operation.
     */
    default Consumer3A<A,B,C> beforeThat(Iterable<Consumer3<A[],B[],C[]>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<A[],B[],C[]> consumer : before)
    		{
    			if(consumer instanceof Consumer3A<A,B,C>)
    				((Consumer3A<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B,C> Consumer3A<A,B,C> inSequence(Consumer3<A[],B[],C[]>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly
    	 * without wrapping. Otherwise wrap the original operation in an
    	 * operation of the desired type. The optimization prevents unnecessary
    	 * auto-boxing if possible and also unnecessary creation of a new
    	 * operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer3A<A,B,C>)
    			return (Consumer3A<A,B,C>) consumers[0];
    		else
    			return (Consumer3A<A,B,C>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<A[],B[],C[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3A<A,B,C>)
    				((Consumer3A<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A} performing the operations.
     */
    static <A,B,C> Consumer3A<A,B,C> inSequence(Iterable<Consumer3<A[],B[],C[]>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<A[],B[],C[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3A<A,B,C>)
    				((Consumer3A<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
