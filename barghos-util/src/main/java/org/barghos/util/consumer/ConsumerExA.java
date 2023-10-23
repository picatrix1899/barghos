package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional array input argument
 * and returns no result. Unlike {@link ConsumerA} this may throw Exceptions.
 * {@link ConsumerExA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * 
 * @see ConsumerA
 * @see ConsumerExA
 * @see Consumer2A
 * @see ConsumerEx2A
 * @see Consumer3A
 * @see ConsumerEx3A
 * @see Consumer4A
 * @see ConsumerEx4A
 */
@FunctionalInterface
public interface ConsumerExA<A> extends ConsumerEx<A[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptArray(A[] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExA} performing this operation and the
     * operation after.
     */
    default ConsumerExA<A> thenArray(ConsumerExA<A> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptArray(a); after.acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA} performing this operation and the
     * operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerExA<A> thenArray(ConsumerExA<A>... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptArray(a); after[0].acceptArray(a);};

    	return (a) -> {acceptArray(a); for(ConsumerExA<A> consumer : after) consumer.acceptArray(a);};
    }
    
	/**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA} performing this operation and the
     * operations after.
     */
	default ConsumerExA<A> thenArray(java.util.List<ConsumerExA<A>> after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
		int size = after.size();
		
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {acceptArray(a); after.get(0).acceptArray(a);};

    	return (a) -> {acceptArray(a); for(ConsumerExA<A> consumer : after) consumer.acceptArray(a);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExA} performing this operation and the
     * operations after.
     */
	default ConsumerExA<A> thenArray(Iterable<ConsumerExA<A>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a) -> {acceptArray(a); for(ConsumerExA<A> consumer : after) consumer.acceptArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExA} performing the operation before and
     * this operation.
     */
    default ConsumerExA<A> beforeArray(ConsumerExA<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExA<A> beforeArray(ConsumerExA<A>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptArray(a); acceptArray(a);};
    	
    	return (a) -> {for(ConsumerExA<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA} performing the operations before and
     * this operation.
     */
	default ConsumerExA<A> beforeArray(java.util.List<ConsumerExA<A>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {before.get(0).acceptArray(a); acceptArray(a);};
    	
    	return (a) -> {for(ConsumerExA<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExA} performing the operations before and
     * this operation.
     */
    default ConsumerExA<A> beforeArray(Iterable<ConsumerExA<A>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {for(ConsumerExA<A> consumer : before) consumer.acceptArray(a); acceptArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExA} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A> ConsumerExA<A> sequenceArray(ConsumerExA<A>... consumers)
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
    	
    	return (a) -> {for(ConsumerExA<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
	/**
     * Composes a new {@link ConsumerExA} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
	static <A> ConsumerExA<A> sequenceArray(java.util.List<ConsumerExA<A>> consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
		int size = consumers.size();
		
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a) -> {for(ConsumerExA<A> consumer : consumers) consumer.acceptArray(a);};
    }
	
    /**
     * Composes a new {@link ConsumerExA} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
    static <A> ConsumerExA<A> sequenceArray(Iterable<ConsumerExA<A>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a) -> {for(ConsumerExA<A> consumer : consumers) consumer.acceptArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[] a) throws Exception
    {
    	acceptArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExA} performing this operation and the
     * operation after.
     */
    default ConsumerExA<A> then(ConsumerEx<A[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExA<A>)
    	{
    		final ConsumerExA<A> originalAfter = (ConsumerExA<A>)after;
    		
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
     * @return A new {@link ConsumerExA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExA<A> then(ConsumerEx<A[]>... after)
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
    		if(after[0] instanceof ConsumerExA<A>)
        	{
        		final ConsumerExA<A> originalAfter = (ConsumerExA<A>)after[0];
        		
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
			
    		for(ConsumerEx<A[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA} performing this operation and the
     * operations after.
     */
	default ConsumerExA<A> then(java.util.List<ConsumerEx<A[]>> after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
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
    		final ConsumerEx<A[]> first = after.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerExA<A>)
        	{
        		final ConsumerExA<A> originalAfter = (ConsumerExA<A>)first;
        		
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
			
    		for(ConsumerEx<A[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA} performing this operation and the
     * operations after.
     */
	default ConsumerExA<A> then(Iterable<ConsumerEx<A[]>> after)
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
			
    		for(ConsumerEx<A[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA} performing the operation before and
     * this operation.
     */
    default ConsumerExA<A> before(ConsumerEx<A[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExA<A>)
    	{
    		final ConsumerExA<A> originalBefore = (ConsumerExA<A>)before;
    		
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
     * @return A new {@link ConsumerExA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExA<A> before(ConsumerEx<A[]>... before)
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
    		if(before[0] instanceof ConsumerExA<A>)
        	{
        		final ConsumerExA<A> originalBefore = (ConsumerExA<A>)before[0];
        		
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
    		for(ConsumerEx<A[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA} performing the operations before and
     * this operation.
     */
    default ConsumerExA<A> before(java.util.List<ConsumerEx<A[]>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
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
    		final ConsumerEx<A[]> first = before.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerExA<A>)
        	{
        		final ConsumerExA<A> originalBefore = (ConsumerExA<A>)first;
        		
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
    		for(ConsumerEx<A[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
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
     * @return A new {@link ConsumerExA} performing the operations before and
     * this operation.
     */
    default ConsumerExA<A> before(Iterable<ConsumerEx<A[]>> before)
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
    		for(ConsumerEx<A[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A> ConsumerExA<A> sequence(ConsumerEx<A[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerExA<A>)
    			return (ConsumerExA<A>) consumers[0];
    		else
    			return (ConsumerExA<A>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
	static <A> ConsumerExA<A> sequence(java.util.List<ConsumerEx<A[]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
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
    		final ConsumerEx<A[]> first = consumers.get(0);
    		
    		if(first instanceof ConsumerExA<A>)
    			return (ConsumerExA<A>) first;
    		else
    			return (ConsumerExA<A>) first::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<A[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExA} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
    static <A> ConsumerExA<A> sequence(Iterable<ConsumerEx<A[]>> consumers)
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
    		for(ConsumerEx<A[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExA<A>)
    				((ConsumerExA<A>)consumer).acceptArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link ConsumerA}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link ConsumerA} performing the operations and exception
     * handling.
     */
    default ConsumerA<A> handled(ExceptionHandler handler)
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
     * again a {@link ConsumerExA} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerExA} performing the operations.
     */
    default ConsumerExA<A> onException(ConsumerExA<A> consumer)
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
     * is a {@link ConsumerA}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerA} performing the operations.
     */
    default ConsumerA<A> onException(ConsumerA<A> consumer)
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
