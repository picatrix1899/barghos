//package org.barghos.util.iterator.floats;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.util.consumer.floats.ConsumerF;
//import org.barghos.util.iterator.Iterable;
//import org.barghos.validation.Validate;
//
///**
// * Represents an object that supports iterating over its float entries.
// * This interface marks possible targets for 'for-each-loops'.
// */
//public interface IterableF extends Iterable<Float>
//{
//	/** {@inheritDoc} */
//	@Override
//	IteratorF iterator();
//	
//	default void forEach(ConsumerF action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		for (Float t : this)
//		{
//			action.acceptF(t);
//		}
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default void forEach(Consumer<? super Float> action)
//	{
//		forEach(action::accept);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	default void forEach(java.util.function.Consumer<? super Float> action)
//	{
//		forEach(action::accept);
//	}
//}


