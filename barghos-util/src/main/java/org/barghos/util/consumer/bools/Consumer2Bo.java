package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two boolean input arguments and returns
 * no result. {@link Consumer2Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBool(boolean, boolean)}.
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
public interface Consumer2Bo extends Consumer2<Boolean,Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptBool(boolean a, boolean b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2Bo} performing this operation and the
     * operation after.
     */
    default Consumer2Bo thenBool(Consumer2Bo after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptBool(a, b); after.acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2Bo} performing this operation and the
     * operations after.
     */
	default Consumer2Bo thenBool(Consumer2Bo... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptBool(a, b); after[0].acceptBool(a, b);};

    	return (a, b) -> {acceptBool(a, b); for(Consumer2Bo consumer : after) consumer.acceptBool(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2Bo} performing the operation before and
     * this operation.
     */
    default Consumer2Bo beforeBool(Consumer2Bo before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2Bo} performing the operations before and
     * this operation.
     */
    default Consumer2Bo beforeBool(Consumer2Bo... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptBool(a, b); acceptBool(a, b);};
    	
    	return (a, b) -> {for(Consumer2Bo consumer : before) consumer.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2Bo} performing the operations.
     */
	static Consumer2Bo sequenceBool(Consumer2Bo... consumers)
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
    	
    	return (a, b) -> {for(Consumer2Bo consumer : consumers) consumer.acceptBool(a, b);};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBool(boolean, boolean)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Boolean a, Boolean b)
    {
    	acceptBool(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bo} performing this operation and the
     * operation after.
     */
    default Consumer2Bo thenGeneric(Consumer2<Boolean,Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2Bo)
    	{
    		final Consumer2Bo originalAfter = (Consumer2Bo)after;
    		
    		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptBool(a, b); after.acceptGeneric(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bo} performing this operation and the
     * operation after.
     */
    default Consumer2Bo thenGeneric(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2Bo)
    	{
    		final Consumer2Bo originalAfter = (Consumer2Bo)after;
    		
    		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptBool(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bo} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2Bo thenGeneric(Consumer2<Boolean,Boolean>... after)
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
    		if(after[0] instanceof Consumer2Bo)
        	{
        		final Consumer2Bo originalAfter = (Consumer2Bo)after[0];
        		
        		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptBool(a, b); after[0].acceptGeneric(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptBool(a, b);
			
    		for(Consumer2<Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumer2Bo)
    				((Consumer2Bo)consumer).acceptBool(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bo} performing the operation before and
     * this operation.
     */
    default Consumer2Bo beforeGeneric(Consumer2<Boolean,Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2Bo)
    	{
    		final Consumer2Bo originalBefore = (Consumer2Bo)before;
    		
    		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.acceptGeneric(a, b); acceptBool(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bo} performing the operation before and
     * this operation.
     */
    default Consumer2Bo beforeGeneric(java.util.function.BiConsumer<? super Boolean,? super Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2Bo)
    	{
    		final Consumer2Bo originalBefore = (Consumer2Bo)before;
    		
    		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptBool(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bo} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2Bo beforeGeneric(Consumer2<Boolean,Boolean>... before)
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
    		if(before[0] instanceof Consumer2Bo)
        	{
        		final Consumer2Bo originalBefore = (Consumer2Bo)before[0];
        		
        		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].acceptGeneric(a, b); acceptBool(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumer2Bo)
    				((Consumer2Bo)consumer).acceptBool(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    		
    		acceptBool(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2Bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2Bo sequenceGeneric(Consumer2<Boolean,Boolean>... consumers)
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
    		if(consumers[0] instanceof Consumer2Bo)
    			return (Consumer2Bo) consumers[0];
    		else
    			return (Consumer2Bo) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2Bo)
    				((Consumer2Bo)consumer).acceptBool(a, b);
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
     * @deprecated Use {@link #acceptBool(boolean, boolean)} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b)
    {
    	acceptBool(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2Bo andThen(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptBool(a, b); after.accept(a, b);};
    }
}
