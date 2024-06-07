package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four boolean input arguments and returns
 * no result. Unlike {@link Consumer4Bo} this may throw exceptions.
 * {@link ConsumerEx4Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBool}.
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
public interface ConsumerEx4Bo extends ConsumerEx4<Boolean,Boolean,Boolean,Boolean>
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
    void acceptBool(boolean a, boolean b, boolean c, boolean d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing this operation and the
     * operation after.
     */
    default ConsumerEx4Bo thenBool(ConsumerEx4Bo after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptBool(a, b, c, d); after.acceptBool(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing this operation and the
     * operations after.
     */
	default ConsumerEx4Bo thenBool(ConsumerEx4Bo... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptBool(a, b, c, d); after[0].acceptBool(a, b, c, d);};

    	return (a, b, c, d) -> {acceptBool(a, b, c, d); for(ConsumerEx4Bo consumer : after) consumer.acceptBool(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing the operation before and
     * this operation.
     */
    default ConsumerEx4Bo beforeBool(ConsumerEx4Bo before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing the operations before and
     * this operation.
     */
    default ConsumerEx4Bo beforeBool(ConsumerEx4Bo... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4Bo consumer : before) consumer.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Bo} performing the operations.
     */
	static ConsumerEx4Bo sequenceBool(ConsumerEx4Bo... consumers)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4Bo consumer : consumers) consumer.acceptBool(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b, Boolean c, Boolean d) throws Exception
    {
    	acceptBool(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing this operation and the
     * operation after.
     */
    default ConsumerEx4Bo then(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4Bo)
    	{
    		final ConsumerEx4Bo originalAfter = (ConsumerEx4Bo)after;
    		
    		return (a, b, c, d) -> {acceptBool(a, b, c, d); originalAfter.acceptBool(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptBool(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4Bo then(ConsumerEx4<Boolean,Boolean,Boolean,Boolean>... after)
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
    		if(after[0] instanceof ConsumerEx4Bo)
        	{
        		final ConsumerEx4Bo originalAfter = (ConsumerEx4Bo)after[0];
        		
        		return (a, b, c, d) -> {acceptBool(a, b, c, d); originalAfter.acceptBool(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptBool(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptBool(a, b, c, d);
			
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4Bo)
    				((ConsumerEx4Bo)consumer).acceptBool(a, b, c, d);
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
     * @return A new {@link ConsumerEx4Bo} performing the operation before and
     * this operation.
     */
    default ConsumerEx4Bo before(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4Bo)
    	{
    		final ConsumerEx4Bo originalBefore = (ConsumerEx4Bo)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptBool(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Bo} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4Bo before(ConsumerEx4<Boolean,Boolean,Boolean,Boolean>... before)
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
    		if(before[0] instanceof ConsumerEx4Bo)
        	{
        		final ConsumerEx4Bo originalBefore = (ConsumerEx4Bo)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptBool(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4Bo)
    				((ConsumerEx4Bo)consumer).acceptBool(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptBool(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4Bo sequence(ConsumerEx4<Boolean,Boolean,Boolean,Boolean>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx4Bo)
    			return (ConsumerEx4Bo) consumers[0];
    		else
    			return (ConsumerEx4Bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4Bo)
    				((ConsumerEx4Bo)consumer).acceptBool(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
