package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three boolean input arguments and
 * returns no result. Unlike {@link Consumer3Bo} this may throw exceptions.
 * {@link ConsumerEx3Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBool}.
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface ConsumerEx3Bo extends ConsumerEx3<Boolean,Boolean,Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBool(boolean a, boolean b, boolean c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing this operation and the
     * operation after.
     */
    default ConsumerEx3Bo thenBool(ConsumerEx3Bo after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptBool(a, b, c); after.acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing this operation and the
     * operations after.
     */
	default ConsumerEx3Bo thenBool(ConsumerEx3Bo... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptBool(a, b, c); after[0].acceptBool(a, b, c);};

    	return (a, b, c) -> {acceptBool(a, b, c); for(ConsumerEx3Bo consumer : after) consumer.acceptBool(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing the operation before and
     * this operation.
     */
    default ConsumerEx3Bo beforeBool(ConsumerEx3Bo before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing the operations before and
     * this operation.
     */
    default ConsumerEx3Bo beforeBool(ConsumerEx3Bo... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptBool(a, b, c); acceptBool(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3Bo consumer : before) consumer.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3Bo} performing the operations.
     */
	static ConsumerEx3Bo sequenceBool(ConsumerEx3Bo... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(ConsumerEx3Bo consumer : consumers) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b, Boolean c) throws Exception
    {
    	acceptBool(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing this operation and the
     * operation after.
     */
    default ConsumerEx3Bo then(ConsumerEx3<Boolean,Boolean,Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3Bo)
    	{
    		final ConsumerEx3Bo originalAfter = (ConsumerEx3Bo)after;
    		
    		return (a, b, c) -> {acceptBool(a, b, c); originalAfter.acceptBool(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptBool(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3Bo then(ConsumerEx3<Boolean,Boolean,Boolean>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
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
    		 * as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof ConsumerEx3Bo)
        	{
        		final ConsumerEx3Bo originalAfter = (ConsumerEx3Bo)after[0];
        		
        		return (a, b, c) -> {acceptBool(a, b, c); originalAfter.acceptBool(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptBool(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptBool(a, b, c);
			
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3Bo)
    				((ConsumerEx3Bo)consumer).acceptBool(a, b, c);
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
     * @return A new {@link ConsumerEx3Bo} performing the operation before and
     * this operation.
     */
    default ConsumerEx3Bo before(ConsumerEx3<Boolean,Boolean,Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3Bo)
    	{
    		final ConsumerEx3Bo originalBefore = (ConsumerEx3Bo)before;
    		
    		return (a, b, c) -> {originalBefore.acceptBool(a, b, c); acceptBool(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptBool(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3Bo} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3Bo before(ConsumerEx3<Boolean,Boolean,Boolean>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
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
    		 * as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof ConsumerEx3Bo)
        	{
        		final ConsumerEx3Bo originalBefore = (ConsumerEx3Bo)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptBool(a, b, c); acceptBool(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptBool(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3Bo)
    				((ConsumerEx3Bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBool(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3Bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3Bo sequence(ConsumerEx3<Boolean,Boolean,Boolean>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
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
    		if(consumers[0] instanceof ConsumerEx3Bo)
    			return (ConsumerEx3Bo) consumers[0];
    		else
    			return (ConsumerEx3Bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3Bo)
    				((ConsumerEx3Bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
