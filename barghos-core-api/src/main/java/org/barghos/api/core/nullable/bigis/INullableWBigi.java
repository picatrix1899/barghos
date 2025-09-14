package org.barghos.api.core.nullable.bigis;

import java.math.BigInteger;

import org.barghos.annotation.AllowNull;

public interface INullableWBigi extends INullableRBigi
{
	INullableWBigi value(BigInteger value);
	
	INullableWBigi set(@AllowNull INullableRBigi value);
	
	INullableWBigi setNull();
}
