package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four 3-dimensional array input arguments and returns no
 * result.
 * {@link Consumer4A3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
 * @param <D> The type of the fourth argument to the operation.
 * 
 * @see ConsumerA3
 * @see ConsumerExA3
 * @see Consumer2A3
 * @see ConsumerEx2A3
 * @see Consumer3A3
 * @see ConsumerEx3A3
 * @see Consumer4A3
 * @see ConsumerEx4A3
 */
@FunctionalInterface
public interface Consumer4A3<A,B,C,D>extends Consumer4<A[][][],B[][][],C[][][],D[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptArray(A[][][] a, B[][][] b, C[][][] c, D[][][] d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4A3} performing this operation and the operation after.
     */
    default Consumer4A3<A,B,C,D> andThenArray(Consumer4A3<A,B,C,D> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptArray(a, b, c, d); after.acceptArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4A3} performing this operation and the operations after.
     */
	@SuppressWarnings("unchecked")
	default Consumer4A3<A,B,C,D> andThenArray(Consumer4A3<A,B,C,D>... after)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptArray(a, b, c, d); after[0].acceptArray(a, b, c, d);};

    	return (a, b, c, d) -> {acceptArray(a, b, c, d); for(Consumer4A3<A,B,C,D> consumer : after) consumer.acceptArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4A3} performing this operation and the operations after.
     */
	default Consumer4A3<A,B,C,D> andThenArray(Iterable<Consumer4A3<A,B,C,D>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptArray(a, b, c, d); for(Consumer4A3<A,B,C,D> consumer : after) consumer.acceptArray(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4A3} performing the operation before and this operation.
     */
    default Consumer4A3<A,B,C,D> beforeThatArray(Consumer4A3<A,B,C,D> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptArray(a, b, c, d); acceptArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4A3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
	default Consumer4A3<A,B,C,D> beforeThatArray(Consumer4A3<A,B,C,D>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptArray(a, b, c, d); acceptArray(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4A3<A,B,C,D> consumer : before) consumer.acceptArray(a, b, c, d); acceptArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4A3} performing the operations before and this operation.
     */
    default Consumer4A3<A,B,C,D> beforeThatArray(Iterable<Consumer4A3<A,B,C,D>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(Consumer4A3<A,B,C,D> consumer : before) consumer.acceptArray(a, b, c, d); acceptArray(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4A3} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B,C,D> Consumer4A3<A,B,C,D> inSequenceArray(Consumer4A3<A,B,C,D>... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4A3<A,B,C,D> consumer : consumers) consumer.acceptArray(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4A3} performing the operations.
     */
    static <A,B,C,D> Consumer4A3<A,B,C,D> inSequenceArray(Iterable<Consumer4A3<A,B,C,D>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(Consumer4A3<A,B,C,D> consumer : consumers) consumer.acceptArray(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][][] a, B[][][] b, C[][][] c, D[][][] d)
    {
    	acceptArray(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4A3} performing this operation and the operation after.
     */
    default Consumer4A3<A,B,C,D> andThen(Consumer4<A[][][],B[][][],C[][][],D[][][]> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof Consumer4A3<A,B,C,D>)
    	{
    		final Consumer4A3<A,B,C,D> originalAfter = (Consumer4A3<A,B,C,D>)after;
    		
    		return (a, b, c, d) -> {acceptArray(a, b, c, d); originalAfter.acceptArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptArray(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4A3} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4A3<A,B,C,D> andThen(Consumer4<A[][][],B[][][],C[][][],D[][][]>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
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
    		 * If the passed operation is an instance of the desired type use it as the desired type
    		 * to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer4A3<A,B,C,D>)
        	{
        		final Consumer4A3<A,B,C,D> originalAfter = (Consumer4A3<A,B,C,D>)after[0];
        		
        		return (a, b, c, d) -> {acceptArray(a, b, c, d); originalAfter.acceptArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptArray(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptArray(a, b, c, d);
			
    		for(Consumer4<A[][][],B[][][],C[][][],D[][][]> consumer : after)
    		{
    			if(consumer instanceof Consumer4A3<A,B,C,D>)
    				((Consumer4A3<A,B,C,D>)consumer).acceptArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4A3} performing this operation and the operations after.
     */
	default Consumer4A3<A,B,C,D> andThen(Iterable<Consumer4<A[][][],B[][][],C[][][],D[][][]>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
		return (a, b, c, d) -> {
			acceptArray(a, b, c, d);
			
    		for(Consumer4<A[][][],B[][][],C[][][],D[][][]> consumer : after)
    		{
    			if(consumer instanceof Consumer4A3<A,B,C,D>)
    				((Consumer4A3<A,B,C,D>)consumer).acceptArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4A3} performing the operation before and this operation.
     */
    default Consumer4A3<A,B,C,D> beforeThat(Consumer4<A[][][],B[][][],C[][][],D[][][]> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(before instanceof Consumer4A3<A,B,C,D>)
    	{
    		final Consumer4A3<A,B,C,D> originalBefore = (Consumer4A3<A,B,C,D>)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptArray(a, b, c, d); acceptArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptArray(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4A3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4A3<A,B,C,D> beforeThat(Consumer4<A[][][],B[][][],C[][][],D[][][]>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
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
    		 * If the passed operation is an instance of the desired type use it as the desired type
    		 * to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer4A3<A,B,C,D>)
        	{
        		final Consumer4A3<A,B,C,D> originalBefore = (Consumer4A3<A,B,C,D>)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptArray(a, b, c, d); acceptArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptArray(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<A[][][],B[][][],C[][][],D[][][]> consumer : before)
    		{
    			if(consumer instanceof Consumer4A3<A,B,C,D>)
    				((Consumer4A3<A,B,C,D>)consumer).acceptArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptArray(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4A3} performing the operations before and this operation.
     */
    default Consumer4A3<A,B,C,D> beforeThat(Iterable<Consumer4<A[][][],B[][][],C[][][],D[][][]>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<A[][][],B[][][],C[][][],D[][][]> consumer : before)
    		{
    			if(consumer instanceof Consumer4A3<A,B,C,D>)
    				((Consumer4A3<A,B,C,D>)consumer).acceptArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4A3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B,C,D> Consumer4A3<A,B,C,D> inSequence(Consumer4<A[][][],B[][][],C[][][],D[][][]>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation is an instance of
    	 * the desired type return the operation directly without wrapping. Otherwise wrap the
    	 * original operation in an operation of the desired type. The optimization prevents
    	 * unnecessary auto-boxing if possible and also unnecessary creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer4A3<A,B,C,D>)
    			return (Consumer4A3<A,B,C,D>) consumers[0];
    		else
    			return (Consumer4A3<A,B,C,D>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<A[][][],B[][][],C[][][],D[][][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4A3<A,B,C,D>)
    				((Consumer4A3<A,B,C,D>)consumer).acceptArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer4A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * @param <D> The type of the fourth argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4A3} performing the operations.
     */
    static <A,B,C,D> Consumer4A3<A,B,C,D> inSequence(Iterable<Consumer4<A[][][],B[][][],C[][][],D[][][]>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<A[][][],B[][][],C[][][],D[][][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4A3<A,B,C,D>)
    				((Consumer4A3<A,B,C,D>)consumer).acceptArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
