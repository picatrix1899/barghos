package org.barghos.util.nullable.bigis;

import java.math.BigInteger;

import org.barghos.annotation.AllowNull;

public sealed interface IConstNullableBigi extends INullableRBigi permits ConstNullableBigi, ConstNullableBigi.Null
{
	public static IConstNullableBigi of()
	{
		return ConstNullableBigi.of();
	}
	
	public static IConstNullableBigi of(@AllowNull BigInteger value)
	{
		return ConstNullableBigi.of(value);
	}
	
	public static IConstNullableBigi of(@AllowNull INullableRBigi value)
	{
		return ConstNullableBigi.of(value);
	}
}
