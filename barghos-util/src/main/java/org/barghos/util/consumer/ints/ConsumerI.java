package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one integer input argument and returns
 * no result. {@link ConsumerI} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptInt(int)}.
 * 
 * @see ConsumerI
 * @see ConsumerExI
 * @see Consumer2I
 * @see ConsumerEx2I
 * @see Consumer3I
 * @see ConsumerEx3I
 * @see Consumer4I
 * @see ConsumerEx4I
 */
@FunctionalInterface
public interface ConsumerI extends Consumer<Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptInt(int a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerI} performing this operation and the
     * operation after.
     */
    default ConsumerI thenInt(ConsumerI after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptInt(a); after.acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerI} performing this operation and the
     * operations after.
     */
	default ConsumerI thenInt(ConsumerI... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptInt(a); after[0].acceptInt(a);};

    	return (a) -> {acceptInt(a); for(ConsumerI consumer : after) consumer.acceptInt(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerI} performing the operation before and this
     * operation.
     */
    default ConsumerI beforeInt(ConsumerI before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerI} performing the operations before and this
     * operation.
     */
    default ConsumerI beforeInt(ConsumerI... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptInt(a); acceptInt(a);};
    	
    	return (a) -> {for(ConsumerI consumer : before) consumer.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Composes a new {@link ConsumerI} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerI} performing the operations.
     */
	static ConsumerI sequenceInt(ConsumerI... consumers)
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
    	
    	return (a) -> {for(ConsumerI consumer : consumers) consumer.acceptInt(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptInt(int)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Integer a)
    {
    	acceptInt(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerI} performing this operation and the
     * operation after.
     */
    default ConsumerI thenGeneric(Consumer<Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerI)
    	{
    		final ConsumerI originalAfter = (ConsumerI)after;
    		
    		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {acceptInt(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerI} performing this operation and the
     * operation after.
     */
    default ConsumerI thenGeneric(java.util.function.Consumer<? super Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerI)
    	{
    		final ConsumerI originalAfter = (ConsumerI)after;
    		
    		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {acceptInt(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerI} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerI thenGeneric(Consumer<Integer>... after)
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
    		if(after[0] instanceof ConsumerI)
        	{
        		final ConsumerI originalAfter = (ConsumerI)after[0];
        		
        		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
        	}
        	else
        	{
        		return (a) -> {acceptInt(a); after[0].acceptGeneric(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptInt(a);
			
    		for(Consumer<Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerI)
    				((ConsumerI)consumer).acceptInt(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerI} performing the operation before and this
     * operation.
     */
    default ConsumerI beforeGeneric(Consumer<Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerI)
    	{
    		final ConsumerI originalBefore = (ConsumerI)before;
    		
    		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptInt(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerI} performing the operation before and this
     * operation.
     */
    default ConsumerI beforeGeneric(java.util.function.Consumer<? super Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerI)
    	{
    		final ConsumerI originalBefore = (ConsumerI)before;
    		
    		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptInt(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerI} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerI beforeGeneric(Consumer<Integer>... before)
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
    		if(before[0] instanceof ConsumerI)
        	{
        		final ConsumerI originalBefore = (ConsumerI)before[0];
        		
        		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptInt(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerI)
    				((ConsumerI)consumer).acceptInt(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerI} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerI} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerI sequenceGeneric(Consumer<Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerI)
    			return (ConsumerI) consumers[0];
    		else
    			return (ConsumerI) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerI)
    				((ConsumerI)consumer).acceptInt(a);
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
     * @deprecated Use {@link #acceptInt(int)} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a)
    {
    	acceptInt(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerI andThen(java.util.function.Consumer<? super Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptInt(a); after.accept(a);};
    }
}
