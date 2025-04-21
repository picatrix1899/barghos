package org.barghos.util.nullable.bigis;

import java.math.BigInteger;

import org.barghos.util.nullable.NullableR;
import org.barghos.util.nullable.NullableW;

public interface NullableWBigi extends NullableRBigi, NullableW<BigInteger>
{
	
	NullableWBigi valueBigi(BigInteger value);
	
	NullableWBigi value(BigInteger value);
	
	NullableWBigi set(NullableRBigi value);
	
	NullableWBigi set(NullableR<BigInteger> value);
	
	NullableWBigi setNull();
	
}
