package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one boolean input argument and returns no result.
 * {@link Consumerbo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBool(boolean)}.
 * 
 * @see Consumerbo
 * @see ConsumerExbo
 * @see Consumer2bo
 * @see ConsumerEx2bo
 * @see Consumer3bo
 * @see ConsumerEx3bo
 * @see Consumer4bo
 * @see ConsumerEx4bo
 */
@FunctionalInterface
public interface Consumerbo extends Consumer<Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptBool(boolean a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerbo} performing this operation and the operation after.
     */
    default Consumerbo andThenFloat(Consumerbo after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBool(a); after.acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbo} performing this operation and the operations after.
     */
	default Consumerbo andThenFloat(Consumerbo... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptBool(a); after[0].acceptBool(a);};

    	return (a) -> {acceptBool(a); for(Consumerbo consumer : after) consumer.acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbo} performing this operation and the operations after.
     */
	default Consumerbo andThenFloat(Iterable<Consumerbo> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptBool(a); for(Consumerbo consumer : after) consumer.acceptBool(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerbo} performing the operation before and this operation.
     */
    default Consumerbo beforeThatFloat(Consumerbo before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbo} performing the operations before and this operation.
     */
    default Consumerbo beforeThatFloat(Consumerbo... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBool(a); acceptBool(a);};
    	
    	return (a) -> {for(Consumerbo consumer : before) consumer.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbo} performing the operations before and this operation.
     */
    default Consumerbo beforeThatFloat(Iterable<Consumerbo> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumerbo consumer : before) consumer.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Composes a new {@link Consumerbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbo} performing the operations.
     */
	static Consumerbo inSequenceFloat(Consumerbo... consumers)
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
    	
    	return (a) -> {for(Consumerbo consumer : consumers) consumer.acceptBool(a);};
    }
    
    /**
     * Composes a new {@link Consumerbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbo} performing the operations.
     */
    static Consumerbo inSequenceFloat(Iterable<Consumerbo> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumerbo consumer : consumers) consumer.acceptBool(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a)
    {
    	acceptBool(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerbo} performing this operation and the operation after.
     */
    default Consumerbo andThen(Consumer<Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerbo)
    	{
    		final Consumerbo originalAfter = (Consumerbo)after;
    		
    		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBool(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbo} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerbo andThen(Consumer<Boolean>... after)
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
    		if(after[0] instanceof Consumerbo)
        	{
        		final Consumerbo originalAfter = (Consumerbo)after[0];
        		
        		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBool(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptBool(a);
			
    		for(Consumer<Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumerbo)
    				((Consumerbo)consumer).acceptBool(a);
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
     * @return A new {@link Consumerbo} performing this operation and the operations after.
     */
	default Consumerbo andThen(Iterable<Consumer<Boolean>> after)
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
			acceptBool(a);
			
    		for(Consumer<Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumerbo)
    				((Consumerbo)consumer).acceptBool(a);
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
     * @return A new {@link Consumerbo} performing the operation before and this operation.
     */
    default Consumerbo beforeThat(Consumer<Boolean> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerbo)
    	{
    		final Consumerbo originalBefore = (Consumerbo)before;
    		
    		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBool(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbo} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerbo beforeThat(Consumer<Boolean>... before)
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
    		if(before[0] instanceof Consumerbo)
        	{
        		final Consumerbo originalBefore = (Consumerbo)before[0];
        		
        		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptBool(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumerbo)
    				((Consumerbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBool(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbo} performing the operations before and this operation.
     */
    default Consumerbo beforeThat(Iterable<Consumer<Boolean>> before)
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
    		for(Consumer<Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumerbo)
    				((Consumerbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBool(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerbo inSequence(Consumer<Boolean>... consumers)
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
    		if(consumers[0] instanceof Consumerbo)
    			return (Consumerbo) consumers[0];
    		else
    			return (Consumerbo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumerbo)
    				((Consumerbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbo} performing the operations.
     */
    static Consumerbo inSequence(Iterable<Consumer<Boolean>> consumers)
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
    		for(Consumer<Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumerbo)
    				((Consumerbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerbo andThen(java.util.function.Consumer<? super Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBool(a); after.accept(a);};
    }
}
