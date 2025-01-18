package org.barghos.util.nullable;

public interface NullableR<T>
{
	
	T value();
	
	boolean isPresent();

	boolean equals(Object obj);
	
	boolean equals(NullableR<?> obj);
	
	boolean equalsValue(T obj);
	
}
