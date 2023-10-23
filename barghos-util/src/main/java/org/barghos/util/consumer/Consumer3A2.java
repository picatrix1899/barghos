package org.barghos.util.consumer;

import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 2-dimensional array input
 * arguments and returns no result. {@link Consumer3A2} is expected to operate
 * via side-effects.
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
public interface Consumer3A2<A,B,C> extends Consumer3<A[][],B[][],C[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptArray(A[][] a, B[][] b, C[][] c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3A2} performing this operation and the
     * operation after.
     */
    default Consumer3A2<A,B,C> thenArray(Consumer3A2<A,B,C> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptArray(a, b, c); after.acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A2} performing this operation and the
     * operations after.
     */
	@SuppressWarnings("unchecked")
	default Consumer3A2<A,B,C> thenArray(Consumer3A2<A,B,C>... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptArray(a, b, c); after[0].acceptArray(a, b, c);};

    	return (a, b, c) -> {acceptArray(a, b, c); for(Consumer3A2<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A2} performing this operation and the
     * operations after.
     */
	default Consumer3A2<A,B,C> thenArray(java.util.List<Consumer3A2<A,B,C>> after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
		int size = after.size();
		
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b, c) -> {acceptArray(a, b, c); after.get(0).acceptArray(a, b, c);};

    	return (a, b, c) -> {acceptArray(a, b, c); for(Consumer3A2<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3A2} performing this operation and the
     * operations after.
     */
	default Consumer3A2<A,B,C> thenArray(Iterable<Consumer3A2<A,B,C>> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a, b, c) -> {acceptArray(a, b, c); for(Consumer3A2<A,B,C> consumer : after) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3A2} performing the operation before and
     * this operation.
     */
    default Consumer3A2<A,B,C> beforeArray(Consumer3A2<A,B,C> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
	default Consumer3A2<A,B,C> beforeArray(Consumer3A2<A,B,C>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptArray(a, b, c); acceptArray(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3A2<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A2} performing the operations before and
     * this operation.
     */
	default Consumer3A2<A,B,C> beforeArray(java.util.List<Consumer3A2<A,B,C>> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a, b, c) -> {before.get(0).acceptArray(a, b, c); acceptArray(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3A2<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3A2} performing the operations before and
     * this operation.
     */
    default Consumer3A2<A,B,C> beforeArray(Iterable<Consumer3A2<A,B,C>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {for(Consumer3A2<A,B,C> consumer : before) consumer.acceptArray(a, b, c); acceptArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
	@SuppressWarnings("unchecked")
	static <A,B,C> Consumer3A2<A,B,C> sequenceArray(Consumer3A2<A,B,C>... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3A2<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
    
	/**
     * Composes a new {@link Consumer3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
	static <A,B,C> Consumer3A2<A,B,C> sequenceArray(java.util.List<Consumer3A2<A,B,C>> consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3A2<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
	
    /**
     * Composes a new {@link Consumer3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
    static <A,B,C> Consumer3A2<A,B,C> sequenceArray(Iterable<Consumer3A2<A,B,C>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a, b, c) -> {for(Consumer3A2<A,B,C> consumer : consumers) consumer.acceptArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptArray} instead.
     */
    @Override
    @Deprecated
    default void accept(A[][] a, B[][] b, C[][] c)
    {
    	acceptArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3A2} performing this operation and the
     * operation after.
     */
    default Consumer3A2<A,B,C> then(Consumer3<A[][],B[][],C[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to
		 * avoid boxing.
		 */
    	if(after instanceof Consumer3A2<A,B,C>)
    	{
    		final Consumer3A2<A,B,C> originalAfter = (Consumer3A2<A,B,C>)after;
    		
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
     * @return A new {@link Consumer3A2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3A2<A,B,C> then(Consumer3<A[][],B[][],C[][]>... after)
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
    		if(after[0] instanceof Consumer3A2<A,B,C>)
        	{
        		final Consumer3A2<A,B,C> originalAfter = (Consumer3A2<A,B,C>)after[0];
        		
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
			
    		for(Consumer3<A[][],B[][],C[][]> consumer : after)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
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
     * @return A new {@link Consumer3A2} performing this operation and the
     * operations after.
     */
	default Consumer3A2<A,B,C> then(java.util.List<Consumer3<A[][],B[][],C[][]>> after)
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
    		final Consumer3<A[][],B[][],C[][]> first = after.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof Consumer3A2<A,B,C>)
        	{
        		final Consumer3A2<A,B,C> originalAfter = (Consumer3A2<A,B,C>)first;
        		
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
			
    		for(Consumer3<A[][],B[][],C[][]> consumer : after)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
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
     * @return A new {@link Consumer3A2} performing this operation and the
     * operations after.
     */
	default Consumer3A2<A,B,C> then(Iterable<Consumer3<A[][],B[][],C[][]>> after)
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
			
    		for(Consumer3<A[][],B[][],C[][]> consumer : after)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
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
     * @return A new {@link Consumer3A2} performing the operation before and
     * this operation.
     */
    default Consumer3A2<A,B,C> before(Consumer3<A[][],B[][],C[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3A2<A,B,C>)
    	{
    		final Consumer3A2<A,B,C> originalBefore = (Consumer3A2<A,B,C>)before;
    		
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
     * @return A new {@link Consumer3A2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3A2<A,B,C> before(Consumer3<A[][],B[][],C[][]>... before)
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
    		if(before[0] instanceof Consumer3A2<A,B,C>)
        	{
        		final Consumer3A2<A,B,C> originalBefore = (Consumer3A2<A,B,C>)before[0];
        		
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
    		for(Consumer3<A[][],B[][],C[][]> consumer : before)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
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
     * @return A new {@link Consumer3A2} performing the operations before and
     * this operation.
     */
    default Consumer3A2<A,B,C> before(java.util.List<Consumer3<A[][],B[][],C[][]>> before)
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
    		final Consumer3<A[][],B[][],C[][]> first = before.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(first instanceof Consumer3A2<A,B,C>)
        	{
        		final Consumer3A2<A,B,C> originalBefore = (Consumer3A2<A,B,C>)first;
        		
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
    		for(Consumer3<A[][],B[][],C[][]> consumer : before)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
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
     * @return A new {@link Consumer3A2} performing the operations before and
     * this operation.
     */
    default Consumer3A2<A,B,C> before(Iterable<Consumer3<A[][],B[][],C[][]>> before)
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
    		for(Consumer3<A[][],B[][],C[][]> consumer : before)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static <A,B,C> Consumer3A2<A,B,C> sequence(Consumer3<A[][],B[][],C[][]>... consumers)
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
    		if(consumers[0] instanceof Consumer3A2<A,B,C>)
    			return (Consumer3A2<A,B,C>) consumers[0];
    		else
    			return (Consumer3A2<A,B,C>) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<A[][],B[][],C[][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
	static <A,B,C> Consumer3A2<A,B,C> sequence(java.util.List<Consumer3<A[][],B[][],C[][]>> consumers)
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
    		final Consumer3<A[][],B[][],C[][]> first = consumers.get(0);
    		
    		if(first instanceof Consumer3A2<A,B,C>)
    			return (Consumer3A2<A,B,C>) first;
    		else
    			return (Consumer3A2<A,B,C>) first::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<A[][],B[][],C[][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3A2} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * @param <B> The type of the second argument to the operation.
     * @param <C> The type of the third argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3A2} performing the operations.
     */
    static <A,B,C> Consumer3A2<A,B,C> sequence(Iterable<Consumer3<A[][],B[][],C[][]>> consumers)
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
    		for(Consumer3<A[][],B[][],C[][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3A2<A,B,C>)
    				((Consumer3A2<A,B,C>)consumer).acceptArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
