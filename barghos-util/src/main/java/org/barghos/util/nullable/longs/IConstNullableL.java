package org.barghos.util.nullable.longs;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableL extends INullableRL permits ConstNullableL, ConstNullableL.Null
{
	public static IConstNullableL of()
	{
		return ConstNullableL.of();
	}
	
	public static IConstNullableL of(long value)
	{
		return ConstNullableL.of(value);
	}
	
	public static IConstNullableL of(@AllowNull Long value)
	{
		return ConstNullableL.of(value);
	}
	
	public static IConstNullableL of(@AllowNull INullableRL value)
	{
		return ConstNullableL.of(value);
	}
}
