package org.barghos.util.nullable.floats;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableF extends INullableRF permits ConstNullableF, ConstNullableF.Null
{
	public static IConstNullableF of()
	{
		return ConstNullableF.of();
	}
	
	public static IConstNullableF of(float value)
	{
		return ConstNullableF.of(value);
	}
	
	public static IConstNullableF of(@AllowNull Float value)
	{
		return ConstNullableF.of(value);
	}
	
	public static IConstNullableF of(@AllowNull INullableRF value)
	{
		return ConstNullableF.of(value);
	}
}
