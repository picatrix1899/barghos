package org.barghos.event;


public interface EventHandler<T>
{
	void raise(T event);
}
