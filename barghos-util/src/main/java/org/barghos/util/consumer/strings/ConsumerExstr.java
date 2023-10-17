package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one string input argument and returns no result.
 * Unlike {@link Consumerstr} this may throw Exceptions.
 * {@link ConsumerExstr} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptString(String)}.
 * 
 * @see Consumerstr
 * @see ConsumerExstr
 * @see Consumer2str
 * @see ConsumerEx2str
 * @see Consumer3str
 * @see ConsumerEx3str
 * @see Consumer4str
 * @see ConsumerEx4str
 */
@FunctionalInterface
public interface ConsumerExstr extends ConsumerEx<String>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptString(String a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExstr} performing this operation and the operation after.
     */
    default ConsumerExstr andThenString(ConsumerExstr after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptString(a); after.acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExstr} performing this operation and the operations after.
     */
	default ConsumerExstr andThenString(ConsumerExstr... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptString(a); after[0].acceptString(a);};

    	return (a) -> {acceptString(a); for(ConsumerExstr consumer : after) consumer.acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExstr} performing this operation and the operations after.
     */
	default ConsumerExstr andThenString(Iterable<ConsumerExstr> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptString(a); for(ConsumerExstr consumer : after) consumer.acceptString(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExstr} performing the operation before and this operation.
     */
    default ConsumerExstr beforeThatString(ConsumerExstr before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExstr} performing the operations before and this operation.
     */
    default ConsumerExstr beforeThatString(ConsumerExstr... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptString(a); acceptString(a);};
    	
    	return (a) -> {for(ConsumerExstr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExstr} performing the operations before and this operation.
     */
    default ConsumerExstr beforeThatString(Iterable<ConsumerExstr> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExstr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExstr} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExstr} performing the operations.
     */
	static ConsumerExstr inSequenceString(ConsumerExstr... consumers)
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
    	
    	return (a) -> {for(ConsumerExstr consumer : consumers) consumer.acceptString(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExstr} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExstr} performing the operations.
     */
    static ConsumerExstr inSequenceString(Iterable<ConsumerExstr> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExstr consumer : consumers) consumer.acceptString(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a) throws Exception
    {
    	acceptString(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExstr} performing this operation and the operation after.
     */
    default ConsumerExstr andThen(ConsumerEx<String> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExstr)
    	{
    		final ConsumerExstr originalAfter = (ConsumerExstr)after;
    		
    		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {acceptString(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExstr} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExstr andThen(ConsumerEx<String>... after)
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
    		if(after[0] instanceof ConsumerExstr)
        	{
        		final ConsumerExstr originalAfter = (ConsumerExstr)after[0];
        		
        		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {acceptString(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptString(a);
			
    		for(ConsumerEx<String> consumer : after)
    		{
    			if(consumer instanceof ConsumerExstr)
    				((ConsumerExstr)consumer).acceptString(a);
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
     * @return A new {@link ConsumerExstr} performing this operation and the operations after.
     */
	default ConsumerExstr andThen(Iterable<ConsumerEx<String>> after)
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
			acceptString(a);
			
    		for(ConsumerEx<String> consumer : after)
    		{
    			if(consumer instanceof ConsumerExstr)
    				((ConsumerExstr)consumer).acceptString(a);
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
     * @return A new {@link ConsumerExstr} performing the operation before and this operation.
     */
    default ConsumerExstr beforeThat(ConsumerEx<String> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExstr)
    	{
    		final ConsumerExstr originalBefore = (ConsumerExstr)before;
    		
    		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptString(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExstr} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExstr beforeThat(ConsumerEx<String>... before)
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
    		if(before[0] instanceof ConsumerExstr)
        	{
        		final ConsumerExstr originalBefore = (ConsumerExstr)before[0];
        		
        		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptString(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<String> consumer : before)
    		{
    			if(consumer instanceof ConsumerExstr)
    				((ConsumerExstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptString(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExstr} performing the operations before and this operation.
     */
    default ConsumerExstr beforeThat(Iterable<ConsumerEx<String>> before)
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
    		for(ConsumerEx<String> consumer : before)
    		{
    			if(consumer instanceof ConsumerExstr)
    				((ConsumerExstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptString(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExstr} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExstr} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExstr inSequence(ConsumerEx<String>... consumers)
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
    		if(consumers[0] instanceof ConsumerExstr)
    			return (ConsumerExstr) consumers[0];
    		else
    			return (ConsumerExstr) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExstr)
    				((ConsumerExstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExstr} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExstr} performing the operations.
     */
    static ConsumerExstr inSequence(Iterable<ConsumerEx<String>> consumers)
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
    		for(ConsumerEx<String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExstr)
    				((ConsumerExstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
