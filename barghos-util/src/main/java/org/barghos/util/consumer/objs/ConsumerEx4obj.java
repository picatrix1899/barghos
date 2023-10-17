package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four object input argument and returns no result.
 * Unlike {@link Consumer4obj} this may throw Exceptions.
 * {@link ConsumerEx4obj} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptObject(Object, Object, Object, Object)}.
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
public interface ConsumerEx4obj extends ConsumerEx4<Object,Object,Object,Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObject(Object a, Object b, Object c, Object d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing this operation and the operation after.
     */
    default ConsumerEx4obj andThenObject(ConsumerEx4obj after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptObject(a, b, c, d); after.acceptObject(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing this operation and the operations after.
     */
	default ConsumerEx4obj andThenObject(ConsumerEx4obj... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptObject(a, b, c, d); after[0].acceptObject(a, b, c, d);};

    	return (a, b, c, d) -> {acceptObject(a, b, c, d); for(ConsumerEx4obj consumer : after) consumer.acceptObject(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing this operation and the operations after.
     */
	default ConsumerEx4obj andThenObject(Iterable<ConsumerEx4obj> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptObject(a, b, c, d); for(ConsumerEx4obj consumer : after) consumer.acceptObject(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operation before and this operation.
     */
    default ConsumerEx4obj beforeThatObject(ConsumerEx4obj before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations before and this operation.
     */
    default ConsumerEx4obj beforeThatObject(ConsumerEx4obj... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4obj consumer : before) consumer.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations before and this operation.
     */
    default ConsumerEx4obj beforeThatObject(Iterable<ConsumerEx4obj> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4obj consumer : before) consumer.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations.
     */
	static ConsumerEx4obj inSequenceObject(ConsumerEx4obj... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4obj consumer : consumers) consumer.acceptObject(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations.
     */
    static ConsumerEx4obj inSequenceObject(Iterable<ConsumerEx4obj> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4obj consumer : consumers) consumer.acceptObject(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a, Object b, Object c, Object d) throws Exception
    {
    	acceptObject(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing this operation and the operation after.
     */
    default ConsumerEx4obj andThen(ConsumerEx4<Object,Object,Object,Object> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4obj)
    	{
    		final ConsumerEx4obj originalAfter = (ConsumerEx4obj)after;
    		
    		return (a, b, c, d) -> {acceptObject(a, b, c, d); originalAfter.acceptObject(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptObject(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4obj andThen(ConsumerEx4<Object,Object,Object,Object>... after)
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
    		if(after[0] instanceof ConsumerEx4obj)
        	{
        		final ConsumerEx4obj originalAfter = (ConsumerEx4obj)after[0];
        		
        		return (a, b, c, d) -> {acceptObject(a, b, c, d); originalAfter.acceptObject(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptObject(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptObject(a, b, c, d);
			
    		for(ConsumerEx4<Object,Object,Object,Object> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4obj)
    				((ConsumerEx4obj)consumer).acceptObject(a, b, c, d);
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
     * @return A new {@link ConsumerEx4obj} performing this operation and the operations after.
     */
	default ConsumerEx4obj andThen(Iterable<ConsumerEx4<Object,Object,Object,Object>> after)
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
		return (a, b, c, d) -> {
			acceptObject(a, b, c, d);
			
    		for(ConsumerEx4<Object,Object,Object,Object> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4obj)
    				((ConsumerEx4obj)consumer).acceptObject(a, b, c, d);
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
     * @return A new {@link ConsumerEx4obj} performing the operation before and this operation.
     */
    default ConsumerEx4obj beforeThat(ConsumerEx4<Object,Object,Object,Object> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4obj)
    	{
    		final ConsumerEx4obj originalBefore = (ConsumerEx4obj)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptObject(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4obj beforeThat(ConsumerEx4<Object,Object,Object,Object>... before)
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
    		if(before[0] instanceof ConsumerEx4obj)
        	{
        		final ConsumerEx4obj originalBefore = (ConsumerEx4obj)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptObject(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Object,Object,Object,Object> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4obj)
    				((ConsumerEx4obj)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptObject(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations before and this operation.
     */
    default ConsumerEx4obj beforeThat(Iterable<ConsumerEx4<Object,Object,Object,Object>> before)
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
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Object,Object,Object,Object> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4obj)
    				((ConsumerEx4obj)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptObject(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4obj inSequence(ConsumerEx4<Object,Object,Object,Object>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerEx4obj)
    			return (ConsumerEx4obj) consumers[0];
    		else
    			return (ConsumerEx4obj) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Object,Object,Object,Object> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4obj)
    				((ConsumerEx4obj)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4obj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4obj} performing the operations.
     */
    static ConsumerEx4obj inSequence(Iterable<ConsumerEx4<Object,Object,Object,Object>> consumers)
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
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Object,Object,Object,Object> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4obj)
    				((ConsumerEx4obj)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
