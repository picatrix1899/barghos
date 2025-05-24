package org.barghos.util.nullable.objs;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableO extends INullableRO permits ConstNullableO, ConstNullableO.Null
{
	public static IConstNullableO of()
	{
		return ConstNullableO.of();
	}
	
	public static IConstNullableO of(@AllowNull Object value)
	{
		return ConstNullableO.of(value);
	}
	
	public static IConstNullableO of(@AllowNull INullableRO value)
	{
		return ConstNullableO.of(value);
	}
}
