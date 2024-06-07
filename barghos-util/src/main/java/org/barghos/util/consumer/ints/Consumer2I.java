package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two integer input arguments and returns
 * no result. {@link Consumer2I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptInt(int, int)}.
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
public interface Consumer2I extends Consumer2<Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptInt(int a, int b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2I} performing this operation and the
     * operation after.
     */
    default Consumer2I thenInt(Consumer2I after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptInt(a, b); after.acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2I} performing this operation and the
     * operations after.
     */
	default Consumer2I thenInt(Consumer2I... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptInt(a, b); after[0].acceptInt(a, b);};

    	return (a, b) -> {acceptInt(a, b); for(Consumer2I consumer : after) consumer.acceptInt(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2I} performing the operation before and this
     * operation.
     */
    default Consumer2I beforeInt(Consumer2I before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2I} performing the operations before and
     * this operation.
     */
    default Consumer2I beforeInt(Consumer2I... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptInt(a, b); acceptInt(a, b);};
    	
    	return (a, b) -> {for(Consumer2I consumer : before) consumer.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2I} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2I} performing the operations.
     */
	static Consumer2I sequenceInt(Consumer2I... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2I consumer : consumers) consumer.acceptInt(a, b);};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptInt(int, int)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Integer a, Integer b)
    {
    	acceptInt(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2I} performing this operation and the
     * operation after.
     */
    default Consumer2I thenGeneric(Consumer2<Integer,Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2I)
    	{
    		final Consumer2I originalAfter = (Consumer2I)after;
    		
    		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptInt(a, b); after.acceptGeneric(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2I} performing this operation and the
     * operation after.
     */
    default Consumer2I thenGeneric(java.util.function.BiConsumer<? super Integer,? super Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2I)
    	{
    		final Consumer2I originalAfter = (Consumer2I)after;
    		
    		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptInt(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2I} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2I thenGeneric(Consumer2<Integer,Integer>... after)
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
    		if(after[0] instanceof Consumer2I)
        	{
        		final Consumer2I originalAfter = (Consumer2I)after[0];
        		
        		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptInt(a, b); after[0].acceptGeneric(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptInt(a, b);
			
    		for(Consumer2<Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof Consumer2I)
    				((Consumer2I)consumer).acceptInt(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2I} performing the operation before and this
     * operation.
     */
    default Consumer2I beforeGeneric(Consumer2<Integer,Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2I)
    	{
    		final Consumer2I originalBefore = (Consumer2I)before;
    		
    		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.acceptGeneric(a, b); acceptInt(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2I} performing the operation before and this
     * operation.
     */
    default Consumer2I beforeGeneric(java.util.function.BiConsumer<? super Integer,? super Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2I)
    	{
    		final Consumer2I originalBefore = (Consumer2I)before;
    		
    		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptInt(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2I} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2I beforeGeneric(Consumer2<Integer,Integer>... before)
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
    		if(before[0] instanceof Consumer2I)
        	{
        		final Consumer2I originalBefore = (Consumer2I)before[0];
        		
        		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].acceptGeneric(a, b); acceptInt(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof Consumer2I)
    				((Consumer2I)consumer).acceptInt(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    		
    		acceptInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2I} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2I} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2I sequenceGeneric(Consumer2<Integer,Integer>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
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
    		if(consumers[0] instanceof Consumer2I)
    			return (Consumer2I) consumers[0];
    		else
    			return (Consumer2I) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2I)
    				((Consumer2I)consumer).acceptInt(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
    /*
     * =============================
     * java.util.function.BiConsumer
     * =============================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptInt(int, int)} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b)
    {
    	acceptInt(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2I andThen(java.util.function.BiConsumer<? super Integer,? super Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptInt(a, b); after.accept(a, b);};
    }
}
