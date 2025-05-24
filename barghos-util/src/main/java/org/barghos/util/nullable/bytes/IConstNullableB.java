package org.barghos.util.nullable.bytes;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableB extends INullableRB permits ConstNullableB, ConstNullableB.Null
{
	public static IConstNullableB of()
	{
		return ConstNullableB.of();
	}
	
	public static IConstNullableB of(byte value)
	{
		return ConstNullableB.of(value);
	}
	
	public static IConstNullableB of(@AllowNull Byte value)
	{
		return ConstNullableB.of(value);
	}
	
	public static IConstNullableB of(@AllowNull INullableRB value)
	{
		return ConstNullableB.of(value);
	}
}
