package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional array input argument and returns no
 * result.
 * {@link ConsumerA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
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
public interface ConsumerA<A> extends Consumer<A[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptArray(A[] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerA} performing this operation and the operation after.
     */
    default ConsumerA<A> andThenArray(ConsumerA<A> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptArray(a); after.acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerA} performing this operation and the operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerA<A> andThenArray(ConsumerA<A>... after)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptArray(a); after[0].acceptArray(a);};

    	return (a) -> {acceptArray(a); for(ConsumerA<A> consumer : after) consumer.acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerA} performing this operation and the operations after.
     */
	default ConsumerA<A> andThenArray(Iterable<ConsumerA<A>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptArray(a); for(ConsumerA<A> consumer : after) consumer.acceptArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerA} performing the operation before and this operation.
     */
    default ConsumerA<A> beforeThatArray(ConsumerA<A> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerA} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerA<A> beforeThatArray(ConsumerA<A>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptArray(a); acceptArray(a);};
    	
    	return (a) -> {for(ConsumerA<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerA} performing the operations before and this operation.
     */
    default ConsumerA<A> beforeThatArray(Iterable<ConsumerA<A>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerA<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerA} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerA} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A> ConsumerA<A> inSequenceArray(ConsumerA<A>... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerA<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerA} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerA} performing the operations.
     */
    static <A> ConsumerA<A> inSequenceArray(Iterable<ConsumerA<A>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerA<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[] a)
    {
    	acceptArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerA} performing this operation and the operation after.
     */
    default ConsumerA<A> andThen(Consumer<A[]> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof ConsumerA<A>)
    	{
    		final ConsumerA<A> originalAfter = (ConsumerA<A>)after;
    		
    		return (a) -> {acceptArray(a); originalAfter.acceptArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerA} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerA<A> andThen(Consumer<A[]>... after)
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
    		if(after[0] instanceof ConsumerA<A>)
        	{
        		final ConsumerA<A> originalAfter = (ConsumerA<A>)after[0];
        		
        		return (a) -> {acceptArray(a); originalAfter.acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptArray(a);
			
    		for(Consumer<A[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerA<A>)
    				((ConsumerA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerA} performing this operation and the operations after.
     */
	default ConsumerA<A> andThen(Iterable<Consumer<A[]>> after)
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
		return (a) -> {
			acceptArray(a);
			
    		for(Consumer<A[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerA<A>)
    				((ConsumerA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerA} performing the operation before and this operation.
     */
    default ConsumerA<A> beforeThat(Consumer<A[]> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(before instanceof ConsumerA<A>)
    	{
    		final ConsumerA<A> originalBefore = (ConsumerA<A>)before;
    		
    		return (a) -> {originalBefore.acceptArray(a); acceptArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerA} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerA<A> beforeThat(Consumer<A[]>... before)
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
    		if(before[0] instanceof ConsumerA<A>)
        	{
        		final ConsumerA<A> originalBefore = (ConsumerA<A>)before[0];
        		
        		return (a) -> {originalBefore.acceptArray(a); acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<A[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerA<A>)
    				((ConsumerA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptArray(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerA} performing the operations before and this operation.
     */
    default ConsumerA<A> beforeThat(Iterable<Consumer<A[]>> before)
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
    	return (a) -> {
    		for(Consumer<A[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerA<A>)
    				((ConsumerA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerA} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A> ConsumerA<A> inSequence(Consumer<A[]>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation is an instance of
    	 * the desired type return the operation directly without wrapping. Otherwise wrap the
    	 * original operation in an operation of the desired type. The optimization prevents
    	 * unnecessary auto-boxing if possible and also unnecessary creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerA<A>)
    			return (ConsumerA<A>) consumers[0];
    		else
    			return (ConsumerA<A>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<A[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerA<A>)
    				((ConsumerA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerA} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerA} performing the operations.
     */
    static <A> ConsumerA<A> inSequence(Iterable<Consumer<A[]>> consumers)
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
    	return (a) -> {
    		for(Consumer<A[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerA<A>)
    				((ConsumerA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerA<A> andThen(java.util.function.Consumer<? super A[]> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptArray(a); after.accept(a);};
    }
}
