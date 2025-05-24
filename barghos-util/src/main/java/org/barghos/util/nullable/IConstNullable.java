package org.barghos.util.nullable;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullable<T> extends INullableR<T> permits ConstNullable, ConstNullable.Null
{
	public static <T> IConstNullable<T> of()
	{
		return ConstNullable.of();
	}
	
	public static <T> IConstNullable<T> of(@AllowNull T value)
	{
		return ConstNullable.of(value);
	}
	
	public static <T> IConstNullable<T> of(@AllowNull INullableR<T> value)
	{
		return ConstNullable.of(value);
	}
}
