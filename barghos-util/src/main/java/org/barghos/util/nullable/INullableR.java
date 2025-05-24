package org.barghos.util.nullable;

import org.barghos.annotation.AllowNull;

public interface INullableR<T>
{
	
	T value();
	
	T valueOrDefault(@AllowNull T def);
	
	T valueOrDefault();
	
	boolean isNull();
	
	boolean isNotNull();

	boolean equals(@AllowNull Object obj);
	
	boolean equals(@AllowNull INullableR<?> obj);
	
}
