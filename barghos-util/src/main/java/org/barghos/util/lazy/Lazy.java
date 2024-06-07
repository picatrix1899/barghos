package org.barghos.util.lazy;


public interface Lazy<T>
{
	T value();
	
	boolean hasValue();
}
