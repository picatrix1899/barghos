package org.barghos.util.nullable.chars;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableC extends INullableRC permits ConstNullableC, ConstNullableC.Null
{
	public static IConstNullableC of()
	{
		return ConstNullableC.of();
	}
	
	public static IConstNullableC of(char value)
	{
		return ConstNullableC.of(value);
	}
	
	public static IConstNullableC of(@AllowNull Character value)
	{
		return ConstNullableC.of(value);
	}
	
	public static IConstNullableC of(@AllowNull INullableRC value)
	{
		return ConstNullableC.of(value);
	}
}
