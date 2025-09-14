package org.barghos.api.core.nullable.bigd;

import java.math.BigDecimal;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableBigd extends INullableRBigd permits ConstNullableBigd, ConstNullableBigd.Null
{
	public static IConstNullableBigd of()
	{
		return ConstNullableBigd.of();
	}
	
	public static IConstNullableBigd of(@AllowNull BigDecimal value)
	{
		return ConstNullableBigd.of(value);
	}
	
	public static IConstNullableBigd of(@AllowNull INullableRBigd value)
	{
		return ConstNullableBigd.of(value);
	}
}
