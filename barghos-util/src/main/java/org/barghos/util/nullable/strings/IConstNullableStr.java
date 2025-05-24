package org.barghos.util.nullable.strings;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableStr extends INullableRStr permits ConstNullableStr, ConstNullableStr.Null
{
	public static IConstNullableStr of()
	{
		return ConstNullableStr.of();
	}
	
	public static IConstNullableStr of(@AllowNull String value)
	{
		return ConstNullableStr.of(value);
	}
	
	public static IConstNullableStr of(@AllowNull INullableRStr value)
	{
		return ConstNullableStr.of(value);
	}
}
