package org.barghos.util.consumer;

import org.barghos.validation.Assert;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 3-dimensional array input arguments and returns no
 * result.
 * {@link Consumer2A3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
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
public interface Consumer2A3<A,B> extends Consumer2<A[][][],B[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptArray(A[][][] a, B[][][] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2A3} performing this operation and the operation after.
     */
    default Consumer2A3<A,B> andThenArray(Consumer2A3<A,B> after)
    {
    	Assert.assertNotNull("after", after);
    	
    	return (a, b) -> {acceptArray(a, b); after.acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2A3} performing this operation and the operations after.
     */
	@SuppressWarnings("unchecked")
	default Consumer2A3<A,B> andThenArray(Consumer2A3<A,B>... after)
    {
		Assert.assertNotNull("after", after);
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptArray(a, b); after[0].acceptArray(a, b);};

    	return (a, b) -> {acceptArray(a, b); for(Consumer2A3<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2A3} performing this operation and the operations after.
     */
	default Consumer2A3<A,B> andThenArray(Iterable<Consumer2A3<A,B>> after)
    {
		Assert.assertNotNull("after", after);
		
    	return (a, b) -> {acceptArray(a, b); for(Consumer2A3<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2A3} performing the operation before and this operation.
     */
    default Consumer2A3<A,B> beforeThatArray(Consumer2A3<A,B> before)
    {
    	Assert.assertNotNull("before", before);
    	
    	return (a, b) -> {before.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2A3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
	default Consumer2A3<A,B> beforeThatArray(Consumer2A3<A,B>... before)
    {
    	Assert.assertNotNull("before", before);
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptArray(a, b); acceptArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2A3<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2A3} performing the operations before and this operation.
     */
    default Consumer2A3<A,B> beforeThatArray(Iterable<Consumer2A3<A,B>> before)
    {
    	Assert.assertNotNull("before", before);
    	
    	return (a, b) -> {for(Consumer2A3<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2A3} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B> Consumer2A3<A,B> inSequenceArray(Consumer2A3<A,B>... consumers)
    {
		Assert.assertNotNull("consumers", consumers);
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
    	
    	return (a, b) -> {for(Consumer2A3<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2A3} performing the operations.
     */
    static <A,B> Consumer2A3<A,B> inSequenceArray(Iterable<Consumer2A3<A,B>> consumers)
    {
    	Assert.assertNotNull("consumers", consumers);
    	
    	return (a, b) -> {for(Consumer2A3<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][][] a, B[][][] b)
    {
    	acceptArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2A3} performing this operation and the operation after.
     */
    default Consumer2A3<A,B> andThen(Consumer2<A[][][],B[][][]> after)
    {
    	Assert.assertNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof Consumer2A3<A,B>)
    	{
    		final Consumer2A3<A,B> originalAfter = (Consumer2A3<A,B>)after;
    		
    		return (a, b) -> {acceptArray(a, b); originalAfter.acceptArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2A3} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2A3<A,B> andThen(Consumer2<A[][][],B[][][]>... after)
    {
    	Assert.assertNotNull("after", after);
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
    		if(after[0] instanceof Consumer2A3<A,B>)
        	{
        		final Consumer2A3<A,B> originalAfter = (Consumer2A3<A,B>)after[0];
        		
        		return (a, b) -> {acceptArray(a, b); originalAfter.acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptArray(a, b);
			
    		for(Consumer2<A[][][],B[][][]> consumer : after)
    		{
    			if(consumer instanceof Consumer2A3<A,B>)
    				((Consumer2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2A3} performing this operation and the operations after.
     */
	default Consumer2A3<A,B> andThen(Iterable<Consumer2<A[][][],B[][][]>> after)
    {
		Assert.assertNotNull("after", after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
		return (a, b) -> {
			acceptArray(a, b);
			
    		for(Consumer2<A[][][],B[][][]> consumer : after)
    		{
    			if(consumer instanceof Consumer2A3<A,B>)
    				((Consumer2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2A3} performing the operation before and this operation.
     */
    default Consumer2A3<A,B> beforeThat(Consumer2<A[][][],B[][][]> before)
    {
    	Assert.assertNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(before instanceof Consumer2A3<A,B>)
    	{
    		final Consumer2A3<A,B> originalBefore = (Consumer2A3<A,B>)before;
    		
    		return (a, b) -> {originalBefore.acceptArray(a, b); acceptArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2A3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2A3<A,B> beforeThat(Consumer2<A[][][],B[][][]>... before)
    {
    	Assert.assertNotNull("before", before);
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
    		if(before[0] instanceof Consumer2A3<A,B>)
        	{
        		final Consumer2A3<A,B> originalBefore = (Consumer2A3<A,B>)before[0];
        		
        		return (a, b) -> {originalBefore.acceptArray(a, b); acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<A[][][],B[][][]> consumer : before)
    		{
    			if(consumer instanceof Consumer2A3<A,B>)
    				((Consumer2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptArray(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2A3} performing the operations before and this operation.
     */
    default Consumer2A3<A,B> beforeThat(Iterable<Consumer2<A[][][],B[][][]>> before)
    {
    	Assert.assertNotNull("before", before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<A[][][],B[][][]> consumer : before)
    		{
    			if(consumer instanceof Consumer2A3<A,B>)
    				((Consumer2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2A3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B> Consumer2A3<A,B> inSequence(Consumer2<A[][][],B[][][]>... consumers)
    {
    	Assert.assertNotNull("consumers", consumers);
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation is an instance of
    	 * the desired type return the operation directly without wrapping. Otherwise wrap the
    	 * original operation in an operation of the desired type. The optimization prevents
    	 * unnecessary auto-boxing if possible and also unnecessary creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer2A3<A,B>)
    			return (Consumer2A3<A,B>) consumers[0];
    		else
    			return (Consumer2A3<A,B>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<A[][][],B[][][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2A3<A,B>)
    				((Consumer2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2A3} performing the operations.
     */
    static <A,B> Consumer2A3<A,B> inSequence(Iterable<Consumer2<A[][][],B[][][]>> consumers)
    {
    	Assert.assertNotNull("consumers", consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<A[][][],B[][][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2A3<A,B>)
    				((Consumer2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2A3<A,B> andThen(java.util.function.BiConsumer<? super A[][][],? super B[][][]> after)
    {
    	Assert.assertNotNull("after", after);
    	
    	return (a, b) -> {acceptArray(a, b); after.accept(a, b);};
    }
}
