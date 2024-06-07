package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one string input argument and returns no
 * result. {@link ConsumerStr} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptString(String)}.
 * 
 * @see ConsumerStr
 * @see ConsumerExStr
 * @see Consumer2Str
 * @see ConsumerEx2Str
 * @see Consumer3Str
 * @see ConsumerEx3Str
 * @see Consumer4Str
 * @see ConsumerEx4Str
 */
@FunctionalInterface
public interface ConsumerStr extends Consumer<String>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptString(String a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerStr} performing this operation and the
     * operation after.
     */
    default ConsumerStr thenString(ConsumerStr after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptString(a); after.acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerStr} performing this operation and the
     * operations after.
     */
	default ConsumerStr thenString(ConsumerStr... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptString(a); after[0].acceptString(a);};

    	return (a) -> {acceptString(a); for(ConsumerStr consumer : after) consumer.acceptString(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerStr} performing the operation before and
     * this operation.
     */
    default ConsumerStr beforeString(ConsumerStr before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerStr} performing the operations before and
     * this operation.
     */
    default ConsumerStr beforeString(ConsumerStr... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptString(a); acceptString(a);};
    	
    	return (a) -> {for(ConsumerStr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Composes a new {@link ConsumerStr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerStr} performing the operations.
     */
	static ConsumerStr sequenceString(ConsumerStr... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerStr consumer : consumers) consumer.acceptString(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptString(String)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(String a)
    {
    	acceptString(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerStr} performing this operation and the
     * operation after.
     */
    default ConsumerStr thenGeneric(Consumer<String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerStr)
    	{
    		final ConsumerStr originalAfter = (ConsumerStr)after;
    		
    		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {acceptString(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerStr} performing this operation and the
     * operation after.
     */
    default ConsumerStr thenGeneric(java.util.function.Consumer<? super String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerStr)
    	{
    		final ConsumerStr originalAfter = (ConsumerStr)after;
    		
    		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {acceptString(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerStr} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerStr thenGeneric(Consumer<String>... after)
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
    		if(after[0] instanceof ConsumerStr)
        	{
        		final ConsumerStr originalAfter = (ConsumerStr)after[0];
        		
        		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {acceptString(a); after[0].acceptGeneric(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptString(a);
			
    		for(Consumer<String> consumer : after)
    		{
    			if(consumer instanceof ConsumerStr)
    				((ConsumerStr)consumer).acceptString(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerStr} performing the operation before and
     * this operation.
     */
    default ConsumerStr beforeGeneric(Consumer<String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerStr)
    	{
    		final ConsumerStr originalBefore = (ConsumerStr)before;
    		
    		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptString(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerStr} performing the operation before and
     * this operation.
     */
    default ConsumerStr beforeGeneric(java.util.function.Consumer<? super String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerStr)
    	{
    		final ConsumerStr originalBefore = (ConsumerStr)before;
    		
    		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptString(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerStr} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerStr beforeGeneric(Consumer<String>... before)
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
    		if(before[0] instanceof ConsumerStr)
        	{
        		final ConsumerStr originalBefore = (ConsumerStr)before[0];
        		
        		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptString(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : before)
    		{
    			if(consumer instanceof ConsumerStr)
    				((ConsumerStr)consumer).acceptString(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptString(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerStr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerStr} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerStr sequenceGeneric(Consumer<String>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerStr)
    			return (ConsumerStr) consumers[0];
    		else
    			return (ConsumerStr) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerStr)
    				((ConsumerStr)consumer).acceptString(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
    /*
     * ===========================
     * java.util.function.Consumer
     * ===========================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptString(String)} instead.
     */
    @Override
    @Deprecated
    default void accept(String a)
    {
    	acceptString(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerStr andThen(java.util.function.Consumer<? super String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptString(a); after.accept(a);};
    }
}
