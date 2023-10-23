package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one string input argument and returns no
 * result. {@link Consumerstr} is expected to operate via side-effects.
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
public interface Consumerstr extends Consumer<String>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptString(String a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerstr} performing this operation and the
     * operation after.
     */
    default Consumerstr thenString(Consumerstr after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptString(a); after.acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerstr} performing this operation and the
     * operations after.
     */
	default Consumerstr thenString(Consumerstr... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptString(a); after[0].acceptString(a);};

    	return (a) -> {acceptString(a); for(Consumerstr consumer : after) consumer.acceptString(a);};
    }
    
	/**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerstr} performing this operation and the
     * operations after.
     */
	default Consumerstr thenString(java.util.List<Consumerstr> after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
		int size = after.size();
		
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {acceptString(a); after.get(0).acceptString(a);};

    	return (a) -> {acceptString(a); for(Consumerstr consumer : after) consumer.acceptString(a);};
    }
	
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerstr} performing this operation and the
     * operations after.
     */
	default Consumerstr thenString(Iterable<Consumerstr> after)
    {
		Validation.validateNotNull("after", after);
		
    	return (a) -> {acceptString(a); for(Consumerstr consumer : after) consumer.acceptString(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerstr} performing the operation before and
     * this operation.
     */
    default Consumerstr beforeString(Consumerstr before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerstr} performing the operations before and
     * this operation.
     */
    default Consumerstr beforeString(Consumerstr... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptString(a); acceptString(a);};
    	
    	return (a) -> {for(Consumerstr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerstr} performing the operations before and
     * this operation.
     */
    default Consumerstr beforeString(java.util.List<Consumerstr> before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	int size = before.size();
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(size == 0) return this;
    	
    	if(size == 1) return (a) -> {before.get(0).acceptString(a); acceptString(a);};
    	
    	return (a) -> {for(Consumerstr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerstr} performing the operations before and
     * this operation.
     */
    default Consumerstr beforeString(Iterable<Consumerstr> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {for(Consumerstr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Composes a new {@link Consumerstr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerstr} performing the operations.
     */
	static Consumerstr sequenceString(Consumerstr... consumers)
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
    	
    	return (a) -> {for(Consumerstr consumer : consumers) consumer.acceptString(a);};
    }
    
	/**
     * Composes a new {@link Consumerstr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerstr} performing the operations.
     */
	static Consumerstr sequenceString(java.util.List<Consumerstr> consumers)
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
    	
    	return (a) -> {for(Consumerstr consumer : consumers) consumer.acceptString(a);};
    }
	
    /**
     * Composes a new {@link Consumerstr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerstr} performing the operations.
     */
    static Consumerstr sequenceString(Iterable<Consumerstr> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	return (a) -> {for(Consumerstr consumer : consumers) consumer.acceptString(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a)
    {
    	acceptString(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerstr} performing this operation and the
     * operation after.
     */
    default Consumerstr then(Consumer<String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerstr)
    	{
    		final Consumerstr originalAfter = (Consumerstr)after;
    		
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
     * @return A new {@link Consumerstr} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerstr then(Consumer<String>... after)
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumerstr)
        	{
        		final Consumerstr originalAfter = (Consumerstr)after[0];
        		
        		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {acceptString(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptString(a);
			
    		for(Consumer<String> consumer : after)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
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
     * @return A new {@link Consumerstr} performing this operation and the
     * operations after.
     */
	default Consumerstr then(java.util.List<Consumer<String>> after)
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
    		final Consumer<String> first = after.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(first instanceof Consumerstr)
        	{
        		final Consumerstr originalAfter = (Consumerstr)first;
        		
        		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {acceptString(a); first.accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptString(a);
			
    		for(Consumer<String> consumer : after)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
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
     * @return A new {@link Consumerstr} performing this operation and the
     * operations after.
     */
	default Consumerstr then(Iterable<Consumer<String>> after)
    {
		Validation.validateNotNull("after", after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
		return (a) -> {
			acceptString(a);
			
    		for(Consumer<String> consumer : after)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
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
     * @return A new {@link Consumerstr} performing the operation before and
     * this operation.
     */
    default Consumerstr before(Consumer<String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerstr)
    	{
    		final Consumerstr originalBefore = (Consumerstr)before;
    		
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
     * @return A new {@link Consumerstr} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerstr before(Consumer<String>... before)
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumerstr)
        	{
        		final Consumerstr originalBefore = (Consumerstr)before[0];
        		
        		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptString(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : before)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
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
     * @return A new {@link Consumerstr} performing the operations before and
     * this operation.
     */
    default Consumerstr before(java.util.List<Consumer<String>> before)
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
    		final Consumer<String> first = before.get(0);
    		
    		/*
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(first instanceof Consumerstr)
        	{
        		final Consumerstr originalBefore = (Consumerstr)first;
        		
        		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {first.accept(a); acceptString(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : before)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
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
     * @return A new {@link Consumerstr} performing the operations before and
     * this operation.
     */
    default Consumerstr before(Iterable<Consumer<String>> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : before)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptString(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerstr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerstr} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerstr sequence(Consumer<String>... consumers)
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
    		if(consumers[0] instanceof Consumerstr)
    			return (Consumerstr) consumers[0];
    		else
    			return (Consumerstr) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : consumers)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerstr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerstr} performing the operations.
     */
	static Consumerstr sequence(java.util.List<Consumer<String>> consumers)
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
    		final Consumer<String> first = consumers.get(0);
    		
    		if(first instanceof Consumerstr)
    			return (Consumerstr) first;
    		else
    			return (Consumerstr) first::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : consumers)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerstr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerstr} performing the operations.
     */
    static Consumerstr sequence(Iterable<Consumer<String>> consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String> consumer : consumers)
    		{
    			if(consumer instanceof Consumerstr)
    				((Consumerstr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerstr andThen(java.util.function.Consumer<? super String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptString(a); after.accept(a);};
    }
}
