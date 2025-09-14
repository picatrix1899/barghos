package org.barghos.api.core.nullable.shorts;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableS extends INullableRS permits ConstNullableS, ConstNullableS.Null
{
	public static IConstNullableS of()
	{
		return ConstNullableS.of();
	}
	
	public static IConstNullableS of(short value)
	{
		return ConstNullableS.of(value);
	}
	
	public static IConstNullableS of(@AllowNull Short value)
	{
		return ConstNullableS.of(value);
	}
	
	public static IConstNullableS of(@AllowNull INullableRS value)
	{
		return ConstNullableS.of(value);
	}
}
