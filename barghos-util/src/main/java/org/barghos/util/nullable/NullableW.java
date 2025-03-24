package org.barghos.util.nullable;

public interface NullableW<T> extends NullableR<T>
{

	NullableW<T> value(T value);
	
	NullableW<T> set(NullableR<T> v);
	
	NullableW<T> setNull();
	
}
