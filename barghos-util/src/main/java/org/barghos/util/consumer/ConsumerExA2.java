package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 2-dimensional array input argument and returns no
 * result.
 * Unlike {@link ConsumerA2} this may throw Exceptions.
 * {@link ConsumerExA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * 
 * @see ConsumerA2
 * @see ConsumerExA2
 * @see Consumer2A2
 * @see ConsumerEx2A2
 * @see Consumer3A2
 * @see ConsumerEx3A2
 * @see Consumer4A2
 * @see ConsumerEx4A2
 */
@FunctionalInterface
public interface ConsumerExA2<A> extends ConsumerEx<A[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptArray(A[][] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExA2} performing this operation and the operation after.
     */
    default ConsumerExA2<A> andThenArray(ConsumerExA2<A> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptArray(a); after.acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA2} performing this operation and the operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerExA2<A> andThenArray(ConsumerExA2<A>... after)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptArray(a); after[0].acceptArray(a);};

    	return (a) -> {acceptArray(a); for(ConsumerExA2<A> consumer : after) consumer.acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA2} performing this operation and the operations after.
     */
	default ConsumerExA2<A> andThenArray(Iterable<ConsumerExA2<A>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptArray(a); for(ConsumerExA2<A> consumer : after) consumer.acceptArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExA2} performing the operation before and this operation.
     */
    default ConsumerExA2<A> beforeThatArray(ConsumerExA2<A> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA2} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExA2<A> beforeThatArray(ConsumerExA2<A>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptArray(a); acceptArray(a);};
    	
    	return (a) -> {for(ConsumerExA2<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA2} performing the operations before and this operation.
     */
    default ConsumerExA2<A> beforeThatArray(Iterable<ConsumerExA2<A>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExA2<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExA2} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA2} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A> ConsumerExA2<A> inSequenceArray(ConsumerExA2<A>... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
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
    	
    	return (a) -> {for(ConsumerExA2<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExA2} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA2} performing the operations.
     */
    static <A> ConsumerExA2<A> inSequenceArray(Iterable<ConsumerExA2<A>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExA2<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][] a) throws Exception
    {
    	acceptArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExA2} performing this operation and the operation after.
     */
    default ConsumerExA2<A> andThen(ConsumerEx<A[][]> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof ConsumerExA2<A>)
    	{
    		final ConsumerExA2<A> originalAfter = (ConsumerExA2<A>)after;
    		
    		return (a) -> {acceptArray(a); originalAfter.acceptArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA2} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExA2<A> andThen(ConsumerEx<A[][]>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
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
    		 * If the passed operation is an instance of the desired type use it as the desired type
    		 * to avoid boxing.
    		 */
    		if(after[0] instanceof ConsumerExA2<A>)
        	{
        		final ConsumerExA2<A> originalAfter = (ConsumerExA2<A>)after[0];
        		
        		return (a) -> {acceptArray(a); originalAfter.acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptArray(a);
			
    		for(ConsumerEx<A[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA2<A>)
    				((ConsumerExA2<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA2} performing this operation and the operations after.
     */
	default ConsumerExA2<A> andThen(Iterable<ConsumerEx<A[][]>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
		return (a) -> {
			acceptArray(a);
			
    		for(ConsumerEx<A[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA2<A>)
    				((ConsumerExA2<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA2} performing the operation before and this operation.
     */
    default ConsumerExA2<A> beforeThat(ConsumerEx<A[][]> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(before instanceof ConsumerExA2<A>)
    	{
    		final ConsumerExA2<A> originalBefore = (ConsumerExA2<A>)before;
    		
    		return (a) -> {originalBefore.acceptArray(a); acceptArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA2} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExA2<A> beforeThat(ConsumerEx<A[][]>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
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
    		 * If the passed operation is an instance of the desired type use it as the desired type
    		 * to avoid boxing.
    		 */
    		if(before[0] instanceof ConsumerExA2<A>)
        	{
        		final ConsumerExA2<A> originalBefore = (ConsumerExA2<A>)before[0];
        		
        		return (a) -> {originalBefore.acceptArray(a); acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA2<A>)
    				((ConsumerExA2<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptArray(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA2} performing the operations before and this operation.
     */
    default ConsumerExA2<A> beforeThat(Iterable<ConsumerEx<A[][]>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA2<A>)
    				((ConsumerExA2<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA2} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A> ConsumerExA2<A> inSequence(ConsumerEx<A[][]>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation is an instance of
    	 * the desired type return the operation directly without wrapping. Otherwise wrap the
    	 * original operation in an operation of the desired type. The optimization prevents
    	 * unnecessary auto-boxing if possible and also unnecessary creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerExA2<A>)
    			return (ConsumerExA2<A>) consumers[0];
    		else
    			return (ConsumerExA2<A>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA2<A>)
    				((ConsumerExA2<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA2} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA2} performing the operations.
     */
    static <A> ConsumerExA2<A> inSequence(Iterable<ConsumerEx<A[][]>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is not possible to
    	 * optimize while composing the new operation composing the new operation anymore.
    	 * The optimization had to be postponed to execution of the composite operation.
    	 * The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA2<A>)
    				((ConsumerExA2<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a {@link ConsumerA2}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link ConsumerA2} performing the operations and exception handling.
     */
    default ConsumerA2<A> handled(ExceptionHandler handler)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(handler);
    	
    	return (a) -> {
    		try
    		{
    			acceptArray(a);
    		}
    		catch(Exception e)
    		{
    			handler.handle(e);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer. As the passed
     * consumer may throw an exception the returned consumer is again a {@link ConsumerExA2}
     * relaying the exceptions of the passed consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerExA2} performing the operations.
     */
    default ConsumerExA2<A> onException(ConsumerExA2<A> consumer)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumer);
    	
    	return (a) -> {
    		try
    		{
    			acceptArray(a);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptArray(a);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer. As the passed
     * consumer can not throw an exception the returned consumer is a {@link ConsumerA2}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerA2} performing the operations.
     */
    default ConsumerA2<A> onException(ConsumerA2<A> consumer)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumer);
    	
    	return (a) -> {
    		try
    		{
    			acceptArray(a);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptArray(a);
    		}
    	};
    }
}
