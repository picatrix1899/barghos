package org.barghos.util.nullable.bytes;

import org.barghos.util.nullable.NullableR;

public interface NullableRB extends NullableR<Byte>
{
	
	byte valueB();
	
	byte valueOrDefaultB(byte def);
	
	byte valueOrDefaultB();
	
	@Override
	Byte value();
	
	@Override
	Byte valueOrDefault(Byte def);
	
	@Override
	Byte valueOrDefault();
	
	boolean equals(NullableRB obj);
	
	boolean equalsValueB(byte obj);
	
	boolean equalsValue(Byte obj);
	
}
