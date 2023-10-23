package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 3-dimensional array input argument
 * and returns no result. Unlike {@link ConsumerA3} this may throw Exceptions.
 * {@link ConsumerExA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
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
public interface ConsumerExA3<A> extends ConsumerEx<A[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptArray(A[][][] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operation after.
     */
    default ConsumerExA3<A> thenArray(ConsumerExA3<A> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptArray(a); after.acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerExA3<A> thenArray(ConsumerExA3<A>... after)
    {
		Validation.validateNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptArray(a); after[0].acceptArray(a);};

    	return (a) -> {acceptArray(a); for(ConsumerExA3<A> consumer : after) consumer.acceptArray(a);};
    }
    
	/**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operations after.
     */
	default ConsumerExA3<A> thenArray(java.util.List<ConsumerExA3<A>> after)
    {
		Validation.validateNotNull("after", after);
    	
		int size = after.size();
		
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {acceptArray(a); after.get(0).acceptArray(a);};

    	return (a) -> {acceptArray(a); for(ConsumerExA3<A> consumer : after) consumer.acceptArray(a);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operations after.
     */
	default ConsumerExA3<A> thenArray(Iterable<ConsumerExA3<A>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a) -> {acceptArray(a); for(ConsumerExA3<A> consumer : after) consumer.acceptArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExA3} performing the operation before and
     * this operation.
     */
    default ConsumerExA3<A> beforeArray(ConsumerExA3<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExA3<A> beforeArray(ConsumerExA3<A>... before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptArray(a); acceptArray(a);};
    	
    	return (a) -> {for(ConsumerExA3<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA3} performing the operations before and
     * this operation.
     */
	default ConsumerExA3<A> beforeArray(java.util.List<ConsumerExA3<A>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {before.get(0).acceptArray(a); acceptArray(a);};
    	
    	return (a) -> {for(ConsumerExA3<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA3} performing the operations before and
     * this operation.
     */
    default ConsumerExA3<A> beforeArray(Iterable<ConsumerExA3<A>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {for(ConsumerExA3<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExA3} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A> ConsumerExA3<A> sequenceArray(ConsumerExA3<A>... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerExA3<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
	/**
     * Composes a new {@link ConsumerExA3} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
	static <A> ConsumerExA3<A> sequenceArray(java.util.List<ConsumerExA3<A>> consumers)
    {
		Validation.validateNotNull("consumers", consumers);
    	
		int size = consumers.size();
		
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a) -> {for(ConsumerExA3<A> consumer : consumers) consumer.acceptArray(a);};
    }
	
    /**
     * Composes a new {@link ConsumerExA3} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
    static <A> ConsumerExA3<A> sequenceArray(Iterable<ConsumerExA3<A>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a) -> {for(ConsumerExA3<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][][] a) throws Exception
    {
    	acceptArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operation after.
     */
    default ConsumerExA3<A> then(ConsumerEx<A[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExA3<A>)
    	{
    		final ConsumerExA3<A> originalAfter = (ConsumerExA3<A>)after;
    		
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
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExA3<A> then(ConsumerEx<A[][][]>... after)
    {
    	Validation.validateNotNull("after", after);
    	
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
    		if(after[0] instanceof ConsumerExA3<A>)
        	{
        		final ConsumerExA3<A> originalAfter = (ConsumerExA3<A>)after[0];
        		
        		return (a) -> {acceptArray(a); originalAfter.acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptArray(a);
			
    		for(ConsumerEx<A[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operations after.
     */
	default ConsumerExA3<A> then(java.util.List<ConsumerEx<A[][][]>> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	int size = after.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(size == 1)
    	{
    		final ConsumerEx<A[][][]> first = after.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerExA3<A>)
        	{
        		final ConsumerExA3<A> originalAfter = (ConsumerExA3<A>)first;
        		
        		return (a) -> {acceptArray(a); originalAfter.acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptArray(a); first.accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptArray(a);
			
    		for(ConsumerEx<A[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA3} performing this operation and the
     * operations after.
     */
	default ConsumerExA3<A> then(Iterable<ConsumerEx<A[][][]>> after)
    {
		Validation.validateNotNull("after", after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
		return (a) -> {
			acceptArray(a);
			
    		for(ConsumerEx<A[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA3} performing the operation before and
     * this operation.
     */
    default ConsumerExA3<A> before(ConsumerEx<A[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExA3<A>)
    	{
    		final ConsumerExA3<A> originalBefore = (ConsumerExA3<A>)before;
    		
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
     * @return A new {@link ConsumerExA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExA3<A> before(ConsumerEx<A[][][]>... before)
    {
    	Validation.validateNotNull("before", before);
    	
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
    		if(before[0] instanceof ConsumerExA3<A>)
        	{
        		final ConsumerExA3<A> originalBefore = (ConsumerExA3<A>)before[0];
        		
        		return (a) -> {originalBefore.acceptArray(a); acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA3} performing the operations before and
     * this operation.
     */
    default ConsumerExA3<A> before(java.util.List<ConsumerEx<A[][][]>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(size == 1)
    	{
    		final ConsumerEx<A[][][]> first = before.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerExA3<A>)
        	{
        		final ConsumerExA3<A> originalBefore = (ConsumerExA3<A>)first;
        		
        		return (a) -> {originalBefore.acceptArray(a); acceptArray(a);};
        	}
        	else
        	{
        		return (a) -> {first.accept(a); acceptArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA3} performing the operations before and
     * this operation.
     */
    default ConsumerExA3<A> before(Iterable<ConsumerEx<A[][][]>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA3} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A> ConsumerExA3<A> sequence(ConsumerEx<A[][][]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
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
    		if(consumers[0] instanceof ConsumerExA3<A>)
    			return (ConsumerExA3<A>) consumers[0];
    		else
    			return (ConsumerExA3<A>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA3} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
	static <A> ConsumerExA3<A> sequence(java.util.List<ConsumerEx<A[][][]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	int size = consumers.size();
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly
    	 * without wrapping. Otherwise wrap the original operation in an
    	 * operation of the desired type. The optimization prevents unnecessary
    	 * auto-boxing if possible and also unnecessary creation of a new
    	 * operation.
    	 */
    	if(size == 1)
    	{
    		final ConsumerEx<A[][][]> first = consumers.get(0);
    		
    		if(first instanceof ConsumerExA3<A>)
    			return (ConsumerExA3<A>) first;
    		else
    			return (ConsumerExA3<A>) first::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA3} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
    static <A> ConsumerExA3<A> sequence(Iterable<ConsumerEx<A[][][]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA3<A>)
    				((ConsumerExA3<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link ConsumerA3}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link ConsumerA3} performing the operations and exception
     * handling.
     */
    default ConsumerA3<A> handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
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
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer may throw an exception the returned consumer is
     * again a {@link ConsumerExA3} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerExA3} performing the operations.
     */
    default ConsumerExA3<A> onException(ConsumerExA3<A> consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
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
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link ConsumerA3}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerA3} performing the operations.
     */
    default ConsumerA3<A> onException(ConsumerA3<A> consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
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
