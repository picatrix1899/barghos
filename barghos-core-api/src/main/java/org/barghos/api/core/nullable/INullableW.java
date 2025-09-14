package org.barghos.api.core.nullable;

import org.barghos.annotation.AllowNull;

public interface INullableW<T> extends INullableR<T>
{
	INullableW<T> value(@AllowNull T value);
	
	INullableW<T> set(@AllowNull INullableR<T> v);
	
	INullableW<T> setNull();
}
