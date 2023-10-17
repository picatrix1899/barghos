package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one float input argument and returns no result.
 * Unlike {@link Consumerf} this may throw Exceptions.
 * {@link ConsumerExf} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptFloat(float)}.
 * 
 * @see Consumerf
 * @see ConsumerExf
 * @see Consumer2f
 * @see ConsumerEx2f
 * @see Consumer3f
 * @see ConsumerEx3f
 * @see Consumer4f
 * @see ConsumerEx4f
 */
@FunctionalInterface
public interface ConsumerExf extends ConsumerEx<Float>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloat(float a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExf} performing this operation and the operation after.
     */
    default ConsumerExf andThenFloat(ConsumerExf after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptFloat(a); after.acceptFloat(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExf} performing this operation and the operations after.
     */
	default ConsumerExf andThenFloat(ConsumerExf... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptFloat(a); after[0].acceptFloat(a);};

    	return (a) -> {acceptFloat(a); for(ConsumerExf consumer : after) consumer.acceptFloat(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExf} performing this operation and the operations after.
     */
	default ConsumerExf andThenFloat(Iterable<ConsumerExf> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptFloat(a); for(ConsumerExf consumer : after) consumer.acceptFloat(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExf} performing the operation before and this operation.
     */
    default ConsumerExf beforeThatFloat(ConsumerExf before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptFloat(a); acceptFloat(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExf} performing the operations before and this operation.
     */
    default ConsumerExf beforeThatFloat(ConsumerExf... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptFloat(a); acceptFloat(a);};
    	
    	return (a) -> {for(ConsumerExf consumer : before) consumer.acceptFloat(a); acceptFloat(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExf} performing the operations before and this operation.
     */
    default ConsumerExf beforeThatFloat(Iterable<ConsumerExf> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExf consumer : before) consumer.acceptFloat(a); acceptFloat(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExf} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExf} performing the operations.
     */
	static ConsumerExf inSequenceFloat(ConsumerExf... consumers)
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
    	
    	return (a) -> {for(ConsumerExf consumer : consumers) consumer.acceptFloat(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExf} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExf} performing the operations.
     */
    static ConsumerExf inSequenceFloat(Iterable<ConsumerExf> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExf consumer : consumers) consumer.acceptFloat(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptFloat} instead.
     */
    @Override
    @Deprecated
    default void accept(Float a) throws Exception
    {
    	acceptFloat(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExf} performing this operation and the operation after.
     */
    default ConsumerExf andThen(ConsumerEx<Float> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExf)
    	{
    		final ConsumerExf originalAfter = (ConsumerExf)after;
    		
    		return (a) -> {acceptFloat(a); originalAfter.acceptFloat(a);};
    	}
    	else
    	{
    		return (a) -> {acceptFloat(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExf} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExf andThen(ConsumerEx<Float>... after)
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
    		if(after[0] instanceof ConsumerExf)
        	{
        		final ConsumerExf originalAfter = (ConsumerExf)after[0];
        		
        		return (a) -> {acceptFloat(a); originalAfter.acceptFloat(a);};
        	}
        	else
        	{
        		return (a) -> {acceptFloat(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptFloat(a);
			
    		for(ConsumerEx<Float> consumer : after)
    		{
    			if(consumer instanceof ConsumerExf)
    				((ConsumerExf)consumer).acceptFloat(a);
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
     * @return A new {@link ConsumerExf} performing this operation and the operations after.
     */
	default ConsumerExf andThen(Iterable<ConsumerEx<Float>> after)
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
			acceptFloat(a);
			
    		for(ConsumerEx<Float> consumer : after)
    		{
    			if(consumer instanceof ConsumerExf)
    				((ConsumerExf)consumer).acceptFloat(a);
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
     * @return A new {@link ConsumerExf} performing the operation before and this operation.
     */
    default ConsumerExf beforeThat(ConsumerEx<Float> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExf)
    	{
    		final ConsumerExf originalBefore = (ConsumerExf)before;
    		
    		return (a) -> {originalBefore.acceptFloat(a); acceptFloat(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptFloat(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExf} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExf beforeThat(ConsumerEx<Float>... before)
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
    		if(before[0] instanceof ConsumerExf)
        	{
        		final ConsumerExf originalBefore = (ConsumerExf)before[0];
        		
        		return (a) -> {originalBefore.acceptFloat(a); acceptFloat(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptFloat(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Float> consumer : before)
    		{
    			if(consumer instanceof ConsumerExf)
    				((ConsumerExf)consumer).acceptFloat(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptFloat(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExf} performing the operations before and this operation.
     */
    default ConsumerExf beforeThat(Iterable<ConsumerEx<Float>> before)
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
    		for(ConsumerEx<Float> consumer : before)
    		{
    			if(consumer instanceof ConsumerExf)
    				((ConsumerExf)consumer).acceptFloat(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptFloat(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExf} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExf} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExf inSequence(ConsumerEx<Float>... consumers)
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
    		if(consumers[0] instanceof ConsumerExf)
    			return (ConsumerExf) consumers[0];
    		else
    			return (ConsumerExf) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Float> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExf)
    				((ConsumerExf)consumer).acceptFloat(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExf} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExf} performing the operations.
     */
    static ConsumerExf inSequence(Iterable<ConsumerEx<Float>> consumers)
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
    		for(ConsumerEx<Float> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExf)
    				((ConsumerExf)consumer).acceptFloat(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
