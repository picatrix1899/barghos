package org.barghos.util.nullable.bigis;

import java.math.BigInteger;

import org.barghos.util.nullable.NullableR;

public interface NullableRBigi extends NullableR<BigInteger>
{
	
	BigInteger valueBigi();
	
	BigInteger valueOrDefaultBigi(BigInteger def);
	
	BigInteger valueOrDefaultBigi();
	
	@Override
	BigInteger value();
	
	@Override
	BigInteger valueOrDefault(BigInteger def);
	
	@Override
	BigInteger valueOrDefault();
	
	boolean equals(NullableRBigi obj);
	
	boolean equalsValueBigi(BigInteger obj);
	
	boolean equalsValue(BigInteger obj);
	
}
