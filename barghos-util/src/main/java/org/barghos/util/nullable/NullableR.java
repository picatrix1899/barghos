package org.barghos.util.nullable;

public interface NullableR<T>
{
	
	T value();
	
	T valueOrDefault(T def);
	
	T valueOrDefault();
	
	boolean isNull();
	
	boolean isNotNull();

	boolean equals(Object obj);
	
	boolean equals(NullableR<?> obj);
	
	boolean equalsValue(T obj);
	
}
