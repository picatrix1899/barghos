package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three object input arguments and returns no result.
 * {@link Consumer3obj} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptObject(Object, Object, Object)}.
 * 
 * @see Consumerobj
 * @see ConsumerExobj
 * @see Consumer2obj
 * @see ConsumerEx2obj
 * @see Consumer3obj
 * @see ConsumerEx3obj
 * @see Consumer4obj
 * @see ConsumerEx4obj
 */
@FunctionalInterface
public interface Consumer3obj extends Consumer3<Object,Object,Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptObject(Object a, Object b, Object c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3obj} performing this operation and the operation after.
     */
    default Consumer3obj andThenObject(Consumer3obj after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptObject(a, b, c); after.acceptObject(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3obj} performing this operation and the operations after.
     */
	default Consumer3obj andThenObject(Consumer3obj... after)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptObject(a, b, c); after[0].acceptObject(a, b, c);};

    	return (a, b, c) -> {acceptObject(a, b, c); for(Consumer3obj consumer : after) consumer.acceptObject(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3obj} performing this operation and the operations after.
     */
	default Consumer3obj andThenObject(Iterable<Consumer3obj> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptObject(a, b, c); for(Consumer3obj consumer : after) consumer.acceptObject(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3obj} performing the operation before and this operation.
     */
    default Consumer3obj beforeThatObject(Consumer3obj before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptObject(a, b, c); acceptObject(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3obj} performing the operations before and this operation.
     */
    default Consumer3obj beforeThatObject(Consumer3obj... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptObject(a, b, c); acceptObject(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3obj consumer : before) consumer.acceptObject(a, b, c); acceptObject(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3obj} performing the operations before and this operation.
     */
    default Consumer3obj beforeThatObject(Iterable<Consumer3obj> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3obj consumer : before) consumer.acceptObject(a, b, c); acceptObject(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3obj} performing the operations.
     */
	static Consumer3obj inSequenceObject(Consumer3obj... consumers)
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
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(Consumer3obj consumer : consumers) consumer.acceptObject(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3obj} performing the operations.
     */
    static Consumer3obj inSequenceObject(Iterable<Consumer3obj> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3obj consumer : consumers) consumer.acceptObject(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a, Object b, Object c)
    {
    	acceptObject(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3obj} performing this operation and the operation after.
     */
    default Consumer3obj andThen(Consumer3<Object,Object,Object> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3obj)
    	{
    		final Consumer3obj originalAfter = (Consumer3obj)after;
    		
    		return (a, b, c) -> {acceptObject(a, b, c); originalAfter.acceptObject(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptObject(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3obj} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3obj andThen(Consumer3<Object,Object,Object>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer3obj)
        	{
        		final Consumer3obj originalAfter = (Consumer3obj)after[0];
        		
        		return (a, b, c) -> {acceptObject(a, b, c); originalAfter.acceptObject(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptObject(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptObject(a, b, c);
			
    		for(Consumer3<Object,Object,Object> consumer : after)
    		{
    			if(consumer instanceof Consumer3obj)
    				((Consumer3obj)consumer).acceptObject(a, b, c);
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
     * @return A new {@link Consumer3obj} performing this operation and the operations after.
     */
	default Consumer3obj andThen(Iterable<Consumer3<Object,Object,Object>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
		return (a, b, c) -> {
			acceptObject(a, b, c);
			
    		for(Consumer3<Object,Object,Object> consumer : after)
    		{
    			if(consumer instanceof Consumer3obj)
    				((Consumer3obj)consumer).acceptObject(a, b, c);
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
     * @return A new {@link Consumer3obj} performing the operation before and this operation.
     */
    default Consumer3obj beforeThat(Consumer3<Object,Object,Object> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3obj)
    	{
    		final Consumer3obj originalBefore = (Consumer3obj)before;
    		
    		return (a, b, c) -> {originalBefore.acceptObject(a, b, c); acceptObject(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptObject(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3obj} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3obj beforeThat(Consumer3<Object,Object,Object>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer3obj)
        	{
        		final Consumer3obj originalBefore = (Consumer3obj)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptObject(a, b, c); acceptObject(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptObject(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Object,Object,Object> consumer : before)
    		{
    			if(consumer instanceof Consumer3obj)
    				((Consumer3obj)consumer).acceptObject(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptObject(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3obj} performing the operations before and this operation.
     */
    default Consumer3obj beforeThat(Iterable<Consumer3<Object,Object,Object>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Object,Object,Object> consumer : before)
    		{
    			if(consumer instanceof Consumer3obj)
    				((Consumer3obj)consumer).acceptObject(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptObject(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3obj} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3obj inSequence(Consumer3<Object,Object,Object>... consumers)
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
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer3obj)
    			return (Consumer3obj) consumers[0];
    		else
    			return (Consumer3obj) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Object,Object,Object> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3obj)
    				((Consumer3obj)consumer).acceptObject(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3obj} performing the operations.
     */
    static Consumer3obj inSequence(Iterable<Consumer3<Object,Object,Object>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Object,Object,Object> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3obj)
    				((Consumer3obj)consumer).acceptObject(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
