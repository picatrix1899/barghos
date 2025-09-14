//package org.barghos.util.iterator;
//
//import java.util.Comparator;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.Validate;
//
//public interface Spliterator<T> extends java.util.Spliterator<T>
//{
//	boolean tryAdvance(Consumer<? super T> action);
//	
//	/** {@inheritDoc} */
//	@Override
//	default boolean tryAdvance(java.util.function.Consumer<? super T> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		return tryAdvance(action::accept);
//	}
//	
//	default void forEachRemaining(Consumer<? super T> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		do { } while (tryAdvance(action));
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default void forEachRemaining(java.util.function.Consumer<? super T> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		forEachRemaining(action::accept);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	Spliterator<T> trySplit();
//	
//	/** {@inheritDoc} */
//	@Override
//	long estimateSize();
//	
//	/** {@inheritDoc} */
//	@Override
//	default long getExactSizeIfKnown()
//	{
//		return (characteristics() & SIZED) == 0 ? -1L : estimateSize();
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	int characteristics();
//	
//	/** {@inheritDoc} */
//	@Override
//	default boolean hasCharacteristics(int characteristics)
//	{
//		return (characteristics() & characteristics) == characteristics;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default Comparator<? super T> getComparator()
//	{
//	    throw new IllegalStateException();
//	}
//}


