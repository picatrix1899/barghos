package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one long input argument and returns no result.
 * {@link Consumerl} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptLong(long)}.
 * 
 * @see Consumerl
 * @see ConsumerExl
 * @see Consumer2l
 * @see ConsumerEx2l
 * @see Consumer3l
 * @see ConsumerEx3l
 * @see Consumer4l
 * @see ConsumerEx4l
 */
@FunctionalInterface
public interface Consumerl extends Consumer<Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptLong(long a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerl} performing this operation and the operation after.
     */
    default Consumerl andThenLong(Consumerl after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptLong(a); after.acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerl} performing this operation and the operations after.
     */
	default Consumerl andThenLong(Consumerl... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptLong(a); after[0].acceptLong(a);};

    	return (a) -> {acceptLong(a); for(Consumerl consumer : after) consumer.acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerl} performing this operation and the operations after.
     */
	default Consumerl andThenLong(Iterable<Consumerl> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptLong(a); for(Consumerl consumer : after) consumer.acceptLong(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerl} performing the operation before and this operation.
     */
    default Consumerl beforeThatLong(Consumerl before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerl} performing the operations before and this operation.
     */
    default Consumerl beforeThatLong(Consumerl... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptLong(a); acceptLong(a);};
    	
    	return (a) -> {for(Consumerl consumer : before) consumer.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerl} performing the operations before and this operation.
     */
    default Consumerl beforeThatLong(Iterable<Consumerl> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumerl consumer : before) consumer.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Composes a new {@link Consumerl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerl} performing the operations.
     */
	static Consumerl inSequenceLong(Consumerl... consumers)
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
    	
    	return (a) -> {for(Consumerl consumer : consumers) consumer.acceptLong(a);};
    }
    
    /**
     * Composes a new {@link Consumerl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerl} performing the operations.
     */
    static Consumerl inSequenceLong(Iterable<Consumerl> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumerl consumer : consumers) consumer.acceptLong(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a)
    {
    	acceptLong(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerl} performing this operation and the operation after.
     */
    default Consumerl andThen(Consumer<Long> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerl)
    	{
    		final Consumerl originalAfter = (Consumerl)after;
    		
    		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {acceptLong(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerl} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerl andThen(Consumer<Long>... after)
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
    		if(after[0] instanceof Consumerl)
        	{
        		final Consumerl originalAfter = (Consumerl)after[0];
        		
        		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
        	}
        	else
        	{
        		return (a) -> {acceptLong(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptLong(a);
			
    		for(Consumer<Long> consumer : after)
    		{
    			if(consumer instanceof Consumerl)
    				((Consumerl)consumer).acceptLong(a);
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
     * @return A new {@link Consumerl} performing this operation and the operations after.
     */
	default Consumerl andThen(Iterable<Consumer<Long>> after)
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
			acceptLong(a);
			
    		for(Consumer<Long> consumer : after)
    		{
    			if(consumer instanceof Consumerl)
    				((Consumerl)consumer).acceptLong(a);
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
     * @return A new {@link Consumerl} performing the operation before and this operation.
     */
    default Consumerl beforeThat(Consumer<Long> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerl)
    	{
    		final Consumerl originalBefore = (Consumerl)before;
    		
    		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptLong(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerl} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerl beforeThat(Consumer<Long>... before)
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
    		if(before[0] instanceof Consumerl)
        	{
        		final Consumerl originalBefore = (Consumerl)before[0];
        		
        		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptLong(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Long> consumer : before)
    		{
    			if(consumer instanceof Consumerl)
    				((Consumerl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptLong(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerl} performing the operations before and this operation.
     */
    default Consumerl beforeThat(Iterable<Consumer<Long>> before)
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
    		for(Consumer<Long> consumer : before)
    		{
    			if(consumer instanceof Consumerl)
    				((Consumerl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptLong(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerl} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerl inSequence(Consumer<Long>... consumers)
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
    		if(consumers[0] instanceof Consumerl)
    			return (Consumerl) consumers[0];
    		else
    			return (Consumerl) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumerl)
    				((Consumerl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerl} performing the operations.
     */
    static Consumerl inSequence(Iterable<Consumer<Long>> consumers)
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
    		for(Consumer<Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumerl)
    				((Consumerl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerl andThen(java.util.function.Consumer<? super Long> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptLong(a); after.accept(a);};
    }
}
