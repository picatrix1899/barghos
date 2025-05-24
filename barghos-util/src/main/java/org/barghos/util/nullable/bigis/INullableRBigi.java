package org.barghos.util.nullable.bigis;

import java.math.BigInteger;

import org.barghos.annotation.AllowNull;

public interface INullableRBigi
{
	boolean isNull();
	
	boolean isNotNull();
	
	BigInteger value();
	
	BigInteger valueOrDefault(@AllowNull BigInteger def);
	
	BigInteger valueOrDefault();
	
	boolean equals(@AllowNull BigInteger obj);
	
	boolean equals(@AllowNull INullableRBigi obj);
}
