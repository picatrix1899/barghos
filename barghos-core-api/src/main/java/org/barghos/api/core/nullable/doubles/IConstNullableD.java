package org.barghos.api.core.nullable.doubles;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableD extends INullableRD permits ConstNullableD, ConstNullableD.Null
{
	public static IConstNullableD of()
	{
		return ConstNullableD.of();
	}
	
	public static IConstNullableD of(double value)
	{
		return ConstNullableD.of(value);
	}
	
	public static IConstNullableD of(@AllowNull Double value)
	{
		return ConstNullableD.of(value);
	}
	
	public static IConstNullableD of(@AllowNull INullableRD value)
	{
		return ConstNullableD.of(value);
	}
}
