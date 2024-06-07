package org.barghos.util.consumer;

import org.barghos.util.consumer.floats.ConsumerF;
import org.barghos.util.consumer.floats.ConsumerFA;
import org.barghos.util.function.Function;
import org.barghos.util.function.floats.FunctionF;
import org.barghos.util.function.floats.FunctionFA;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one input argument and returns no
 * result. {@link Consumer} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #accept(Object)}.
 *
 * @param <A> The type of the first argument to the operation.
 * 
 * @see Consumer
 * @see ConsumerEx
 * @see Consumer2
 * @see ConsumerEx2
 * @see Consumer3
 * @see ConsumerEx3
 * @see Consumer4
 * @see ConsumerEx4
 */
@FunctionalInterface
public interface Consumer<A> extends java.util.function.Consumer<A>
{
	/**
     * Performs the operation on the given argument.
     *
     * @param a The first input argument.
     */
    @Override
	void accept(A a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer} performing this operation and the
     * operation after.
     */
    default Consumer<A> then(Consumer<A> after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a) -> { accept(a); after.accept(a); };
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer} performing this operation and the
     * operation after.
     */
    default Consumer<A> then(java.util.function.Consumer<? super A> after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a) -> { accept(a); after.accept(a); };
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer} performing the operation before and this
     * operation.
     */
    default Consumer<A> before(Consumer<A> before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a) -> { before.accept(a); accept(a); };
    }
    
    /**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer} performing the operation before and this
     * operation.
     */
    default Consumer<A> before(java.util.function.Consumer<? super A> before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a) -> { before.accept(a); accept(a); };
    }
    
    /**
     * Composes a new consumer that first transforms its input with the given
     * function an then relays the result to this consumer.
     * 
     * @param <FA> The input type of the given function and the input type
     * of the returned consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default <FA> Consumer<FA> transformBefore(Function<FA,A> transformer)
    {
    	ParameterValidation.pvNotNull("transformer", transformer);
    	
    	return (a) -> accept(transformer.apply(a));
    }
    
    /**
     * Composes a new consumer that first transforms its input with the given
     * function an then relays the result to this consumer.
     * 
     * @param <FA> The input type of the given function and the input type
     * of the returned consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default <FA> Consumer<FA> transformBefore(java.util.function.Function<FA,A> transformer)
    {
    	ParameterValidation.pvNotNull("transformer", transformer);
    	
    	return (a) -> accept(transformer.apply(a));
    }
    
    /**
     * Composes a new float consumer that first transforms its float input with
     * the given function an then relays the result to this consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default ConsumerF transformBeforeFloat(FunctionF<A> func)
    {
    	ParameterValidation.pvNotNull("func", func);
    	
    	return (a) -> accept(func.applyFloat(a));
    }
    
    /**
     * Composes a new float consumer that first transforms its float input with
     * the given function an then relays the result to this consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default ConsumerF transformBeforeFloat(Function<Float,A> func)
    {
    	ParameterValidation.pvNotNull("func", func);
    	
    	return (a) -> accept(func.apply(a));
    }
    
    /**
     * Composes a new float consumer that first transforms its float input with
     * the given function an then relays the result to this consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default ConsumerF transformBeforeFloat(java.util.function.Function<Float,A> func)
    {
    	ParameterValidation.pvNotNull("func", func);
    	
    	return (a) -> accept(func.apply(a));
    }
    
    /**
     * Composes a new 1-dimensional float array consumer that first transforms
     * its float array input with the given function an then relays the result
     * to this consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default ConsumerFA transformBeforeFloatArray(FunctionFA<A> func)
    {
    	ParameterValidation.pvNotNull("func", func);
    	
    	return (a) -> accept(func.applyFloatArray(a));
    }
    
    /**
     * Composes a new 1-dimensional float array consumer that first transforms
     * its float array input with the given function an then relays the result
     * to this consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default ConsumerFA transformBeforeFloatArray(Function<float[],A> func)
    {
    	ParameterValidation.pvNotNull("func", func);
    	
    	return (a) -> accept(func.apply(a));
    }
    
    /**
     * Composes a new 1-dimensional float array consumer that first transforms
     * its float array input with the given function an then relays the result
     * to this consumer.
     * 
     * @param transformer The function applied to the consumer input to
     * transform it.
     * 
     * @return A composed consumer that first applies the given function and
     * then relays the result to this consumer.
     */
    default ConsumerFA transformBeforeFloatArray(java.util.function.Function<float[],A> func)
    {
    	ParameterValidation.pvNotNull("func", func);
    	
    	return (a) -> accept(func.apply(a));
    }
    
    /**
     * @deprecated
     * Use {@link #then(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Consumer<A> andThen(java.util.function.Consumer<? super A> after)
    {
    	return then(after);
    }
    
    /**
     * Composes a new {@link Consumer} performing the given operations in
     * sequence.
     * 
     * @param <A> The type of the first argument to the operation.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer} performing the operations.
     */
    @SafeVarargs
	public static <A> Consumer<A> of(Consumer<A>... consumers)
    {
    	ParameterValidation.pvNotNull("consumers", consumers);
    	ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> { for(Consumer<A> consumer : consumers) consumer.accept(a); };
    }
}
