package org.barghos.util.iterator;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

public interface Iterable<T> extends java.lang.Iterable<T>
{
	/** {@inheritDoc} */
	@Override
	Iterator<T> iterator();
	
	default void forEach(Consumer<? super T> action)
	{
		Validate.Arg.checkNotNull("action", action);
		
		for (T t : this)
		{
			action.accept(t);
		}
	}
		
	/** {@inheritDoc} */
	@Override
	default void forEach(java.util.function.Consumer<? super T> action)
	{
		forEach(action::accept);
	}
}
