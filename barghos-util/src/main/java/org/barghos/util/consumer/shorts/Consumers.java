package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one short input argument and returns no result.
 * {@link Consumers} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptShort(short)}.
 * 
 * @see Consumers
 * @see ConsumerExs
 * @see Consumer2s
 * @see ConsumerEx2s
 * @see Consumer3s
 * @see ConsumerEx3s
 * @see Consumer4s
 * @see ConsumerEx4s
 */
@FunctionalInterface
public interface Consumers extends Consumer<Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptShort(short a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumers} performing this operation and the operation after.
     */
    default Consumers andThenShort(Consumers after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptShort(a); after.acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumers} performing this operation and the operations after.
     */
	default Consumers andThenShort(Consumers... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptShort(a); after[0].acceptShort(a);};

    	return (a) -> {acceptShort(a); for(Consumers consumer : after) consumer.acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumers} performing this operation and the operations after.
     */
	default Consumers andThenShort(Iterable<Consumers> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptShort(a); for(Consumers consumer : after) consumer.acceptShort(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumers} performing the operation before and this operation.
     */
    default Consumers beforeThatShort(Consumers before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumers} performing the operations before and this operation.
     */
    default Consumers beforeThatShort(Consumers... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShort(a); acceptShort(a);};
    	
    	return (a) -> {for(Consumers consumer : before) consumer.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumers} performing the operations before and this operation.
     */
    default Consumers beforeThatShort(Iterable<Consumers> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumers consumer : before) consumer.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Composes a new {@link Consumers} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumers} performing the operations.
     */
	static Consumers inSequenceShort(Consumers... consumers)
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
    	
    	return (a) -> {for(Consumers consumer : consumers) consumer.acceptShort(a);};
    }
    
    /**
     * Composes a new {@link Consumers} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumers} performing the operations.
     */
    static Consumers inSequenceShort(Iterable<Consumers> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumers consumer : consumers) consumer.acceptShort(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a)
    {
    	acceptShort(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumers} performing this operation and the operation after.
     */
    default Consumers andThen(Consumer<Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumers)
    	{
    		final Consumers originalAfter = (Consumers)after;
    		
    		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShort(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumers} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumers andThen(Consumer<Short>... after)
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
    		if(after[0] instanceof Consumers)
        	{
        		final Consumers originalAfter = (Consumers)after[0];
        		
        		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {acceptShort(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptShort(a);
			
    		for(Consumer<Short> consumer : after)
    		{
    			if(consumer instanceof Consumers)
    				((Consumers)consumer).acceptShort(a);
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
     * @return A new {@link Consumers} performing this operation and the operations after.
     */
	default Consumers andThen(Iterable<Consumer<Short>> after)
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
			acceptShort(a);
			
    		for(Consumer<Short> consumer : after)
    		{
    			if(consumer instanceof Consumers)
    				((Consumers)consumer).acceptShort(a);
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
     * @return A new {@link Consumers} performing the operation before and this operation.
     */
    default Consumers beforeThat(Consumer<Short> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumers)
    	{
    		final Consumers originalBefore = (Consumers)before;
    		
    		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptShort(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumers} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumers beforeThat(Consumer<Short>... before)
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
    		if(before[0] instanceof Consumers)
        	{
        		final Consumers originalBefore = (Consumers)before[0];
        		
        		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptShort(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Short> consumer : before)
    		{
    			if(consumer instanceof Consumers)
    				((Consumers)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShort(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumers} performing the operations before and this operation.
     */
    default Consumers beforeThat(Iterable<Consumer<Short>> before)
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
    		for(Consumer<Short> consumer : before)
    		{
    			if(consumer instanceof Consumers)
    				((Consumers)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShort(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumers} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumers} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumers inSequence(Consumer<Short>... consumers)
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
    		if(consumers[0] instanceof Consumers)
    			return (Consumers) consumers[0];
    		else
    			return (Consumers) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumers)
    				((Consumers)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumers} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumers} performing the operations.
     */
    static Consumers inSequence(Iterable<Consumer<Short>> consumers)
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
    		for(Consumer<Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumers)
    				((Consumers)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumers andThen(java.util.function.Consumer<? super Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptShort(a); after.accept(a);};
    }
}
