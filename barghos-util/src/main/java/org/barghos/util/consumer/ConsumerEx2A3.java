package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 2-dimensional array input argument and returns no
 * result.
 * Unlike {@link Consumer2A3} this may throw Exceptions.
 * {@link ConsumerEx2A3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * 
 * @see ConsumerA3
 * @see ConsumerExA3
 * @see Consumer2A3
 * @see ConsumerEx2A3
 * @see Consumer3A3
 * @see ConsumerEx3A3
 * @see Consumer4A3
 * @see ConsumerEx4A3
 */
@FunctionalInterface
public interface ConsumerEx2A3<A,B> extends ConsumerEx2<A[][][],B[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptArray(A[][][] a, B[][][] b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing this operation and the operation after.
     */
    default ConsumerEx2A3<A,B> andThenArray(ConsumerEx2A3<A,B> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptArray(a, b); after.acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing this operation and the operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerEx2A3<A,B> andThenArray(ConsumerEx2A3<A,B>... after)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptArray(a, b); after[0].acceptArray(a, b);};

    	return (a, b) -> {acceptArray(a, b); for(ConsumerEx2A3<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing this operation and the operations after.
     */
	default ConsumerEx2A3<A,B> andThenArray(Iterable<ConsumerEx2A3<A,B>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptArray(a, b); for(ConsumerEx2A3<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operation before and this operation.
     */
    default ConsumerEx2A3<A,B> beforeThatArray(ConsumerEx2A3<A,B> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2A3<A,B> beforeThatArray(ConsumerEx2A3<A,B>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptArray(a, b); acceptArray(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2A3<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations before and this operation.
     */
    default ConsumerEx2A3<A,B> beforeThatArray(Iterable<ConsumerEx2A3<A,B>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2A3<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B> ConsumerEx2A3<A,B> inSequenceArray(ConsumerEx2A3<A,B>... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(ConsumerEx2A3<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations.
     */
    static <A,B> ConsumerEx2A3<A,B> inSequenceArray(Iterable<ConsumerEx2A3<A,B>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2A3<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][][] a, B[][][] b) throws Exception
    {
    	acceptArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing this operation and the operation after.
     */
    default ConsumerEx2A3<A,B> andThen(ConsumerEx2<A[][][],B[][][]> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof ConsumerEx2A3<A,B>)
    	{
    		final ConsumerEx2A3<A,B> originalAfter = (ConsumerEx2A3<A,B>)after;
    		
    		return (a, b) -> {acceptArray(a, b); originalAfter.acceptArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2A3<A,B> andThen(ConsumerEx2<A[][][],B[][][]>... after)
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
    		if(after[0] instanceof ConsumerEx2A3<A,B>)
        	{
        		final ConsumerEx2A3<A,B> originalAfter = (ConsumerEx2A3<A,B>)after[0];
        		
        		return (a, b) -> {acceptArray(a, b); originalAfter.acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptArray(a, b);
			
    		for(ConsumerEx2<A[][][],B[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2A3<A,B>)
    				((ConsumerEx2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing this operation and the operations after.
     */
	default ConsumerEx2A3<A,B> andThen(Iterable<ConsumerEx2<A[][][],B[][][]>> after)
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
		return (a, b) -> {
			acceptArray(a, b);
			
    		for(ConsumerEx2<A[][][],B[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2A3<A,B>)
    				((ConsumerEx2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operation before and this operation.
     */
    default ConsumerEx2A3<A,B> beforeThat(ConsumerEx2<A[][][],B[][][]> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as the desired type to
		 * avoid boxing.
		 */
    	if(before instanceof ConsumerEx2A3<A,B>)
    	{
    		final ConsumerEx2A3<A,B> originalBefore = (ConsumerEx2A3<A,B>)before;
    		
    		return (a, b) -> {originalBefore.acceptArray(a, b); acceptArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2A3<A,B> beforeThat(ConsumerEx2<A[][][],B[][][]>... before)
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
    		if(before[0] instanceof ConsumerEx2A3<A,B>)
        	{
        		final ConsumerEx2A3<A,B> originalBefore = (ConsumerEx2A3<A,B>)before[0];
        		
        		return (a, b) -> {originalBefore.acceptArray(a, b); acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[][][],B[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2A3<A,B>)
    				((ConsumerEx2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptArray(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations before and this operation.
     */
    default ConsumerEx2A3<A,B> beforeThat(Iterable<ConsumerEx2<A[][][],B[][][]>> before)
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
    	return (a, b) -> {
    		for(ConsumerEx2<A[][][],B[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2A3<A,B>)
    				((ConsumerEx2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B> ConsumerEx2A3<A,B> inSequence(ConsumerEx2<A[][][],B[][][]>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null. Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation is an instance of
    	 * the desired type return the operation directly without wrapping. Otherwise wrap the
    	 * original operation in an operation of the desired type. The optimization prevents
    	 * unnecessary auto-boxing if possible and also unnecessary creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerEx2A3<A,B>)
    			return (ConsumerEx2A3<A,B>) consumers[0];
    		else
    			return (ConsumerEx2A3<A,B>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while composing the new
    	 * operation anymore. The optimization had to be postponed to execution of the composite
    	 * operation. The optimization prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[][][],B[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2A3<A,B>)
    				((ConsumerEx2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A3} performing the given operations in sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations.
     */
    static <A,B> ConsumerEx2A3<A,B> inSequence(Iterable<ConsumerEx2<A[][][],B[][][]>> consumers)
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
    	return (a, b) -> {
    		for(ConsumerEx2<A[][][],B[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2A3<A,B>)
    				((ConsumerEx2A3<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a {@link Consumer2A3}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer2A3} performing the operations and exception handling.
     */
    default Consumer2A3<A,B> handled(ExceptionHandler handler)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(handler);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptArray(a, b);
    		}
    		catch(Exception e)
    		{
    			handler.handle(e);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer. As the passed
     * consumer may throw an exception the returned consumer is again a {@link ConsumerEx2A3}
     * relaying the exceptions of the passed consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx2A3} performing the operations.
     */
    default ConsumerEx2A3<A,B> onException(ConsumerEx2A3<A,B> consumer)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptArray(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptArray(a, b);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer. As the passed
     * consumer can not throw an exception the returned consumer is a {@link Consumer2A3}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer2A3} performing the operations.
     */
    default Consumer2A3<A,B> onException(Consumer2A3<A,B> consumer)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptArray(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptArray(a, b);
    		}
    	};
    }
}
