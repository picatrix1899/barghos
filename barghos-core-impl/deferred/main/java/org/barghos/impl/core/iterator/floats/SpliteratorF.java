//package org.barghos.util.iterator.floats;
//
//import org.barghos.util.comparator.floats.ComparatorF;
//import org.barghos.util.consumer.Consumer;
//import org.barghos.util.consumer.floats.ConsumerF;
//import org.barghos.util.iterator.Spliterator;
//import org.barghos.validation.Validate;
//
//public interface SpliteratorF extends Spliterator<Float>
//{
//	boolean tryAdvance(ConsumerF action);
//	
//	/** {@inheritDoc} */
//	@Override
//	default boolean tryAdvance(Consumer<? super Float> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		return tryAdvance(action::accept);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default boolean tryAdvance(java.util.function.Consumer<? super Float> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		return tryAdvance(action::accept);
//	}
//	
//	default void forEachRemaining(ConsumerF action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		do { } while (tryAdvance(action));
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default void forEachRemaining(Consumer<? super Float> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		forEachRemaining(action::accept);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default void forEachRemaining(java.util.function.Consumer<? super Float> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		forEachRemaining(action::accept);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	SpliteratorF trySplit();
//	
//	/** {@inheritDoc} */
//	@Override
//	default ComparatorF getComparator()
//	{
//		throw new IllegalStateException();
//	}
//}


