//package org.barghos.util.iterator.floats;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.util.consumer.floats.ConsumerF;
//import org.barghos.util.iterator.Iterator;
//import org.barghos.validation.Validate;
//
//public interface IteratorF extends Iterator<Float>
//{
//	float nextF();
//
//	/** {@inheritDoc} */
//	@Override
//	default Float next()
//	{
//		return nextF();
//	}
//	
//	default void forEachRemaining(ConsumerF action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//			
//		while (hasNext())
//		{
//			action.acceptF(nextF());
//		}
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
//}