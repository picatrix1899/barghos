//package org.barghos.util.iterator;
//
//import org.barghos.util.consumer.Consumer;
//import org.barghos.validation.Validate;
//
//public interface Iterator<T> extends java.util.Iterator<T>
//{
//	/** {@inheritDoc} */
//	@Override
//	T next();
//	
//	/** {@inheritDoc} */
//	@Override
//	boolean hasNext();
//	
//	/** {@inheritDoc} */
//	@Override
//	default void remove()
//	{
//		throw new UnsupportedOperationException("remove");
//	}
//	
//	default int skip(int n)
//	{
//		Validate.Arg.checkMin("n", 0, n);
//	
//		int i = 0;
//	
//		while (i < n && hasNext())
//		{
//			next();
//			
//			i++;
//		}
//
//		return i;
//	}
//	
//	default void forEachRemaining(Consumer<? super T> action)
//	{
//		Validate.Arg.checkNotNull("action", action);
//		
//		while (hasNext())
//		{
//			action.accept(next());
//		}
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
//}


