package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one object input argument and returns no result.
 * {@link Consumerobj} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptObject(Object)}.
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
public interface Consumerobj extends Consumer<Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptObject(Object a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerobj} performing this operation and the operation after.
     */
    default Consumerobj andThenObject(Consumerobj after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptObject(a); after.acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerobj} performing this operation and the operations after.
     */
	default Consumerobj andThenObject(Consumerobj... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptObject(a); after[0].acceptObject(a);};

    	return (a) -> {acceptObject(a); for(Consumerobj consumer : after) consumer.acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerobj} performing this operation and the operations after.
     */
	default Consumerobj andThenObject(Iterable<Consumerobj> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptObject(a); for(Consumerobj consumer : after) consumer.acceptObject(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerobj} performing the operation before and this operation.
     */
    default Consumerobj beforeThatObject(Consumerobj before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerobj} performing the operations before and this operation.
     */
    default Consumerobj beforeThatObject(Consumerobj... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptObject(a); acceptObject(a);};
    	
    	return (a) -> {for(Consumerobj consumer : before) consumer.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerobj} performing the operations before and this operation.
     */
    default Consumerobj beforeThatObject(Iterable<Consumerobj> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumerobj consumer : before) consumer.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Composes a new {@link Consumerobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerobj} performing the operations.
     */
	static Consumerobj inSequenceObject(Consumerobj... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
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
    	
    	return (a) -> {for(Consumerobj consumer : consumers) consumer.acceptObject(a);};
    }
    
    /**
     * Composes a new {@link Consumerobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerobj} performing the operations.
     */
    static Consumerobj inSequenceObject(Iterable<Consumerobj> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumerobj consumer : consumers) consumer.acceptObject(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a)
    {
    	acceptObject(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerobj} performing this operation and the operation after.
     */
    default Consumerobj andThen(Consumer<Object> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerobj)
    	{
    		final Consumerobj originalAfter = (Consumerobj)after;
    		
    		return (a) -> {acceptObject(a); originalAfter.acceptObject(a);};
    	}
    	else
    	{
    		return (a) -> {acceptObject(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerobj} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerobj andThen(Consumer<Object>... after)
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
    		if(after[0] instanceof Consumerobj)
        	{
        		final Consumerobj originalAfter = (Consumerobj)after[0];
        		
        		return (a) -> {acceptObject(a); originalAfter.acceptObject(a);};
        	}
        	else
        	{
        		return (a) -> {acceptObject(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptObject(a);
			
    		for(Consumer<Object> consumer : after)
    		{
    			if(consumer instanceof Consumerobj)
    				((Consumerobj)consumer).acceptObject(a);
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
     * @return A new {@link Consumerobj} performing this operation and the operations after.
     */
	default Consumerobj andThen(Iterable<Consumer<Object>> after)
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
		return (a) -> {
			acceptObject(a);
			
    		for(Consumer<Object> consumer : after)
    		{
    			if(consumer instanceof Consumerobj)
    				((Consumerobj)consumer).acceptObject(a);
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
     * @return A new {@link Consumerobj} performing the operation before and this operation.
     */
    default Consumerobj beforeThat(Consumer<Object> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerobj)
    	{
    		final Consumerobj originalBefore = (Consumerobj)before;
    		
    		return (a) -> {originalBefore.acceptObject(a); acceptObject(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptObject(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerobj} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerobj beforeThat(Consumer<Object>... before)
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
    		if(before[0] instanceof Consumerobj)
        	{
        		final Consumerobj originalBefore = (Consumerobj)before[0];
        		
        		return (a) -> {originalBefore.acceptObject(a); acceptObject(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptObject(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Object> consumer : before)
    		{
    			if(consumer instanceof Consumerobj)
    				((Consumerobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObject(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerobj} performing the operations before and this operation.
     */
    default Consumerobj beforeThat(Iterable<Consumer<Object>> before)
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
    	return (a) -> {
    		for(Consumer<Object> consumer : before)
    		{
    			if(consumer instanceof Consumerobj)
    				((Consumerobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObject(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerobj} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerobj inSequence(Consumer<Object>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumerobj)
    			return (Consumerobj) consumers[0];
    		else
    			return (Consumerobj) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Object> consumer : consumers)
    		{
    			if(consumer instanceof Consumerobj)
    				((Consumerobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerobj} performing the operations.
     */
    static Consumerobj inSequence(Iterable<Consumer<Object>> consumers)
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
    	return (a) -> {
    		for(Consumer<Object> consumer : consumers)
    		{
    			if(consumer instanceof Consumerobj)
    				((Consumerobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerobj andThen(java.util.function.Consumer<? super Object> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptObject(a); after.accept(a);};
    }
}
