package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional array input argument
 * and returns no result. Unlike {@link Consumer2A} this may throw Exceptions.
 * {@link ConsumerEx2A} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
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
public interface ConsumerEx2A<A,B> extends ConsumerEx2<A[],B[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptArray(A[] a, B[] b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operation after.
     */
    default ConsumerEx2A<A,B> thenArray(ConsumerEx2A<A,B> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptArray(a, b); after.acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerEx2A<A,B> thenArray(ConsumerEx2A<A,B>... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptArray(a, b); after[0].acceptArray(a, b);};

    	return (a, b) -> {acceptArray(a, b); for(ConsumerEx2A<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
    
	/**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operations after.
     */
	default ConsumerEx2A<A,B> thenArray(java.util.List<ConsumerEx2A<A,B>> after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
		int size = after.size();
		
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b) -> {acceptArray(a, b); after.get(0).acceptArray(a, b);};

    	return (a, b) -> {acceptArray(a, b); for(ConsumerEx2A<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operations after.
     */
	default ConsumerEx2A<A,B> thenArray(Iterable<ConsumerEx2A<A,B>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a, b) -> {acceptArray(a, b); for(ConsumerEx2A<A,B> consumer : after) consumer.acceptArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing the operation before and
     * this operation.
     */
    default ConsumerEx2A<A,B> beforeArray(ConsumerEx2A<A,B> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2A<A,B> beforeArray(ConsumerEx2A<A,B>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptArray(a, b); acceptArray(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2A<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations before and
     * this operation.
     */
	default ConsumerEx2A<A,B> beforeArray(java.util.List<ConsumerEx2A<A,B>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b) -> {before.get(0).acceptArray(a, b); acceptArray(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2A<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations before and
     * this operation.
     */
    default ConsumerEx2A<A,B> beforeArray(Iterable<ConsumerEx2A<A,B>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {for(ConsumerEx2A<A,B> consumer : before) consumer.acceptArray(a, b); acceptArray(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B> ConsumerEx2A<A,B> sequenceArray(ConsumerEx2A<A,B>... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2A<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
    
	/**
     * Composes a new {@link ConsumerEx2A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
	static <A,B> ConsumerEx2A<A,B> sequenceArray(java.util.List<ConsumerEx2A<A,B>> consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
		int size = consumers.size();
		
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a, b) -> {for(ConsumerEx2A<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
	
    /**
     * Composes a new {@link ConsumerEx2A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
    static <A,B> ConsumerEx2A<A,B> sequenceArray(Iterable<ConsumerEx2A<A,B>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a, b) -> {for(ConsumerEx2A<A,B> consumer : consumers) consumer.acceptArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[] a, B[] b) throws Exception
    {
    	acceptArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operation after.
     */
    default ConsumerEx2A<A,B> then(ConsumerEx2<A[],B[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2A<A,B>)
    	{
    		final ConsumerEx2A<A,B> originalAfter = (ConsumerEx2A<A,B>)after;
    		
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
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2A<A,B> then(ConsumerEx2<A[],B[]>... after)
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
    		if(after[0] instanceof ConsumerEx2A<A,B>)
        	{
        		final ConsumerEx2A<A,B> originalAfter = (ConsumerEx2A<A,B>)after[0];
        		
        		return (a, b) -> {acceptArray(a, b); originalAfter.acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptArray(a, b);
			
    		for(ConsumerEx2<A[],B[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
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
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operations after.
     */
	default ConsumerEx2A<A,B> then(java.util.List<ConsumerEx2<A[],B[]>> after)
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
    		final ConsumerEx2<A[],B[]> first = after.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerEx2A<A,B>)
        	{
        		final ConsumerEx2A<A,B> originalAfter = (ConsumerEx2A<A,B>)first;
        		
        		return (a, b) -> {acceptArray(a, b); originalAfter.acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptArray(a, b); first.accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptArray(a, b);
			
    		for(ConsumerEx2<A[],B[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
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
     * @return A new {@link ConsumerEx2A} performing this operation and the
     * operations after.
     */
	default ConsumerEx2A<A,B> then(Iterable<ConsumerEx2<A[],B[]>> after)
    {
		Validation.validateNotNull("after", after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
		return (a, b) -> {
			acceptArray(a, b);
			
    		for(ConsumerEx2<A[],B[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
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
     * @return A new {@link ConsumerEx2A} performing the operation before and
     * this operation.
     */
    default ConsumerEx2A<A,B> before(ConsumerEx2<A[],B[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2A<A,B>)
    	{
    		final ConsumerEx2A<A,B> originalBefore = (ConsumerEx2A<A,B>)before;
    		
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
     * @return A new {@link ConsumerEx2A} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2A<A,B> before(ConsumerEx2<A[],B[]>... before)
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
    		if(before[0] instanceof ConsumerEx2A<A,B>)
        	{
        		final ConsumerEx2A<A,B> originalBefore = (ConsumerEx2A<A,B>)before[0];
        		
        		return (a, b) -> {originalBefore.acceptArray(a, b); acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[],B[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
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
     * @return A new {@link ConsumerEx2A} performing the operations before and
     * this operation.
     */
    default ConsumerEx2A<A,B> before(java.util.List<ConsumerEx2<A[],B[]>> before)
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
    		final ConsumerEx2<A[],B[]> first = before.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerEx2A<A,B>)
        	{
        		final ConsumerEx2A<A,B> originalBefore = (ConsumerEx2A<A,B>)first;
        		
        		return (a, b) -> {originalBefore.acceptArray(a, b); acceptArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {first.accept(a, b); acceptArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[],B[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
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
     * @return A new {@link ConsumerEx2A} performing the operations before and
     * this operation.
     */
    default ConsumerEx2A<A,B> before(Iterable<ConsumerEx2<A[],B[]>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[],B[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B> ConsumerEx2A<A,B> sequence(ConsumerEx2<A[],B[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2A<A,B>)
    			return (ConsumerEx2A<A,B>) consumers[0];
    		else
    			return (ConsumerEx2A<A,B>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[],B[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
	static <A,B> ConsumerEx2A<A,B> sequence(java.util.List<ConsumerEx2<A[],B[]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	int size = consumers.size();
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a, b) -> {};
    	
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
    		final ConsumerEx2<A[],B[]> first = consumers.get(0);
    		
    		if(first instanceof ConsumerEx2A<A,B>)
    			return (ConsumerEx2A<A,B>) first;
    		else
    			return (ConsumerEx2A<A,B>) first::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[],B[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2A} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
    static <A,B> ConsumerEx2A<A,B> sequence(Iterable<ConsumerEx2<A[],B[]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<A[],B[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2A<A,B>)
    				((ConsumerEx2A<A,B>)consumer).acceptArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link Consumer2A}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer2A} performing the operations and exception
     * handling.
     */
    default Consumer2A<A,B> handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
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
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer may throw an exception the returned consumer is
     * again a {@link ConsumerEx2A} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx2A} performing the operations.
     */
    default ConsumerEx2A<A,B> onException(ConsumerEx2A<A,B> consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
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
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link Consumer2A}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer2A} performing the operations.
     */
    default Consumer2A<A,B> onException(Consumer2A<A,B> consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
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
