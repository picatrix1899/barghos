package org.barghos.util.nullable.ints;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableI extends INullableRI permits ConstNullableI, ConstNullableI.Null
{
	public static IConstNullableI of()
	{
		return ConstNullableI.of();
	}
	
	public static IConstNullableI of(int value)
	{
		return ConstNullableI.of(value);
	}
	
	public static IConstNullableI of(@AllowNull Integer value)
	{
		return ConstNullableI.of(value);
	}
	
	public static IConstNullableI of(@AllowNull INullableRI value)
	{
		return ConstNullableI.of(value);
	}
}
