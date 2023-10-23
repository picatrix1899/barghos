package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 2-dimensional array input argument
 * and returns no result. Unlike {@link Consumer3A2} this may throw Exceptions.
 * {@link ConsumerEx3A2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptArray}.
 * 
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
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
public interface ConsumerEx3A2<A,B,C> extends ConsumerEx3<A[][],B[][],C[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptArray(A[][] a, B[][] b, C[][] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operation after.
     */
    default ConsumerEx3A2<A,B,C> thenArray(ConsumerEx3A2<A,B,C> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptArray(a, b, c); after.acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operations after.
     */
	@SuppressWarnings("unchecked")
	default ConsumerEx3A2<A,B,C> thenArray(ConsumerEx3A2<A,B,C>... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptArray(a, b, c); after[0].acceptArray(a, b, c);};

    	return (a, b, c) -> {acceptArray(a, b, c); for(ConsumerEx3A2<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operations after.
     */
	default ConsumerEx3A2<A,B,C> thenArray(java.util.List<ConsumerEx3A2<A,B,C>> after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
		int size = after.size();
		
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b, c) -> {acceptArray(a, b, c); after.get(0).acceptArray(a, b, c);};

    	return (a, b, c) -> {acceptArray(a, b, c); for(ConsumerEx3A2<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operations after.
     */
	default ConsumerEx3A2<A,B,C> thenArray(Iterable<ConsumerEx3A2<A,B,C>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a, b, c) -> {acceptArray(a, b, c); for(ConsumerEx3A2<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operation before and
     * this operation.
     */
    default ConsumerEx3A2<A,B,C> beforeArray(ConsumerEx3A2<A,B,C> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3A2<A,B,C> beforeArray(ConsumerEx3A2<A,B,C>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptArray(a, b, c); acceptArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3A2<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3} performing the operations before and
     * this operation.
     */
	default ConsumerEx3A2<A,B,C> beforeArray(java.util.List<ConsumerEx3A2<A,B,C>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b, c) -> {before.get(0).acceptArray(a, b, c); acceptArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3A2<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations before and
     * this operation.
     */
    default ConsumerEx3A2<A,B,C> beforeArray(Iterable<ConsumerEx3A2<A,B,C>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {for(ConsumerEx3A2<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B,C> ConsumerEx3A2<A,B,C> sequenceArray(ConsumerEx3A2<A,B,C>... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(ConsumerEx3A2<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Composes a new {@link ConsumerEx3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
	static <A,B,C> ConsumerEx3A2<A,B,C> sequenceArray(java.util.List<ConsumerEx3A2<A,B,C>> consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
		int size = consumers.size();
		
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(size == 1) return consumers.get(0);
    	
    	return (a, b, c) -> {for(ConsumerEx3A2<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
	
    /**
     * Composes a new {@link ConsumerEx3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
    static <A,B,C> ConsumerEx3A2<A,B,C> sequenceArray(Iterable<ConsumerEx3A2<A,B,C>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3A2<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][] a, B[][] b, C[][] c) throws Exception
    {
    	acceptArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operation after.
     */
    default ConsumerEx3A2<A,B,C> then(ConsumerEx3<A[][],B[][],C[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3A2<A,B,C>)
    	{
    		final ConsumerEx3A2<A,B,C> originalAfter = (ConsumerEx3A2<A,B,C>)after;
    		
    		return (a, b, c) -> {acceptArray(a, b, c); originalAfter.acceptArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3A2<A,B,C> then(ConsumerEx3<A[][],B[][],C[][]>... after)
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
    		if(after[0] instanceof ConsumerEx3A2<A,B,C>)
        	{
        		final ConsumerEx3A2<A,B,C> originalAfter = (ConsumerEx3A2<A,B,C>)after[0];
        		
        		return (a, b, c) -> {acceptArray(a, b, c); originalAfter.acceptArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptArray(a, b, c);
			
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operations after.
     */
	default ConsumerEx3A2<A,B,C> then(java.util.List<ConsumerEx3<A[][],B[][],C[][]>> after)
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
    		final ConsumerEx3<A[][],B[][],C[][]> first = after.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerEx3A2<A,B,C>)
        	{
        		final ConsumerEx3A2<A,B,C> originalAfter = (ConsumerEx3A2<A,B,C>)first;
        		
        		return (a, b, c) -> {acceptArray(a, b, c); originalAfter.acceptArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptArray(a, b, c); first.accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptArray(a, b, c);
			
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing this operation and the
     * operations after.
     */
	default ConsumerEx3A2<A,B,C> then(Iterable<ConsumerEx3<A[][],B[][],C[][]>> after)
    {
		Validation.validateNotNull("after", after);
		
		/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
		return (a, b, c) -> {
			acceptArray(a, b, c);
			
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operation before and
     * this operation.
     */
    default ConsumerEx3A2<A,B,C> before(ConsumerEx3<A[][],B[][],C[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3A2<A,B,C>)
    	{
    		final ConsumerEx3A2<A,B,C> originalBefore = (ConsumerEx3A2<A,B,C>)before;
    		
    		return (a, b, c) -> {originalBefore.acceptArray(a, b, c); acceptArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3A2<A,B,C> before(ConsumerEx3<A[][],B[][],C[][]>... before)
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
    		if(before[0] instanceof ConsumerEx3A2<A,B,C>)
        	{
        		final ConsumerEx3A2<A,B,C> originalBefore = (ConsumerEx3A2<A,B,C>)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptArray(a, b, c); acceptArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptArray(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations before and
     * this operation.
     */
    default ConsumerEx3A2<A,B,C> before(java.util.List<ConsumerEx3<A[][],B[][],C[][]>> before)
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
    		final ConsumerEx3<A[][],B[][],C[][]> first = before.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof ConsumerEx3A2<A,B,C>)
        	{
        		final ConsumerEx3A2<A,B,C> originalBefore = (ConsumerEx3A2<A,B,C>)first;
        		
        		return (a, b, c) -> {originalBefore.acceptArray(a, b, c); acceptArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {first.accept(a, b, c); acceptArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptArray(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations before and
     * this operation.
     */
    default ConsumerEx3A2<A,B,C> before(Iterable<ConsumerEx3<A[][],B[][],C[][]>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B,C> ConsumerEx3A2<A,B,C> sequence(ConsumerEx3<A[][],B[][],C[][]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx3A2<A,B,C>)
    			return (ConsumerEx3A2<A,B,C>) consumers[0];
    		else
    			return (ConsumerEx3A2<A,B,C>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
	static <A,B,C> ConsumerEx3A2<A,B,C> sequence(java.util.List<ConsumerEx3<A[][],B[][],C[][]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	int size = consumers.size();
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(size == 0) return (a, b, c) -> {};
    	
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
    		final ConsumerEx3<A[][],B[][],C[][]> first = consumers.get(0);
    		
    		if(first instanceof ConsumerEx3A2<A,B,C>)
    			return (ConsumerEx3A2<A,B,C>) first;
    		else
    			return (ConsumerEx3A2<A,B,C>) first::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
    static <A,B,C> ConsumerEx3A2<A,B,C> sequence(Iterable<ConsumerEx3<A[][],B[][],C[][]>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed it is
    	 * not possible to optimize while composing the new operation composing
    	 * the new operation anymore. The optimization had to be postponed to
    	 * execution of the composite operation. The optimization prevents
    	 * unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<A[][],B[][],C[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3A2<A,B,C>)
    				((ConsumerEx3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link Consumer3A2}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer3A2} performing the operations and exception
     * handling.
     */
    default Consumer3A2<A,B,C> handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a, b, c) -> {
    		try
    		{
    			acceptArray(a, b, c);
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
     * again a {@link ConsumerEx3A2} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx3A2} performing the operations.
     */
    default ConsumerEx3A2<A,B,C> onException(ConsumerEx3A2<A,B,C> consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b, c) -> {
    		try
    		{
    			acceptArray(a, b, c);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptArray(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link Consumer3A2}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
    default Consumer3A2<A,B,C> onException(Consumer3A2<A,B,C> consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b, c) -> {
    		try
    		{
    			acceptArray(a, b, c);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptArray(a, b, c);
    		}
    	};
    }
}
