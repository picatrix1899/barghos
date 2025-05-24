package org.barghos.util.nullable.bools;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableBo extends INullableRBo permits ConstNullableBo, ConstNullableBo.Null
{
	public static IConstNullableBo of()
	{
		return ConstNullableBo.of();
	}
	
	public static IConstNullableBo of(boolean value)
	{
		return ConstNullableBo.of(value);
	}
	
	public static IConstNullableBo of(@AllowNull Boolean value)
	{
		return ConstNullableBo.of(value);
	}
	
	public static IConstNullableBo of(@AllowNull INullableRBo value)
	{
		return ConstNullableBo.of(value);
	}
}
